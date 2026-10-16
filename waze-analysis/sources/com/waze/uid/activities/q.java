package com.waze.uid.activities;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.waze.sharedui.profile.UserProfile;
import com.waze.uid.UidModel;
import com.waze.uid.b.ab;
import com.waze.uid.b.ad;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final MutableLiveData f44107a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableLiveData f44108b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f44109c;

    /* JADX WARN: Illegal instructions before constructor call */
    public q() {
        com.waze.app_nav.hub.b.c cVarA = com.waze.app_nav.hub.b.c.f15258a.a();
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        x.f(cVarA, "popupManager");
        x.f(aVarA, "stringProvider");
        super(aVarA);
        this.f44107a = new MutableLiveData();
        this.f44108b = new MutableLiveData(new bb(bm.f44280a));
        bn bnVarB = ck.b(null);
        this.f44109c = bnVarB;
        u(ab.f44136a.a());
        ai.m(ai.K(ai.F(new p(cVarA.a()), bnVarB, new l(this, null)), new m(this, null)), ViewModelKt.getViewModelScope(this));
    }

    private final com.waze.uid.b.m x() {
        com.waze.uid.b.m mVarP = p();
        x.d(mVarP, "null cannot be cast to non-null type com.waze.uid.controller.EventsController<com.waze.uid.UidModel>");
        return mVarP;
    }

    public final int a() {
        return ((UidModel) x().b()).getEmailParameters().getPinCodeLength();
    }

    public final MutableLiveData b() {
        return this.f44107a;
    }

    public final MutableLiveData c() {
        return this.f44108b;
    }

    public final UserProfile d() {
        return ((UidModel) x().b()).getEmailParameters().getExistingProfile();
    }

    public final String f() {
        return ((UidModel) x().b()).getEmailParameters().getEmailAddress();
    }

    public final String g() {
        return ((UidModel) x().b()).getLoginParameters().getUsername();
    }

    @Override // com.waze.uid.b.ad
    public final void i(com.waze.uid.b.i iVar) {
        x.f(iVar, "state");
        bb bbVarF = iVar.f();
        if (bbVarF instanceof bb) {
            this.f44107a.setValue(bbVarF.b());
            this.f44108b.setValue(bbVarF);
        } else {
            String strR = r();
            Objects.toString(iVar);
            com.waze.shared_infra.i.h.k(strR, "unexpected ui state ".concat(String.valueOf(iVar)));
        }
        this.f44109c.e(iVar.c());
        n().postValue(iVar.d());
    }

    public final boolean j() {
        return ((UidModel) x().b()).getInstallParameters().isExistingUser();
    }

    public final boolean k() {
        return ((UidModel) x().b()).getInstallParameters().showTermsAndService;
    }
}
