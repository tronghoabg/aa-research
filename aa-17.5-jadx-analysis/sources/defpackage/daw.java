package defpackage;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class daw extends czd {
    private final bwq a;
    private boolean b;

    public daw(Context context) {
        super(context, null, 0);
        this.a = new ParcelableSnapshotMutableState(null, bxp.c);
    }

    public final void a(afeg afegVar) {
        this.b = true;
        this.a.b(afegVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    @Override // defpackage.czd
    public final void b(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(420213850);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            afeg afegVar = (afeg) this.a.a();
            if (afegVar == null) {
                buxVarC.v(-1238823553);
            } else {
                buxVarC.v(98585282);
                afegVar.invoke(buxVarC, 0);
            }
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(this, i, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.czd
    protected final boolean i() {
        return this.b;
    }
}
