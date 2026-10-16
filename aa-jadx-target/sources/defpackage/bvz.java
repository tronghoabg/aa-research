package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bvz implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bvz(defpackage.bwc bwcVar, defpackage.khb khbVar, defpackage.bzl bzlVar, defpackage.bws bwsVar, int i) {
        this.e = i;
        this.a = bwcVar;
        this.d = khbVar;
        this.b = bzlVar;
        this.c = bwsVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aej, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        int i = this.e;
        if (i != 0) {
            ?? r2 = this.c;
            if (i != 1) {
                ?? r0 = this.d;
                ((defpackage.nkp) this.b).p(((java.lang.Number) r2.a()).intValue(), (defpackage.kxh) r0.a(), (android.content.Context) this.a, true);
                return defpackage.afbk.a;
            }
            defpackage.afk afkVar = (defpackage.afk) r2;
            java.lang.Object obj = afkVar.a;
            java.lang.Object obj2 = this.d;
            boolean zF = defpackage.afga.f(obj2, obj);
            java.lang.Object obj3 = this.b;
            if (!zF || !defpackage.afga.f(obj3, afkVar.b)) {
                ?? r5 = this.a;
                afkVar.a = obj2;
                afkVar.b = obj3;
                afkVar.c = r5;
                afkVar.d = new defpackage.agf(r5, afkVar.i, obj2, obj3, null);
                afkVar.h.b(true);
                afkVar.e = false;
                afkVar.f = true;
            }
            return defpackage.afbk.a;
        }
        java.lang.Object obj4 = this.a;
        defpackage.bzr bzrVar = ((defpackage.bwc) obj4).q;
        java.lang.Object obj5 = this.c;
        java.lang.Object obj6 = this.b;
        java.lang.Object obj7 = this.d;
        defpackage.khb khbVar = bzrVar.k;
        try {
            bzrVar.k = (defpackage.khb) obj7;
            defpackage.bzl bzlVar = ((defpackage.bwc) obj4).m;
            int[] iArr = ((defpackage.bwc) obj4).e;
            defpackage.zo zoVar = ((defpackage.bwc) obj4).w;
            ((defpackage.bwc) obj4).e = null;
            ((defpackage.bwc) obj4).w = null;
            try {
                ((defpackage.bwc) obj4).m = (defpackage.bzl) obj6;
                boolean z = bzrVar.b;
                try {
                    bzrVar.b = false;
                    ((defpackage.bwc) obj4).am(((defpackage.bws) obj5).a, ((defpackage.bws) obj5).h, ((defpackage.bws) obj5).b);
                    bzrVar.b = z;
                    ((defpackage.bwc) obj4).m = bzlVar;
                    ((defpackage.bwc) obj4).e = iArr;
                    ((defpackage.bwc) obj4).w = zoVar;
                    bzrVar.k = khbVar;
                    return defpackage.afbk.a;
                } catch (java.lang.Throwable th) {
                    bzrVar.b = z;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                ((defpackage.bwc) obj4).m = bzlVar;
                ((defpackage.bwc) obj4).e = iArr;
                ((defpackage.bwc) obj4).w = zoVar;
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            bzrVar.k = khbVar;
            throw th3;
        }
    }

    public /* synthetic */ bvz(java.lang.Object obj, defpackage.afk afkVar, java.lang.Object obj2, defpackage.afj afjVar, int i) {
        this.e = i;
        this.d = obj;
        this.c = afkVar;
        this.b = obj2;
        this.a = afjVar;
    }

    public /* synthetic */ bvz(defpackage.nkp nkpVar, android.content.Context context, defpackage.bys bysVar, defpackage.bys bysVar2, int i) {
        this.e = i;
        this.b = nkpVar;
        this.a = context;
        this.c = bysVar;
        this.d = bysVar2;
    }
}
