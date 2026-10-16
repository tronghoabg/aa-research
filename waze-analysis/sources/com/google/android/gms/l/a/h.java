package com.google.android.gms.l.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends ad {
    public h(Context context, Looper looper, p pVar, r rVar, s sVar) {
        super(context, looper, 51, pVar, rVar, sVar);
    }

    @Override // com.google.android.gms.common.internal.m
    public final boolean W() {
        return false;
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 9410000;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // com.google.android.gms.common.internal.m
    public final com.google.android.gms.common.f[] h() {
        return com.google.android.gms.l.e.f5612k;
    }
}
