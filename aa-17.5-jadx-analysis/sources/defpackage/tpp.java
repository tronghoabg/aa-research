package defpackage;

import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class tpp implements uyl, tpm {
    private final ackk a;
    private final Object b;
    private final ackk c;
    private boolean d;

    public tpp(ackk ackkVar, ackk ackkVar2, boolean z) {
        Object obj = new Object();
        this.b = obj;
        this.a = ackkVar;
        this.c = ackkVar2;
        this.d = false;
        synchronized (obj) {
            tpo tpoVar = tpo.a;
            (a(tns.AIR_QUALITY_HEATMAP) ? ulx.F : a(tns.BICYCLING) ? ulx.b : !a(tns.TRANSIT) ? a(tns.THREE_DIMENSIONAL) ? ulx.b : ulx.b : ulx.A).a(z);
        }
        c();
    }

    private final boolean a(tns tnsVar) {
        if (c()) {
            throw null;
        }
        return ((tnq) this.c.a()).c().i(tnsVar);
    }

    private final boolean c() {
        ackk ackkVar = this.a;
        return ackkVar != null && ((trk) ackkVar.a()).m().k();
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.tpm
    public final void l(boolean z) {
        throw null;
    }
}
