package com.waze.car_lib.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.lc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20974a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.r.a f20975b;

    /* renamed from: c, reason: collision with root package name */
    private final lc f20976c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f20977d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableLiveData f20978e;

    public at(com.waze.shared_infra.o.a aVar, com.waze.shared_infra.r.a aVar2, lc lcVar, kotlinx.coroutines.af afVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "appSessionController");
        h.g.b.x.f(lcVar, "shutdownController");
        h.g.b.x.f(afVar, "scope");
        this.f20974a = aVar;
        this.f20975b = aVar2;
        this.f20976c = lcVar;
        this.f20977d = afVar;
        this.f20978e = new MutableLiveData();
    }

    public static final /* synthetic */ ap c(at atVar) {
        com.waze.shared_infra.o.a aVar = atVar.f20974a;
        return new ap(new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_LOGIN_ERROR_LOGIN_FAILED_TITLE, new Object[0]), aVar.c(R.string.AAOS_LOGIN_ERROR_LOGIN_FAILED_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_LOGIN_ERROR_CANCEL_BUTTON, new Object[0]), false), new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_LOGIN_ERROR_LOGIN_FAILED_CONFIRM_BUTTON, new Object[0]), true)));
    }

    private final String g(boolean z) {
        return this.f20974a.c(true != z ? R.string.AAOS_LOGIN_ERROR_START_NEW_DRIVE_TITLE : R.string.AAOS_LOGIN_ERROR_TITLE, new Object[0]);
    }

    public final LiveData a(boolean z) {
        String strG = g(z);
        int i2 = z ? R.string.AAOS_LOGIN_ERROR_MESSAGE : R.string.AAOS_LOGIN_ERROR_START_NEW_DRIVE_MESSAGE;
        MutableLiveData mutableLiveData = this.f20978e;
        com.waze.shared_infra.o.a aVar = this.f20974a;
        mutableLiveData.setValue(new aq(new com.waze.car_lib.p.dg(strG, aVar.c(i2, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_LOGIN_ERROR_CANCEL_BUTTON, new Object[0]), false), new com.waze.car_lib.p.dc(aVar.c(true != z ? R.string.AAOS_LOGIN_ERROR_START_NEW_DRIVE_CONFIRM_BUTTON : R.string.AAOS_LOGIN_ERROR_CONFIRM_BUTTON, new Object[0]), true))));
        return mutableLiveData;
    }

    public final void e(com.waze.car_lib.f.dn dnVar, boolean z) {
        h.g.b.x.f(dnVar, "loginErrorController");
        this.f20978e.setValue(new ar(new com.waze.car_lib.p.df(g(z), this.f20974a.c(R.string.PLEASE_WAIT___, new Object[0]))));
        kotlinx.coroutines.aj.z(this.f20977d, null, null, new as(this, dnVar, (h.c.e) null, 0), 3);
    }

    public final void f() {
        this.f20976c.shutDown();
    }
}
