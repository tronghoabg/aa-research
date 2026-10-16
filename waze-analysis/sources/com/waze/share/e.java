package com.waze.share;

import android.content.Context;
import android.text.TextUtils;
import com.waze.R;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.social.EndDriveData;
import com.waze.user.FriendUserData;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private FriendUserData f37698a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f37699b = com.waze.shared_infra.o.b.a();

    /* renamed from: c, reason: collision with root package name */
    private EndDriveData f37700c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37701d;

    public e(String str) {
        this.f37701d = str;
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i a(e eVar, Context context) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(context);
        timeFormat.setTimeZone(timeZone);
        f fVar = new f(context, eVar.f37701d, !TextUtils.isEmpty(eVar.f37700c.shareOwner) ? eVar.f37700c.shareOwner : eVar.f37699b.c(R.string.RECEIVE_SHARE_DRIVE_ANONYMOUS_NAME, new Object[0]), eVar.f37698a.pictureUrl, eVar.f37700c.address, timeFormat.format(new Date(System.currentTimeMillis() + (eVar.f37698a.mEtaSeconds * 1000))));
        fVar.show();
        return com.waze.app_nav.hub.b.m.a(fVar);
    }

    public static /* synthetic */ h.ab b(e eVar, FriendUserData friendUserData) {
        eVar.f37698a = friendUserData;
        eVar.f();
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(e eVar, EndDriveData endDriveData) {
        eVar.f37700c = endDriveData;
        eVar.f();
        return h.ab.f48028a;
    }

    static /* bridge */ /* synthetic */ void d(final e eVar) {
        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class);
        h.g.a.l<? super EndDriveData, h.ab> lVar = new h.g.a.l() { // from class: com.waze.share.c
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return e.c(this.f37696a, (EndDriveData) obj);
            }
        };
        String str = eVar.f37701d;
        driveToNativeManager.getFriendsDrivingData(str, lVar);
        ((ShareNativeManager) com.waze.web.r.h(ShareNativeManager.class)).getFriendFromMeeting(str, new h.g.a.l() { // from class: com.waze.share.d
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return e.b(this.f37697a, (FriendUserData) obj);
            }
        });
    }

    static /* bridge */ /* synthetic */ void e(e eVar, FriendUserData friendUserData) {
        eVar.f37698a = friendUserData;
        eVar.f();
    }

    private final void f() {
        FriendUserData friendUserData = this.f37698a;
        if (friendUserData == null || this.f37700c == null) {
            if (friendUserData == null) {
                com.waze.shared_infra.i.h.c("ReceiveShareDrive - User is null! Cannot show dialog! Meeting ID = ".concat(String.valueOf(this.f37701d)));
            }
            if (this.f37700c == null) {
                com.waze.shared_infra.i.h.c("ReceiveShareDrive - DriveData is null! Cannot show dialog! Meeting ID = ".concat(String.valueOf(this.f37701d)));
                return;
            }
            return;
        }
        f.f37702a = null;
        if (this.f37700c.isInMeeting) {
            com.waze.shared_infra.i.h.h("ReceiveShareDrive - User is already in this meeting. Showing map screen immediately.");
            f.j(this.f37701d);
        } else {
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k(this.f37701d, new com.waze.app_nav.hub.b.j() { // from class: com.waze.share.b
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    return e.a(this.f37695a, context);
                }
            }));
        }
    }
}
