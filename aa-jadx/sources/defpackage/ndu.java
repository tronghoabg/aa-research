package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ndu implements defpackage.afer {
    final /* synthetic */ defpackage.afer a;
    final /* synthetic */ defpackage.bwx b;
    final /* synthetic */ float c;
    private final /* synthetic */ int d;

    public ndu(defpackage.afer aferVar, defpackage.bwx bwxVar, float f, int i) {
        this.d = i;
        this.a = aferVar;
        this.b = bwxVar;
        this.c = f;
    }

    @Override // defpackage.afer
    public final /* synthetic */ java.lang.Object invoke() {
        int i = this.d;
        defpackage.afer aferVar = this.a;
        boolean z = true;
        if (i != 0) {
            if (aferVar == null || (!((java.lang.Boolean) this.b.a()).booleanValue() && (!defpackage.leh.a.a().f() || defpackage.dlr.a(this.c, 360.0f) < 0))) {
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (aferVar == null || (!((java.lang.Boolean) this.b.a()).booleanValue() && (!defpackage.leh.a.a().f() || defpackage.dlr.a(this.c, 360.0f) < 0))) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
