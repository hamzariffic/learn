package com.example.edcaster.core.domain;

import com.example.edcaster.core.data.repository.CategoryStore;
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
public final class FilterableCategoriesUseCase_Factory implements Factory<FilterableCategoriesUseCase> {
  private final Provider<CategoryStore> categoryStoreProvider;

  public FilterableCategoriesUseCase_Factory(Provider<CategoryStore> categoryStoreProvider) {
    this.categoryStoreProvider = categoryStoreProvider;
  }

  @Override
  public FilterableCategoriesUseCase get() {
    return newInstance(categoryStoreProvider.get());
  }

  public static FilterableCategoriesUseCase_Factory create(
      Provider<CategoryStore> categoryStoreProvider) {
    return new FilterableCategoriesUseCase_Factory(categoryStoreProvider);
  }

  public static FilterableCategoriesUseCase newInstance(CategoryStore categoryStore) {
    return new FilterableCategoriesUseCase(categoryStore);
  }
}
