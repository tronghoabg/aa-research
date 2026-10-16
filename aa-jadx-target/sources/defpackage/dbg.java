package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbg extends defpackage.czl {
    private final defpackage.bwx a;
    private boolean b;

    public dbg(android.content.Context context) {
        super(context, null, 0);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
    }

    public final void a(defpackage.affg affgVar) {
        this.b = true;
        this.a.b(affgVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    @Override // defpackage.czl
    public final void b(defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(420213850);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.affg affgVar = (defpackage.affg) this.a.a();
            if (affgVar == null) {
                bveVarC.v(-1238823553);
            } else {
                bveVarC.v(98585282);
                affgVar.invoke(bveVarC, 0);
            }
            ((defpackage.bwc) bveVarC).Y(false);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.brb(this, i, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.czl
    protected final boolean i() {
        return this.b;
    }
}
