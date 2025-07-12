package com.example.edcaster.core.data.repository;

import com.example.edcaster.core.data.database.dao.TransactionRunner;
import com.example.edcaster.core.data.network.CoursesFetcher;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

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
public final class CourseRepository_Factory implements Factory<CourseRepository> {
  private final Provider<CoursesFetcher> coursesFetcherProvider;

  private final Provider<CourseStore> courseStoreProvider;

  private final Provider<LessonStore> lessonStoreProvider;

  private final Provider<CategoryStore> categoryStoreProvider;

  private final Provider<TransactionRunner> transactionRunnerProvider;

  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  public CourseRepository_Factory(Provider<CoursesFetcher> coursesFetcherProvider,
      Provider<CourseStore> courseStoreProvider, Provider<LessonStore> lessonStoreProvider,
      Provider<CategoryStore> categoryStoreProvider,
      Provider<TransactionRunner> transactionRunnerProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    this.coursesFetcherProvider = coursesFetcherProvider;
    this.courseStoreProvider = courseStoreProvider;
    this.lessonStoreProvider = lessonStoreProvider;
    this.categoryStoreProvider = categoryStoreProvider;
    this.transactionRunnerProvider = transactionRunnerProvider;
    this.mainDispatcherProvider = mainDispatcherProvider;
  }

  @Override
  public CourseRepository get() {
    return newInstance(coursesFetcherProvider.get(), courseStoreProvider.get(), lessonStoreProvider.get(), categoryStoreProvider.get(), transactionRunnerProvider.get(), mainDispatcherProvider.get());
  }

  public static CourseRepository_Factory create(Provider<CoursesFetcher> coursesFetcherProvider,
      Provider<CourseStore> courseStoreProvider, Provider<LessonStore> lessonStoreProvider,
      Provider<CategoryStore> categoryStoreProvider,
      Provider<TransactionRunner> transactionRunnerProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    return new CourseRepository_Factory(coursesFetcherProvider, courseStoreProvider, lessonStoreProvider, categoryStoreProvider, transactionRunnerProvider, mainDispatcherProvider);
  }

  public static CourseRepository newInstance(CoursesFetcher coursesFetcher, CourseStore courseStore,
      LessonStore lessonStore, CategoryStore categoryStore, TransactionRunner transactionRunner,
      CoroutineDispatcher mainDispatcher) {
    return new CourseRepository(coursesFetcher, courseStore, lessonStore, categoryStore, transactionRunner, mainDispatcher);
  }
}
