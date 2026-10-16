package com.waze.map;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import androidx.core.view.ViewKt;
import androidx.lifecycle.Lifecycle;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ig;
import com.waze.navigate.AddressItem;
import com.waze.user.UserData;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bq extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.view.popups.a.ag f28436a;

    /* renamed from: b, reason: collision with root package name */
    private volatile com.waze.view.popups.a.h f28437b;

    /* renamed from: c, reason: collision with root package name */
    private com.waze.view.popups.a.af f28438c;

    /* renamed from: d, reason: collision with root package name */
    private bp f28439d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f28440e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.as.a f28441f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.view.popups.b.m f28442g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28443h;

    public bq(Context context) {
        super(context, null);
        this.f28439d = new bo();
        this.f28440e = new AtomicInteger();
        this.f28441f = (com.waze.as.a) com.waze.web.r.h(com.waze.as.a.class);
        this.f28443h = false;
    }

    private final void B() {
        this.f28439d.c(u());
    }

    public static /* synthetic */ void d(bq bqVar, com.waze.view.popups.a.h hVar) {
        com.waze.shared_infra.i.h.a("onDetailsPopupHidden()");
        if (bqVar.f28437b == hVar) {
            com.waze.shared_infra.i.h.a("the current-selected DetailsPopUp instance got hidden, will reset selected-location");
            if (bqVar.f28443h) {
                NativeManager.Post(new com.google.android.gms.common.api.internal.bc(13));
            }
            bqVar.f28437b = null;
            bqVar.B();
        }
    }

    public static /* synthetic */ void e(bq bqVar) {
        com.waze.view.popups.a.ag agVar = bqVar.f28436a;
        if (agVar != null) {
            if (agVar.isShown()) {
                bqVar.f28436a.f(true);
            }
            bqVar.f28436a = null;
        }
        bqVar.B();
    }

    public static /* synthetic */ void f(bq bqVar) {
        if (bqVar.f28437b != null && bqVar.f28437b.isShown()) {
            bqVar.f28437b.h();
        }
        bqVar.f28437b = null;
        bqVar.B();
    }

    public static /* synthetic */ void g(bq bqVar, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, AddressItem addressItem, int i7, AddressItem addressItem2, int i8, boolean z2) {
        if (i2 != bqVar.f28440e.get()) {
            com.waze.shared_infra.i.h.j("ignoring request to show popup (popupId:" + i2 + "), a new popup was requested to show instead");
            return;
        }
        if (i3 != 1) {
            if (bqVar.f28437b == null) {
                bqVar.f28437b = new com.waze.view.popups.a.h(bqVar.getContext(), new com.google.firebase.messaging.l(bqVar), bqVar.f28442g, bqVar.f28439d);
                bqVar.addView(bqVar.f28437b, new FrameLayout.LayoutParams((int) bqVar.getResources().getDimension(R.dimen.map_popup_width), -2));
                bqVar.bringChildToFront(bqVar.f28437b);
            }
            bqVar.f28437b.j(i4, i5 - com.waze.ui.z.as.f(16), i6, str, str2, str3, z, i3, addressItem, i7, addressItem2, i8, z2);
            com.waze.view.popups.a.ag agVar = bqVar.f28436a;
            if (agVar != null && agVar.i()) {
                agVar.f(true);
                bqVar.f28436a = null;
            }
        } else {
            if (bqVar.f28437b != null && bqVar.f28437b.isShown()) {
                bqVar.f28437b.i();
                bqVar.f28437b = null;
            }
            com.waze.view.popups.a.ag agVar2 = bqVar.f28436a;
            if (agVar2 != null && agVar2.i()) {
                return;
            }
            com.waze.view.popups.a.ag agVar3 = new com.waze.view.popups.a.ag(bqVar.getContext());
            bqVar.f28436a = agVar3;
            agVar3.l(i4, i5, addressItem, bqVar);
        }
        bqVar.B();
    }

    public final void A(String str, boolean z) {
        if (this.f28437b == null || !this.f28437b.isShown()) {
            return;
        }
        this.f28437b.E(str, z);
    }

    public final void h() {
        com.waze.view.popups.a.ag agVar = this.f28436a;
        if (agVar != null && agVar.i() && !agVar.h()) {
            agVar.f(true);
            this.f28436a = null;
        }
        if (this.f28437b != null && this.f28437b.isShown()) {
            this.f28437b.h();
            this.f28437b = null;
        }
        i();
    }

    public final void i() {
        com.waze.view.popups.a.af afVar = this.f28438c;
        if (afVar != null) {
            afVar.e();
            this.f28438c = null;
        }
        B();
    }

    public final void j() {
        if (this.f28437b != null && this.f28437b.isShown() && this.f28437b.b() == 7) {
            h();
        }
    }

    public final void k(boolean z) {
        this.f28443h = z;
    }

    public final void l(Lifecycle lifecycle, com.waze.view.popups.b.m mVar) {
        this.f28442g = mVar;
        lifecycle.addObserver(new bn(this));
    }

    public final void m(bp bpVar) {
        this.f28439d = bpVar;
    }

    public final void n(bj bjVar, final int i2, final int i3, final int i4) {
        final String str = bjVar.f28401a;
        final String str2 = bjVar.f28402b;
        final String str3 = bjVar.f28403c;
        final boolean z = bjVar.f28404d;
        final int number = bjVar.a().a().getNumber();
        final AddressItem addressItem = bjVar.f28408h;
        final int i5 = bjVar.f28411k;
        final AddressItem addressItem2 = bjVar.f28409i;
        final int i6 = bjVar.f28410j;
        bi biVar = bjVar.f28412l;
        bi biVar2 = bi.f28398a;
        if (this.f28441f.a().d() == com.waze.ui.r.a.e.b.a.f43359a) {
            Activity activityS = com.waze.shared_infra.i.h.s(getContext());
            if (activityS != null) {
                com.waze.design_components.d.a(activityS, com.waze.shared_infra.o.b.a().c(R.string.LOCK_SCREEN_NAVIGATION_DETAILS_POPUP_BLOCKED_MESSAGE, new Object[0]), null);
            } else {
                com.waze.shared_infra.i.h.a("DetailsPopUp: hostActivity is null, can't display WazeToast to user");
            }
            com.waze.shared_infra.i.h.a("map details popup ignored, phone is locked!");
            return;
        }
        final boolean z2 = biVar == biVar2;
        final int iIncrementAndGet = this.f28440e.incrementAndGet();
        com.waze.shared_infra.i.h.a("request to show popup (popupId:" + iIncrementAndGet + ", title: " + str + ", msg: " + str2 + ") at position (x:" + i2 + ", y:" + i3 + ")");
        ViewKt.doOnLayout(this, new com.waze.beacons.a.b(new Runnable() { // from class: com.waze.map.bm
            @Override // java.lang.Runnable
            public final void run() {
                bq.g(this.f28423a, iIncrementAndGet, number, i2, i3, i4, str, str2, str3, z, addressItem, i5, addressItem2, i6, z2);
            }
        }, 17));
    }

    public final void o(Activity activity, UserData userData, int i2, int i3) {
        if (this.f28438c == null) {
            if (this.f28443h) {
                this.f28438c = new com.waze.view.popups.a.af(activity, null);
            } else {
                com.waze.view.popups.a.af afVar = new com.waze.view.popups.a.af(activity, new com.google.firebase.messaging.l(this));
                this.f28438c = afVar;
                addView(afVar);
            }
        }
        this.f28438c.d(userData, i2, i3);
        B();
    }

    public final void p(int i2, int i3) {
        com.waze.view.popups.a.ag agVar = this.f28436a;
        if (agVar != null && agVar.i()) {
            agVar.g(i2, i3);
            return;
        }
        int iF = i3 - com.waze.ui.z.as.f(16);
        if (this.f28437b == null || !this.f28437b.isShown()) {
            return;
        }
        this.f28437b.k(i2, iF);
    }

    public final void q(int i2, String str, String str2) {
        if (i2 == 1 || this.f28437b == null || !this.f28437b.isShown()) {
            return;
        }
        this.f28437b.l(i2, str, str2);
    }

    public final void r(Bitmap bitmap) {
        if (v(7)) {
            this.f28437b.m(bitmap);
        }
    }

    public final void s(int i2, int i3) {
        com.waze.view.popups.a.af afVar = this.f28438c;
        if (afVar == null) {
            return;
        }
        afVar.g(i2, i3);
    }

    public final boolean u() {
        if (this.f28437b != null && this.f28437b.isShown()) {
            return true;
        }
        com.waze.view.popups.a.ag agVar = this.f28436a;
        return (agVar != null && agVar.i()) || this.f28438c != null;
    }

    public final boolean v(int i2) {
        com.waze.view.popups.a.h hVar = this.f28437b;
        return hVar != null && hVar.isShown() && hVar.b() == i2;
    }

    public final void z() {
        com.waze.view.popups.a.ag agVar = this.f28436a;
        if (agVar != null && agVar.i()) {
            post(new ig(this, 10));
            return;
        }
        if (this.f28437b != null && this.f28437b.isShown()) {
            post(new ig(this, 11));
        } else if (this.f28438c != null) {
            post(new ig(this, 12));
        }
    }
}
