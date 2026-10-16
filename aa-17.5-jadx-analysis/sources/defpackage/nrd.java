package defpackage;

import com.google.android.gms.car.display.CarDisplayId;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class nrd {
    public boolean a;
    public final Object b;
    public Object c;

    public nrd(byte[] bArr) {
        this.a = false;
        this.c = null;
        this.b = null;
    }

    public static nrd a() {
        return (nrd) ((msd) mki.a.i(msd.class)).i().i(nrd.class);
    }

    public final void b() {
        if (!this.a) {
            throw new lhs("Cannot use this method if service has not been started");
        }
    }

    public final boolean c() {
        return d() || f();
    }

    public final boolean d() {
        b();
        Object obj = this.c;
        obj.getClass();
        return ((lds) obj).d();
    }

    public final boolean e() {
        b();
        Object obj = this.c;
        obj.getClass();
        return ((lds) obj).f();
    }

    public final boolean f() {
        b();
        Object obj = this.c;
        obj.getClass();
        return ((lds) obj).e();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void g(swa swaVar) {
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(swaVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Queue] */
    public final void h(svz svzVar) {
        swa swaVar;
        Object obj = this.b;
        synchronized (obj) {
            if (this.c != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (obj) {
                        swaVar = (swa) this.c.poll();
                        if (swaVar == null) {
                            this.a = false;
                            return;
                        }
                    }
                    swaVar.a(svzVar);
                }
            }
        }
    }

    public nrd(CarDisplayId carDisplayId) {
        this.b = carDisplayId;
    }

    public nrd() {
        this.b = new Object();
    }
}
