package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.qiz;

/* loaded from: classes2.dex */
public class CarAssistantEvent extends AbstractBundleable {
    public static final Parcelable.Creator<CarAssistantEvent> CREATOR = new qiz(CarAssistantEvent.class);
    public int a;
    public long b;
    public int c;
    public Bundle d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getInt("EVENT_TYPE");
        this.b = bundle.getLong("GENERATED_MILLIS");
        this.c = bundle.getInt("VOICE_PLATE_INFO");
        this.d = bundle.getBundle("CUSTOM_PAYLOAD");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("EVENT_TYPE", this.a);
        bundle.putLong("GENERATED_MILLIS", this.b);
        bundle.putInt("VOICE_PLATE_INFO", this.c);
        bundle.putBundle("CUSTOM_PAYLOAD", this.d);
    }
}
