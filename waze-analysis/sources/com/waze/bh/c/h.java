package com.waze.bh.c;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.ConfigManager;
import com.waze.app_nav.w;
import com.waze.config.ConfigValues;
import com.waze.ui.v.i;
import com.waze.ui.v.k;
import com.waze.ui.v.l;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bh.b.c f16786a;

    /* renamed from: b, reason: collision with root package name */
    private final w f16787b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bh.f f16788c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f16789d;

    /* renamed from: e, reason: collision with root package name */
    private String f16790e;

    public h(com.waze.bh.b.c cVar, w wVar, ConfigManager configManager, com.waze.bh.f fVar) {
        x.f(cVar, "client");
        x.f(wVar, "mainFlowController");
        x.f(configManager, "configManager");
        x.f(fVar, "statsSender");
        this.f16786a = cVar;
        this.f16787b = wVar;
        this.f16788c = fVar;
        fVar.c();
        String configValueString = configManager.getConfigValueString(ConfigValues.CONFIG_VALUE_QR_LOGIN_BOTTOM_TEXT_LINK);
        x.e(configValueString, "getConfigValueString(...)");
        this.f16789d = ck.b(new com.waze.ui.v.h(configValueString));
    }

    private final void k() {
        String str = this.f16790e;
        if (str != null) {
            aj.z(ViewModelKt.getViewModelScope(this), null, null, new g(this, str, null, 1, null), 3);
        }
    }

    public final String c() {
        return this.f16790e;
    }

    public final ch e() {
        return this.f16789d;
    }

    public final void f() {
        this.f16788c.b(com.waze.bh.e.f16793a);
        this.f16789d.c(i.f43508a);
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new f(this, null), 3);
    }

    public final void g() {
        k();
        this.f16787b.c();
        if (((l) e().d()) instanceof com.waze.ui.v.h) {
            this.f16788c.b(com.waze.bh.e.f16795c);
        }
    }

    public final void h() {
        this.f16788c.b(com.waze.bh.e.f16796d);
    }

    public final void i() {
        k();
        this.f16788c.b(com.waze.bh.e.f16794b);
        this.f16789d.c(k.f43510a);
    }

    public final void j(String str) {
        this.f16790e = str;
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new g(this, str, null, 0), 3);
    }
}
