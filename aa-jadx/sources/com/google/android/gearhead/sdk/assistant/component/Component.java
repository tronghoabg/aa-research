package com.google.android.gearhead.sdk.assistant.component;

/* JADX INFO: loaded from: classes2.dex */
public class Component extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.component.Component> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.component.Component.class);
    private java.lang.String a;
    private boolean b;
    private java.util.List c = new java.util.ArrayList();
    private defpackage.qkj d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        defpackage.qkj qkjVar;
        this.a = bundle.getString("ID");
        android.os.IBinder binder = bundle.getBinder("SELECTION_HANDLER_BINDER");
        java.util.ArrayList arrayList = null;
        if (binder == null) {
            qkjVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.component.ISelectionHandler");
            qkjVar = iInterfaceQueryLocalInterface instanceof defpackage.qkj ? (defpackage.qkj) iInterfaceQueryLocalInterface : new defpackage.qkj(binder);
        }
        this.d = qkjVar;
        this.b = bundle.getBoolean("DISABLED");
        android.os.Bundle bundle2 = bundle.getBundle("SUB_COMPONENTS");
        if (bundle2 != null) {
            int i = bundle2.getInt("BUNDLEABLE_LIST_SIZE");
            arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(com.google.android.gearhead.sdk.assistant.AbstractBundleable.e(bundle2, java.lang.Integer.toString(i2)));
            }
        }
        this.c = arrayList;
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putString("ID", this.a);
        defpackage.qkj qkjVar = this.d;
        if (qkjVar != null) {
            bundle.putBinder("SELECTION_HANDLER_BINDER", qkjVar.asBinder());
        }
        bundle.putBoolean("DISABLED", this.b);
        java.util.List list = this.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("BUNDLEABLE_LIST_SIZE", list.size());
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gearhead.sdk.assistant.AbstractBundleable.f(bundle2, java.lang.Integer.toString(i), (com.google.android.gearhead.sdk.assistant.AbstractBundleable) list.get(i));
        }
        bundle.putBundle("SUB_COMPONENTS", bundle2);
    }
}
