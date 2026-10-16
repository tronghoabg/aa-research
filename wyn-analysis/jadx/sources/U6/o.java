package u6;

import A7.V1;
import Hf.InterfaceC0602l;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jf.InterfaceC3108h;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static o f46705e;

    /* renamed from: a, reason: collision with root package name */
    public int f46706a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f46707b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f46708c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f46709d;

    public o(Context context) {
        this.f46707b = new Handler(Looper.getMainLooper());
        this.f46708c = new CopyOnWriteArrayList();
        this.f46709d = new Object();
        this.f46706a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        v.C(context, new V1(this, 12), intentFilter);
    }

    public static void a(o oVar, int i5) {
        synchronized (oVar.f46709d) {
            try {
                if (oVar.f46706a == i5) {
                    return;
                }
                oVar.f46706a = i5;
                Iterator it = ((CopyOnWriteArrayList) oVar.f46708c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    t6.o oVar2 = (t6.o) weakReference.get();
                    if (oVar2 != null) {
                        oVar2.a(i5);
                    } else {
                        ((CopyOnWriteArrayList) oVar.f46708c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized o b(Context context) {
        try {
            if (f46705e == null) {
                f46705e = new o(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f46705e;
    }

    public int c() {
        int i5;
        synchronized (this.f46709d) {
            i5 = this.f46706a;
        }
        return i5;
    }

    public o(int i5, Gf.a aVar, InterfaceC0602l interfaceC0602l, InterfaceC3108h interfaceC3108h) {
        this.f46707b = interfaceC0602l;
        this.f46706a = i5;
        this.f46708c = aVar;
        this.f46709d = interfaceC3108h;
    }
}
