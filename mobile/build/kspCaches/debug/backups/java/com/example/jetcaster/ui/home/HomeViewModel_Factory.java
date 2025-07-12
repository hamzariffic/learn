package com.example.edcaster.ui.home;

import com.example.edcaster.core.data.repository.EpisodeStore;
import com.example.edcaster.core.data.repository.PodcastStore;
import com.example.edcaster.core.data.repository.PodcastsRepository;
import com.example.edcaster.core.domain.FilterableCategoriesUseCase;
import com.example.edcaster.core.domain.PodcastCategoryFilterUseCase;
import com.example.edcaster.core.player.EpisodePlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<PodcastsRepository> podcastsRepositoryProvider;

  private final Provider<PodcastStore> podcastStoreProvider;

  private final Provider<EpisodeStore> episodeStoreProvider;

  private final Provider<PodcastCategoryFilterUseCase> podcastCategoryFilterUseCaseProvider;

  private final Provider<FilterableCategoriesUseCase> filterableCategoriesUseCaseProvider;

  private final Provider<EpisodePlayer> episodePlayerProvider;

  public HomeViewModel_Factory(Provider<PodcastsRepository> podcastsRepositoryProvider,
      Provider<PodcastStore> podcastStoreProvider, Provider<EpisodeStore> episodeStoreProvider,
      Provider<PodcastCategoryFilterUseCase> podcastCategoryFilterUseCaseProvider,
      Provider<FilterableCategoriesUseCase> filterableCategoriesUseCaseProvider,
      Provider<EpisodePlayer> episodePlayerProvider) {
    this.podcastsRepositoryProvider = podcastsRepositoryProvider;
    this.podcastStoreProvider = podcastStoreProvider;
    this.episodeStoreProvider = episodeStoreProvider;
    this.podcastCategoryFilterUseCaseProvider = podcastCategoryFilterUseCaseProvider;
    this.filterableCategoriesUseCaseProvider = filterableCategoriesUseCaseProvider;
    this.episodePlayerProvider = episodePlayerProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(podcastsRepositoryProvider.get(), podcastStoreProvider.get(), episodeStoreProvider.get(), podcastCategoryFilterUseCaseProvider.get(), filterableCategoriesUseCaseProvider.get(), episodePlayerProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<PodcastsRepository> podcastsRepositoryProvider,
      Provider<PodcastStore> podcastStoreProvider, Provider<EpisodeStore> episodeStoreProvider,
      Provider<PodcastCategoryFilterUseCase> podcastCategoryFilterUseCaseProvider,
      Provider<FilterableCategoriesUseCase> filterableCategoriesUseCaseProvider,
      Provider<EpisodePlayer> episodePlayerProvider) {
    return new HomeViewModel_Factory(podcastsRepositoryProvider, podcastStoreProvider, episodeStoreProvider, podcastCategoryFilterUseCaseProvider, filterableCategoriesUseCaseProvider, episodePlayerProvider);
  }

  public static HomeViewModel newInstance(PodcastsRepository podcastsRepository,
      PodcastStore podcastStore, EpisodeStore episodeStore,
      PodcastCategoryFilterUseCase podcastCategoryFilterUseCase,
      FilterableCategoriesUseCase filterableCategoriesUseCase, EpisodePlayer episodePlayer) {
    return new HomeViewModel(podcastsRepository, podcastStore, episodeStore, podcastCategoryFilterUseCase, filterableCategoriesUseCase, episodePlayer);
  }
}
