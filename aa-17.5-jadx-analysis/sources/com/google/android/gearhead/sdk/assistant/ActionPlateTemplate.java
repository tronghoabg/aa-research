package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gearhead.sdk.assistant.component.Component;
import defpackage.qiz;

/* loaded from: classes2.dex */
public class ActionPlateTemplate extends AbstractBundleable {
    public static final Parcelable.Creator<ActionPlateTemplate> CREATOR = new qiz(ActionPlateTemplate.class);
    private Component a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = (Component) e(bundle, "ROOT_COMPONENT");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        f(bundle, "ROOT_COMPONENT", this.a);
    }
}
