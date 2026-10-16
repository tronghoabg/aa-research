package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ykr extends defpackage.yjy implements defpackage.yle {
    public volatile defpackage.ylf c;

    public ykr(java.lang.Object obj, int i) {
        super(obj, i);
        this.c = defpackage.yli.a;
    }

    @Override // defpackage.yke
    public final java.lang.Object d() {
        return this.c.get();
    }

    @Override // defpackage.yle
    public final defpackage.ylf e() {
        return this.c;
    }
}
