package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.abnj;
import defpackage.abnv;
import defpackage.abon;
import defpackage.orl;
import defpackage.qiz;

/* loaded from: classes2.dex */
public class SupportedVersionInfo extends AbstractBundleable {
    public static final Parcelable.Creator<SupportedVersionInfo> CREATOR = new qiz(SupportedVersionInfo.class);
    public int a;
    public int b;
    public orl c = orl.a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getInt("MIN_VERSION");
        this.b = bundle.getInt("MAX_VERSION");
        orl orlVar = orl.a;
        this.c = orlVar;
        byte[] byteArray = bundle.getByteArray("FEATURE_FLAGS");
        if (byteArray != null) {
            try {
                this.c = (orl) abnv.B(orlVar, byteArray, abnj.a());
            } catch (abon e) {
                throw new IllegalArgumentException("Error parsing AssistantFeatureFlags", e);
            }
        }
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("MIN_VERSION", this.a);
        bundle.putInt("MAX_VERSION", this.b);
        bundle.putByteArray("FEATURE_FLAGS", this.c.h());
    }
}
