package com.example.edcaster.core.data.network;

import com.rometools.rome.io.SyndFeedInput;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.OkHttpClient;

@ScopeMetadata
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
public final class CoursesFetcher_Factory implements Factory<CoursesFetcher> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<SyndFeedInput> syndFeedInputProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public CoursesFetcher_Factory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<SyndFeedInput> syndFeedInputProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.syndFeedInputProvider = syndFeedInputProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public CoursesFetcher get() {
    return newInstance(okHttpClientProvider.get(), syndFeedInputProvider.get(), ioDispatcherProvider.get());
  }

  public static CoursesFetcher_Factory create(Provider<OkHttpClient> okHttpClientProvider,
      Provider<SyndFeedInput> syndFeedInputProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new CoursesFetcher_Factory(okHttpClientProvider, syndFeedInputProvider, ioDispatcherProvider);
  }

  public static CoursesFetcher newInstance(OkHttpClient okHttpClient, SyndFeedInput syndFeedInput,
      CoroutineDispatcher ioDispatcher) {
    return new CoursesFetcher(okHttpClient, syndFeedInput, ioDispatcher);
  }
}
