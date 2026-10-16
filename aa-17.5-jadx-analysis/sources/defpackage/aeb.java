package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class aeb {
    public final long a;
    public final bwq b;
    public aei c;
    public long d;
    public long e;
    public final bii f;
    private final afdr g;
    private final bwq h;

    public aeb(Object obj, bii biiVar, aei aeiVar, long j, long j2, afdr afdrVar) {
        this.f = biiVar;
        this.a = j2;
        this.g = afdrVar;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(obj, bxpVar);
        this.c = ca.A(aeiVar);
        this.d = j;
        this.e = Long.MIN_VALUE;
        this.h = new ParcelableSnapshotMutableState(true, bxpVar);
    }

    public final Object a() {
        return this.b.a();
    }

    public final void b() {
        d();
        this.g.invoke();
    }

    public final boolean c() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final void d() {
        this.h.b(false);
    }
}
