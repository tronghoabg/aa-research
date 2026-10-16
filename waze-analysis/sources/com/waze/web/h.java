package com.waze.web;

import android.support.v4.app.ar;
import com.waze.ConfigManager;
import com.waze.ab.ab;
import com.waze.share.aa;
import com.waze.sharedui.web.ak;
import com.waze.sharedui.web.s;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f45492a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45493b;

    h(SimpleWebActivity simpleWebActivity, int i2) {
        this.f45493b = i2;
        Objects.requireNonNull(simpleWebActivity);
        this.f45492a = simpleWebActivity;
    }

    @Override // com.waze.sharedui.web.ak
    public final void a() {
    }

    @Override // com.waze.sharedui.web.ak
    public final void b() {
    }

    @Override // com.waze.sharedui.web.ak
    public final void c() {
    }

    @Override // com.waze.sharedui.web.ak
    public final void d(boolean z) {
    }

    @Override // com.waze.sharedui.web.ak
    public final void e(s sVar) {
        if (this.f45493b != 0) {
            return;
        }
        ((k) this.f45492a).n(sVar);
    }

    @Override // com.waze.sharedui.web.ak
    public final void f() {
        if (this.f45493b != 0) {
            ConfigManager.getInstance().sendLogsAutoConfirm();
        } else {
            ConfigManager.getInstance().sendLogsAutoConfirm();
        }
    }

    @Override // com.waze.sharedui.web.ak
    public final void g() {
        if (this.f45493b == 0) {
            i.m();
            return;
        }
        ((SimpleWebActivity) this.f45492a).finish();
        com.waze.alerters.a.k.e().d();
        ab.c();
    }

    @Override // com.waze.sharedui.web.ak
    public final void h(String str) {
        if (this.f45493b != 0) {
            ((SimpleWebActivity) this.f45492a).startActivity(aa.a(str));
        } else {
            ((ar) this.f45492a).startActivity(aa.a(str));
        }
    }

    @Override // com.waze.sharedui.web.ak
    public final void i(String str) {
        if (this.f45493b != 0) {
            if (str != null) {
                SimpleWebActivity simpleWebActivity = (SimpleWebActivity) this.f45492a;
                simpleWebActivity.x(str, simpleWebActivity.f45478l);
                return;
            }
            return;
        }
        if (str != null) {
            i iVar = (i) this.f45492a;
            iVar.h(str, iVar.f45497d);
        }
    }

    h(i iVar, int i2) {
        this.f45493b = i2;
        Objects.requireNonNull(iVar);
        this.f45492a = iVar;
    }
}
