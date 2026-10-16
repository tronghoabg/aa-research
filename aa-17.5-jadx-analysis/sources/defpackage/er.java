package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class er {
    static final eq a = new eq(new pj(1));
    public static int b = -100;
    public static dwa c = null;
    public static dwa d = null;
    private static Boolean i = null;
    public static boolean e = false;
    public static final yy f = new yy(0);
    public static final Object g = new Object();
    public static final Object h = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(er erVar) {
        synchronized (g) {
            yx yxVar = new yx(f);
            while (yxVar.hasNext()) {
                er erVar2 = (er) ((WeakReference) yxVar.next()).get();
                if (erVar2 == erVar || erVar2 == null) {
                    yxVar.remove();
                }
            }
        }
    }

    static boolean p(Context context) throws PackageManager.NameNotFoundException {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) fj.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                i = false;
            }
        }
        return i.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract ef b();

    public abstract MenuInflater c();

    public abstract View d(int i2);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void l(int i2);

    public abstract void m(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t(int i2);
}
