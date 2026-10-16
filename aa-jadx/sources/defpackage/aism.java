package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aism implements defpackage.aisp {
    public final defpackage.aisp a;
    public final defpackage.affc b;
    public final defpackage.affc c;

    public aism(defpackage.aisp aispVar, defpackage.affc affcVar, defpackage.affc affcVar2) {
        this.a = aispVar;
        this.b = affcVar;
        this.c = affcVar2;
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return new defpackage.aisl(this);
    }
}
