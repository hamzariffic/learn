package com.example.edcaster;

import coil.ImageLoader;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class EdcasterApplication_MembersInjector implements MembersInjector<EdcasterApplication> {
  private final Provider<ImageLoader> imageLoaderProvider;

  public EdcasterApplication_MembersInjector(Provider<ImageLoader> imageLoaderProvider) {
    this.imageLoaderProvider = imageLoaderProvider;
  }

  public static MembersInjector<EdcasterApplication> create(
      Provider<ImageLoader> imageLoaderProvider) {
    return new EdcasterApplication_MembersInjector(imageLoaderProvider);
  }

  @Override
  public void injectMembers(EdcasterApplication instance) {
    injectImageLoader(instance, imageLoaderProvider.get());
  }

  @InjectedFieldSignature("com.example.edcaster.EdcasterApplication.imageLoader")
  public static void injectImageLoader(EdcasterApplication instance, ImageLoader imageLoader) {
    instance.imageLoader = imageLoader;
  }
}
