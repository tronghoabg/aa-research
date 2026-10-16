package com.waze;

import android.content.Intent;
import android.content.res.Resources;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.share.ViewShareDriveActivity;
import com.waze.uid.FlowContext;
import com.waze.uid.FlowType;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f24398a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24399b;

    hn(NativeManager nativeManager, String str, int i2, byte[] bArr) {
        this.f24399b = i2;
        this.f24398a = str;
        Objects.requireNonNull(nativeManager);
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.f24399b) {
            case 0:
                DriveToNativeManager driveToNativeManager = (DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class);
                String str = (String) this.f24398a;
                if (!driveToNativeManager.isMeetingIdSet(str)) {
                    com.waze.share.f.b(str);
                    break;
                } else {
                    Intent intent = new Intent(lm.d().e(), (Class<?>) ViewShareDriveActivity.class);
                    intent.putExtra("meeting", str);
                    lm.d().e().startActivityForResult(intent, 0);
                    break;
                }
            case 1:
                NativeManager.mInviteId = (String) this.f24398a;
                com.waze.uid.b.ab.y().A(com.waze.uid.r.d(FlowType.ADD_ID, FlowContext.WAZE_ONBOARDING));
                break;
            case 2:
                NativeManager nativeManager = (NativeManager) this.f24398a;
                if (nativeManager.mOnInCarDeeplinkActionListener != null && nativeManager.mOnInCarDeeplinkActionListener.b()) {
                    nativeManager.mOnInCarDeeplinkActionListener.a(new com.waze.navigate.a.b(new com.waze.navigate.a.a(com.waze.settings.f.c.a.f37237a)));
                    break;
                }
                break;
            case 3:
                ((NativeManager) this.f24398a).getPopupsBridgeCompat().b(new com.waze.main_screen.ab.b(true));
                break;
            case 4:
                ((NativeManager) this.f24398a).updateCalendarEventsNTV();
                break;
            case 5:
                com.waze.utils.n.f44897a.c((String) this.f24398a, null, mg.a());
                break;
            case 6:
                com.waze.sharedui.a.e eVarE = lm.d().e();
                if (eVarE != null) {
                    com.waze.navigate.cs csVar = new com.waze.navigate.cs((AddressItem) this.f24398a);
                    csVar.d();
                    csVar.b(eVarE, 1);
                    break;
                }
                break;
            case 7:
                com.waze.sharedui.a.e eVarE2 = lm.d().e();
                if (eVarE2 != null) {
                    new com.waze.navigate.cs((AddressItem) this.f24398a).b(eVarE2, 1);
                    break;
                }
                break;
            case 8:
                kj kjVar = (kj) this.f24398a;
                if (kjVar.f25043d) {
                    if (kjVar.f25040a == 1 && kjVar.f25045f) {
                        kjVar.n.h(kjVar.f());
                    } else if (!kjVar.f25045f) {
                        kjVar.f25045f = true;
                        kjVar.f25049j.postDelayed(this, kjVar.f25046g * 1000);
                    } else if (kjVar.f25040a <= kjVar.f25044e + 1) {
                        kjVar.n.f(0);
                    } else {
                        kjVar.f25044e++;
                        if (kjVar.f25042c[kjVar.f25044e] == null) {
                            kjVar.n.f(0);
                        } else {
                            kjVar.f25049j.setCurrentItem(kjVar.f25044e);
                            kjVar.f25049j.postDelayed(this, kjVar.f25042c[kjVar.f25044e].aj() * 1000);
                        }
                    }
                    kjVar.K(kjVar.f25044e);
                    break;
                }
                break;
            default:
                NativeManager.getInstance().ExecuteActionNTV((String) this.f24398a);
                break;
        }
    }

    hn(NativeManager nativeManager, String str, int i2) {
        this.f24399b = i2;
        this.f24398a = str;
        Objects.requireNonNull(nativeManager);
    }

    hn(NativeManager nativeManager, int i2) {
        this.f24399b = i2;
        Objects.requireNonNull(nativeManager);
        this.f24398a = nativeManager;
    }

    hn(NativeManager nativeManager, int i2, byte[] bArr) {
        this.f24399b = i2;
        Objects.requireNonNull(nativeManager);
        this.f24398a = nativeManager;
    }

    hn(NativeManager nativeManager, int i2, char[] cArr) {
        this.f24399b = i2;
        Objects.requireNonNull(nativeManager);
        this.f24398a = nativeManager;
    }

    hn(NativeManager nativeManager, String str, int i2, char[] cArr) {
        this.f24399b = i2;
        this.f24398a = str;
        Objects.requireNonNull(nativeManager);
    }

    hn(hx hxVar, AddressItem addressItem, int i2) {
        this.f24399b = i2;
        this.f24398a = addressItem;
        Objects.requireNonNull(hxVar);
    }

    hn(hy hyVar, AddressItem addressItem, int i2) {
        this.f24399b = i2;
        this.f24398a = addressItem;
        Objects.requireNonNull(hyVar);
    }

    hn(kj kjVar, int i2) {
        this.f24399b = i2;
        Objects.requireNonNull(kjVar);
        this.f24398a = kjVar;
    }

    hn(ld ldVar, String str, int i2) {
        this.f24399b = i2;
        this.f24398a = str;
        Objects.requireNonNull(ldVar);
    }
}
