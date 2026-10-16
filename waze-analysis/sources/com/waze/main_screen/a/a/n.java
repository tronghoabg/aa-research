package com.waze.main_screen.a.a;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.main_screen.p.a.b.b.ac;
import com.waze.main_screen.p.a.b.b.af;
import com.waze.main_screen.p.b.a.b.t;
import com.waze.map.b.o;
import com.waze.navigate.en;
import com.waze.reports_v2.c.an;
import com.waze.sharedrive.e.bo;
import com.waze.sharedrive.e.bp;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25554a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.b.n f25555b;

    /* renamed from: c, reason: collision with root package name */
    private final en f25556c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.ab.a.m f25557d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.w.a.a f25558e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.r.a.c f25559f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.main_screen.l.b.j f25560g;

    /* renamed from: h, reason: collision with root package name */
    private final af f25561h;

    /* renamed from: i, reason: collision with root package name */
    private final bp f25562i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.sound.e.m f25563j;

    /* renamed from: k, reason: collision with root package name */
    private final bn f25564k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f25565l;
    private final t m;

    public n(com.waze.shared_infra.i.e eVar, com.waze.map.b.n nVar, en enVar, com.waze.main_screen.ab.a.m mVar, com.waze.main_screen.w.a.a aVar, com.waze.main_screen.r.a.c cVar, com.waze.sound.e.k kVar, ac acVar, com.waze.main_screen.p.b.a.b.c cVar2, com.waze.main_screen.l.b.e eVar2, bo boVar, an anVar) {
        x.f(eVar, "logger");
        x.f(nVar, "mainMapController");
        x.f(enVar, "navigationStateProvider");
        x.f(mVar, "popupsStateHolder");
        x.f(aVar, "quickSettingsStateHolder");
        x.f(cVar, "notificationMessageStateHolder");
        x.f(kVar, "voiceGuidanceStateHolderFactory");
        x.f(acVar, "etaDrawerStateHolderFactory");
        x.f(cVar2, "navigationBarStateHolderFactory");
        x.f(eVar2, "navInstructionListStateHolderFactory");
        x.f(boVar, "shareDriveMapIndicationStateHolderFactory");
        x.f(anVar, "conversationalReportingActivationStateHolder");
        this.f25554a = eVar;
        this.f25555b = nVar;
        this.f25556c = enVar;
        this.f25557d = mVar;
        this.f25558e = aVar;
        this.f25559f = cVar;
        t tVarA = cVar2.a(new h());
        this.m = tVarA;
        this.f25560g = eVar2.a(new k(this), new l(this));
        af afVarA = acVar.a();
        this.f25561h = afVarA;
        bp bpVarA = boVar.a();
        this.f25562i = bpVarA;
        com.waze.sound.e.m mVarA = kVar.a();
        this.f25563j = mVarA;
        bn bnVarB = ck.b(new g(null));
        this.f25564k = bnVarB;
        kotlinx.coroutines.b.k kVarL = ai.L(bnVarB, new m(this, null));
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(this);
        int i2 = bz.f51630a;
        this.f25565l = ai.V(kVarL, viewModelScope, by.c(), bnVarB.d());
        eVar.a("init " + System.identityHashCode(this));
        addCloseable((AutoCloseable) tVarA);
        if (mVarA != null) {
            addCloseable((AutoCloseable) mVarA);
        }
        addCloseable((AutoCloseable) afVarA);
        if (bpVarA != null) {
            addCloseable((AutoCloseable) bpVarA);
        }
        addCloseable((AutoCloseable) cVar);
        addCloseable((AutoCloseable) anVar);
    }

    public static final /* synthetic */ void j(n nVar, NavigationItem navigationItem) {
        com.waze.map.b.n nVar2 = nVar.f25555b;
        nVar2.r(new o(new com.waze.shared_infra.h.c(navigationItem.getLat(), navigationItem.getLon()), Float.valueOf(navigationItem.getRotation()), 0.0f, false, null, 28), true);
        nVar2.n(navigationItem.getNavSegmentIdx());
    }

    public final com.waze.main_screen.l.b.j a() {
        return this.f25560g;
    }

    public final af b() {
        return this.f25561h;
    }

    public final com.waze.main_screen.r.a.c c() {
        return this.f25559f;
    }

    public final com.waze.main_screen.w.a.a d() {
        return this.f25558e;
    }

    public final com.waze.main_screen.ab.a.m e() {
        return this.f25557d;
    }

    public final com.waze.sound.e.m g() {
        return this.f25563j;
    }

    public final ch i() {
        return this.f25565l;
    }

    public final t l() {
        return this.m;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f25554a.a("cleared " + System.identityHashCode(this));
    }
}
