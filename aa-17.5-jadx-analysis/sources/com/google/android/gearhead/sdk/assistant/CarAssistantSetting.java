package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.qiz;

/* loaded from: classes2.dex */
public class CarAssistantSetting extends AbstractBundleable {
    public static final Parcelable.Creator<CarAssistantSetting> CREATOR = new qiz(CarAssistantSetting.class);
    public int a;
    public boolean b;
    public int c;
    public String d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getInt("SETTING_KEY");
        this.b = bundle.getBoolean("BOOL_VALUE");
        this.c = bundle.getInt("INT_VALUE");
        this.d = bundle.getString("STRING_VALUE");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("SETTING_KEY", this.a);
        bundle.putBoolean("BOOL_VALUE", this.b);
        bundle.putInt("INT_VALUE", this.c);
        bundle.putString("STRING_VALUE", this.d);
    }
}
