package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.qiz;

/* loaded from: classes2.dex */
public class VoiceSessionResult extends AbstractBundleable {
    public static final Parcelable.Creator<VoiceSessionResult> CREATOR = new qiz(VoiceSessionResult.class);
    public int a;
    public IntentResult b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getInt("RESULT_TYPE");
        Bundle bundle2 = bundle.getBundle("INTENT_RESULT");
        if (bundle2 != null) {
            IntentResult intentResult = new IntentResult();
            this.b = intentResult;
            intentResult.a(bundle2);
        }
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("RESULT_TYPE", this.a);
        if (this.b != null) {
            Bundle bundle2 = new Bundle();
            this.b.b(bundle2);
            bundle.putBundle("INTENT_RESULT", bundle2);
        }
    }
}
