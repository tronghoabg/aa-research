package com.google.android.gms.ads.internal.client;

import D6.AbstractBinderC0377i0;
import D6.d1;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvj;

/* loaded from: classes3.dex */
public class LiteSdkInfo extends AbstractBinderC0377i0 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // D6.InterfaceC0379j0
    public zzbvj getAdapterCreator() {
        return new zzbvf();
    }

    @Override // D6.InterfaceC0379j0
    public d1 getLiteSdkVersion() {
        return new d1(ModuleDescriptor.MODULE_VERSION, 261710000, "25.3.0");
    }
}
