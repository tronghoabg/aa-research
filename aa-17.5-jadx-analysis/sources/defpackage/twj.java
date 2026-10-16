package defpackage;

/* loaded from: classes3.dex */
public final class twj {
    public Object a;
    public Object b;
    public Object c;
    public final Object d;

    public twj(roa roaVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = roaVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tpz] */
    public final void a(tpz tpzVar) {
        synchronized (this.d) {
            ?? r1 = this.a;
            if (tpzVar == r1) {
                return;
            }
            if (r1 != 0 && r1 != this.b && r1 != this.c) {
                r1.f();
            }
            this.a = tpzVar;
        }
    }

    public final void b(yze yzeVar) {
        if (yzeVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.a = yzeVar;
    }

    public final void c(yzf yzfVar) {
        if (yzfVar == null) {
            throw new NullPointerException("Null errorDetail");
        }
        this.c = yzfVar;
    }

    public twj() {
        xvy xvyVar = xvy.a;
        this.b = xvyVar;
        this.d = xvyVar;
    }
}
