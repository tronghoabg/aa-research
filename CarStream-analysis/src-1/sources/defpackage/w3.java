package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.media.MediaSessionManager;
import com.carstream.tech.car.e;
import com.carstream.tech.media.ControllerService;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class w3 extends MediaSessionCompat.Callback {
    public final /* synthetic */ ControllerService a;

    public w3(ControllerService controllerService) {
        this.a = controllerService;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        y6 y6VarPlayerOrLog = this.a.playerOrLog("nut phu " + str);
        if (y6VarPlayerOrLog == null) {
            return;
        }
        if ("cnt.toan_man_hinh".equals(str)) {
            ((e) y6VarPlayerOrLog).G();
            return;
        }
        if ("cnt.tua_lui".equals(str)) {
            ((e) y6VarPlayerOrLog).B(-10000L, false);
            return;
        }
        if ("cnt.tua_toi".equals(str)) {
            ((e) y6VarPlayerOrLog).B(10000L, false);
            return;
        }
        if ("cnt.giong_noi".equals(str)) {
            ((e) y6VarPlayerOrLog).F();
        } else {
            if (str == null || !str.startsWith("cnt.mo_app.")) {
                return;
            }
            ((e) y6VarPlayerOrLog).p(str.substring(11));
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onFastForward() {
        y6 y6VarPlayerOrLog = this.a.playerOrLog("onFastForward");
        if (y6VarPlayerOrLog != null) {
            ((e) y6VarPlayerOrLog).B(10000L, false);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        try {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                intent.getAction();
            } else {
                int keyCode = keyEvent.getKeyCode();
                String strKeyCodeToString = KeyEvent.keyCodeToString(keyEvent.getKeyCode());
                int action = keyEvent.getAction();
                StringBuilder sb = new StringBuilder();
                sb.append(keyCode);
                sb.append(" = ");
                sb.append(strKeyCodeToString);
                sb.append(" action=");
                sb.append(action);
            }
        } catch (Exception unused) {
        }
        return super.onMediaButtonEvent(intent);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        ControllerService controllerService = this.a;
        try {
            MediaSessionManager.RemoteUserInfo currentControllerInfo = controllerService.session.getCurrentControllerInfo();
            if (currentControllerInfo != null) {
                currentControllerInfo.getPackageName();
            }
        } catch (Throwable unused) {
        }
        y6 y6VarPlayerOrLog = controllerService.playerOrLog("onPause");
        if (y6VarPlayerOrLog != null) {
            ((e) y6VarPlayerOrLog).r();
        }
        controllerService.publishState(2);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        z6.f();
        boolean zC = z6.c();
        ControllerService controllerService = this.a;
        if (zC) {
            controllerService.publishState(3);
        } else {
            controllerService.publishNotReady();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        if (str == null || !str.startsWith("search/")) {
            return;
        }
        z6.d(str.substring(7));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        String strQueryFrom = ControllerService.queryFrom(str, bundle);
        boolean zIsEmpty = strQueryFrom.isEmpty();
        ControllerService controllerService = this.a;
        if (zIsEmpty) {
            if (z6.c()) {
                return;
            }
            controllerService.publishNotReady();
        } else {
            if (z6.d(strQueryFrom)) {
                return;
            }
            controllerService.publishNotReady();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepare() {
        z6.c();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        onPlayFromSearch(str, bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRewind() {
        y6 y6VarPlayerOrLog = this.a.playerOrLog("onRewind");
        if (y6VarPlayerOrLog != null) {
            ((e) y6VarPlayerOrLog).B(-10000L, false);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        y6 y6VarPlayerOrLog = this.a.playerOrLog("onSeekTo");
        if (y6VarPlayerOrLog != null) {
            ((e) y6VarPlayerOrLog).B(j, true);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ControllerService controllerService = this.a;
        boolean z = jCurrentTimeMillis - controllerService.lastNextAt < 600;
        if (z) {
            jCurrentTimeMillis = 0;
        }
        controllerService.lastNextAt = jCurrentTimeMillis;
        if (!z) {
            if (controllerService.playerOrLog("onSkipToNext") == null) {
                return;
            }
            if (controllerService.pendingSkip != null) {
                controllerService.main.removeCallbacks(controllerService.pendingSkip);
            }
            controllerService.pendingSkip = new f(this, 16);
            controllerService.main.postDelayed(controllerService.pendingSkip, 600L);
            return;
        }
        if (controllerService.pendingSkip != null) {
            controllerService.main.removeCallbacks(controllerService.pendingSkip);
            controllerService.pendingSkip = null;
        }
        y6 y6VarPlayerOrLog = controllerService.playerOrLog("next x2");
        if (y6VarPlayerOrLog != null) {
            ((e) y6VarPlayerOrLog).F();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        y6 y6VarPlayerOrLog = this.a.playerOrLog("onSkipToPrevious");
        if (y6VarPlayerOrLog != null) {
            ((e) y6VarPlayerOrLog).w();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onStop() {
        ControllerService controllerService = this.a;
        try {
            MediaSessionManager.RemoteUserInfo currentControllerInfo = controllerService.session.getCurrentControllerInfo();
            if (currentControllerInfo != null) {
                currentControllerInfo.getPackageName();
            }
        } catch (Throwable unused) {
        }
        y6 y6VarPlayerOrLog = controllerService.playerOrLog("onStop");
        if (y6VarPlayerOrLog != null) {
            ((e) y6VarPlayerOrLog).r();
        }
        controllerService.publishState(2);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetRating(RatingCompat ratingCompat) {
    }
}
