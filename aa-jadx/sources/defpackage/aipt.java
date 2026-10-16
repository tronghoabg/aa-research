package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aipt implements defpackage.aiog {
    private final java.lang.String description;

    private aipt(java.lang.String str) {
        this.description = str;
    }

    @Override // defpackage.aiog
    public java.lang.String getDescription() {
        return this.description;
    }

    @Override // defpackage.aiog
    public /* bridge */ java.lang.String invoke(defpackage.agdj agdjVar) {
        return defpackage.aiof.invoke(this, agdjVar);
    }

    public /* synthetic */ aipt(java.lang.String str, defpackage.affu affuVar) {
        this(str);
    }
}
