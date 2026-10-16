package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwl implements defpackage.rwh {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.XFER");
    static final defpackage.rwf b = new defpackage.rwi();
    public final defpackage.rvm c;
    public final java.util.concurrent.Executor d;
    public final java.util.Map e;
    public final java.lang.Object f = new java.lang.Object();
    public int g;
    public final int h;
    private final java.util.concurrent.Executor i;
    private defpackage.rwj j;
    private defpackage.rwk k;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public rwl(int i, defpackage.rvm rvmVar, defpackage.xzi xziVar, java.util.Map map) {
        this.h = i;
        this.c = rvmVar;
        this.d = xziVar.fF();
        this.i = xziVar.fF();
        this.e = map;
    }

    @Override // defpackage.rwh
    public final void a(int i, defpackage.rwf rwfVar) {
        synchronized (this.f) {
            if (this.h == 0) {
                throw null;
            }
            this.e.put(java.lang.Integer.valueOf(i), rwfVar);
        }
    }

    @Override // defpackage.rwh
    public final void b(int i) {
        synchronized (this.f) {
            if (this.h == 0) {
                throw null;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            java.util.Map map = this.e;
            map.remove(numValueOf);
            map.put(numValueOf, b);
        }
    }

    @Override // defpackage.rwh
    public final void c(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (this.h == 0) {
            throw null;
        }
        synchronized (this.f) {
            defpackage.rwj rwjVar = this.j;
            if (rwjVar != null) {
                rwjVar.c();
            }
            defpackage.rwk rwkVar = this.k;
            if (rwkVar != null) {
                rwkVar.a();
            }
            this.j = new defpackage.rwj(this, parcelFileDescriptor);
            this.k = new defpackage.rwk(this, parcelFileDescriptor);
            defpackage.rwj rwjVar2 = this.j;
            defpackage.ypu ypuVarAi = a.f().ai(8439);
            defpackage.rwl rwlVar = rwjVar2.a;
            int i = rwlVar.h;
            java.lang.String strM = defpackage.ooa.m(i);
            if (i == 0) {
                throw null;
            }
            ypuVarAi.y("%s Start executor and read messages", strM);
            rwlVar.d.execute(new defpackage.qtk(rwjVar2, 14));
        }
    }

    @Override // defpackage.rwh
    public final void d() {
        if (this.h == 0) {
            throw null;
        }
        synchronized (this.f) {
            defpackage.rwj rwjVar = this.j;
            defpackage.rwk rwkVar = this.k;
            this.j = null;
            this.k = null;
            this.g = 0;
            if (rwjVar != null) {
                this.d.execute(new defpackage.rid(rwjVar, 17));
            }
            if (rwkVar != null) {
                this.i.execute(new defpackage.rid(rwkVar, 18));
            }
        }
    }

    @Override // defpackage.rwh
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean e(int i, defpackage.rtu rtuVar, int i2, java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        defpackage.abor aborVarN = defpackage.qug.a.n();
        aborVarN.t();
        defpackage.qug qugVar = (defpackage.qug) aborVarN.b;
        qugVar.b |= 8;
        qugVar.f = i;
        aborVarN.t();
        defpackage.qug qugVar2 = (defpackage.qug) aborVarN.b;
        qugVar2.b |= 4;
        qugVar2.e = rtuVar.a;
        aborVarN.t();
        defpackage.qug qugVar3 = (defpackage.qug) aborVarN.b;
        qugVar3.b |= 32;
        qugVar3.h = rtuVar.b;
        int iRemaining = byteBufferDuplicate.remaining();
        aborVarN.t();
        defpackage.qug qugVar4 = (defpackage.qug) aborVarN.b;
        qugVar4.b |= 1;
        qugVar4.c = iRemaining;
        aborVarN.t();
        defpackage.qug qugVar5 = (defpackage.qug) aborVarN.b;
        qugVar5.b |= 2;
        qugVar5.d = i2;
        aborVarN.t();
        defpackage.qug qugVar6 = (defpackage.qug) aborVarN.b;
        qugVar6.b |= 64;
        qugVar6.i = rtuVar.c;
        defpackage.qug qugVar7 = (defpackage.qug) aborVarN.q();
        synchronized (this.f) {
            defpackage.rwk rwkVar = this.k;
            if (rwkVar == null) {
                return false;
            }
            int i3 = this.g;
            if (i3 >= 1024) {
                throw new rwg();
            }
            this.g = i3 + 1;
            this.i.execute(new defpackage.sbn(this, rwkVar, qugVar7, byteBufferDuplicate, 1));
            return true;
        }
    }
}
