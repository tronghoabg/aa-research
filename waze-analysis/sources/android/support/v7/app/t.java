package android.support.v7.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArraySet;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f623b = 0;

    /* renamed from: a, reason: collision with root package name */
    static final r f622a = new r(new s());

    /* renamed from: c, reason: collision with root package name */
    private static int f624c = -100;

    /* renamed from: d, reason: collision with root package name */
    private static LocaleListCompat f625d = null;

    /* renamed from: e, reason: collision with root package name */
    private static LocaleListCompat f626e = null;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f627f = null;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f628g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final ArraySet f629h = new ArraySet();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f630i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static final Object f631j = new Object();

    t() {
    }

    private static void D(t tVar) {
        synchronized (f630i) {
            Iterator it = f629h.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) ((WeakReference) it.next()).get();
                if (tVar2 == tVar || tVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static int a() {
        return f624c;
    }

    static LocaleListCompat f() {
        return f625d;
    }

    static void g(t tVar) {
        synchronized (f630i) {
            D(tVar);
            f629h.add(new WeakReference(tVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void k(android.content.Context r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L7e
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r3 = "android.support.v7.app.AppLocalesMetadataHolderService"
            r0.<init>(r5, r3)
            android.content.pm.PackageManager r3 = r5.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r1) goto L7e
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "locale"
            if (r3 < r2) goto L53
            androidx.collection.ArraySet r2 = android.support.v7.app.t.f629h
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.support.v7.app.t r3 = (android.support.v7.app.t) r3
            if (r3 == 0) goto L24
            android.content.Context r3 = r3.c()
            if (r3 == 0) goto L24
            java.lang.Object r2 = r3.getSystemService(r4)
            goto L44
        L43:
            r2 = 0
        L44:
            if (r2 == 0) goto L58
            android.app.LocaleManager r2 = com.a.a.a.a$$ExternalSyntheticApiModelOutline0.m(r2)
            android.os.LocaleList r2 = com.a.a.a.a$$ExternalSyntheticApiModelOutline0.m(r2)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.wrap(r2)
            goto L5c
        L53:
            androidx.core.os.LocaleListCompat r2 = android.support.v7.app.t.f625d
            if (r2 == 0) goto L58
            goto L5c
        L58:
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
        L5c:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L77
            java.lang.String r2 = androidx.core.app.AppLocalesStorageHelper.readLocales(r5)
            java.lang.Object r3 = r5.getSystemService(r4)
            if (r3 == 0) goto L77
            android.os.LocaleList r2 = a.a$$ExternalSyntheticApiModelOutline0.m(r2)
            android.app.LocaleManager r3 = com.a.a.a.a$$ExternalSyntheticApiModelOutline0.m(r3)
            com.a.a.a.a$$ExternalSyntheticApiModelOutline0.m(r3, r2)
        L77:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r5.setComponentEnabledSetting(r0, r1, r1)
        L7e:
            android.support.v7.app.t.f628g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.t.k(android.content.Context):void");
    }

    static void o(t tVar) {
        synchronized (f630i) {
            D(tVar);
        }
    }

    public static void s(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f624c != i2) {
            f624c = i2;
            synchronized (f630i) {
                Iterator it = f629h.iterator();
                while (it.hasNext()) {
                    t tVar = (t) ((WeakReference) it.next()).get();
                    if (tVar != null) {
                        tVar.x();
                    }
                }
            }
        }
    }

    static void v(Context context) {
        if (w(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f628g) {
                    return;
                }
                f622a.execute(new p(context, 0));
                return;
            }
            synchronized (f631j) {
                LocaleListCompat localeListCompat = f625d;
                if (localeListCompat == null) {
                    LocaleListCompat localeListCompatForLanguageTags = f626e;
                    if (localeListCompatForLanguageTags == null) {
                        localeListCompatForLanguageTags = LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
                        f626e = localeListCompatForLanguageTags;
                    }
                    if (localeListCompatForLanguageTags.isEmpty()) {
                    } else {
                        f625d = f626e;
                    }
                } else if (!localeListCompat.equals(f626e)) {
                    LocaleListCompat localeListCompat2 = f625d;
                    f626e = localeListCompat2;
                    AppLocalesStorageHelper.persistLocales(context, localeListCompat2.toLanguageTags());
                }
            }
        }
    }

    static boolean w(Context context) throws PackageManager.NameNotFoundException {
        if (f627f == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ar.class), 640);
                if (serviceInfo.metaData != null) {
                    f627f = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f627f = false;
            }
        }
        return f627f.booleanValue();
    }

    public abstract void A(int i2);

    public abstract void B();

    public abstract android.support.a.i C();

    public Context b(Context context) {
        throw null;
    }

    public Context c() {
        throw null;
    }

    public abstract MenuInflater d();

    public abstract View e(int i2);

    public abstract void h(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void i();

    public abstract void j();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void p(int i2);

    public abstract void q(View view);

    public abstract void r(View view, ViewGroup.LayoutParams layoutParams);

    public void t(int i2) {
        throw null;
    }

    public abstract void u(CharSequence charSequence);

    public abstract void x();

    public abstract void y();

    public abstract void z();
}
