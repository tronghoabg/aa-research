package com.google.android.gms.location.a;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.common.api.k;
import com.google.android.gms.location.g;
import com.google.android.gms.location.h;
import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends com.google.android.a.b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f5670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(w wVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
        this.f5670a = wVar;
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        h hVar = (h) com.google.android.a.c.a(parcel, h.CREATOR);
        k kVar = (k) com.google.android.a.c.a(parcel, k.CREATOR);
        enforceNoDataAvail(parcel);
        ab.e(hVar.a(), new g(hVar), this.f5670a, kVar);
        return true;
    }
}
