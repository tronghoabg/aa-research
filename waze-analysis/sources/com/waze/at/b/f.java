package com.waze.at.b;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.R;
import com.waze.app_nav.w;
import com.waze.lc;
import com.waze.shared_infra.r.p;
import com.waze.ui.n.g;
import com.waze.ui.n.h;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final w f15665a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.r.a f15666b;

    /* renamed from: c, reason: collision with root package name */
    private final lc f15667c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15668d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f15669e;

    public f(w wVar, com.waze.shared_infra.r.a aVar, lc lcVar) {
        x.f(wVar, "mainFlowController");
        x.f(aVar, "appSessionController");
        x.f(lcVar, "shutdownController");
        this.f15665a = wVar;
        this.f15666b = aVar;
        this.f15667c = lcVar;
        this.f15669e = ck.b(h.f43083a);
    }

    public final ch d(boolean z, p pVar) {
        x.f(pVar, "appType");
        if (this.f15668d) {
            return this.f15669e;
        }
        this.f15668d = true;
        bn bnVar = this.f15669e;
        p pVar2 = p.f37990h;
        bnVar.c(new g(!z ? R.string.MOBILE_LOGIN_ERROR_START_NEW_DRIVE_TITLE : pVar == pVar2 ? R.string.MOBILE_LOGIN_ERROR_TITLE_USING_CAR : R.string.MOBILE_LOGIN_ERROR_TITLE_USING_MOBILE, z ? R.string.MOBILE_LOGIN_ERROR_MESSAGE : pVar == pVar2 ? R.string.MOBILE_LOGIN_ERROR_START_NEW_DRIVE_MESSAGE_LOGOUT_CAR : R.string.MOBILE_LOGIN_ERROR_START_NEW_DRIVE_MESSAGE_LOGOUT_PHONE, !z ? R.string.MOBILE_LOGIN_ERROR_CONFIRM_BUTTON : R.string.MOBILE_LOGIN_ERROR_USE_HERE_CONFIRM_BUTTON, z ? R.drawable.tier_three_preferred_device_96px : R.drawable.tier_three_switch_device_96px));
        return bnVar;
    }

    public final void e() {
        this.f15669e.c(h.f43083a);
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new e(this, null), 3);
    }

    public final void f() {
        this.f15667c.shutDown();
    }
}
