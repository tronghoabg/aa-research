package defpackage;

import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class tpn implements tpm {
    private final tpm a;

    public tpn(tpm tpmVar) {
        this.a = tpmVar;
    }

    @Override // defpackage.uyl
    public final /* synthetic */ void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.tpm
    public final void l(boolean z) {
        txu txuVar = (txu) ((tnq) this.a).c();
        if (txuVar.K) {
            txuVar.s();
            if (txuVar.e != z) {
                txuVar.e = z;
                if (txuVar.C()) {
                    txuVar.g();
                } else if (txuVar.i(tns.SATELLITE)) {
                    txuVar.h();
                }
            }
        }
    }
}
