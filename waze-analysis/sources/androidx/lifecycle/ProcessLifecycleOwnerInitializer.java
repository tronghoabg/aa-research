package androidx.lifecycle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    private static final String TAG = "ProcessLifecycleG3";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("androidx.startup.InitializationProvider");
            Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class<?> cls = Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
            cls.getMethod("create", Context.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), getContext());
        } catch (Exception unused2) {
            Log.d(TAG, "androidx.startup is not available, initializing using ProcessLifecycleOwnerInitializer instead.");
            LifecycleDispatcher.init(getContext());
            ProcessLifecycleOwner.init(getContext());
            return true;
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
