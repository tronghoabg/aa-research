package com.google.android.gms.fido.a.b.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends ad {
    public b(Context context, Looper looper, p pVar, r rVar, s sVar) {
        super(context, looper, 148, pVar, rVar, sVar);
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.m
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.m
    public final f[] h() {
        return new f[]{com.google.android.gms.fido.a.f5266b, com.google.android.gms.fido.a.f5265a};
    }
}
