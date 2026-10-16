package com.google.android.gearhead.sdk.assistant;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.qiz;

/* loaded from: classes2.dex */
public class IntentResult extends AbstractBundleable {
    public static final Parcelable.Creator<IntentResult> CREATOR = new qiz(IntentResult.class);
    public int a;
    public Intent b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getInt("INTENT_TYPE");
        this.b = (Intent) bundle.getParcelable("INTENT");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("INTENT_TYPE", this.a);
        bundle.putParcelable("INTENT", this.b);
    }
}
