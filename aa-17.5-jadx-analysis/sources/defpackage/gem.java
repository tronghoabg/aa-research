package defpackage;

/* loaded from: classes2.dex */
public final class gem implements gdo {
    public final gdo a;
    public boolean b;
    final /* synthetic */ gen c;

    public gem(gen genVar, ept eptVar, gdo gdoVar) {
        this.c = genVar;
        this.a = gdoVar;
        eptVar.c(new gel(this, genVar));
    }

    @Override // defpackage.gdo
    public final boolean a() {
        if (this.b) {
            return this.a.a();
        }
        return false;
    }
}
