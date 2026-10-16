package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractBinderC1712a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.InterfaceC1726o;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26520a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26522c;

    public /* synthetic */ e0(int i5, Object obj, Object obj2) {
        this.f26520a = i5;
        this.f26522c = obj;
        this.f26521b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1726o interfaceC1726o;
        InterfaceC1726o z2;
        Set set;
        switch (this.f26520a) {
            case 0:
                if (((E) this.f26522c).f26445a) {
                    d7.b bVar = ((d0) this.f26521b).f26519b;
                    if ((bVar.f34115b == 0 || bVar.f34116c == null) ? false : true) {
                        E e7 = (E) this.f26522c;
                        InterfaceC1700n interfaceC1700n = e7.mLifecycleFragment;
                        Activity activity = e7.getActivity();
                        PendingIntent pendingIntent = bVar.f34116c;
                        AbstractC1732v.i(pendingIntent);
                        int i5 = ((d0) this.f26521b).f26518a;
                        int i10 = GoogleApiActivity.f26420b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i5);
                        intent.putExtra("notify_manager", false);
                        interfaceC1700n.startActivityForResult(intent, 1);
                        return;
                    }
                    E e10 = (E) this.f26522c;
                    if (e10.f26448d.b(e10.getActivity(), bVar.f34115b, null) != null) {
                        E e11 = (E) this.f26522c;
                        e11.f26448d.i(e11.getActivity(), e11.mLifecycleFragment, bVar.f34115b, (E) this.f26522c);
                        return;
                    }
                    if (bVar.f34115b != 18) {
                        E e12 = (E) this.f26522c;
                        int i11 = ((d0) this.f26521b).f26518a;
                        e12.f26446b.set(null);
                        e12.f26450f.j(bVar, i11);
                        return;
                    }
                    E e13 = (E) this.f26522c;
                    d7.e eVar = e13.f26448d;
                    Activity activity2 = e13.getActivity();
                    eVar.getClass();
                    ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                    builder.setView(progressBar);
                    builder.setMessage(com.google.android.gms.common.internal.B.b(activity2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    d7.e.g(activity2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", e13);
                    E e14 = (E) this.f26522c;
                    Context applicationContext = e14.getActivity().getApplicationContext();
                    D d3 = new D(this, alertDialogCreate);
                    e14.f26448d.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    K8.r rVar = new K8.r(d3);
                    zao.zaa(applicationContext, rVar, intentFilter);
                    rVar.f6671b = applicationContext;
                    if (d7.i.c(applicationContext)) {
                        return;
                    }
                    E e15 = (E) this.f26522c;
                    e15.f26446b.set(null);
                    zau zauVar = e15.f26450f.f26543n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (rVar) {
                        try {
                            Context context = (Context) rVar.f6671b;
                            if (context != null) {
                                context.unregisterReceiver(rVar);
                            }
                            rVar.f6671b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                F6.r rVar2 = (F6.r) this.f26522c;
                H h10 = (H) ((C1695i) rVar2.f4016g).f26540j.get((C1688b) rVar2.f4013d);
                if (h10 == null) {
                    return;
                }
                d7.b bVar2 = (d7.b) this.f26521b;
                if (!bVar2.V()) {
                    h10.m(bVar2, null);
                    return;
                }
                rVar2.f4011b = true;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) rVar2.f4012c;
                if (gVar.requiresSignIn()) {
                    if (!rVar2.f4011b || (interfaceC1726o = (InterfaceC1726o) rVar2.f4014e) == null) {
                        return;
                    }
                    gVar.getRemoteService(interfaceC1726o, (Set) rVar2.f4015f);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e16) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e16);
                    gVar.disconnect("Failed to get service from broker.");
                    h10.m(new d7.b(10, null, null), null);
                    return;
                }
            case 2:
                C1703q c1703q = (C1703q) this.f26521b;
                InterfaceC1702p interfaceC1702p = (InterfaceC1702p) this.f26522c;
                Object obj = c1703q.f26551b;
                if (obj == null) {
                    interfaceC1702p.onNotifyListenerFailed();
                    return;
                }
                try {
                    interfaceC1702p.notifyListener(obj);
                    return;
                } catch (RuntimeException e17) {
                    interfaceC1702p.onNotifyListenerFailed();
                    throw e17;
                }
            default:
                F7.g gVar2 = (F7.g) this.f26521b;
                d7.b bVar3 = gVar2.f4029b;
                boolean zV = bVar3.V();
                U u10 = (U) this.f26522c;
                if (zV) {
                    com.google.android.gms.common.internal.F f10 = gVar2.f4030c;
                    AbstractC1732v.i(f10);
                    d7.b bVar4 = f10.f26593c;
                    if (!bVar4.V()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        u10.f26494g.g(bVar4);
                        u10.f26493f.disconnect();
                        return;
                    }
                    F6.r rVar3 = u10.f26494g;
                    IBinder iBinder = f10.f26592b;
                    if (iBinder == null) {
                        z2 = null;
                    } else {
                        int i12 = AbstractBinderC1712a.f26639a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        z2 = iInterfaceQueryLocalInterface instanceof InterfaceC1726o ? (InterfaceC1726o) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.Z(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    rVar3.getClass();
                    if (z2 == null || (set = u10.f26491d) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        rVar3.g(new d7.b(4, null, null));
                    } else {
                        rVar3.f4014e = z2;
                        rVar3.f4015f = set;
                        if (rVar3.f4011b) {
                            ((com.google.android.gms.common.api.g) rVar3.f4012c).getRemoteService(z2, set);
                        }
                    }
                } else {
                    u10.f26494g.g(bVar3);
                }
                u10.f26493f.disconnect();
                return;
        }
    }

    public /* synthetic */ e0(C1703q c1703q, InterfaceC1702p interfaceC1702p) {
        this.f26520a = 2;
        this.f26521b = c1703q;
        this.f26522c = interfaceC1702p;
    }
}
