package defpackage;

/* loaded from: classes3.dex */
public final class adcx implements adcw {
    private static final wcv a = new wcv(adcu.b, 18);

    @Override // defpackage.adcw
    public final boolean a() {
        return ((Boolean) a.d(1, "CollectionBasisVerifierFeatures__enable_cbv_v2", false).gu()).booleanValue();
    }

    @Override // defpackage.adcw
    public final boolean b() {
        return ((Boolean) a.d(2, "CollectionBasisVerifierFeatures__enable_google_signature_check", false).gu()).booleanValue();
    }

    @Override // defpackage.adcw
    public final void c() {
        ((Boolean) a.d(11, "CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false).gu()).booleanValue();
    }
}
