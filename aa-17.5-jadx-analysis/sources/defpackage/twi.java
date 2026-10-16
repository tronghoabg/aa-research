package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class twi extends tvx implements tpv {
    public boolean f;
    public tqx g;
    public final qsb h;
    private final AtomicReference i;

    public twi(trt trtVar, uim uimVar, txc txcVar, tvw tvwVar, qsb qsbVar, abcs abcsVar, int i, txe txeVar) {
        super(txcVar, tvwVar, ueb.ao(abcsVar, i, trtVar, new ucr(uimVar, null)), txeVar, true);
        this.g = tqx.a;
        this.i = new AtomicReference();
        this.h = qsbVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tvx, defpackage.tyw
    public final void v() {
        synchronized (this) {
            if (this.f) {
                qsb qsbVar = this.h;
                abcs abcsVarC = j();
                if (abcsVarC != abcs.a) {
                    qsbVar.d.remove(abcsVarC);
                }
            }
            this.f = false;
        }
        super.v();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tvx, defpackage.tyw
    public final void w() {
        synchronized (this) {
            this.h.a.remove(this);
            this.i.set(null);
        }
        super.w();
    }

    @Override // defpackage.tvx, defpackage.tyw
    public final /* bridge */ /* synthetic */ void u() {
    }

    public twi(trt trtVar, uim uimVar, txc txcVar, tvw tvwVar, qsb qsbVar, abcs abcsVar, int i, txe txeVar, byte[] bArr) {
        super(txcVar, tvwVar, ueb.ao(abcsVar, i, trtVar, new ucr(uimVar, null)), txeVar, false);
        this.g = tqx.a;
        this.i = new AtomicReference();
        this.h = qsbVar;
    }
}
