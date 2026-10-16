package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class IntentResult extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.IntentResult> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.IntentResult.class);
    public int a;
    public android.content.Intent b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = bundle.getInt("INTENT_TYPE");
        this.b = (android.content.Intent) bundle.getParcelable("INTENT");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("INTENT_TYPE", this.a);
        bundle.putParcelable("INTENT", this.b);
    }
}
