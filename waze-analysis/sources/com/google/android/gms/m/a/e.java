package com.google.android.gms.m.a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.q;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.common.internal.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends ad implements com.google.android.gms.common.api.h {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5698e;

    /* renamed from: f, reason: collision with root package name */
    private final p f5699f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f5700g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f5701h;

    public e(Context context, Looper looper, p pVar, Bundle bundle, r rVar, s sVar) {
        super(context, looper, 44, pVar, rVar, sVar);
        this.f5698e = true;
        this.f5699f = pVar;
        this.f5700g = bundle;
        this.f5701h = pVar.d();
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final Bundle b() {
        p pVar = this.f5699f;
        if (!x().getPackageName().equals(pVar.f())) {
            this.f5700g.putString("com.google.android.gms.signin.internal.realClientPackageName", pVar.f());
        }
        return this.f5700g;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void i(b bVar) {
        try {
            Account accountB = this.f5699f.b();
            GoogleSignInAccount googleSignInAccountA = "<<default account>>".equals(accountB.name) ? q.c(x()).a() : null;
            Integer num = this.f5701h;
            av.m(num);
            ((c) y()).a(new f(1, new bd(accountB, num.intValue(), googleSignInAccountA)), bVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                bVar.e(new h(1, new com.google.android.gms.common.d(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final boolean q() {
        return this.f5698e;
    }
}
