package com.example.edcaster.core.di;

import com.example.edcaster.core.player.EpisodePlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.example.edcaster.core.data.Dispatcher")
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
public final class DomainDiModule_ProvideEpisodePlayerFactory implements Factory<EpisodePlayer> {
  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  public DomainDiModule_ProvideEpisodePlayerFactory(
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    this.mainDispatcherProvider = mainDispatcherProvider;
  }

  @Override
  public EpisodePlayer get() {
    return provideEpisodePlayer(mainDispatcherProvider.get());
  }

  public static DomainDiModule_ProvideEpisodePlayerFactory create(
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    return new DomainDiModule_ProvideEpisodePlayerFactory(mainDispatcherProvider);
  }

  public static EpisodePlayer provideEpisodePlayer(CoroutineDispatcher mainDispatcher) {
    return Preconditions.checkNotNullFromProvides(DomainDiModule.INSTANCE.provideEpisodePlayer(mainDispatcher));
  }
}
