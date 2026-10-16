package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bet implements defpackage.affc {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public bet(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Type inference failed for: r6v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        long j;
        int i = this.c;
        boolean zI = true;
        if (i == 0) {
            android.view.KeyEvent keyEvent = ((cpx) obj).a;
            android.view.InputDevice device = keyEvent.getDevice();
            if (device == null || !device.supportsSource(513) || ((device.isVirtual() && keyEvent.getSource() != 33554433) || defpackage.tn.h(keyEvent) != 2 || keyEvent.getSource() == 257)) {
                zI = false;
            } else if (defpackage.asq.Q(keyEvent, 19)) {
                zI = ((defpackage.cik) this.b).i(5, true);
            } else if (defpackage.asq.Q(keyEvent, 20)) {
                zI = ((defpackage.cik) this.b).i(6, true);
            } else if (defpackage.asq.Q(keyEvent, 21)) {
                zI = ((defpackage.cik) this.b).i(3, true);
            } else if (defpackage.asq.Q(keyEvent, 22)) {
                zI = ((defpackage.cik) this.b).i(4, true);
            } else if (defpackage.asq.Q(keyEvent, 23)) {
                defpackage.sr srVar = ((defpackage.beg) this.a).v;
                if (srVar != null) {
                    srVar.r();
                }
            } else {
                zI = false;
            }
            return java.lang.Boolean.valueOf(zI);
        }
        if (i == 1) {
            android.view.KeyEvent keyEvent2 = ((cpx) obj).a;
            if (((defpackage.beg) this.a).d() == defpackage.bdz.b && keyEvent2.getKeyCode() == 4 && defpackage.tn.h(keyEvent2) == 1) {
                ((defpackage.blw) this.b).i(null);
            } else {
                zI = false;
            }
            return java.lang.Boolean.valueOf(zI);
        }
        if (i == 2) {
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.a;
            synchronized (((defpackage.bwm) obj3).a) {
                ((defpackage.bwm) obj3).b.remove(obj2);
            }
            return defpackage.afbk.a;
        }
        if (i == 3) {
            defpackage.ceq ceqVar = (defpackage.ceq) obj;
            synchronized (defpackage.cer.b) {
                j = defpackage.cer.d;
                defpackage.cer.d = 1 + j;
            }
            return new defpackage.ced(j, ceqVar, this.a, this.b);
        }
        if (i == 4) {
            java.lang.Object obj4 = this.a;
            java.lang.Object obj5 = this.b;
            synchronized (((defpackage.dap) obj5).e) {
                ((defpackage.dap) obj5).f.remove(obj4);
            }
            return defpackage.afbk.a;
        }
        if (i != 5) {
            return ((java.lang.Boolean) obj).booleanValue() ? this.b : this.a;
        }
        defpackage.eqp eqpVar = (defpackage.eqp) this.a;
        java.lang.Object objE = eqpVar.e();
        defpackage.afgq afgqVar = (defpackage.afgq) this.b;
        if (afgqVar.a || ((objE == null && obj != null) || (objE != null && !defpackage.afga.f(objE, obj)))) {
            afgqVar.a = false;
            eqpVar.m(obj);
        }
        return defpackage.afbk.a;
    }

    public bet(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
