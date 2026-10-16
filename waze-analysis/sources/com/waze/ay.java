package com.waze;

import android.content.Intent;
import android.os.Looper;
import com.waze.navigate.social.ShareHelpActivity;
import com.waze.share.ViewShareDriveActivity;
import com.waze.user.FriendUserData;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ay implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16125a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16126b;

    ay(NativeManager nativeManager, int i2, byte[] bArr) {
        this.f16126b = i2;
        Objects.requireNonNull(nativeManager);
        this.f16125a = nativeManager;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.waze.hu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.waze.df, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16126b) {
            case 0:
                ConfigManager.lambda$runOnConfigSynced$1(this.f16125a);
                break;
            case 1:
                NativeManager.runMainThreadTask(new ay((Object) this.f16125a, 0));
                break;
            case 2:
                bc.onConfigSyncedFromServerJNI$lambda$0((bc) this.f16125a);
                break;
            case 3:
                bc.onConfigSyncedToServerJNI$lambda$0((bc) this.f16125a);
                break;
            case 4:
                bm.postInit$default((DeeplinkUpdatesNativeManager) this.f16125a, null, 1, null);
                break;
            case 5:
                MainActivity.aO(this.f16125a);
                break;
            case 6:
                com.waze.sound.bg.c().n();
                ((el) this.f16125a).Z().v();
                break;
            case 7:
                gb.OpenSubmitLogsDialogJNI$lambda$0((gb) this.f16125a);
                break;
            case 8:
                ((iz) this.f16125a).onNativeLooperPrepared();
                break;
            case 9:
                NativeManager.lambda$UiReadyToShowEncouragement$0((com.waze.messages.c) this.f16125a);
                break;
            case 10:
                NativeManager.getInstance().handlers.a(NativeManager.UH_LOGIN_DONE, new hh(Looper.getMainLooper(), this.f16125a));
                break;
            case 11:
                t.l(new ay((Object) this.f16125a, 10));
                break;
            case 12:
                String str = (String) this.f16125a;
                if (!com.waze.share.v.t(str)) {
                    lm.d().c().v(str);
                    break;
                }
                break;
            case 13:
                FriendUserData friendUserData = (FriendUserData) this.f16125a;
                com.waze.share.f.f(friendUserData);
                if (lm.d().e() instanceof ViewShareDriveActivity) {
                    ((ViewShareDriveActivity) lm.d().e()).q(friendUserData);
                    break;
                }
                break;
            case 14:
                this.f16125a.a();
                break;
            case 15:
                ((NativeManager) this.f16125a).getPopupsBridgeCompat().a(null);
                break;
            case 16:
                ((NativeManager) this.f16125a).closeProgressPopup();
                break;
            case 17:
                ((NativeManager) this.f16125a).closeProgressPopup();
                break;
            case 18:
                ((NativeManager) this.f16125a).LogOutNTV();
                break;
            case 19:
                MainActivity mainActivityC = lm.d().c();
                if (!((NativeManager) this.f16125a).isNavigating()) {
                    mainActivityC.startActivity(new Intent(mainActivityC, (Class<?>) ShareHelpActivity.class));
                    break;
                } else {
                    com.waze.share.aa.e(mainActivityC, com.waze.share.z.f37754a, null);
                    break;
                }
            default:
                com.waze.sharedui.a.e eVarE = lm.d().e();
                if (eVarE != null && !eVarE.isFinishing()) {
                    Object obj = this.f16125a;
                    if (obj == null) {
                        obj = "UNKNOWN";
                    }
                    com.waze.ad.a.j.k(eVarE, com.waze.feedback.f.f23862b, com.waze.feedback.g.f23865a, (String) obj);
                    break;
                } else {
                    com.waze.shared_infra.i.h.c("Cannot Call showReportAnIssue. Activity is not available");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ay(Object obj, int i2) {
        this.f16126b = i2;
        this.f16125a = obj;
    }

    ay(hu huVar, int i2) {
        this.f16126b = i2;
        this.f16125a = huVar;
    }

    ay(NativeManager nativeManager, String str, int i2) {
        this.f16126b = i2;
        this.f16125a = str;
        Objects.requireNonNull(nativeManager);
    }

    ay(NativeManager nativeManager, int i2, char[] cArr) {
        this.f16126b = i2;
        Objects.requireNonNull(nativeManager);
        this.f16125a = nativeManager;
    }

    ay(NativeManager nativeManager, FriendUserData friendUserData, int i2) {
        this.f16126b = i2;
        this.f16125a = friendUserData;
        Objects.requireNonNull(nativeManager);
    }

    ay(NativeManager nativeManager, int i2, short[] sArr) {
        this.f16126b = i2;
        Objects.requireNonNull(nativeManager);
        this.f16125a = nativeManager;
    }

    ay(NativeManager nativeManager, int i2, int[] iArr) {
        this.f16126b = i2;
        Objects.requireNonNull(nativeManager);
        this.f16125a = nativeManager;
    }

    ay(NativeManager nativeManager, int i2, boolean[] zArr) {
        this.f16126b = i2;
        Objects.requireNonNull(nativeManager);
        this.f16125a = nativeManager;
    }

    ay(NativeManager nativeManager, String str, int i2, byte[] bArr) {
        this.f16126b = i2;
        this.f16125a = str;
        Objects.requireNonNull(nativeManager);
    }
}
