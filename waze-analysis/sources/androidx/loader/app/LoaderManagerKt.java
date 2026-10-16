package androidx.loader.app;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LoaderManagerKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.loader.app.LoaderManagerKt$initLoader$2, reason: invalid class name */
    public final class AnonymousClass2 implements LoaderManager.LoaderCallbacks {
        final /* synthetic */ Loader $loader;
        final /* synthetic */ l $onLoadFinished;
        final /* synthetic */ a<ab> $onLoaderReset;

        public AnonymousClass2(Loader loader, l lVar, a<ab> aVar) {
            this.$loader = loader;
            this.$onLoadFinished = lVar;
            this.$onLoaderReset = aVar;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public Loader onCreateLoader(int i2, Bundle bundle) {
            return this.$loader;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoadFinished(Loader loader, Object obj) {
            x.f(loader, "loader");
            this.$onLoadFinished.invoke(obj);
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoaderReset(Loader loader) {
            x.f(loader, "loader");
            this.$onLoaderReset.invoke();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.loader.app.LoaderManagerKt$restartLoader$2, reason: invalid class name and case insensitive filesystem */
    public final class C04462 implements LoaderManager.LoaderCallbacks {
        final /* synthetic */ Loader $loader;
        final /* synthetic */ l $onLoadFinished;
        final /* synthetic */ a<ab> $onLoaderReset;

        public C04462(Loader loader, l lVar, a<ab> aVar) {
            this.$loader = loader;
            this.$onLoadFinished = lVar;
            this.$onLoaderReset = aVar;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public Loader onCreateLoader(int i2, Bundle bundle) {
            return this.$loader;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoadFinished(Loader loader, Object obj) {
            x.f(loader, "loader");
            this.$onLoadFinished.invoke(obj);
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoaderReset(Loader loader) {
            x.f(loader, "loader");
            this.$onLoaderReset.invoke();
        }
    }

    public static final <D> void initLoader(LoaderManager loaderManager, int i2, Loader<D> loader, a<ab> aVar, l<? super D, ab> lVar) {
        x.f(loaderManager, "<this>");
        x.f(loader, "loader");
        x.f(aVar, "onLoaderReset");
        x.f(lVar, "onLoadFinished");
        loaderManager.initLoader(i2, null, new AnonymousClass2(loader, lVar, aVar));
    }

    public static /* synthetic */ void initLoader$default(LoaderManager loaderManager, int i2, Loader loader, a aVar, l lVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            aVar = new a<ab>() { // from class: androidx.loader.app.LoaderManagerKt.initLoader.1
                @Override // h.g.a.a
                public /* bridge */ /* synthetic */ ab invoke() {
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        x.f(loaderManager, "<this>");
        x.f(loader, "loader");
        x.f(aVar, "onLoaderReset");
        x.f(lVar, "onLoadFinished");
        loaderManager.initLoader(i2, null, new AnonymousClass2(loader, lVar, aVar));
    }

    public static final <D> void restartLoader(LoaderManager loaderManager, int i2, Loader<D> loader, a<ab> aVar, l<? super D, ab> lVar) {
        x.f(loaderManager, "<this>");
        x.f(loader, "loader");
        x.f(aVar, "onLoaderReset");
        x.f(lVar, "onLoadFinished");
        loaderManager.restartLoader(i2, null, new C04462(loader, lVar, aVar));
    }

    public static /* synthetic */ void restartLoader$default(LoaderManager loaderManager, int i2, Loader loader, a aVar, l lVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            aVar = new a<ab>() { // from class: androidx.loader.app.LoaderManagerKt.restartLoader.1
                @Override // h.g.a.a
                public /* bridge */ /* synthetic */ ab invoke() {
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        x.f(loaderManager, "<this>");
        x.f(loader, "loader");
        x.f(aVar, "onLoaderReset");
        x.f(lVar, "onLoadFinished");
        loaderManager.restartLoader(i2, null, new C04462(loader, lVar, aVar));
    }
}
