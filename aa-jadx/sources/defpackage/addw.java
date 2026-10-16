package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class addw implements defpackage.addv {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.addt.b, 18);

    @Override // defpackage.addv
    public final boolean a() {
        return ((java.lang.Boolean) a.d(1, "CollectionBasisVerifierFeatures__enable_cbv_v2", false).fF()).booleanValue();
    }

    @Override // defpackage.addv
    public final boolean b() {
        return ((java.lang.Boolean) a.d(2, "CollectionBasisVerifierFeatures__enable_google_signature_check", false).fF()).booleanValue();
    }

    @Override // defpackage.addv
    public final void c() {
        ((java.lang.Boolean) a.d(11, "CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false).fF()).booleanValue();
    }
}
