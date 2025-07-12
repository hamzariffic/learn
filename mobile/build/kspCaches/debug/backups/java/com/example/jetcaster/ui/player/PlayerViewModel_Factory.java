package com.example.edcaster.ui.player;

import androidx.lifecycle.SavedStateHandle;
import com.example.edcaster.core.data.repository.EpisodeStore;
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
public final class PlayerViewModel_Factory implements Factory<PlayerViewModel> {
  private final Provider<EpisodeStore> episodeStoreProvider;

  private final Provider<EpisodePlayer> episodePlayerProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public PlayerViewModel_Factory(Provider<EpisodeStore> episodeStoreProvider,
      Provider<EpisodePlayer> episodePlayerProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.episodeStoreProvider = episodeStoreProvider;
    this.episodePlayerProvider = episodePlayerProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public PlayerViewModel get() {
    return newInstance(episodeStoreProvider.get(), episodePlayerProvider.get(), savedStateHandleProvider.get());
  }

  public static PlayerViewModel_Factory create(Provider<EpisodeStore> episodeStoreProvider,
      Provider<EpisodePlayer> episodePlayerProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new PlayerViewModel_Factory(episodeStoreProvider, episodePlayerProvider, savedStateHandleProvider);
  }

  public static PlayerViewModel newInstance(EpisodeStore episodeStore, EpisodePlayer episodePlayer,
      SavedStateHandle savedStateHandle) {
    return new PlayerViewModel(episodeStore, episodePlayer, savedStateHandle);
  }
}
