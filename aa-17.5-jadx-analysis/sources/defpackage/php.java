package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class php extends phq {
    public php(gkc gkcVar) {
        super(gkcVar);
        woy.aa(koo.n(), "Failure injection is not enabled");
    }

    @Override // defpackage.phq, defpackage.pho
    public final tgu e() throws IOException {
        return (tgu) koo.m().b(par.RFCOMM_CONNECT, new pcc(this, 3));
    }

    public final /* synthetic */ tgu i(pat patVar) throws IOException {
        if (patVar != pat.IO_EXCEPTION) {
            return super.e();
        }
        throw new IOException("RFCOMM connect failed due to the FAIL_RFCOMM_CONNECT injection");
    }
}
