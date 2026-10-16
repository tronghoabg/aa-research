package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
final class uce extends pld {
    public uce(pkx pkxVar) {
        super(plc.b, pkxVar);
    }

    @Override // defpackage.pld
    protected final /* synthetic */ void h(Object obj) {
        ((ubf) obj).x(4);
    }

    public final void j(ubf ubfVar) {
        if (super.d(ubfVar.t()) == null) {
            ubfVar.w(4);
            super.e(ubfVar.t(), ubfVar);
        }
    }

    public final void k(int i) {
        super.i(i);
    }

    @ResultIgnorabilityUnspecified
    public final synchronized ubf l(long j) {
        ubf ubfVar;
        ubfVar = (ubf) super.d(j);
        if (ubfVar != null) {
            ubfVar.w(1);
        }
        return ubfVar;
    }
}
