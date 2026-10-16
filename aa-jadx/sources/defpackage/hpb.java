package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hpb implements defpackage.hnm {
    @Override // defpackage.hnm
    public final /* bridge */ /* synthetic */ defpackage.hnn a(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("entity_type");
        if (string == null) {
            string = "";
        }
        return new defpackage.hpc(string);
    }
}
