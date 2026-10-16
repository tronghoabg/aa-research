package com.google.android.gearhead.sdk.assistant.component;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.google.android.gearhead.sdk.assistant.AbstractBundleable;
import defpackage.qiz;
import defpackage.qjn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Component extends AbstractBundleable {
    public static final Parcelable.Creator<Component> CREATOR = new qiz(Component.class);
    private String a;
    private boolean b;
    private List c = new ArrayList();
    private qjn d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        qjn qjnVar;
        this.a = bundle.getString("ID");
        IBinder binder = bundle.getBinder("SELECTION_HANDLER_BINDER");
        ArrayList arrayList = null;
        if (binder == null) {
            qjnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.component.ISelectionHandler");
            qjnVar = iInterfaceQueryLocalInterface instanceof qjn ? (qjn) iInterfaceQueryLocalInterface : new qjn(binder);
        }
        this.d = qjnVar;
        this.b = bundle.getBoolean("DISABLED");
        Bundle bundle2 = bundle.getBundle("SUB_COMPONENTS");
        if (bundle2 != null) {
            int i = bundle2.getInt("BUNDLEABLE_LIST_SIZE");
            arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(AbstractBundleable.e(bundle2, Integer.toString(i2)));
            }
        }
        this.c = arrayList;
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putString("ID", this.a);
        qjn qjnVar = this.d;
        if (qjnVar != null) {
            bundle.putBinder("SELECTION_HANDLER_BINDER", qjnVar.asBinder());
        }
        bundle.putBoolean("DISABLED", this.b);
        List list = this.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("BUNDLEABLE_LIST_SIZE", list.size());
        for (int i = 0; i < list.size(); i++) {
            AbstractBundleable.f(bundle2, Integer.toString(i), (AbstractBundleable) list.get(i));
        }
        bundle.putBundle("SUB_COMPONENTS", bundle2);
    }
}
