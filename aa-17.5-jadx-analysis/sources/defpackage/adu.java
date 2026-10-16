package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class adu {
    public final String a;
    public final aed b;
    public final aei c;
    public final aei d;
    public aei e;
    public aei f;
    public final bii g;
    private final Object h;
    private final bwq i;
    private final bwq j;
    private final aft k;
    private final bii l;

    public adu(Object obj, bii biiVar, Object obj2, String str) {
        this.g = biiVar;
        this.h = obj2;
        this.a = str;
        this.b = new aed(biiVar, obj, null, Long.MIN_VALUE, Long.MIN_VALUE, false);
        bxp bxpVar = bxp.c;
        this.i = new ParcelableSnapshotMutableState(false, bxpVar);
        this.j = new ParcelableSnapshotMutableState(obj, bxpVar);
        this.l = new bii((char[]) null, (byte[]) null);
        this.k = new aft(1.0f, 1500.0f, obj2);
        aei aeiVarA = a();
        aei aeiVar = aeiVarA instanceof aee ? adv.e : aeiVarA instanceof aef ? adv.f : aeiVarA instanceof aeg ? adv.g : adv.h;
        this.c = aeiVar;
        aei aeiVarA2 = a();
        aei aeiVar2 = aeiVarA2 instanceof aee ? adv.a : aeiVarA2 instanceof aef ? adv.b : aeiVarA2 instanceof aeg ? adv.c : adv.d;
        this.d = aeiVar2;
        this.e = aeiVar;
        this.f = aeiVar2;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [afec, java.lang.Object] */
    public static /* synthetic */ Object k(adu aduVar, Object obj, aec aecVar, afec afecVar, afck afckVar, int i) {
        if ((i & 2) != 0) {
            aecVar = aduVar.k;
        }
        aec aecVar2 = aecVar;
        Object objInvoke = (i & 4) != 0 ? aduVar.g.a.invoke(aduVar.a()) : null;
        afec afecVar2 = (i & 8) != 0 ? null : afecVar;
        Object objD = aduVar.d();
        bii biiVar = aduVar.g;
        return aduVar.l.u(afn.a, new ads(aduVar, objInvoke, new afy(aecVar2, biiVar, objD, obj, (aei) biiVar.b.invoke(objInvoke)), aduVar.b.b, afecVar2, null), afckVar);
    }

    public final aei a() {
        return this.b.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [afec, java.lang.Object] */
    public final Object b(Object obj) {
        if (!affa.f(this.e, this.c) || !affa.f(this.f, this.d)) {
            bii biiVar = this.g;
            aei aeiVar = (aei) biiVar.b.invoke(obj);
            int iB = aeiVar.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (aeiVar.a(i) < this.e.a(i) || aeiVar.a(i) > this.f.a(i)) {
                    aeiVar.e(i, afpt.d(aeiVar.a(i), this.e.a(i), this.f.a(i)));
                    z = true;
                }
            }
            if (z) {
                return biiVar.a.invoke(aeiVar);
            }
        }
        return obj;
    }

    public final Object c() {
        return this.j.a();
    }

    public final Object d() {
        return this.b.a();
    }

    public final Object e(Object obj, afck afckVar) {
        Object objU = this.l.u(afn.a, new adt(this, obj, null), afckVar);
        return objU == afcr.a ? objU : afak.a;
    }

    public final Object f(afck afckVar) {
        Object objU = this.l.u(afn.a, new bli(this, (afck) null, 1), afckVar);
        return objU == afcr.a ? objU : afak.a;
    }

    public final void g() {
        aed aedVar = this.b;
        aedVar.a.d();
        aedVar.b = Long.MIN_VALUE;
        h(false);
    }

    public final void h(boolean z) {
        this.i.b(Boolean.valueOf(z));
    }

    public final void i(Object obj) {
        this.j.b(obj);
    }

    public final boolean j() {
        return ((Boolean) this.i.a()).booleanValue();
    }
}
