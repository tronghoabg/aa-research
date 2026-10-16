package A7;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f674a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AtomicReference f675b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ P0 f676c;

    public /* synthetic */ Q0() {
        this.f674a = 0;
    }

    private final void a() {
        synchronized (this.f675b) {
            try {
                try {
                    AtomicReference atomicReference = this.f675b;
                    C0273n0 c0273n0 = (C0273n0) this.f676c.f421a;
                    C0245e c0245e = c0273n0.f979g;
                    String strK0 = c0273n0.j().k0();
                    c0245e.getClass();
                    atomicReference.set(Boolean.valueOf(c0245e.o0(strK0, AbstractC0304y.f1141N)));
                } finally {
                    this.f675b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (this.f675b) {
            try {
                try {
                    AtomicReference atomicReference = this.f675b;
                    C0273n0 c0273n0 = (C0273n0) this.f676c.f421a;
                    C0245e c0245e = c0273n0.f979g;
                    String strK0 = c0273n0.j().k0();
                    c0245e.getClass();
                    atomicReference.set(c0245e.l0(strK0, AbstractC0304y.f1143O));
                } finally {
                    this.f675b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.f675b) {
            try {
                try {
                    AtomicReference atomicReference = this.f675b;
                    C0273n0 c0273n0 = (C0273n0) this.f676c.f421a;
                    atomicReference.set(Integer.valueOf(c0273n0.f979g.i0(c0273n0.j().k0(), AbstractC0304y.f1147Q)));
                } finally {
                    this.f675b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (this.f675b) {
            try {
                try {
                    AtomicReference atomicReference = this.f675b;
                    C0273n0 c0273n0 = (C0273n0) this.f676c.f421a;
                    atomicReference.set(Long.valueOf(c0273n0.f979g.j0(c0273n0.j().k0(), AbstractC0304y.f1145P)));
                } finally {
                    this.f675b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f674a) {
            case 0:
                P0 p02 = this.f676c;
                Bundle bundleO = p02.a0().f774o.o();
                C0271m1 c0271m1H = AbstractC0279p0.h((C0273n0) p02.f421a);
                c0271m1H.m0(new W0(c0271m1H, this.f675b, c0271m1H.w0(false), bundleO, 3));
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            default:
                synchronized (this.f675b) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f675b;
                            C0273n0 c0273n0 = (C0273n0) this.f676c.f421a;
                            atomicReference.set(Double.valueOf(c0273n0.f979g.e0(c0273n0.j().k0(), AbstractC0304y.f1149R)));
                        } finally {
                            this.f675b.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ Q0(P0 p02, AtomicReference atomicReference, int i5) {
        this.f674a = i5;
        this.f675b = atomicReference;
        this.f676c = p02;
    }
}
