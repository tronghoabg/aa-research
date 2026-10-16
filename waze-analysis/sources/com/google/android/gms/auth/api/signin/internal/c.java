package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.ad;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends ad {

    /* renamed from: e, reason: collision with root package name */
    private final GoogleSignInOptions f4620e;

    public c(Context context, Looper looper, com.google.android.gms.common.internal.p pVar, GoogleSignInOptions googleSignInOptions, r rVar, s sVar) {
        super(context, looper, 91, pVar, rVar, sVar);
        com.google.android.gms.auth.api.signin.d dVar = new com.google.android.gms.auth.api.signin.d(googleSignInOptions);
        dVar.e(com.google.android.gms.i.a.a.a.a.a());
        if (!pVar.g().isEmpty()) {
            Iterator it = pVar.g().iterator();
            while (it.hasNext()) {
                dVar.d((Scope) it.next(), new Scope[0]);
            }
        }
        this.f4620e = dVar.a();
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new o(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final GoogleSignInOptions i() {
        return this.f4620e;
    }
}
