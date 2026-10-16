package com.waze;

import com.waze.share.ViewShareDriveActivity;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f24295a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f24296b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ NativeManager f24297c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f24298d;

    gy(NativeManager nativeManager, String str, boolean z, int i2, byte[] bArr) {
        this.f24298d = i2;
        this.f24295a = str;
        this.f24296b = z;
        Objects.requireNonNull(nativeManager);
        this.f24297c = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24298d;
        boolean z = false;
        if (i2 == 0) {
            NativeManager nativeManager = this.f24297c;
            nativeManager.closeProgressPopup();
            com.waze.sharedui.a.e eVarE = lm.d().e();
            if (eVarE == null) {
                return;
            }
            MainActivity mainActivityC = lm.d().c();
            if (!eVarE.k() && mainActivityC != null) {
                nativeManager.openProgressPopup(mainActivityC, this.f24295a, 0, this.f24296b);
                return;
            } else {
                if (eVarE.bs() && eVarE.aK()) {
                    nativeManager.openProgressPopup(eVarE, this.f24295a, 0, this.f24296b);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            NativeManager nativeManager2 = this.f24297c;
            nativeManager2.closeProgressPopup();
            MainActivity mainActivityC2 = lm.d().c();
            if (mainActivityC2 == null || !mainActivityC2.bs()) {
                return;
            }
            nativeManager2.openProgressPopup(mainActivityC2, this.f24295a, 0, this.f24296b);
            return;
        }
        if (lm.d().c() != null) {
            com.waze.shared_infra.i.h.h("Closing alert tickers with meeting id: ".concat(String.valueOf(this.f24295a)));
        } else {
            com.waze.shared_infra.i.h.c("Cannot close alert ticker with meeting id. Main activity is not available");
        }
        if (lm.d().e() instanceof ViewShareDriveActivity) {
            ViewShareDriveActivity viewShareDriveActivity = (ViewShareDriveActivity) lm.d().e();
            if (viewShareDriveActivity.r(this.f24295a)) {
                viewShareDriveActivity.finish();
                z = true;
            }
        }
        NativeManager nativeManager3 = this.f24297c;
        if (nativeManager3.mIsShowingCloseSharedDriveDialog) {
            return;
        }
        if (z || this.f24296b) {
            nativeManager3.mIsShowingCloseSharedDriveDialog = true;
            if (nativeManager3.isNavigating()) {
                nativeManager3.showTooltip(4, 0, 0L, 0);
            } else {
                com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("ShareDrivePopup", new gu(this, com.waze.shared_infra.o.b.a())));
            }
        }
    }

    gy(NativeManager nativeManager, String str, boolean z, int i2) {
        this.f24298d = i2;
        this.f24295a = str;
        this.f24296b = z;
        Objects.requireNonNull(nativeManager);
        this.f24297c = nativeManager;
    }

    gy(NativeManager nativeManager, String str, boolean z, int i2, char[] cArr) {
        this.f24298d = i2;
        this.f24295a = str;
        this.f24296b = z;
        Objects.requireNonNull(nativeManager);
        this.f24297c = nativeManager;
    }
}
