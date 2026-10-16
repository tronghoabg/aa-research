package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class VoiceSessionResult extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.VoiceSessionResult> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.VoiceSessionResult.class);
    public int a;
    public com.google.android.gearhead.sdk.assistant.IntentResult b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = bundle.getInt("RESULT_TYPE");
        android.os.Bundle bundle2 = bundle.getBundle("INTENT_RESULT");
        if (bundle2 != null) {
            com.google.android.gearhead.sdk.assistant.IntentResult intentResult = new com.google.android.gearhead.sdk.assistant.IntentResult();
            this.b = intentResult;
            intentResult.a(bundle2);
        }
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("RESULT_TYPE", this.a);
        if (this.b != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.b.b(bundle2);
            bundle.putBundle("INTENT_RESULT", bundle2);
        }
    }
}
