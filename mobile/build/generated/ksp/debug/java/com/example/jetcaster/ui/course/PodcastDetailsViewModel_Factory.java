package com.example.edcaster.ui.course;

import com.example.edcaster.core.data.repository.EpisodeStore;
import com.example.edcaster.core.data.repository.PodcastStore;
import com.example.edcaster.core.player.EpisodePlayer;
import dagger.internal.DaggerGenerated;
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
public final class PodcastDetailsViewModel_Factory {
  private final Provider<EpisodeStore> episodeStoreProvider;

  private final Provider<EpisodePlayer> episodePlayerProvider;

  private final Provider<PodcastStore> podcastStoreProvider;

  public PodcastDetailsViewModel_Factory(Provider<EpisodeStore> episodeStoreProvider,
      Provider<EpisodePlayer> episodePlayerProvider, Provider<PodcastStore> podcastStoreProvider) {
    this.episodeStoreProvider = episodeStoreProvider;
    this.episodePlayerProvider = episodePlayerProvider;
    this.podcastStoreProvider = podcastStoreProvider;
  }

  public PodcastDetailsViewModel get(String podcastUri) {
    return newInstance(episodeStoreProvider.get(), episodePlayerProvider.get(), podcastStoreProvider.get(), podcastUri);
  }

  public static PodcastDetailsViewModel_Factory create(Provider<EpisodeStore> episodeStoreProvider,
      Provider<EpisodePlayer> episodePlayerProvider, Provider<PodcastStore> podcastStoreProvider) {
    return new PodcastDetailsViewModel_Factory(episodeStoreProvider, episodePlayerProvider, podcastStoreProvider);
  }

  public static PodcastDetailsViewModel newInstance(EpisodeStore episodeStore,
      EpisodePlayer episodePlayer, PodcastStore podcastStore, String podcastUri) {
    return new PodcastDetailsViewModel(episodeStore, episodePlayer, podcastStore, podcastUri);
  }
}
