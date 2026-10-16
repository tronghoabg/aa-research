package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class CarAssistantSetting extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.CarAssistantSetting> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.CarAssistantSetting.class);
    public int a;
    public boolean b;
    public int c;
    public java.lang.String d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = bundle.getInt("SETTING_KEY");
        this.b = bundle.getBoolean("BOOL_VALUE");
        this.c = bundle.getInt("INT_VALUE");
        this.d = bundle.getString("STRING_VALUE");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("SETTING_KEY", this.a);
        bundle.putBoolean("BOOL_VALUE", this.b);
        bundle.putInt("INT_VALUE", this.c);
        bundle.putString("STRING_VALUE", this.d);
    }
}
