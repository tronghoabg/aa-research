package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class kmi extends defpackage.czl implements defpackage.rba, defpackage.mnj {
    private final defpackage.yqm a;
    private final java.util.Set b;
    private final defpackage.mbt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmi(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new defpackage.yqm(defpackage.yrs.d("AbsCarComposeView"));
        this.b = new java.util.LinkedHashSet();
        this.c = new defpackage.mbt();
    }

    @Override // defpackage.czl
    public final void b(defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2120159843);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            arrayList.add(defpackage.kmj.c.b(this.c));
            arrayList.add(defpackage.kmj.b.b(this.b));
            defpackage.afgx.a(w(), arrayList);
            defpackage.dai.aB((defpackage.bxk[]) arrayList.toArray(new defpackage.bxk[arrayList.size()]), defpackage.dai.as(-659601629, true, new defpackage.cvi(this, 8), bveVarC), bveVarC, 48);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(this, i, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        configuration.getClass();
        int iDiff = getContext().getResources().getConfiguration().diff(configuration);
        int i = iDiff & (-617);
        defpackage.yqm yqmVar = this.a;
        if (i == 0) {
            yqmVar.l().K("Ignored config change %s, %d", configuration, iDiff);
            return;
        }
        yqmVar.l().y("newConfig: %s", configuration);
        yqmVar.l().y("currentConfig: %s", getContext().getResources().getConfiguration());
        super.dispatchConfigurationChanged(getContext().getResources().getConfiguration());
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.mnj) it.next()).h(printWriter);
        }
    }

    public abstract void q(defpackage.bve bveVar, int i);

    @Override // defpackage.rba
    public /* synthetic */ boolean r(android.view.View view, android.view.MotionEvent motionEvent) {
        return view.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // defpackage.rba
    public /* synthetic */ boolean s(android.view.View view, int i, android.graphics.Rect rect) {
        throw null;
    }

    @Override // defpackage.rba
    public /* synthetic */ boolean t(android.view.View view) {
        return view.requestFocusFromTouch();
    }

    @Override // defpackage.rba
    public /* synthetic */ boolean u(android.view.View view) {
        throw null;
    }

    @Override // defpackage.rba
    public boolean v(android.view.View view, int i, boolean z) {
        view.getClass();
        this.c.f(z);
        return false;
    }

    protected defpackage.bxk[] w() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bwx, java.lang.Object] */
    @Override // defpackage.rba
    public final void x(boolean z) {
        defpackage.mbt mbtVar = this.c;
        mbtVar.b.b(java.lang.Boolean.valueOf(z));
        if (z) {
            return;
        }
        mbtVar.f(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmi(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmi(android.content.Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ kmi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.affu affuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
