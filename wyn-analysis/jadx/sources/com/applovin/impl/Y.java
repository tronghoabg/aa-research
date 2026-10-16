package com.applovin.impl;

import A.AbstractC0213f;
import Pc.C0799o;
import Pc.C0800p;
import Va.Za;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.d;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import dd.C2426e;
import dd.C2428g;
import dd.InterfaceC2422a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.C1;
import n9.C3610e;
import org.json.JSONObject;
import r9.C3950g;
import r9.C3955l;
import r9.InterfaceC3945b;
import w9.C4386e;
import w9.InterfaceC4395n;
import w9.InterfaceC4396o;
import x9.InterfaceC4505e;
import yc.C4592o;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements s2.a, AbstractC1631d.b, UserMessagingPlatform.OnConsentFormLoadSuccessListener, d.a, c.InterfaceC0021c, InterfaceC2422a, InterfaceC4395n, InterfaceC4396o, L8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20869c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20870d;

    public /* synthetic */ Y(r2 r2Var, C1651n c1651n, C1653o c1653o, com.applovin.impl.sdk.k kVar) {
        this.f20870d = r2Var;
        this.f20867a = c1651n;
        this.f20868b = c1653o;
        this.f20869c = kVar;
    }

    @Override // com.applovin.impl.AbstractC1631d.b
    public void a(Activity activity) {
        AbstractActivityC1647l.a((r2) this.f20870d, (C1651n) this.f20867a, (C1653o) this.f20868b, (com.applovin.impl.sdk.k) this.f20869c, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // w9.InterfaceC4395n
    public void b(Object obj) {
        C3610e c3610e = (C3610e) obj;
        p9.n nVar = (p9.n) this.f20870d;
        nVar.getClass();
        if (!((AtomicBoolean) this.f20869c).compareAndSet(false, true)) {
            ((C4386e) this.f20868b).a(new ng.a(7, nVar, c3610e));
        } else {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f20867a;
            A6.c.z(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(c3610e);
        }
    }

    public void c(String str, String str2) {
        String str3 = (String) this.f20867a;
        yc.y yVar = (yc.y) this.f20868b;
        q.s1 s1Var = (q.s1) this.f20870d;
        s1Var.getClass();
        C0800p c0800p = (C0800p) this.f20869c;
        if (str != null) {
            c0800p.c(new C4592o(str, str2, null));
            return;
        }
        try {
            c0800p.a(s1Var.j(str3, yVar));
        } catch (Exception e7) {
            q.s1.g(e7, c0800p);
        }
    }

    @Override // dd.InterfaceC2422a
    public void g(p8.q qVar) {
        C0799o c0799o = (C0799o) this.f20869c;
        C2426e c2426e = (C2426e) this.f20870d;
        c2426e.getClass();
        try {
            c0799o.a((String) qVar.get());
        } catch (InterruptedException e7) {
            c0799o.d(new C2428g("exception", e7.getMessage()));
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            intent = null;
            intent = null;
            intent = null;
            Intent intent = null;
            if (!(e10.getCause() instanceof UserRecoverableAuthException)) {
                Throwable cause = e10.getCause();
                c0799o.d(new C2428g("exception", cause != null ? cause.getMessage() : null));
                return;
            }
            if (!((Boolean) this.f20867a).booleanValue() || c2426e.f34265g != null) {
                c0799o.d(new C2428g("user_recoverable_auth", e10.getLocalizedMessage()));
                return;
            }
            Activity activity = c2426e.f34260b;
            if (activity == null) {
                c0799o.d(new C2428g("user_recoverable_auth", "Cannot recover auth because app is not in foreground. " + e10.getLocalizedMessage()));
                return;
            }
            c2426e.a("getTokens", null, null, null, c0799o, (String) this.f20868b);
            UserRecoverableAuthException userRecoverableAuthException = (UserRecoverableAuthException) e10.getCause();
            Intent intent2 = userRecoverableAuthException.f26364a;
            if (intent2 == null) {
                int iF = AbstractC0213f.f(userRecoverableAuthException.f26365b);
                if (iF == 0) {
                    Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                } else if (iF == 1) {
                    Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                } else if (iF == 2) {
                    Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
                }
            } else {
                intent = new Intent(intent2);
            }
            activity.startActivityForResult(intent, 53294);
        }
    }

    @Override // w9.InterfaceC4396o
    public Object get() {
        C3955l c3955l = (C3955l) this.f20870d;
        HashMap mapY = c3955l.f44635e.y((HashSet) this.f20869c);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : mapY.entrySet()) {
            if (AbstractC0213f.b(((s9.k) entry.getValue()).f45381b, 1)) {
                hashSet.add((s9.h) entry.getKey());
            }
        }
        Za za2 = c3955l.f44636f;
        za2.getClass();
        HashMap map = new HashMap();
        za2.j(map, mapY.keySet());
        HashMap mapD = za2.d(mapY, map, new HashSet());
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f20867a;
        Iterator it = list.iterator();
        while (true) {
            s9.l lVar = null;
            if (!it.hasNext()) {
                break;
            }
            t9.h hVar = (t9.h) it.next();
            s9.k kVar = ((r9.x) mapD.get(hVar.f45951a)).f44677a;
            for (t9.g gVar : hVar.f45953c) {
                C1 c1A = gVar.f45950b.a(kVar.f45384e.f(gVar.f45949a));
                if (c1A != null) {
                    if (lVar == null) {
                        lVar = new s9.l();
                    }
                    lVar.g(c1A, gVar.f45949a);
                }
            }
            if (lVar != null) {
                arrayList.add(new t9.l(hVar.f45951a, lVar, s9.l.c(lVar.b().s()), t9.m.a(true)));
            }
        }
        t9.i iVarH = c3955l.f44633c.h((s8.q) this.f20868b, arrayList, list);
        HashMap map2 = new HashMap();
        Iterator it2 = iVarH.b().iterator();
        while (it2.hasNext()) {
            s9.h hVar2 = (s9.h) it2.next();
            s9.k kVar2 = ((r9.x) mapD.get(hVar2)).f44677a;
            t9.f fVarA = iVarH.a(kVar2, ((r9.x) mapD.get(hVar2)).f44678b);
            if (hashSet.contains(hVar2)) {
                fVarA = null;
            }
            t9.h hVarC = t9.h.c(kVar2, fVarA);
            if (hVarC != null) {
                map2.put(hVar2, hVarC);
            }
            if (AbstractC0213f.b(kVar2.f45381b, 1)) {
                kVar2.b(s9.o.f45389b);
            }
        }
        InterfaceC3945b interfaceC3945b = c3955l.f44634d;
        int i5 = iVarH.f45954a;
        interfaceC3945b.g(i5, map2);
        return C3950g.a(i5, mapD);
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return new C8.f((s8.g) lVar.a(s8.g.class), lVar.c(InterfaceC4505e.class), (Executor) lVar.b((L8.t) this.f20870d), (Executor) lVar.b((L8.t) this.f20869c), (Executor) lVar.b((L8.t) this.f20867a), (ScheduledExecutorService) lVar.b((L8.t) this.f20868b));
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((com.applovin.impl.privacy.cmp.a) this.f20870d).a((a.InterfaceC0018a) this.f20869c, (FormError) this.f20867a, (C1646k0) this.f20868b, consentForm);
    }

    public /* synthetic */ Y(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f20870d = obj;
        this.f20869c = obj2;
        this.f20867a = obj3;
        this.f20868b = obj4;
    }

    @Override // com.applovin.impl.s2.a
    public void a(j2 j2Var, r2 r2Var) {
        ((AbstractActivityC1647l) this.f20870d).a((com.applovin.impl.sdk.k) this.f20869c, (C1651n) this.f20867a, (C1653o) this.f20868b, j2Var, r2Var);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void a(com.applovin.impl.sdk.ad.b bVar) {
        ((AppLovinAdServiceImpl) this.f20870d).a((AppLovinAdLoadListener) this.f20869c, (JSONObject) this.f20867a, (C1666u) this.f20868b, bVar);
    }

    @Override // com.applovin.impl.sdk.c.InterfaceC0021c
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        ((com.applovin.impl.sdk.d) this.f20870d).a((d.a) this.f20869c, (c.a) this.f20867a, (C1666u) this.f20868b, bVar, str);
    }
}
