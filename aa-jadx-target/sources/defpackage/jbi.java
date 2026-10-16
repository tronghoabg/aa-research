package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jbi extends defpackage.jbq {
    public static final /* synthetic */ int a = 0;
    private final defpackage.jbh b;

    public jbi(defpackage.jbh jbhVar, defpackage.jbu jbuVar) {
        super(10, jbhVar, jbuVar, 0);
        this.b = jbhVar;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, qyi] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qyi] */
    @Override // defpackage.jbq
    public final void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        if (i != 32769) {
            if (i != 32770) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid message type: "));
            }
            defpackage.abox.w(xmr.a, byteBuffer);
            java.util.List list = ((defpackage.ikp) this.b).b;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((defpackage.iko) it.next()).a.f();
                    } catch (android.os.RemoteException unused) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ikp.a.h()).ai(162)).u("Error calling onStop()");
                    }
                }
            }
            return;
        }
        defpackage.abox.w(xmq.a, byteBuffer);
        defpackage.jbh jbhVar = this.b;
        java.util.List list2 = ((defpackage.ikp) jbhVar).b;
        synchronized (list2) {
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                try {
                    ?? r2 = ((defpackage.iko) it2.next()).a;
                    com.google.android.gms.car.CarInstrumentClusterInfo carInstrumentClusterInfo = ((defpackage.ikp) jbhVar).c;
                    r2.e(carInstrumentClusterInfo.a, carInstrumentClusterInfo.b, carInstrumentClusterInfo.d, carInstrumentClusterInfo.c, carInstrumentClusterInfo.e);
                } catch (android.os.RemoteException unused2) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ikp.a.h()).ai(161)).u("Error calling onStart()");
                }
            }
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        defpackage.abor aborVarN = xmi.a.n();
        aborVarN.t();
        xmi xmiVar = aborVarN.b;
        xmiVar.b |= 1;
        xmiVar.c = i;
        aborVarN.t();
        xmi xmiVar2 = aborVarN.b;
        xmiVar2.b |= 2;
        xmiVar2.d = i2;
        aborVarN.t();
        xmi xmiVar3 = aborVarN.b;
        xmiVar3.b |= 4;
        xmiVar3.e = i3;
        aborVarN.t();
        xmi xmiVar4 = aborVarN.b;
        xmiVar4.f = i4 - 1;
        xmiVar4.b |= 8;
        k(32773, aborVarN.q());
    }

    @Override // defpackage.ize
    public final void b(int i) {
    }
}
