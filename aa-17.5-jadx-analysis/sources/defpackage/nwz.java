package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class nwz extends kmh {
    static final /* synthetic */ afia[] a = {new affn(nwz.class, "parent", "getParent()Lcom/google/android/apps/auto/components/system/notificationcenter/GhNotificationCenterFragment$Holder;", 0)};
    public static final /* synthetic */ int c = 0;
    public final bwq b;
    private final afgl d;
    private final aezr e;

    public nwz() {
        getLifecycle().c(new mzq(this, 5));
        this.d = new mzr(this, 5);
        this.b = new ParcelableSnapshotMutableState(afbe.a, bxp.a);
        aezr aezrVarDH = woy.dH(3, new ndw(new ndw(this, 6), 7));
        this.e = ebi.i(affw.b(nxv.class), new ndw(aezrVarDH, 8), new ndw(aezrVarDH, 9), new nxf(this, aezrVarDH, 1));
    }

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(322530022);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ksr.a(null, null, false, null, bxc.i(-1058869106, true, new njg(this, 14), buxVarC), buxVarC, 24576, 15);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(this, i, 2);
        }
    }

    public final nxp b() {
        return (nxp) this.d.getValue(this, a[0]);
    }

    public final nxv c() {
        return (nxv) this.e.a();
    }

    public final List d() {
        return (List) this.b.a();
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        super.onStop();
        Iterator it = d().iterator();
        while (it.hasNext()) {
            ((nuh) it.next()).d();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        eqj eqjVarA = b().a();
        eqa viewLifecycleOwner = getViewLifecycleOwner();
        tcg tcgVar = new tcg(new ntw(this, 2));
        eqjVarA.fE(viewLifecycleOwner, tcgVar);
        viewLifecycleOwner.getLifecycle().c(tcgVar);
        c();
        eqy.b(nxo.b().c, new nqz(12)).fE(getViewLifecycleOwner(), new nns(new noo(this, 15), 3));
    }
}
