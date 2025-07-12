package com.example.edcaster;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import coil.ImageLoader;
import com.example.edcaster.core.data.database.EdcasterDatabase;
import com.example.edcaster.core.data.database.dao.CategoriesDao;
import com.example.edcaster.core.data.database.dao.EpisodesDao;
import com.example.edcaster.core.data.database.dao.PodcastCategoryEntryDao;
import com.example.edcaster.core.data.database.dao.PodcastFollowedEntryDao;
import com.example.edcaster.core.data.database.dao.PodcastsDao;
import com.example.edcaster.core.data.database.dao.TransactionRunner;
import com.example.edcaster.core.data.di.DataDiModule_ProvideCategoriesDaoFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideCategoryStoreFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideDatabaseFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideEpisodeStoreFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideEpisodesDaoFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideIODispatcherFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideImageLoaderFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideMainDispatcherFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideOkHttpClientFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvidePodcastCategoryEntryDaoFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvidePodcastFollowedEntryDaoFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvidePodcastStoreFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvidePodcastsDaoFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideSyndFeedInputFactory;
import com.example.edcaster.core.data.di.DataDiModule_ProvideTransactionRunnerFactory;
import com.example.edcaster.core.data.network.PodcastsFetcher;
import com.example.edcaster.core.data.repository.CategoryStore;
import com.example.edcaster.core.data.repository.EpisodeStore;
import com.example.edcaster.core.data.repository.PodcastStore;
import com.example.edcaster.core.data.repository.PodcastsRepository;
import com.example.edcaster.core.di.DomainDiModule_ProvideEpisodePlayerFactory;
import com.example.edcaster.core.domain.FilterableCategoriesUseCase;
import com.example.edcaster.core.domain.PodcastCategoryFilterUseCase;
import com.example.edcaster.core.player.EpisodePlayer;
import com.example.edcaster.ui.MainActivity;
import com.example.edcaster.ui.home.HomeViewModel;
import com.example.edcaster.ui.home.HomeViewModel_HiltModules;
import com.example.edcaster.ui.home.HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.edcaster.ui.home.HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.edcaster.ui.player.PlayerViewModel;
import com.example.edcaster.ui.player.PlayerViewModel_HiltModules;
import com.example.edcaster.ui.player.PlayerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.edcaster.ui.player.PlayerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.edcaster.ui.podcast.PodcastDetailsViewModel;
import com.example.edcaster.ui.podcast.PodcastDetailsViewModel_HiltModules;
import com.example.edcaster.ui.podcast.PodcastDetailsViewModel_HiltModules_BindsModule_Bind_LazyMapKey;
import com.example.edcaster.ui.podcast.PodcastDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.rometools.rome.io.SyndFeedInput;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.OkHttpClient;

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
public final class DaggerEdcasterApplication_HiltComponents_SingletonC {
  private DaggerEdcasterApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public EdcasterApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements EdcasterApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public EdcasterApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements EdcasterApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public EdcasterApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements EdcasterApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public EdcasterApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements EdcasterApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public EdcasterApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements EdcasterApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public EdcasterApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements EdcasterApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public EdcasterApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements EdcasterApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public EdcasterApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends EdcasterApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends EdcasterApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends EdcasterApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends EdcasterApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(MapBuilder.<String, Boolean>newMapBuilder(3).put(HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, HomeViewModel_HiltModules.KeyModule.provide()).put(PlayerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, PlayerViewModel_HiltModules.KeyModule.provide()).put(PodcastDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, PodcastDetailsViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends EdcasterApplication_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<HomeViewModel> homeViewModelProvider;

    Provider<PlayerViewModel> playerViewModelProvider;

    Provider<PodcastDetailsViewModel.Factory> factoryProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    PodcastsFetcher podcastsFetcher() {
      return new PodcastsFetcher(singletonCImpl.provideOkHttpClientProvider.get(), singletonCImpl.provideSyndFeedInputProvider.get(), singletonCImpl.provideIODispatcherProvider.get());
    }

    PodcastsRepository podcastsRepository() {
      return new PodcastsRepository(podcastsFetcher(), singletonCImpl.providePodcastStoreProvider.get(), singletonCImpl.provideEpisodeStoreProvider.get(), singletonCImpl.provideCategoryStoreProvider.get(), singletonCImpl.provideTransactionRunnerProvider.get(), singletonCImpl.provideMainDispatcherProvider.get());
    }

    PodcastCategoryFilterUseCase podcastCategoryFilterUseCase() {
      return new PodcastCategoryFilterUseCase(singletonCImpl.provideCategoryStoreProvider.get());
    }

    FilterableCategoriesUseCase filterableCategoriesUseCase() {
      return new FilterableCategoriesUseCase(singletonCImpl.provideCategoryStoreProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.playerViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.factoryProvider = SingleCheck.provider(new SwitchingProvider<PodcastDetailsViewModel.Factory>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2));
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(2).put(HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (homeViewModelProvider))).put(PlayerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (playerViewModelProvider))).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return LazyClassKeyMap.<Object>of(Collections.<String, Object>singletonMap(PodcastDetailsViewModel_HiltModules_BindsModule_Bind_LazyMapKey.lazyClassKeyName, factoryProvider.get()));
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.edcaster.ui.home.HomeViewModel
          return (T) new HomeViewModel(viewModelCImpl.podcastsRepository(), singletonCImpl.providePodcastStoreProvider.get(), singletonCImpl.provideEpisodeStoreProvider.get(), viewModelCImpl.podcastCategoryFilterUseCase(), viewModelCImpl.filterableCategoriesUseCase(), singletonCImpl.provideEpisodePlayerProvider.get());

          case 1: // com.example.edcaster.ui.player.PlayerViewModel
          return (T) new PlayerViewModel(singletonCImpl.provideEpisodeStoreProvider.get(), singletonCImpl.provideEpisodePlayerProvider.get(), viewModelCImpl.savedStateHandle);

          case 2: // com.example.edcaster.ui.podcast.PodcastDetailsViewModel.Factory
          return (T) new PodcastDetailsViewModel.Factory() {
            @Override
            public PodcastDetailsViewModel create(String podcastUri) {
              return new PodcastDetailsViewModel(singletonCImpl.provideEpisodeStoreProvider.get(), singletonCImpl.provideEpisodePlayerProvider.get(), singletonCImpl.providePodcastStoreProvider.get(), podcastUri);
            }
          };

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends EdcasterApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends EdcasterApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends EdcasterApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<ImageLoader> provideImageLoaderProvider;

    Provider<OkHttpClient> provideOkHttpClientProvider;

    Provider<SyndFeedInput> provideSyndFeedInputProvider;

    Provider<CoroutineDispatcher> provideIODispatcherProvider;

    Provider<EdcasterDatabase> provideDatabaseProvider;

    Provider<PodcastsDao> providePodcastsDaoProvider;

    Provider<PodcastFollowedEntryDao> providePodcastFollowedEntryDaoProvider;

    Provider<TransactionRunner> provideTransactionRunnerProvider;

    Provider<PodcastStore> providePodcastStoreProvider;

    Provider<EpisodesDao> provideEpisodesDaoProvider;

    Provider<EpisodeStore> provideEpisodeStoreProvider;

    Provider<CategoriesDao> provideCategoriesDaoProvider;

    Provider<PodcastCategoryEntryDao> providePodcastCategoryEntryDaoProvider;

    Provider<CategoryStore> provideCategoryStoreProvider;

    Provider<CoroutineDispatcher> provideMainDispatcherProvider;

    Provider<EpisodePlayer> provideEpisodePlayerProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideImageLoaderProvider = DoubleCheck.provider(new SwitchingProvider<ImageLoader>(singletonCImpl, 0));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 1));
      this.provideSyndFeedInputProvider = DoubleCheck.provider(new SwitchingProvider<SyndFeedInput>(singletonCImpl, 2));
      this.provideIODispatcherProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineDispatcher>(singletonCImpl, 3));
      this.provideDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<EdcasterDatabase>(singletonCImpl, 6));
      this.providePodcastsDaoProvider = DoubleCheck.provider(new SwitchingProvider<PodcastsDao>(singletonCImpl, 5));
      this.providePodcastFollowedEntryDaoProvider = DoubleCheck.provider(new SwitchingProvider<PodcastFollowedEntryDao>(singletonCImpl, 7));
      this.provideTransactionRunnerProvider = DoubleCheck.provider(new SwitchingProvider<TransactionRunner>(singletonCImpl, 8));
      this.providePodcastStoreProvider = DoubleCheck.provider(new SwitchingProvider<PodcastStore>(singletonCImpl, 4));
      this.provideEpisodesDaoProvider = DoubleCheck.provider(new SwitchingProvider<EpisodesDao>(singletonCImpl, 10));
      this.provideEpisodeStoreProvider = DoubleCheck.provider(new SwitchingProvider<EpisodeStore>(singletonCImpl, 9));
      this.provideCategoriesDaoProvider = DoubleCheck.provider(new SwitchingProvider<CategoriesDao>(singletonCImpl, 12));
      this.providePodcastCategoryEntryDaoProvider = DoubleCheck.provider(new SwitchingProvider<PodcastCategoryEntryDao>(singletonCImpl, 13));
      this.provideCategoryStoreProvider = DoubleCheck.provider(new SwitchingProvider<CategoryStore>(singletonCImpl, 11));
      this.provideMainDispatcherProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineDispatcher>(singletonCImpl, 14));
      this.provideEpisodePlayerProvider = DoubleCheck.provider(new SwitchingProvider<EpisodePlayer>(singletonCImpl, 15));
    }

    @Override
    public void injectEdcasterApplication(EdcasterApplication arg0) {
      injectEdcasterApplication2(arg0);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @CanIgnoreReturnValue
    private EdcasterApplication injectEdcasterApplication2(EdcasterApplication instance) {
      EdcasterApplication_MembersInjector.injectImageLoader(instance, provideImageLoaderProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // coil.ImageLoader
          return (T) DataDiModule_ProvideImageLoaderFactory.provideImageLoader(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 1: // okhttp3.OkHttpClient
          return (T) DataDiModule_ProvideOkHttpClientFactory.provideOkHttpClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 2: // com.rometools.rome.io.SyndFeedInput
          return (T) DataDiModule_ProvideSyndFeedInputFactory.provideSyndFeedInput();

          case 3: // @com.example.edcaster.core.data.Dispatcher(edcasterDispatcher=IO) kotlinx.coroutines.CoroutineDispatcher
          return (T) DataDiModule_ProvideIODispatcherFactory.provideIODispatcher();

          case 4: // com.example.edcaster.core.data.repository.PodcastStore
          return (T) DataDiModule_ProvidePodcastStoreFactory.providePodcastStore(singletonCImpl.providePodcastsDaoProvider.get(), singletonCImpl.providePodcastFollowedEntryDaoProvider.get(), singletonCImpl.provideTransactionRunnerProvider.get());

          case 5: // com.example.edcaster.core.data.database.dao.PodcastsDao
          return (T) DataDiModule_ProvidePodcastsDaoFactory.providePodcastsDao(singletonCImpl.provideDatabaseProvider.get());

          case 6: // com.example.edcaster.core.data.database.EdcasterDatabase
          return (T) DataDiModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 7: // com.example.edcaster.core.data.database.dao.PodcastFollowedEntryDao
          return (T) DataDiModule_ProvidePodcastFollowedEntryDaoFactory.providePodcastFollowedEntryDao(singletonCImpl.provideDatabaseProvider.get());

          case 8: // com.example.edcaster.core.data.database.dao.TransactionRunner
          return (T) DataDiModule_ProvideTransactionRunnerFactory.provideTransactionRunner(singletonCImpl.provideDatabaseProvider.get());

          case 9: // com.example.edcaster.core.data.repository.EpisodeStore
          return (T) DataDiModule_ProvideEpisodeStoreFactory.provideEpisodeStore(singletonCImpl.provideEpisodesDaoProvider.get());

          case 10: // com.example.edcaster.core.data.database.dao.EpisodesDao
          return (T) DataDiModule_ProvideEpisodesDaoFactory.provideEpisodesDao(singletonCImpl.provideDatabaseProvider.get());

          case 11: // com.example.edcaster.core.data.repository.CategoryStore
          return (T) DataDiModule_ProvideCategoryStoreFactory.provideCategoryStore(singletonCImpl.provideCategoriesDaoProvider.get(), singletonCImpl.providePodcastCategoryEntryDaoProvider.get(), singletonCImpl.providePodcastsDaoProvider.get(), singletonCImpl.provideEpisodesDaoProvider.get());

          case 12: // com.example.edcaster.core.data.database.dao.CategoriesDao
          return (T) DataDiModule_ProvideCategoriesDaoFactory.provideCategoriesDao(singletonCImpl.provideDatabaseProvider.get());

          case 13: // com.example.edcaster.core.data.database.dao.PodcastCategoryEntryDao
          return (T) DataDiModule_ProvidePodcastCategoryEntryDaoFactory.providePodcastCategoryEntryDao(singletonCImpl.provideDatabaseProvider.get());

          case 14: // @com.example.edcaster.core.data.Dispatcher(edcasterDispatcher=Main) kotlinx.coroutines.CoroutineDispatcher
          return (T) DataDiModule_ProvideMainDispatcherFactory.provideMainDispatcher();

          case 15: // com.example.edcaster.core.player.EpisodePlayer
          return (T) DomainDiModule_ProvideEpisodePlayerFactory.provideEpisodePlayer(singletonCImpl.provideMainDispatcherProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
