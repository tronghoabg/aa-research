package com.waze.web;

import android.support.v4.app.ar;
import com.waze.sharedui.web.ad;
import com.waze.z.a.d.ai;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements ad {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f45488a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45489b;

    f(SimpleWebActivity simpleWebActivity, int i2) {
        this.f45489b = i2;
        Objects.requireNonNull(simpleWebActivity);
        this.f45488a = simpleWebActivity;
    }

    @Override // com.waze.sharedui.web.ad
    public final void a() {
        if (this.f45489b != 0) {
            ((SimpleWebActivity) this.f45488a).finish();
        } else {
            i.s();
        }
    }

    @Override // com.waze.sharedui.web.ad
    public final void b(boolean z) {
        if (this.f45489b == 0) {
            if (!z) {
                Object obj = this.f45488a;
                ai.s((com.waze.sharedui.a.e) ((ar) obj).getActivity(), ((i) obj).f45500g);
            }
            i iVar = (i) this.f45488a;
            String strG = iVar.f45494a.g();
            if (iVar.f45498e == null && strG != null) {
                iVar.h(strG, iVar.f45497d);
            }
            i.f(iVar);
            return;
        }
        if (!z) {
            Object obj2 = this.f45488a;
            ai.s((com.waze.sharedui.a.e) obj2, ((SimpleWebActivity) obj2).m);
        }
        SimpleWebActivity simpleWebActivity = (SimpleWebActivity) this.f45488a;
        String strG2 = simpleWebActivity.f45476h.g();
        if (simpleWebActivity.f45475f == null && strG2 != null) {
            simpleWebActivity.x(strG2, simpleWebActivity.f45478l);
        }
        SimpleWebActivity.r(simpleWebActivity);
    }

    @Override // com.waze.sharedui.web.ad
    public final void c() {
        int i2 = this.f45489b;
        Object obj = this.f45488a;
        if (i2 != 0) {
            SimpleWebActivity.s((SimpleWebActivity) obj);
        } else {
            i.g((i) obj);
        }
    }

    f(i iVar, int i2) {
        this.f45489b = i2;
        Objects.requireNonNull(iVar);
        this.f45488a = iVar;
    }
}
