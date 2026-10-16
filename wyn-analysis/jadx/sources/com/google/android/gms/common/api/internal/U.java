package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC1717f;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.C1720i;
import com.google.android.gms.internal.base.zac;
import java.util.Set;

/* loaded from: classes3.dex */
public final class U extends F7.c implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: h, reason: collision with root package name */
    public static final C7.l f26487h = E7.b.f3590a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f26488a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f26489b;

    /* renamed from: c, reason: collision with root package name */
    public final C7.l f26490c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f26491d;

    /* renamed from: e, reason: collision with root package name */
    public final C1720i f26492e;

    /* renamed from: f, reason: collision with root package name */
    public F7.a f26493f;

    /* renamed from: g, reason: collision with root package name */
    public F6.r f26494g;

    public U(Context context, Handler handler, C1720i c1720i) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f26488a = context;
        this.f26489b = handler;
        this.f26492e = c1720i;
        this.f26491d = c1720i.f26645a;
        this.f26490c = f26487h;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1694h
    public final void onConnected() {
        F7.a aVar = this.f26493f;
        aVar.getClass();
        try {
            aVar.f4018b.getClass();
            Account account = new Account(AbstractC1717f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = AbstractC1717f.DEFAULT_ACCOUNT.equals(account.name) ? b7.b.a(aVar.getContext()).b() : null;
            Integer num = aVar.f4020d;
            AbstractC1732v.i(num);
            com.google.android.gms.common.internal.E e7 = new com.google.android.gms.common.internal.E(2, account, num.intValue(), googleSignInAccountB);
            F7.d dVar = (F7.d) aVar.getService();
            F7.f fVar = new F7.f(1, e7);
            Parcel parcelZaa = dVar.zaa();
            zac.zac(parcelZaa, fVar);
            zac.zad(parcelZaa, this);
            dVar.zac(12, parcelZaa);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f26489b.post(new e0(3, this, new F7.g(1, new d7.b(8, null, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1704s
    public final void onConnectionFailed(d7.b bVar) {
        this.f26494g.g(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1694h
    public final void onConnectionSuspended(int i5) {
        F6.r rVar = this.f26494g;
        H h10 = (H) ((C1695i) rVar.f4016g).f26540j.get((C1688b) rVar.f4013d);
        if (h10 != null) {
            if (h10.f26462i) {
                h10.n(new d7.b(17, null, null));
            } else {
                h10.onConnectionSuspended(i5);
            }
        }
    }
}
