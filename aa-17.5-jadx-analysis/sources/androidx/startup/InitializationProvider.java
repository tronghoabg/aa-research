package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import defpackage.fci;
import defpackage.fcj;
import defpackage.fck;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new fck();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        if (fci.a == null) {
            synchronized (fci.b) {
                if (fci.a == null) {
                    fci.a = new fci(context);
                }
            }
        }
        Class<?> cls = getClass();
        fci fciVar = fci.a;
        try {
            Context context2 = fciVar.e;
            Bundle bundle = context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData;
            String string = context2.getString(R.string.androidx_startup);
            if (bundle == null) {
                return true;
            }
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls2 = Class.forName(str);
                        if (fcj.class.isAssignableFrom(cls2)) {
                            fciVar.d.add(cls2);
                        }
                    }
                }
                Iterator it = fciVar.d.iterator();
                while (it.hasNext()) {
                    fciVar.a((Class) it.next(), hashSet);
                }
                return true;
            } catch (ClassNotFoundException e) {
                throw new fck(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new fck(e2);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
