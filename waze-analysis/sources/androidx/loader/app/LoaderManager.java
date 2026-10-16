package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class LoaderManager {

    /* compiled from: WazeSource */
    public interface LoaderCallbacks<D> {
        Loader<D> onCreateLoader(int i2, Bundle bundle);

        void onLoadFinished(Loader<D> loader, D d2);

        void onLoaderReset(Loader<D> loader);
    }

    @Deprecated
    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }

    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager getInstance(T t) {
        return new LoaderManagerImpl(t, t.getViewModelStore());
    }

    public abstract void destroyLoader(int i2);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> Loader<D> getLoader(int i2);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract <D> Loader<D> initLoader(int i2, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);

    public abstract void markForRedelivery();

    public abstract <D> Loader<D> restartLoader(int i2, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);

    static LoaderManager getInstance(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        return new LoaderManagerImpl(lifecycleOwner, viewModelStore);
    }
}
