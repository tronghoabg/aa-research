package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class CarAssistantEvent extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.CarAssistantEvent> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.CarAssistantEvent.class);
    public int a;
    public long b;
    public int c;
    public android.os.Bundle d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = bundle.getInt("EVENT_TYPE");
        this.b = bundle.getLong("GENERATED_MILLIS");
        this.c = bundle.getInt("VOICE_PLATE_INFO");
        this.d = bundle.getBundle("CUSTOM_PAYLOAD");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("EVENT_TYPE", this.a);
        bundle.putLong("GENERATED_MILLIS", this.b);
        bundle.putInt("VOICE_PLATE_INFO", this.c);
        bundle.putBundle("CUSTOM_PAYLOAD", this.d);
    }
}
