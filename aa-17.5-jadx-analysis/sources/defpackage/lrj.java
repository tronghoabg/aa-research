package defpackage;

import android.content.ComponentName;
import android.text.TextUtils;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final class lrj implements eqn {
    private static final yfy a;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(1, zaa.MEDIA_PLAYBACK_ERROR_CODE_APP_ERROR);
        yfuVar.e(2, zaa.MEDIA_PLAYBACK_ERROR_CODE_NOT_SUPPORTED);
        yfuVar.e(3, zaa.MEDIA_PLAYBACK_ERROR_CODE_AUTHENTICATION_EXPIRED);
        yfuVar.e(4, zaa.MEDIA_PLAYBACK_ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        yfuVar.e(5, zaa.MEDIA_PLAYBACK_ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        yfuVar.e(6, zaa.MEDIA_PLAYBACK_ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
        yfuVar.e(7, zaa.MEDIA_PLAYBACK_ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        yfuVar.e(8, zaa.MEDIA_PLAYBACK_ERROR_CODE_CONTENT_ALREADY_PLAYING);
        yfuVar.e(9, zaa.MEDIA_PLAYBACK_ERROR_CODE_SKIP_LIMIT_REACHED);
        yfuVar.e(10, zaa.MEDIA_PLAYBACK_ERROR_CODE_ACTION_ABORTED);
        yfuVar.e(11, zaa.MEDIA_PLAYBACK_ERROR_CODE_END_OF_QUEUE);
        a = yfuVar.d(true);
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        AaPlaybackState aaPlaybackState;
        lre lreVar = (lre) obj;
        ComponentName componentName = lreVar.a;
        if (componentName == null || lreVar.b != lok.b || (aaPlaybackState = lreVar.c) == null) {
            return;
        }
        boolean z = true;
        boolean z2 = aaPlaybackState.Q() == 7;
        boolean zIsEmpty = TextUtils.isEmpty(aaPlaybackState.W());
        boolean z3 = aaPlaybackState.P() != 0;
        if (z2 || !zIsEmpty) {
            z = z3;
        } else if (!z3) {
            return;
        }
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, z2 ? yzy.fI : !zIsEmpty ? yzy.fG : yzy.fH);
        rrbVarH.p(componentName);
        if (z) {
            rrbVarH.v((zaa) a.getOrDefault(Integer.valueOf(aaPlaybackState.P()), zaa.MEDIA_PLAYBACK_ERROR_CODE_UNKNOWN_CUSTOM_ERROR));
        }
        ebf.j().F(rrbVarH.l());
    }
}
