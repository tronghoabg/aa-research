package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aita implements defpackage.aisp {
    public final defpackage.aisp a;
    public final java.lang.Object b;
    private final /* synthetic */ int c;

    public aita(defpackage.aisp aispVar, java.lang.Object obj, int i) {
        this.c = i;
        this.a = aispVar;
        this.b = obj;
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return this.c != 0 ? new defpackage.aisy(this, 0) : new defpackage.aisz(this, 0);
    }
}
