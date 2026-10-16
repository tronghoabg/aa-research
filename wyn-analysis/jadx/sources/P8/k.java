package p8;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class k extends ic.d {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f43282b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f43283c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f43284d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f43285e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f43286f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f43287g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new j());
        }
        try {
            f43284d = unsafe.objectFieldOffset(m.class.getDeclaredField("c"));
            f43283c = unsafe.objectFieldOffset(m.class.getDeclaredField("b"));
            f43285e = unsafe.objectFieldOffset(m.class.getDeclaredField("a"));
            f43286f = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
            f43287g = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
            f43282b = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // ic.d
    public final void I(l lVar, l lVar2) {
        f43282b.putObject(lVar, f43287g, lVar2);
    }

    @Override // ic.d
    public final void J(l lVar, Thread thread) {
        f43282b.putObject(lVar, f43286f, thread);
    }

    @Override // ic.d
    public final boolean h(m mVar, c cVar, c cVar2) {
        return h.a(f43282b, mVar, f43283c, cVar, cVar2);
    }

    @Override // ic.d
    public final boolean i(m mVar, Object obj, Object obj2) {
        return i.a(f43282b, mVar, f43285e, obj, obj2);
    }

    @Override // ic.d
    public final boolean j(m mVar, l lVar, l lVar2) {
        return g.a(f43282b, mVar, f43284d, lVar, lVar2);
    }

    @Override // ic.d
    public final c v(m mVar) {
        c cVar;
        c cVar2 = c.f43273d;
        do {
            cVar = mVar.f43296b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!h(mVar, cVar, cVar2));
        return cVar;
    }

    @Override // ic.d
    public final l w(m mVar) {
        l lVar;
        l lVar2 = l.f43288c;
        do {
            lVar = mVar.f43297c;
            if (lVar2 == lVar) {
                break;
            }
        } while (!j(mVar, lVar, lVar2));
        return lVar;
    }
}
