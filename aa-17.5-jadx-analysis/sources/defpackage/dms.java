package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* loaded from: classes2.dex */
public final class dms extends dme {
    private final cdp A;
    private final int B;
    private final String C;
    private rpp D;
    public final View x;
    public afec y;
    public afec z;

    public dms(Context context, bvb bvbVar, View view, tp tpVar, cdp cdpVar, int i, cym cymVar) {
        super(context, bvbVar, i, tpVar, view, cymVar);
        this.x = view;
        this.A = cdpVar;
        this.B = i;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        this.C = strValueOf;
        Object objA = cdpVar != null ? cdpVar.a(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objA instanceof SparseArray ? (SparseArray) objA : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (cdpVar != null) {
            o(cdpVar.e(strValueOf, new cxm(this, 9)));
        }
        afec afecVar = dmj.a;
        this.y = afecVar;
        this.z = afecVar;
    }

    public final void o(rpp rppVar) {
        rpp rppVar2 = this.D;
        if (rppVar2 != null) {
            rppVar2.b();
        }
        this.D = rppVar;
    }
}
