package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import defpackage.epr;
import defpackage.epw;
import defpackage.epx;
import defpackage.eqr;
import defpackage.eqt;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("androidx.startup.InitializationProvider");
            Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class<?> cls = Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
            cls.getMethod("create", Context.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), getContext());
        } catch (Exception unused2) {
            Log.d("ProcessLifecycleG3", "androidx.startup is not available, initializing using ProcessLifecycleOwnerInitializer instead.");
            Context context = getContext();
            if (!epx.a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new epw());
            }
            Context context2 = getContext();
            eqt eqtVar = eqt.a;
            eqtVar.e = new Handler();
            eqtVar.f.e(epr.ON_CREATE);
            ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new eqr(eqtVar));
            return true;
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
