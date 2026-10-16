package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.media3.common.MimeTypes;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import h.m.k;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class ViewModelProvider {
    public static final Companion Companion = new Companion(null);
    public static final CreationExtras.Key<String> VIEW_MODEL_KEY = new CreationExtras.Key<String>() { // from class: androidx.lifecycle.ViewModelProvider$special$$inlined$Key$1
        public String toString() {
            int iHashCode = hashCode();
            k.y(16);
            String string = Integer.toString(iHashCode, 16);
            x.e(string, "toString(...)");
            int i2 = ar.f48106a;
            return "CreationExtras.Key@" + string + "<" + new m(String.class).c() + ">";
        }
    };
    private final ViewModelProviderImpl impl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        this(new ViewModelProviderImpl(viewModelStore, factory, creationExtras));
        x.f(viewModelStore, "store");
        x.f(factory, "factory");
        x.f(creationExtras, "defaultCreationExtras");
    }

    public static final ViewModelProvider create(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStore, factory, creationExtras);
    }

    public <T extends ViewModel> T get(String str, Class<T> cls) {
        x.f(str, "key");
        x.f(cls, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel(o.y(cls), str);
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public class AndroidViewModelFactory extends NewInstanceFactory {
        private static AndroidViewModelFactory _instance;
        private final Application application;
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<Application> APPLICATION_KEY = new CreationExtras.Key<Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1
            public String toString() {
                int iHashCode = hashCode();
                k.y(16);
                String string = Integer.toString(iHashCode, 16);
                x.e(string, "toString(...)");
                int i2 = ar.f48106a;
                return "CreationExtras.Key@" + string + "<" + new m(Application.class).c() + ">";
            }
        };

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                x.c(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (InstantiationException e3) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            } catch (NoSuchMethodException e4) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
            } catch (InvocationTargetException e5) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e5);
            }
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
                if (AndroidViewModelFactory._instance == null) {
                    AndroidViewModelFactory._instance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory._instance;
                x.c(androidViewModelFactory);
                return androidViewModelFactory;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        private AndroidViewModelFactory(Application application, int i2) {
            this.application = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            x.f(cls, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            x.f(cls, "modelClass");
            x.f(creationExtras, "extras");
            if (this.application != null) {
                return (T) create(cls);
            }
            Application application = (Application) creationExtras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(cls, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProvider.VIEW_MODEL_KEY;
        private static NewInstanceFactory _instance;

        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(c<T> cVar, CreationExtras creationExtras) {
            x.f(cVar, "modelClass");
            x.f(creationExtras, "extras");
            return (T) create(o.w(cVar), creationExtras);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory._instance == null) {
                    NewInstanceFactory._instance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory._instance;
                x.c(newInstanceFactory);
                return newInstanceFactory;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            x.f(cls, "modelClass");
            x.f(creationExtras, "extras");
            return (T) create(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            x.f(cls, "modelClass");
            return (T) JvmViewModelProviders.INSTANCE.createViewModel(cls);
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                factory = DefaultViewModelProviderFactory.INSTANCE;
            }
            if ((i2 & 4) != 0) {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            return companion.create(viewModelStore, factory, creationExtras);
        }

        public final ViewModelProvider create(ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras) {
            x.f(viewModelStoreOwner, "owner");
            x.f(factory, "factory");
            x.f(creationExtras, "extras");
            return new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), factory, creationExtras);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                factory = ViewModelStoreOwnerDefaults.getViewModelProviderFactory(viewModelStoreOwner);
            }
            if ((i2 & 4) != 0) {
                creationExtras = ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner);
            }
            return companion.create(viewModelStoreOwner, factory, creationExtras);
        }

        public final ViewModelProvider create(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
            x.f(viewModelStore, "store");
            x.f(factory, "factory");
            x.f(creationExtras, "extras");
            return new ViewModelProvider(viewModelStore, factory, creationExtras);
        }
    }

    public static final ViewModelProvider create(ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStoreOwner, factory, creationExtras);
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: WazeSource */
        public final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
                x.f(viewModelInitializerArr, "initializers");
                return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel((ViewModelInitializer<?>[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
            }
        }

        <T extends ViewModel> T create(c<T> cVar, CreationExtras creationExtras);

        <T extends ViewModel> T create(Class<T> cls);

        <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras);

        /* compiled from: WazeSource */
        /* renamed from: androidx.lifecycle.ViewModelProvider$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static ViewModel $default$create(Factory factory, c cVar, CreationExtras creationExtras) {
                x.f(cVar, "modelClass");
                x.f(creationExtras, "extras");
                return factory.create(o.w(cVar), creationExtras);
            }

            public static Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
                return Factory.Companion.from(viewModelInitializerArr);
            }

            public static ViewModel $default$create(Factory factory, Class cls, CreationExtras creationExtras) {
                x.f(cls, "modelClass");
                x.f(creationExtras, "extras");
                return factory.create(cls);
            }

            public static ViewModel $default$create(Factory factory, Class cls) {
                x.f(cls, "modelClass");
                return ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel();
            }
        }
    }

    public <T extends ViewModel> T get(Class<T> cls) {
        x.f(cls, "modelClass");
        return (T) get(o.y(cls));
    }

    public final <T extends ViewModel> T get(String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel(cVar, str);
    }

    public final <T extends ViewModel> T get(c<T> cVar) {
        x.f(cVar, "modelClass");
        return (T) ViewModelProviderImpl.getViewModel$lifecycle_viewmodel$default(this.impl, cVar, null, 2, null);
    }

    private ViewModelProvider(ViewModelProviderImpl viewModelProviderImpl) {
        this.impl = viewModelProviderImpl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, null, 4, null);
        x.f(viewModelStore, "store");
        x.f(factory, "factory");
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras.Empty empty, int i2, o oVar) {
        this(viewModelStore, factory, (i2 & 4) != 0 ? CreationExtras.Empty.INSTANCE : empty);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner) {
        this(viewModelStoreOwner.getViewModelStore(), ViewModelStoreOwnerDefaults.getViewModelProviderFactory(viewModelStoreOwner), ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner));
        x.f(viewModelStoreOwner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        this(viewModelStoreOwner.getViewModelStore(), factory, ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner));
        x.f(viewModelStoreOwner, "owner");
        x.f(factory, "factory");
    }
}
