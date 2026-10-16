package G3;

import A.e0;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import com.applovin.impl.T0;
import ef.C2515C;
import ff.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class l implements E3.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l f4220c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f4221d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final j f4222a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4223b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f4222a = jVar;
        if (jVar != null) {
            jVar.d(new e0(this, 6));
        }
    }

    @Override // E3.a
    public final void a(D3.i iVar) {
        synchronized (f4221d) {
            try {
                if (this.f4222a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f4223b.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.f4218b == iVar) {
                        arrayList.add(kVar);
                    }
                }
                this.f4223b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((k) it2.next()).f4217a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f4223b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((k) it3.next()).f4217a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    j jVar = this.f4222a;
                    if (jVar != null) {
                        jVar.b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E3.a
    public final void b(Context context, T0 t02, D3.i iVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        C2515C c2515c = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        v vVar = v.f35432a;
        if (activity != null) {
            ReentrantLock reentrantLock = f4221d;
            reentrantLock.lock();
            try {
                j jVar = this.f4222a;
                if (jVar == null) {
                    iVar.accept(new D3.k(vVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f4223b;
                boolean z2 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k) it.next()).f4217a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, t02, iVar);
                copyOnWriteArrayList.add(kVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (activity.equals(((k) next).f4217a)) {
                                break;
                            }
                        }
                    }
                    k kVar2 = (k) next;
                    D3.k kVar3 = kVar2 != null ? kVar2.f4219c : null;
                    if (kVar3 != null) {
                        kVar.f4219c = kVar3;
                        kVar.f4218b.accept(kVar3);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i(jVar, activity));
                    }
                }
                reentrantLock.unlock();
                c2515c = C2515C.f34653a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c2515c == null) {
            iVar.accept(new D3.k(vVar));
        }
    }
}
