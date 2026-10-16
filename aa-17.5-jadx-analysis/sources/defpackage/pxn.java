package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pxn extends psk {
    public pxn(Class cls, pxm pxmVar, psb psbVar, Executor executor) {
        super(cls, pxmVar, psbVar, executor);
    }

    @Override // defpackage.psk
    protected final void a(psm psmVar) {
        pxm pxmVar = (pxm) this.c;
        ((ynz) ((ynz) pxm.a.f()).ai((char) 6930)).u("PaintParametersListeningServerChannelManager got a client parameters update event.");
        pxmVar.c();
    }
}
