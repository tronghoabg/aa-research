package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class ActionPlateTemplate extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.ActionPlateTemplate> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.ActionPlateTemplate.class);
    private com.google.android.gearhead.sdk.assistant.component.Component a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = (com.google.android.gearhead.sdk.assistant.component.Component) e(bundle, "ROOT_COMPONENT");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        f(bundle, "ROOT_COMPONENT", this.a);
    }
}
