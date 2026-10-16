package com.waze;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.work.WorkRequest;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.user.FriendUserData;
import com.waze.view.pages.LinePageIndicator;
import j$.util.DesugarArrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kj extends android.support.v4.app.ar {

    /* renamed from: b, reason: collision with root package name */
    private com.waze.view.popups.k f25041b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25043d;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f25048i;

    /* renamed from: j, reason: collision with root package name */
    private ViewPager f25049j;

    /* renamed from: k, reason: collision with root package name */
    private long f25050k;

    /* renamed from: l, reason: collision with root package name */
    private com.waze.sdk.ae f25051l;
    private com.waze.main_screen.ab.a.e n;

    /* renamed from: a, reason: collision with root package name */
    private int f25040a = 0;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.view.popups.m[] f25042c = new com.waze.view.popups.m[5];

    /* renamed from: e, reason: collision with root package name */
    private int f25044e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25045f = true;

    /* renamed from: g, reason: collision with root package name */
    private int f25046g = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile int f25047h = -1;
    private final Set m = new HashSet();

    private final int J(Class cls) {
        for (int i2 = 0; i2 < this.f25040a; i2++) {
            if (this.f25042c[i2].getClass().isAssignableFrom(cls)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i2) {
        this.f25047h = i2;
        this.f25050k = System.currentTimeMillis();
    }

    public static /* synthetic */ void i(kj kjVar) throws Resources.NotFoundException {
        int i2;
        com.waze.view.popups.m[] mVarArr = kjVar.f25042c;
        if (mVarArr == null || mVarArr[0] == null) {
            return;
        }
        Iterator it = kjVar.m.iterator();
        while (it.hasNext()) {
            ((ki) it.next()).b();
        }
        kjVar.f25043d = true;
        kjVar.f25047h = 0;
        kjVar.f25045f = true;
        View view = kjVar.getView();
        if (view == null) {
            com.waze.shared_infra.i.h.j("openPopUps called while fragment View is not available");
            return;
        }
        int iJ = kjVar.J(com.waze.sdk.ae.class);
        if (iJ >= 0) {
            com.waze.view.popups.m mVar = mVarArr[iJ];
            while (true) {
                i2 = kjVar.f25040a - 1;
                if (iJ >= i2) {
                    break;
                }
                int i3 = iJ + 1;
                mVarArr[iJ] = mVarArr[i3];
                iJ = i3;
            }
            mVarArr[i2] = mVar;
        }
        com.waze.view.popups.k kVar = new com.waze.view.popups.k(kjVar.f25040a, mVarArr);
        kjVar.f25041b = kVar;
        kjVar.f25049j.setAdapter(kVar);
        kjVar.f25049j.setCurrentItem(0);
        NativeManager.getInstance().PopupShown(0, 0, 0, 0);
        kjVar.K(0);
        if (mVarArr[0] == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.swipePopupsContainer);
        LinePageIndicator linePageIndicator = (LinePageIndicator) view.findViewById(R.id.swipePopupsIndicator);
        if (kjVar.f25040a > 1) {
            viewFindViewById.setVisibility(0);
            linePageIndicator.a(kjVar.f25049j);
            linePageIndicator.setVisibility(0);
            if (mVarArr[0].aj() > 0) {
                kjVar.z();
            }
            linePageIndicator.getViewTreeObserver().addOnGlobalLayoutListener(new kg(kjVar, linePageIndicator));
        } else {
            viewFindViewById.setVisibility(8);
            if (mVarArr[0].aj() > 0) {
                kjVar.z();
            }
        }
        int i4 = 0;
        while (true) {
            int i5 = kjVar.f25040a;
            if (i4 >= i5) {
                kjVar.f25049j.setOnPageChangeListener(new kh(kjVar, linePageIndicator));
                return;
            } else {
                mVarArr[0].bG(i5 > 1);
                i4++;
            }
        }
    }

    public final void A(int i2) {
        com.waze.sdk.ae aeVar = this.f25051l;
        if (aeVar != null) {
            aeVar.O(i2);
        }
    }

    public final void E() {
        com.waze.view.popups.m mVar;
        if (this.f25040a <= 0 || (mVar = this.f25042c[this.f25044e]) == null) {
            return;
        }
        mVar.f();
    }

    public final void F() {
        this.f25047h = -1;
    }

    public final void G(com.waze.main_screen.ab.d dVar, com.waze.main_screen.ab.a.e eVar) {
        Context context = getContext();
        if (context == null) {
            com.waze.shared_infra.i.h.k("CrisisResponse", "Null Context");
            return;
        }
        for (int i2 = 0; i2 < this.f25040a; i2++) {
            if (this.f25042c[i2] instanceof com.waze.v.e) {
                com.waze.shared_infra.i.h.k("CrisisResponse", "Already showing, ignoring duplicate call");
                return;
            }
        }
        com.waze.v.i iVar = (com.waze.v.i) com.waze.web.r.i(com.waze.v.i.class);
        if (iVar == null) {
            com.waze.shared_infra.i.h.k("CrisisResponse", "Cannot get state holder from koin, could be closed");
            return;
        }
        com.waze.v.e eVar2 = new com.waze.v.e(context, eVar, dVar.b(), iVar);
        com.waze.view.popups.m[] mVarArr = this.f25042c;
        int i3 = this.f25040a;
        this.f25040a = i3 + 1;
        mVarArr[i3] = eVar2;
        if (dVar.c() != null) {
            dVar.c().intValue();
        }
    }

    public final void I(com.waze.main_screen.ab.a.e eVar) {
        this.n = eVar;
    }

    public final int e() {
        return this.f25047h;
    }

    public final int f() {
        if (!isAdded()) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f25050k;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            jCurrentTimeMillis = 0;
        }
        return (int) jCurrentTimeMillis;
    }

    @Override // android.support.v4.app.ar
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return super.getContext();
    }

    public final com.waze.sdk.ae h() {
        return this.f25051l;
    }

    public final void m() {
        View viewFindViewById;
        this.f25043d = false;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((ki) it.next()).a();
        }
        Runnable runnable = this.f25048i;
        if (runnable != null) {
            this.f25049j.removeCallbacks(runnable);
            this.f25048i = null;
        }
        com.waze.view.popups.k kVar = this.f25041b;
        if (kVar != null) {
            kVar.a();
        }
        this.f25044e = 0;
        this.f25047h = -1;
        if (this.f25040a > 0) {
            for (int i2 = 0; i2 < this.f25040a; i2++) {
                com.waze.view.popups.m[] mVarArr = this.f25042c;
                com.waze.view.popups.m mVar = mVarArr[i2];
                if (mVar instanceof com.waze.sdk.ae) {
                    ((com.waze.sdk.ae) mVar).ag();
                } else if (mVar != null) {
                    mVar.e();
                }
                mVarArr[i2] = null;
            }
            this.f25040a = 0;
            View view = getView();
            if (view == null || (viewFindViewById = view.findViewById(R.id.swipePopupsContainer)) == null) {
                return;
            }
            viewFindViewById.setVisibility(8);
        }
    }

    public final void n(com.waze.main_screen.ab.d dVar) {
        VenueData venueDataA = dVar.a();
        if (venueDataA == null) {
            com.waze.shared_infra.i.h.k("LoadCrisisResponsePopup", "no proto");
            return;
        }
        com.waze.view.popups.m mVar = (com.waze.view.popups.m) DesugarArrays.stream(this.f25042c).filter(new kf()).findFirst().orElse(null);
        com.waze.v.i iVarA = mVar instanceof com.waze.v.e ? ((com.waze.v.e) mVar).a() : null;
        if (iVarA != null) {
            iVarA.e(venueDataA);
        } else {
            com.waze.shared_infra.i.h.k("LoadCrisisResponsePopup", "No State Holder - call externalPoiClosedNTV");
            NativeManager.Post(new com.google.android.gms.common.api.internal.bc(5));
        }
    }

    public final void o(int i2, int i3, int i4, int i5) {
        if (J(com.waze.sdk.ae.class) == i3 || i3 < 0 || i3 >= this.f25040a) {
            return;
        }
        NativeManager.getInstance().PopupShown(i2, i3, i4, i5);
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f25041b = new com.waze.view.popups.k(this.f25040a, this.f25042c);
        return layoutInflater.inflate(R.layout.fragment_swipe_popups, viewGroup, false);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.swipePopupsPager);
        this.f25049j = viewPager;
        viewPager.setAdapter(this.f25041b);
    }

    public final void p() {
        com.waze.view.popups.m mVar;
        if (this.f25040a <= 0 || (mVar = this.f25042c[this.f25044e]) == null) {
            return;
        }
        mVar.I();
    }

    public final void q() {
        for (int i2 = 0; i2 < this.f25040a; i2++) {
            com.waze.view.popups.m[] mVarArr = this.f25042c;
            mVarArr[i2].K();
            com.waze.view.popups.m mVar = mVarArr[i2];
            boolean z = true;
            if (this.f25040a <= 1) {
                z = false;
            }
            mVar.bG(z);
        }
    }

    public final void r(RtAlertItem rtAlertItem, int i2) {
        if (this.f25040a > 4) {
            return;
        }
        com.waze.view.popups.d dVar = new com.waze.view.popups.d(getContext(), this.n);
        dVar.a(rtAlertItem);
        dVar.ak(i2);
        com.waze.view.popups.m[] mVarArr = this.f25042c;
        int i3 = this.f25040a;
        mVarArr[i3] = dVar;
        this.f25040a = i3 + 1;
    }

    public final void s(RtAlertItem rtAlertItem, boolean z, String str, int i2) {
        if (this.f25040a > 4) {
            return;
        }
        com.waze.view.popups.l lVar = new com.waze.view.popups.l(getContext(), this.n);
        lVar.v(rtAlertItem, z, str);
        lVar.ak(i2);
        com.waze.view.popups.m[] mVarArr = this.f25042c;
        int i3 = this.f25040a;
        mVarArr[i3] = lVar;
        this.f25040a = i3 + 1;
    }

    public final void t(FriendUserData friendUserData, int i2, String str, String str2) {
        if (this.f25040a > 4) {
            return;
        }
        com.waze.view.popups.o oVar = new com.waze.view.popups.o(getContext(), this.n);
        oVar.w(friendUserData, i2, str, str2);
        oVar.ak(0);
        com.waze.view.popups.m[] mVarArr = this.f25042c;
        int i3 = this.f25040a;
        mVarArr[i3] = oVar;
        this.f25040a = i3 + 1;
    }

    public final void u(int i2) {
        if (this.f25047h >= 0) {
            o(1, this.f25047h, 0, i2);
            F();
        }
    }

    public final void v(com.waze.sdk.ae aeVar) {
        this.f25051l = aeVar;
    }

    public final void w(int i2) {
        if (i2 > 0) {
            this.f25046g = i2;
        }
    }

    public final void x(boolean z) {
        ((WrapContentHeightViewPager) getView().findViewById(R.id.swipePopupsPager)).a(z);
    }

    public final void y(com.waze.main_screen.ab.b bVar) throws Resources.NotFoundException {
        if (getContext() == null) {
            com.waze.shared_infra.i.h.k("showAudioPanel", "Null Context");
            return;
        }
        com.waze.sdk.ae aeVar = this.f25051l;
        if (aeVar == null) {
            com.waze.shared_infra.i.h.k("showAudioPanel", "Null audio control panel");
            return;
        }
        if (aeVar.isShown()) {
            aeVar.N(bVar.a());
            return;
        }
        int i2 = this.f25040a;
        if (i2 > 4) {
            com.waze.shared_infra.i.h.j("showAudioPanel: failed to add popup");
            return;
        }
        this.f25042c[i2] = aeVar;
        this.f25040a = i2 + 1;
        aeVar.N(bVar.a());
    }

    public final void z() {
        if (this.f25043d) {
            hn hnVar = new hn(this, 8);
            this.f25048i = hnVar;
            this.f25049j.postDelayed(hnVar, this.f25042c[this.f25044e].aj() * 1000);
        }
    }
}
