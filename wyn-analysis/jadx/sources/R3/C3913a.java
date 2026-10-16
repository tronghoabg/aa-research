package r3;

import E5.Q;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.wynauto.wyn.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3913a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C3913a f44323d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f44324e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f44327c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f44326b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f44325a = new HashMap();

    public C3913a(Context context) {
        this.f44327c = context.getApplicationContext();
    }

    public static C3913a c(Context context) {
        if (f44323d == null) {
            synchronized (f44324e) {
                try {
                    if (f44323d == null) {
                        f44323d = new C3913a(context);
                    }
                } finally {
                }
            }
        }
        return f44323d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f44327c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f44326b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC3914b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new Q(e7, 16);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (tg.b.F()) {
            try {
                Trace.beginSection(tg.b.U(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f44325a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC3914b interfaceC3914b = (InterfaceC3914b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listDependencies = interfaceC3914b.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = interfaceC3914b.create(this.f44327c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new Q(th2, 16);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
