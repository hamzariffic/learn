package com.example.edcaster.ui.podcast;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class PodcastDetailsViewModel_Factory_Impl implements PodcastDetailsViewModel.Factory {
  private final PodcastDetailsViewModel_Factory delegateFactory;

  PodcastDetailsViewModel_Factory_Impl(PodcastDetailsViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public PodcastDetailsViewModel create(String podcastUri) {
    return delegateFactory.get(podcastUri);
  }

  public static Provider<PodcastDetailsViewModel.Factory> create(
      PodcastDetailsViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new PodcastDetailsViewModel_Factory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<PodcastDetailsViewModel.Factory> createFactoryProvider(
      PodcastDetailsViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new PodcastDetailsViewModel_Factory_Impl(delegateFactory));
  }
}
