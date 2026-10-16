package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ylc extends defpackage.yjz implements defpackage.yle {
    public volatile defpackage.ylf b;

    public ylc(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = defpackage.yli.a;
    }

    @Override // defpackage.yke
    public final java.lang.Object d() {
        return this.b.get();
    }

    @Override // defpackage.yle
    public final defpackage.ylf e() {
        return this.b;
    }
}
