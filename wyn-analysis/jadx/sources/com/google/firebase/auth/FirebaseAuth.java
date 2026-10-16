package com.google.firebase.auth;

import A7.RunnableC0278p;
import C6.l;
import Dd.c;
import G6.C0549m;
import G9.e;
import J8.AbstractC0629d;
import J8.AbstractC0640o;
import J8.C0627b;
import J8.C0628c;
import J8.C0630e;
import J8.C0632g;
import J8.C0633h;
import J8.G;
import J8.L;
import J8.M;
import J8.O;
import J8.P;
import J8.u;
import J8.v;
import J8.w;
import J8.x;
import K8.AbstractC0707t;
import K8.C0690b;
import K8.C0693e;
import K8.C0694f;
import K8.C0698j;
import K8.E;
import K8.F;
import K8.InterfaceC0689a;
import K8.J;
import K8.z;
import O9.b;
import Pc.T;
import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import b7.k;
import cb.AbstractC1593a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzadn;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import s8.g;
import s8.j;

/* loaded from: classes4.dex */
public class FirebaseAuth implements InterfaceC0689a {

    /* renamed from: A, reason: collision with root package name */
    public final Executor f27281A;

    /* renamed from: B, reason: collision with root package name */
    public String f27282B;

    /* renamed from: a, reason: collision with root package name */
    public final g f27283a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f27284b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f27285c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f27286d;

    /* renamed from: e, reason: collision with root package name */
    public final zzabj f27287e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0640o f27288f;

    /* renamed from: g, reason: collision with root package name */
    public final C0694f f27289g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f27290h;

    /* renamed from: i, reason: collision with root package name */
    public String f27291i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f27292j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public l f27293l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f27294m;

    /* renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f27295n;

    /* renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f27296o;

    /* renamed from: p, reason: collision with root package name */
    public final RecaptchaAction f27297p;

    /* renamed from: q, reason: collision with root package name */
    public final RecaptchaAction f27298q;

    /* renamed from: r, reason: collision with root package name */
    public final RecaptchaAction f27299r;

    /* renamed from: s, reason: collision with root package name */
    public final c f27300s;

    /* renamed from: t, reason: collision with root package name */
    public final F f27301t;

    /* renamed from: u, reason: collision with root package name */
    public final C0690b f27302u;

    /* renamed from: v, reason: collision with root package name */
    public final b f27303v;

    /* renamed from: w, reason: collision with root package name */
    public final b f27304w;

    /* renamed from: x, reason: collision with root package name */
    public z f27305x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f27306y;

    /* renamed from: z, reason: collision with root package name */
    public final Executor f27307z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x00cb  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FirebaseAuth(s8.g r7, O9.b r8, O9.b r9, java.util.concurrent.Executor r10, java.util.concurrent.Executor r11, java.util.concurrent.ScheduledExecutorService r12, java.util.concurrent.Executor r13) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(s8.g, O9.b, O9.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) g.e().c(FirebaseAuth.class);
    }

    public static void j(v vVar) {
        String str;
        String str2;
        C0698j c0698j = vVar.f5829h;
        Executor executor = vVar.f5825d;
        Activity activity = vVar.f5827f;
        T t10 = vVar.f5824c;
        w wVar = vVar.f5828g;
        FirebaseAuth firebaseAuth = vVar.f5822a;
        if (c0698j == null) {
            String str3 = vVar.f5826e;
            AbstractC1732v.f(str3);
            if (wVar == null && zzaer.zza(str3, t10, activity, executor)) {
                return;
            }
            firebaseAuth.f27302u.a(firebaseAuth, str3, vVar.f5827f, firebaseAuth.r(), vVar.f5831j, vVar.k, firebaseAuth.f27297p).addOnCompleteListener(new k(firebaseAuth, vVar, str3, 7));
            return;
        }
        if (c0698j.f6652a != null) {
            String str4 = vVar.f5826e;
            AbstractC1732v.f(str4);
            str2 = str4;
            str = str2;
        } else {
            J8.z zVar = vVar.f5830i;
            AbstractC1732v.i(zVar);
            String str5 = zVar.f5833a;
            AbstractC1732v.f(str5);
            str = str5;
            str2 = zVar.f5836d;
        }
        if (wVar == null || !zzaer.zza(str, t10, activity, executor)) {
            firebaseAuth.f27302u.a(firebaseAuth, str2, vVar.f5827f, firebaseAuth.r(), vVar.f5831j, vVar.k, c0698j.f6652a != null ? firebaseAuth.f27298q : firebaseAuth.f27299r).addOnCompleteListener(new e(7, firebaseAuth, vVar, str, false));
        }
    }

    public static void k(FirebaseAuth firebaseAuth, AbstractC0640o abstractC0640o) {
        if (abstractC0640o != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((C0693e) abstractC0640o).f6628b.f6614a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f27281A.execute(new O(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(com.google.firebase.auth.FirebaseAuth r19, J8.AbstractC0640o r20, com.google.android.gms.internal.p002firebaseauthapi.zzagl r21, boolean r22, boolean r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.l(com.google.firebase.auth.FirebaseAuth, J8.o, com.google.android.gms.internal.firebase-auth-api.zzagl, boolean, boolean):void");
    }

    public static void m(j jVar, v vVar, String str) {
        AbstractC1593a.t("Invoking verification failure callback for phone number/uid - ", str, "FirebaseAuth");
        x xVarZza = zzaer.zza(str, vVar.f5824c, null);
        RunnableC0278p runnableC0278p = new RunnableC0278p(22);
        runnableC0278p.f1018b = xVarZza;
        runnableC0278p.f1019c = jVar;
        vVar.f5825d.execute(runnableC0278p);
    }

    public static void o(FirebaseAuth firebaseAuth, AbstractC0640o abstractC0640o) {
        if (abstractC0640o != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((C0693e) abstractC0640o).f6628b.f6614a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String strZzc = abstractC0640o != null ? ((C0693e) abstractC0640o).f6627a.zzc() : null;
        T9.b bVar = new T9.b();
        bVar.f11816a = strZzc;
        firebaseAuth.f27281A.execute(new O(firebaseAuth, bVar));
    }

    public final String a() {
        String str;
        synchronized (this.f27290h) {
            str = this.f27291i;
        }
        return str;
    }

    public final String b() {
        String str;
        synchronized (this.f27292j) {
            str = this.k;
        }
        return str;
    }

    public final Task c(String str, C0627b c0627b) {
        AbstractC1732v.f(str);
        if (c0627b == null) {
            c0627b = new C0627b(new C0549m(1));
        }
        String str2 = this.f27291i;
        if (str2 != null) {
            c0627b.f5791h = str2;
        }
        c0627b.f5792i = 1;
        return new M(this, str, c0627b, 1).x0(this, this.k, this.f27294m);
    }

    public final void d(String str) {
        AbstractC1732v.f(str);
        if (str.startsWith("chrome-extension://")) {
            this.f27282B = str;
            return;
        }
        try {
            String host = new URI(str.contains("://") ? str : "http://".concat(str)).getHost();
            AbstractC1732v.i(host);
            this.f27282B = host;
        } catch (URISyntaxException e7) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e7.getMessage());
            }
            this.f27282B = str;
        }
    }

    public final void e(String str) {
        AbstractC1732v.f(str);
        synchronized (this.f27290h) {
            this.f27291i = str;
        }
    }

    public final void f(String str) {
        AbstractC1732v.f(str);
        synchronized (this.f27292j) {
            this.k = str;
        }
    }

    public final Task g(AbstractC0629d abstractC0629d) {
        C0628c c0628c;
        AbstractC0629d abstractC0629dX = abstractC0629d.X();
        if (!(abstractC0629dX instanceof C0630e)) {
            boolean z2 = abstractC0629dX instanceof u;
            g gVar = this.f27283a;
            zzabj zzabjVar = this.f27287e;
            return z2 ? zzabjVar.zza(gVar, (u) abstractC0629dX, this.k, (J) new C0632g(this)) : zzabjVar.zza(gVar, abstractC0629dX, this.k, new C0632g(this));
        }
        C0630e c0630e = (C0630e) abstractC0629dX;
        String str = c0630e.f5800c;
        if (TextUtils.isEmpty(str)) {
            String str2 = c0630e.f5799b;
            AbstractC1732v.i(str2);
            String str3 = this.k;
            return new P(this, c0630e.f5798a, false, null, str2, str3).x0(this, str3, this.f27295n);
        }
        AbstractC1732v.f(str);
        zzap zzapVar = C0628c.f5794d;
        AbstractC1732v.f(str);
        try {
            c0628c = new C0628c(str);
        } catch (IllegalArgumentException unused) {
            c0628c = null;
        }
        return c0628c != null && !TextUtils.equals(this.k, c0628c.f5797c) ? Tasks.forException(zzadg.zza(new Status(17072, null, null, null))) : new G(this, false, null, c0630e).x0(this, this.k, this.f27294m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [J8.h, K8.E] */
    public final Task h(AbstractC0640o abstractC0640o, AbstractC0629d abstractC0629d) {
        AbstractC1732v.i(abstractC0640o);
        if (abstractC0629d instanceof C0630e) {
            return new L(this, abstractC0640o, (C0630e) abstractC0629d.X(), 1).x0(this, abstractC0640o.V(), this.f27296o);
        }
        AbstractC0629d abstractC0629dX = abstractC0629d.X();
        ?? c0633h = new C0633h(this, 0);
        return this.f27287e.zza(this.f27283a, abstractC0640o, abstractC0629dX, (String) null, (E) c0633h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [J8.h, K8.E] */
    public final Task i(AbstractC0640o abstractC0640o, boolean z2) {
        if (abstractC0640o == null) {
            return Tasks.forException(zzadg.zza(new Status(17495, null, null, null)));
        }
        zzagl zzaglVar = ((C0693e) abstractC0640o).f6627a;
        if (zzaglVar.zzg() && !z2) {
            return Tasks.forResult(AbstractC0707t.a(zzaglVar.zzc()));
        }
        return this.f27287e.zza(this.f27283a, abstractC0640o, zzaglVar.zzd(), (E) new C0633h(this, 1));
    }

    public final synchronized l n() {
        return this.f27293l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [J8.h, K8.E] */
    /* JADX WARN: Type inference failed for: r6v0, types: [J8.h, K8.E] */
    public final Task p(AbstractC0640o abstractC0640o, AbstractC0629d abstractC0629d) {
        C0628c c0628c;
        int i5 = 0;
        AbstractC1732v.i(abstractC0640o);
        AbstractC0629d abstractC0629dX = abstractC0629d.X();
        if (!(abstractC0629dX instanceof C0630e)) {
            if (abstractC0629dX instanceof u) {
                return this.f27287e.zzb(this.f27283a, abstractC0640o, (u) abstractC0629dX, this.k, (E) new C0633h(this, i5));
            }
            return this.f27287e.zzc(this.f27283a, abstractC0640o, abstractC0629dX, abstractC0640o.V(), new C0633h(this, i5));
        }
        C0630e c0630e = (C0630e) abstractC0629dX;
        if ("password".equals(c0630e.W())) {
            String str = c0630e.f5799b;
            AbstractC1732v.f(str);
            String strV = abstractC0640o.V();
            return new P(this, c0630e.f5798a, true, abstractC0640o, str, strV).x0(this, strV, this.f27295n);
        }
        String str2 = c0630e.f5800c;
        AbstractC1732v.f(str2);
        zzap zzapVar = C0628c.f5794d;
        AbstractC1732v.f(str2);
        try {
            c0628c = new C0628c(str2);
        } catch (IllegalArgumentException unused) {
            c0628c = null;
        }
        return (c0628c == null || TextUtils.equals(this.k, c0628c.f5797c)) ? new G(this, true, abstractC0640o, c0630e).x0(this, this.k, this.f27294m) : Tasks.forException(zzadg.zza(new Status(17072, null, null, null)));
    }

    public final void q() {
        c cVar = this.f27300s;
        AbstractC1732v.i(cVar);
        AbstractC0640o abstractC0640o = this.f27288f;
        if (abstractC0640o != null) {
            ((SharedPreferences) cVar.f2643c).edit().remove(R8.v.f("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((C0693e) abstractC0640o).f6628b.f6614a)).apply();
            this.f27288f = null;
        }
        ((SharedPreferences) cVar.f2643c).edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        o(this, null);
        k(this, null);
    }

    public final boolean r() {
        g gVar = this.f27283a;
        gVar.a();
        return zzadn.zza(gVar.f45328a);
    }

    public final synchronized z s() {
        if (this.f27305x == null) {
            g gVar = this.f27283a;
            AbstractC1732v.i(gVar);
            this.f27305x = new z(gVar);
        }
        return this.f27305x;
    }

    @Keep
    public static FirebaseAuth getInstance(g gVar) {
        return (FirebaseAuth) gVar.c(FirebaseAuth.class);
    }
}
