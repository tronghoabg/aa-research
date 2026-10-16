package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class txe extends defpackage.twt implements defpackage.tqt {
    public boolean f;
    public defpackage.trv g;
    public final defpackage.qsv h;
    private final java.util.concurrent.atomic.AtomicReference i;

    public txe(defpackage.tsr tsrVar, defpackage.ujh ujhVar, defpackage.txz txzVar, defpackage.tws twsVar, defpackage.qsv qsvVar, defpackage.abdv abdvVar, int i, defpackage.tyb tybVar) {
        super(txzVar, twsVar, defpackage.uey.ao(abdvVar, i, tsrVar, new defpackage.udo(ujhVar, null)), tybVar, true);
        this.g = defpackage.trv.a;
        this.i = new java.util.concurrent.atomic.AtomicReference();
        this.h = qsvVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.twt, defpackage.tzt
    public final void v() {
        synchronized (this) {
            if (this.f) {
                defpackage.qsv qsvVar = this.h;
                defpackage.abdv abdvVarC = j();
                if (abdvVarC != defpackage.abdv.a) {
                    qsvVar.d.remove(abdvVarC);
                }
            }
            this.f = false;
        }
        super.v();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.twt, defpackage.tzt
    public final void w() {
        synchronized (this) {
            this.h.a.remove(this);
            this.i.set(null);
        }
        super.w();
    }

    @Override // defpackage.twt, defpackage.tzt
    public final /* bridge */ /* synthetic */ void u() {
    }

    public txe(defpackage.tsr tsrVar, defpackage.ujh ujhVar, defpackage.txz txzVar, defpackage.tws twsVar, defpackage.qsv qsvVar, defpackage.abdv abdvVar, int i, defpackage.tyb tybVar, byte[] bArr) {
        super(txzVar, twsVar, defpackage.uey.ao(abdvVar, i, tsrVar, new defpackage.udo(ujhVar, null)), tybVar, false);
        this.g = defpackage.trv.a;
        this.i = new java.util.concurrent.atomic.AtomicReference();
        this.h = qsvVar;
    }
}
