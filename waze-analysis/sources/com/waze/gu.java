package com.waze;

import android.content.Context;
import android.content.DialogInterface;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gu implements com.waze.app_nav.hub.b.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.o.a f24269a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gy f24270b;

    gu(gy gyVar, com.waze.shared_infra.o.a aVar) {
        this.f24269a = aVar;
        Objects.requireNonNull(gyVar);
        this.f24270b = gyVar;
    }

    @Override // com.waze.app_nav.hub.b.j
    public final com.waze.app_nav.hub.b.i create(Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = this.f24269a;
        oVar.Q(aVar.c(R.string.DRIVE_ENDED_TITLE, new Object[0]));
        oVar.P(aVar.c(R.string.DRIVE_ENDED_TEXT, new Object[0]));
        oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.gs
            @Override // com.waze.ab.q
            public final void onClick(boolean z) {
                this.f24267a.f24270b.f24297c.mIsShowingCloseSharedDriveDialog = false;
            }
        };
        oVar.M(aVar.c(R.string.DRIVE_ENDED_BUTTON, new Object[0]));
        oVar.F(R.drawable.sharedrive_drivr_ended_popup);
        oVar.H(new DialogInterface.OnCancelListener() { // from class: com.waze.gt
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f24268a.f24270b.f24297c.mIsShowingCloseSharedDriveDialog = false;
            }
        });
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }
}
