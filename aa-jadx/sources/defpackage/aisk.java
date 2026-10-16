package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aisk implements defpackage.aisp {
    public final defpackage.aisp a;
    public final boolean b;
    public final defpackage.affc c;

    public aisk(defpackage.aisp aispVar, boolean z, defpackage.affc affcVar) {
        this.a = aispVar;
        this.b = z;
        this.c = affcVar;
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return new defpackage.aisy(this, 1);
    }
}
