package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aiou implements defpackage.aiog {
    private final java.lang.String description;

    private aiou(java.lang.String str) {
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

    public /* synthetic */ aiou(java.lang.String str, defpackage.affu affuVar) {
        this(str);
    }
}
