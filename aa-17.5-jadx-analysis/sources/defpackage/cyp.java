package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class cyp {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public cyp() {
        bxp bxpVar = bxp.c;
        this.f = new ParcelableSnapshotMutableState(false, bxpVar);
        this.c = new ParcelableSnapshotMutableFloatState(1.0f);
        this.g = new ParcelableSnapshotMutableState(false, bxpVar);
        this.d = new ParcelableSnapshotMutableFloatState(1.0f);
        this.h = new ParcelableSnapshotMutableState(false, bxpVar);
        this.a = new ParcelableSnapshotMutableState(new cla(roc.aA(0.5f, 0.5f)), bxpVar);
        this.b = new ParcelableSnapshotMutableState(false, bxpVar);
        this.e = new ParcelableSnapshotMutableState(new cjv(0L), bxpVar);
    }

    public final float a() {
        return ((byb) this.c).e();
    }

    public final float b() {
        return ((byb) this.d).e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bwq, java.lang.Object] */
    public final long c() {
        return ((cla) this.a.a()).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bwq, java.lang.Object] */
    public final long d() {
        return ((cjv) this.e.a()).a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bwq, java.lang.Object] */
    public final void e() {
        ((byb) this.c).h(1.0f);
        this.f.b(false);
        ((byb) this.d).h(1.0f);
        this.g.b(false);
        this.a.b(new cla(roc.aA(0.5f, 0.5f)));
        this.h.b(false);
        this.e.b(new cjv(0L));
        this.b.b(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    public final boolean f() {
        return ((Boolean) this.f.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    public final boolean g() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    public final boolean h() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    public final boolean i() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    public cyp(afec afecVar) {
        this.a = new ces(afecVar);
        this.b = new bwr(18);
        this.c = new bwr(19);
        this.d = new bwr(20);
        this.e = new cyo(1);
        this.f = new cyo(0);
        this.g = new cyo(2);
        this.h = new cyo(3);
    }
}
