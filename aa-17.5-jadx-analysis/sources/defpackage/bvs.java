package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class bvs implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bvs(bvv bvvVar, kgx kgxVar, bzf bzfVar, bwl bwlVar, int i) {
        this.e = i;
        this.a = bvvVar;
        this.d = kgxVar;
        this.b = bzfVar;
        this.c = bwlVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aec, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        int i = this.e;
        if (i != 0) {
            ?? r2 = this.c;
            if (i != 1) {
                ?? r0 = this.d;
                ((njw) this.b).p(((Number) r2.a()).intValue(), (kxa) r0.a(), (Context) this.a, true);
                return afak.a;
            }
            afd afdVar = (afd) r2;
            Object obj = afdVar.a;
            Object obj2 = this.d;
            boolean zF = affa.f(obj2, obj);
            Object obj3 = this.b;
            if (!zF || !affa.f(obj3, afdVar.b)) {
                ?? r5 = this.a;
                afdVar.a = obj2;
                afdVar.b = obj3;
                afdVar.c = r5;
                afdVar.d = new afy(r5, afdVar.i, obj2, obj3, null);
                afdVar.h.b(true);
                afdVar.e = false;
                afdVar.f = true;
            }
            return afak.a;
        }
        Object obj4 = this.a;
        bzl bzlVar = ((bvv) obj4).q;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.d;
        kgx kgxVar = bzlVar.k;
        try {
            bzlVar.k = (kgx) obj7;
            bzf bzfVar = ((bvv) obj4).m;
            int[] iArr = ((bvv) obj4).e;
            zh zhVar = ((bvv) obj4).w;
            ((bvv) obj4).e = null;
            ((bvv) obj4).w = null;
            try {
                ((bvv) obj4).m = (bzf) obj6;
                boolean z = bzlVar.b;
                try {
                    bzlVar.b = false;
                    ((bvv) obj4).am(((bwl) obj5).a, ((bwl) obj5).h, ((bwl) obj5).b);
                    bzlVar.k = kgxVar;
                    return afak.a;
                } finally {
                    bzlVar.b = z;
                }
            } finally {
                ((bvv) obj4).m = bzfVar;
                ((bvv) obj4).e = iArr;
                ((bvv) obj4).w = zhVar;
            }
        } catch (Throwable th) {
            bzlVar.k = kgxVar;
            throw th;
        }
    }

    public /* synthetic */ bvs(Object obj, afd afdVar, Object obj2, afc afcVar, int i) {
        this.e = i;
        this.d = obj;
        this.c = afdVar;
        this.b = obj2;
        this.a = afcVar;
    }

    public /* synthetic */ bvs(njw njwVar, Context context, bym bymVar, bym bymVar2, int i) {
        this.e = i;
        this.b = njwVar;
        this.a = context;
        this.c = bymVar;
        this.d = bymVar2;
    }
}
