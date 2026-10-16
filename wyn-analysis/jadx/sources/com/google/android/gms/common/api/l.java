package com.google.android.gms.common.api;

import U8.v0;
import Va.M6;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1691e;
import com.google.android.gms.common.api.internal.AbstractC1699m;
import com.google.android.gms.common.api.internal.AbstractC1706u;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C1687a;
import com.google.android.gms.common.api.internal.C1688b;
import com.google.android.gms.common.api.internal.C1695i;
import com.google.android.gms.common.api.internal.C1701o;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.api.internal.C1707v;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.internal.H;
import com.google.android.gms.common.api.internal.InterfaceC1700n;
import com.google.android.gms.common.api.internal.InterfaceC1710y;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.internal.O;
import com.google.android.gms.common.api.internal.Q;
import com.google.android.gms.common.api.internal.U;
import com.google.android.gms.common.api.internal.Z;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.internal.AbstractC1717f;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.C1719h;
import com.google.android.gms.common.internal.C1720i;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import x.C4413f;

/* loaded from: classes3.dex */
public abstract class l {
    protected final C1695i zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final C1688b zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final InterfaceC1710y zaj;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Activity activity, i iVar, e eVar, C1687a c1687a) {
        Looper mainLooper = activity.getMainLooper();
        AbstractC1732v.j(mainLooper, "Looper must not be null.");
        this(activity, activity, iVar, eVar, new k(c1687a, mainLooper));
    }

    public final void a(int i5, AbstractC1691e abstractC1691e) {
        abstractC1691e.zak();
        C1695i c1695i = this.zaa;
        c1695i.getClass();
        O o7 = new O(new Z(i5, abstractC1691e), c1695i.f26539i.get(), this);
        zau zauVar = c1695i.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(4, o7));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    public final Task b(int i5, com.google.android.gms.common.api.internal.A a5) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        InterfaceC1710y interfaceC1710y = this.zaj;
        C1695i c1695i = this.zaa;
        c1695i.getClass();
        c1695i.g(taskCompletionSource, a5.f26439c, this);
        O o7 = new O(new b0(i5, a5, taskCompletionSource, interfaceC1710y), c1695i.f26539i.get(), this);
        zau zauVar = c1695i.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(4, o7));
        return taskCompletionSource.getTask();
    }

    public C1719h createClientSettingsBuilder() {
        C1719h c1719h = new C1719h();
        Set set = Collections.EMPTY_SET;
        if (c1719h.f26642a == null) {
            c1719h.f26642a = new C4413f(0);
        }
        c1719h.f26642a.addAll(set);
        c1719h.f26644c = this.zab.getClass().getName();
        c1719h.f26643b = this.zab.getPackageName();
        return c1719h;
    }

    public Task<Boolean> disconnectService() {
        C1695i c1695i = this.zaa;
        c1695i.getClass();
        F f10 = new F(getApiKey());
        zau zauVar = c1695i.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(14, f10));
        return f10.f26452b.getTask();
    }

    public <A extends b, T extends AbstractC1691e> T doBestEffortWrite(T t10) {
        a(2, t10);
        return t10;
    }

    public <A extends b, T extends AbstractC1691e> T doRead(T t10) {
        a(0, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends b, T extends AbstractC1706u, U extends B> Task<Void> doRegisterEventListener(T t10, U u10) {
        AbstractC1732v.i(t10);
        AbstractC1732v.i(u10);
        AbstractC1732v.j(t10.f26554a.f26552c, "Listener has already been released.");
        AbstractC1732v.j(u10.f26440a, "Listener has already been released.");
        AbstractC1732v.a("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", AbstractC1732v.m(t10.f26554a.f26552c, u10.f26440a));
        return this.zaa.i(this, t10, u10, y.f26567a);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C1701o c1701o) {
        return doUnregisterEventListener(c1701o, 0);
    }

    public <A extends b, T extends AbstractC1691e> T doWrite(T t10) {
        a(1, t10);
        return t10;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C1688b getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C1703q registerListener(L l10, String str) {
        return v0.u(this.zag, l10, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, H h10) {
        C1719h c1719hCreateClientSettingsBuilder = createClientSettingsBuilder();
        C1720i c1720i = new C1720i(c1719hCreateClientSettingsBuilder.f26642a, c1719hCreateClientSettingsBuilder.f26643b, c1719hCreateClientSettingsBuilder.f26644c);
        AbstractC1686a abstractC1686a = this.zad.f26434a;
        AbstractC1732v.i(abstractC1686a);
        g gVarBuildClient = abstractC1686a.buildClient(this.zab, looper, c1720i, (Object) this.zae, (m) h10, (n) h10);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (gVarBuildClient instanceof AbstractC1717f)) {
            ((AbstractC1717f) gVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(gVarBuildClient instanceof com.google.android.gms.common.api.internal.r)) {
            return gVarBuildClient;
        }
        M6.z(gVarBuildClient);
        throw null;
    }

    public final U zac(Context context, Handler handler) {
        C1719h c1719hCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new U(context, handler, new C1720i(c1719hCreateClientSettingsBuilder.f26642a, c1719hCreateClientSettingsBuilder.f26643b, c1719hCreateClientSettingsBuilder.f26644c));
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.A a5) {
        return b(2, a5);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doRead(com.google.android.gms.common.api.internal.A a5) {
        return b(0, a5);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C1701o c1701o, int i5) {
        AbstractC1732v.j(c1701o, "Listener key cannot be null.");
        C1695i c1695i = this.zaa;
        c1695i.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c1695i.g(taskCompletionSource, i5, this);
        O o7 = new O(new a0(c1701o, taskCompletionSource), c1695i.f26539i.get(), this);
        zau zauVar = c1695i.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(13, o7));
        return taskCompletionSource.getTask();
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doWrite(com.google.android.gms.common.api.internal.A a5) {
        return b(1, a5);
    }

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        String apiFallbackAttributionTag;
        AbstractC1732v.j(context, "Null context is not permitted.");
        AbstractC1732v.j(iVar, "Api must not be null.");
        AbstractC1732v.j(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC1732v.j(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f26563b;
        C1688b c1688b = new C1688b(iVar, eVar, apiFallbackAttributionTag);
        this.zaf = c1688b;
        this.zai = new J(this);
        C1695i c1695iH = C1695i.h(applicationContext);
        this.zaa = c1695iH;
        this.zah = c1695iH.f26538h.getAndIncrement();
        this.zaj = kVar.f26562a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC1700n fragment = AbstractC1699m.getFragment(activity);
            E e7 = (E) fragment.j(E.class, "ConnectionlessLifecycleHelper");
            if (e7 == null) {
                Object obj = d7.e.f34126c;
                e7 = new E(fragment, c1695iH);
            }
            e7.f26449e.add(c1688b);
            c1695iH.b(e7);
        }
        zau zauVar = c1695iH.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    @ResultIgnorabilityUnspecified
    public <A extends b> Task<Void> doRegisterEventListener(C1707v c1707v) {
        AbstractC1732v.i(c1707v);
        AbstractC1732v.j(c1707v.f26557a.f26554a.f26552c, "Listener has already been released.");
        AbstractC1732v.j(c1707v.f26558b.f26440a, "Listener has already been released.");
        return this.zaa.i(this, c1707v.f26557a, c1707v.f26558b, Q.f26484a);
    }
}
