package defpackage;

import android.view.Window;

/* loaded from: classes2.dex */
final class fd implements hr {
    final /* synthetic */ fe a;
    private final /* synthetic */ int b;

    public fd(fe feVar, int i) {
        this.b = i;
        this.a = feVar;
    }

    @Override // defpackage.hr
    public final void a(hg hgVar, boolean z) {
        if (this.b != 0) {
            this.a.D(hgVar);
            return;
        }
        hg hgVarA = hgVar.a();
        hg hgVar2 = hgVarA != hgVar ? hgVarA : hgVar;
        fe feVar = this.a;
        fc fcVarY = feVar.y(hgVar2);
        if (fcVarY != null) {
            if (hgVarA == hgVar) {
                feVar.E(fcVarY, z);
            } else {
                feVar.C(fcVarY.a, fcVarY, hgVarA);
                feVar.E(fcVarY, true);
            }
        }
    }

    @Override // defpackage.hr
    public final boolean b(hg hgVar) {
        Window.Callback callbackZ;
        if (this.b != 0) {
            Window.Callback callbackZ2 = this.a.z();
            if (callbackZ2 != null) {
                callbackZ2.onMenuOpened(108, hgVar);
            }
            return true;
        }
        if (hgVar == hgVar.a()) {
            fe feVar = this.a;
            if (feVar.w && (callbackZ = feVar.z()) != null && !feVar.D) {
                callbackZ.onMenuOpened(108, hgVar);
            }
        }
        return true;
    }
}
