package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hpc extends defpackage.hnn {
    public static final defpackage.hpb b = new defpackage.hpb();
    public final java.lang.String c;

    public hpc(java.lang.String str) {
        super(defpackage.hno.EntityTypeHintId);
        this.c = str;
    }

    @Override // defpackage.hnn
    public final void a(android.os.Bundle bundle) {
        bundle.putString("entity_type", this.c);
    }
}
