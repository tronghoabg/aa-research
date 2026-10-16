package defpackage;

/* loaded from: classes.dex */
public final class lht extends lhk {
    final /* synthetic */ lhu a;

    public lht(lhu lhuVar) {
        this.a = lhuVar;
    }

    @Override // defpackage.lhk, defpackage.lhl
    public final void b() {
        lhu lhuVar = this.a;
        synchronized (lhuVar.b) {
            lhuVar.a = lhv.a;
        }
    }
}
