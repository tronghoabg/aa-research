package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.abnj;
import defpackage.abnv;
import defpackage.abon;
import defpackage.orh;
import defpackage.qiz;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ClientRegistrationConfig extends AbstractBundleable {
    public static final Parcelable.Creator<ClientRegistrationConfig> CREATOR = new qiz(ClientRegistrationConfig.class);
    public int a;
    public int b;
    public ArrayList c;
    public ArrayList d;
    public String e;
    public String f;
    public orh g = orh.a;
    public int h = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getInt("API_VERSION");
        this.b = bundle.getInt("UI_MODE");
        this.c = bundle.getStringArrayList("APP_WHITELIST");
        this.d = bundle.getStringArrayList("PH_TOKEN");
        this.e = bundle.getString("CAR_MANUFACTURER");
        this.f = bundle.getString("CAR_MODEL");
        this.h = bundle.getInt("VIRTUAL_DEVICE_ID", -1);
        orh orhVar = orh.a;
        this.g = orhVar;
        byte[] byteArray = bundle.getByteArray("FEATURE_FLAGS");
        if (byteArray != null) {
            try {
                this.g = (orh) abnv.B(orhVar, byteArray, abnj.a());
            } catch (abon e) {
                throw new IllegalArgumentException("Error parsing GearheadFeatureFlags", e);
            }
        }
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("API_VERSION", this.a);
        bundle.putInt("UI_MODE", this.b);
        bundle.putStringArrayList("APP_WHITELIST", this.c);
        bundle.putStringArrayList("PH_TOKEN", this.d);
        bundle.putString("CAR_MANUFACTURER", this.e);
        bundle.putString("CAR_MODEL", this.f);
        bundle.putByteArray("FEATURE_FLAGS", this.g.h());
        int i = this.h;
        if (i != -1) {
            bundle.putInt("VIRTUAL_DEVICE_ID", i);
        }
    }
}
