package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wtz extends defpackage.dvg {
    final /* synthetic */ defpackage.wuc a;
    final /* synthetic */ defpackage.wub b;

    public wtz(defpackage.wub wubVar, defpackage.wuc wucVar) {
        this.a = wucVar;
        this.b = wubVar;
    }

    @Override // defpackage.dvg
    public final void a(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    @Override // defpackage.dvg
    public final void b(android.graphics.Typeface typeface) {
        defpackage.wub wubVar = this.b;
        wubVar.m = android.graphics.Typeface.create(typeface, wubVar.d);
        wubVar.o = true;
        this.a.b(wubVar.m, false);
    }
}
