package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class SupportedVersionInfo extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.SupportedVersionInfo> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.SupportedVersionInfo.class);
    public int a;
    public int b;
    public defpackage.osi c = defpackage.osi.a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = bundle.getInt("MIN_VERSION");
        this.b = bundle.getInt("MAX_VERSION");
        defpackage.osi osiVar = defpackage.osi.a;
        this.c = osiVar;
        byte[] byteArray = bundle.getByteArray("FEATURE_FLAGS");
        if (byteArray != null) {
            try {
                this.c = (defpackage.osi) defpackage.abox.B(osiVar, byteArray, defpackage.abol.a());
            } catch (defpackage.abpp e) {
                throw new java.lang.IllegalArgumentException("Error parsing AssistantFeatureFlags", e);
            }
        }
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("MIN_VERSION", this.a);
        bundle.putInt("MAX_VERSION", this.b);
        bundle.putByteArray("FEATURE_FLAGS", this.c.h());
    }
}
