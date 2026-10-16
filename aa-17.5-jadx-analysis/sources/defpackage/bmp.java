package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public final class bmp implements aiyl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bmp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aiyl
    public final /* synthetic */ Object a(Object obj, afck afckVar) throws Throwable {
        int i = this.b;
        if (i == 0) {
            asd asdVar = (asd) obj;
            if (asdVar instanceof asa) {
                ((SnapshotStateList) this.a).add(asdVar);
            } else if (asdVar instanceof asb) {
                ((SnapshotStateList) this.a).remove(((asb) asdVar).a);
            } else if (asdVar instanceof ary) {
                ((SnapshotStateList) this.a).add(asdVar);
            } else if (asdVar instanceof arz) {
                ((SnapshotStateList) this.a).remove(((arz) asdVar).a);
            } else if (asdVar instanceof asi) {
                ((SnapshotStateList) this.a).add(asdVar);
            } else if (asdVar instanceof asj) {
                ((SnapshotStateList) this.a).remove(((asj) asdVar).a);
            } else if (asdVar instanceof ash) {
                ((SnapshotStateList) this.a).remove(((ash) asdVar).a);
            }
            return afak.a;
        }
        if (i == 1) {
            if (Build.VERSION.SDK_INT >= 34) {
                bii biiVar = (bii) this.a;
                biiVar.a().startStylusHandwriting((View) biiVar.a);
            }
            return afak.a;
        }
        if (i == 2) {
            egd egdVar = (egd) this.a;
            if (egdVar.g.h() instanceof ego) {
                return afak.a;
            }
            Object objG = egdVar.g(true, afckVar);
            return objG != afcr.a ? afak.a : objG;
        }
        ocq ocqVar = ((odc) this.a).e.a;
        if (ocqVar != null) {
            odc.a.l().u("Dismissing tooltip due to click on anchor");
            mcd.C(ocqVar, yzy.lL);
            ocqVar.a();
        }
        return afak.a;
    }
}
