package com.example.edcaster.core.domain;

import com.example.edcaster.core.data.repository.EpisodeStore;
import com.example.edcaster.core.data.repository.PodcastStore;
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
public final class GetLatestFollowedEpisodesUseCase_Factory implements Factory<GetLatestFollowedEpisodesUseCase> {
  private final Provider<EpisodeStore> episodeStoreProvider;

  private final Provider<PodcastStore> podcastStoreProvider;

  public GetLatestFollowedEpisodesUseCase_Factory(Provider<EpisodeStore> episodeStoreProvider,
      Provider<PodcastStore> podcastStoreProvider) {
    this.episodeStoreProvider = episodeStoreProvider;
    this.podcastStoreProvider = podcastStoreProvider;
  }

  @Override
  public GetLatestFollowedEpisodesUseCase get() {
    return newInstance(episodeStoreProvider.get(), podcastStoreProvider.get());
  }

  public static GetLatestFollowedEpisodesUseCase_Factory create(
      Provider<EpisodeStore> episodeStoreProvider, Provider<PodcastStore> podcastStoreProvider) {
    return new GetLatestFollowedEpisodesUseCase_Factory(episodeStoreProvider, podcastStoreProvider);
  }

  public static GetLatestFollowedEpisodesUseCase newInstance(EpisodeStore episodeStore,
      PodcastStore podcastStore) {
    return new GetLatestFollowedEpisodesUseCase(episodeStore, podcastStore);
  }
}
