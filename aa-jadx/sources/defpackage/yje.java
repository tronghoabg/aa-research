package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yje extends defpackage.yos {
    final /* synthetic */ defpackage.yjj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yje(java.util.ListIterator listIterator, defpackage.yjj yjjVar) {
        super(listIterator);
        this.a = yjjVar;
    }

    @Override // defpackage.yor
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return ((java.util.Map.Entry) obj).getValue();
    }

    @Override // defpackage.yos, java.util.ListIterator
    public final void set(java.lang.Object obj) {
        defpackage.yjj yjjVar = this.a;
        defpackage.ysr.bj(yjjVar.c != null);
        yjjVar.c.setValue(obj);
    }
}
