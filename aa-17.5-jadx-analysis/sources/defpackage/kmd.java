package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public abstract class kmd extends kmb {
    private final cil a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new cil();
        setFocusable(false);
    }

    public abstract void l(bux buxVar, int i);

    @Override // defpackage.kmb
    public final void q(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1076790593);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cim cimVar = new cim(this.a);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cimVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            l(buxVarC, i2 & 14);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, 4);
        }
    }

    @Override // defpackage.kmb, defpackage.rae
    public final boolean s(View view, int i, Rect rect) {
        if (view.requestFocus(i, null)) {
            return true;
        }
        this.a.a(7);
        return true;
    }

    @Override // defpackage.kmb, defpackage.rae
    public final boolean u(View view) {
        this.a.a(7);
        return true;
    }

    @Override // defpackage.kmb
    protected final bxe[] w() {
        return new bxe[]{gbj.a.b(lfr.a.a())};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmd(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ kmd(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
