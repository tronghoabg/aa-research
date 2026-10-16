package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public final class cgi implements chy {
    public final View a;
    public final dei b;
    public final String c;
    public final Rect d;
    public AutofillId e;
    public boolean f;
    public final cgn g;
    public zj h;
    public final mko i;

    public cgi(cgn cgnVar, mko mkoVar, View view, dei deiVar, String str) {
        this.g = cgnVar;
        this.i = mkoVar;
        this.a = view;
        this.b = deiVar;
        this.c = str;
        this.d = new Rect();
        view.setImportantForAutofill(1);
        Object obj = new kwp(view.getAutofillId()).a;
        if (obj == null) {
            crt.a("Required value was null.");
            throw new aezp();
        }
        this.e = a$$ExternalSyntheticApiModelOutline0.m7m(obj);
        this.h = new zj(6);
    }

    @Override // defpackage.chy
    public final void eP(ciu ciuVar, ciu ciuVar2) {
        cxb cxbVarQ;
        ddr ddrVarR;
        cxb cxbVarQ2;
        ddr ddrVarR2;
        if (ciuVar != null && (cxbVarQ2 = bzi.q(ciuVar)) != null && (ddrVarR2 = cxbVarQ2.r()) != null && czz.aa(ddrVarR2)) {
            this.g.a().notifyViewExited(this.a, cxbVarQ2.c);
        }
        if (ciuVar2 == null || (cxbVarQ = bzi.q(ciuVar2)) == null || (ddrVarR = cxbVarQ.r()) == null || !czz.aa(ddrVarR)) {
            return;
        }
        int i = cxbVarQ.c;
        dei deiVar = this.b;
        cxb cxbVar = (cxb) deiVar.a.a(i);
        if (cxbVar == null || !dei.h(cxbVar)) {
            return;
        }
        def defVar = deiVar.b;
        int iA = deiVar.a(cxbVar);
        long[] jArr = (long[]) defVar.b;
        long j = jArr[iA];
        long j2 = jArr[iA + 1];
        long j3 = j2 >> 32;
        int i2 = (int) j2;
        this.g.a().notifyViewEntered(this.a, i, new Rect((int) (j >> 32), (int) j, (int) j3, i2));
    }

    public cgi() {
        throw null;
    }
}
