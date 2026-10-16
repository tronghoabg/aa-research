package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class phr extends phs {
    public phr(te teVar) {
        super(teVar);
        woy.aa(koo.n(), "Failure injection is not enabled");
    }

    @Override // defpackage.phs, defpackage.pho
    public final tgu e() throws IOException {
        return (tgu) koo.m().b(par.WPP_TCP_CONNECT, new pcc(this, 4));
    }

    public final /* synthetic */ tgu i(pat patVar) throws IOException {
        if (patVar != pat.IO_EXCEPTION) {
            return super.e();
        }
        throw new IOException("TCP connect failed due to the FAIL_WPP_TCP_CONNECT injection");
    }
}
