package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class imo implements imy {
    public final /* synthetic */ ina a;
    private final /* synthetic */ int b;

    public /* synthetic */ imo(ina inaVar, int i) {
        this.b = i;
        this.a = inaVar;
    }

    @Override // defpackage.imy
    public final boolean a(jhf jhfVar) {
        boolean zAf;
        int i = this.b;
        ina inaVar = this.a;
        if (i == 0) {
            return inaVar.ag(jhfVar);
        }
        synchronized (inaVar) {
            zAf = inaVar.af(jhfVar, true);
        }
        return zAf;
    }
}
