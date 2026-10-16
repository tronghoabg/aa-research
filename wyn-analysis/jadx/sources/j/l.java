package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import g1.C2668d;
import java.lang.ref.WeakReference;
import x.C4408a;
import x.C4413f;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final T3.m f38464a = new T3.m(new T3.o(2));

    /* renamed from: b, reason: collision with root package name */
    public static final int f38465b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static C2668d f38466c = null;

    /* renamed from: d, reason: collision with root package name */
    public static C2668d f38467d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f38468e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f38469f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final C4413f f38470g = new C4413f(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f38471h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f38472i = new Object();

    public static boolean c(Context context) {
        if (f38468e == null) {
            try {
                int i5 = AbstractServiceC3061B.f38369a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC3061B.class), Build.VERSION.SDK_INT >= 24 ? AbstractC3060A.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f38468e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f38468e = Boolean.FALSE;
            }
        }
        return f38468e.booleanValue();
    }

    public static void g(w wVar) {
        synchronized (f38471h) {
            try {
                C4413f c4413f = f38470g;
                c4413f.getClass();
                C4408a c4408a = new C4408a(c4413f);
                while (c4408a.hasNext()) {
                    l lVar = (l) ((WeakReference) c4408a.next()).get();
                    if (lVar == wVar || lVar == null) {
                        c4408a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i5);

    public abstract void i(int i5);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
