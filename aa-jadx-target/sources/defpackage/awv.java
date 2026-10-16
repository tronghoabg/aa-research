package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awv {
    public static final java.util.WeakHashMap a = new java.util.WeakHashMap();
    public final defpackage.asw b;
    public final defpackage.asw c;
    public final defpackage.asw d;
    public final defpackage.asw e;
    public final defpackage.asw f;
    public final defpackage.asw g;
    public final defpackage.asw h;
    public final defpackage.asw i;
    public final defpackage.awr j;
    public final defpackage.awu k;
    public final defpackage.awu l;
    public final defpackage.awu m;
    public final boolean n;
    private final defpackage.asw o;
    private final defpackage.bwx p;
    private final defpackage.awr q;
    private final defpackage.awr r;
    private final defpackage.awr s;
    private final defpackage.awr t;
    private final defpackage.awr u;
    private final defpackage.awr v;
    private final defpackage.awr w;
    private int x;
    private final defpackage.auz y;

    public awv(android.view.View view) {
        defpackage.asw aswVar = new defpackage.asw(4, "captionBar");
        this.b = aswVar;
        defpackage.asw aswVar2 = new defpackage.asw(128, "displayCutout");
        this.c = aswVar2;
        defpackage.asw aswVar3 = new defpackage.asw(8, "ime");
        this.d = aswVar3;
        defpackage.asw aswVar4 = new defpackage.asw(32, "mandatorySystemGestures");
        this.e = aswVar4;
        defpackage.asw aswVar5 = new defpackage.asw(2, "navigationBars");
        this.f = aswVar5;
        defpackage.asw aswVar6 = new defpackage.asw(1, "statusBars");
        this.g = aswVar6;
        defpackage.asw aswVar7 = new defpackage.asw(519, "systemBars");
        this.h = aswVar7;
        defpackage.asw aswVar8 = new defpackage.asw(16, "systemGestures");
        this.i = aswVar8;
        defpackage.asw aswVar9 = new defpackage.asw(64, "tappableElement");
        this.o = aswVar9;
        defpackage.dvl dvlVar = defpackage.dvl.a;
        defpackage.awr awrVar = new defpackage.awr(defpackage.asq.u(dvlVar), "waterfall");
        this.j = awrVar;
        this.p = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
        defpackage.awo awoVar = new defpackage.awo(new defpackage.awo(aswVar7, aswVar3), aswVar2);
        this.k = awoVar;
        defpackage.awo awoVar2 = new defpackage.awo(new defpackage.awo(new defpackage.awo(aswVar9, aswVar4), aswVar8), awrVar);
        this.l = awoVar2;
        this.m = new defpackage.awo(awoVar, awoVar2);
        this.q = new defpackage.awr(defpackage.asq.u(dvlVar), "captionBarIgnoringVisibility");
        this.r = new defpackage.awr(defpackage.asq.u(dvlVar), "navigationBarsIgnoringVisibility");
        this.s = new defpackage.awr(defpackage.asq.u(dvlVar), "statusBarsIgnoringVisibility");
        this.t = new defpackage.awr(defpackage.asq.u(dvlVar), "systemBarsIgnoringVisibility");
        this.u = new defpackage.awr(defpackage.asq.u(dvlVar), "tappableElementIgnoringVisibility");
        this.v = new defpackage.awr(defpackage.asq.u(dvlVar), "imeAnimationTarget");
        this.w = new defpackage.awr(defpackage.asq.u(dvlVar), "imeAnimationSource");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.Object tag = view2 != null ? view2.getTag(2131427827) : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        this.n = bool != null ? bool.booleanValue() : false;
        this.y = new defpackage.auz(this);
        int[] iArr = defpackage.ebt.a;
        defpackage.edf edfVarA = defpackage.ebm.a(view);
        if (edfVarA != null) {
            aswVar.f(edfVarA.z(4));
            aswVar2.f(edfVarA.z(128));
            aswVar3.f(edfVarA.z(8));
            aswVar4.f(edfVarA.z(32));
            aswVar5.f(edfVarA.z(2));
            aswVar6.f(edfVarA.z(1));
            aswVar7.f(edfVarA.z(519));
            aswVar8.f(edfVarA.z(16));
            aswVar9.f(edfVarA.z(64));
        }
    }

    public final void a(android.view.View view) {
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            int[] iArr = defpackage.ebt.a;
            defpackage.ebl.e(view, null);
            defpackage.kwv.G(view, null);
            view.removeOnAttachStateChangeListener(this.y);
        }
    }

    public final void b(android.view.View view) {
        if (this.x == 0) {
            defpackage.auz auzVar = this.y;
            auzVar.a = false;
            auzVar.b = false;
            auzVar.c = null;
            int[] iArr = defpackage.ebt.a;
            defpackage.ebl.e(view, auzVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(auzVar);
            defpackage.kwv.G(view, auzVar);
        }
        this.x++;
    }

    public final void c(defpackage.edf edfVar) {
        this.w.f(defpackage.asq.u(edfVar.f(8)));
    }

    public final void d(defpackage.edf edfVar) {
        this.v.f(defpackage.asq.u(edfVar.f(8)));
    }

    public final void e(defpackage.edf edfVar) {
        this.b.g(edfVar);
        this.d.g(edfVar);
        this.c.g(edfVar);
        this.f.g(edfVar);
        this.g.g(edfVar);
        this.h.g(edfVar);
        this.i.g(edfVar);
        this.o.g(edfVar);
        this.e.g(edfVar);
        this.q.f(defpackage.asq.u(edfVar.g(4)));
        this.r.f(defpackage.asq.u(edfVar.g(2)));
        this.s.f(defpackage.asq.u(edfVar.g(1)));
        this.t.f(defpackage.asq.u(edfVar.g(519)));
        this.u.f(defpackage.asq.u(edfVar.g(64)));
        defpackage.eag eagVarK = edfVar.k();
        this.j.f(defpackage.asq.u(eagVarK != null ? eagVarK.a() : defpackage.dvl.a));
        defpackage.cju cjuVar = null;
        if (eagVarK != null) {
            android.graphics.Path pathM = android.os.Build.VERSION.SDK_INT >= 31 ? a$.ExternalSyntheticApiModelOutline0.m(eagVarK.a) : null;
            if (pathM != null) {
                cjuVar = new defpackage.cju(pathM);
            }
        }
        this.p.b(cjuVar);
        defpackage.bzd.l();
    }
}
