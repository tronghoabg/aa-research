package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lrp implements defpackage.eqt {
    private static final defpackage.yhe a;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(1, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_APP_ERROR);
        yhaVar.f(2, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_NOT_SUPPORTED);
        yhaVar.f(3, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_AUTHENTICATION_EXPIRED);
        yhaVar.f(4, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        yhaVar.f(5, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        yhaVar.f(6, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
        yhaVar.f(7, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        yhaVar.f(8, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_CONTENT_ALREADY_PLAYING);
        yhaVar.f(9, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_SKIP_LIMIT_REACHED);
        yhaVar.f(10, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_ACTION_ABORTED);
        yhaVar.f(11, defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_END_OF_QUEUE);
        a = yhaVar.d(true);
    }

    @Override // defpackage.eqt
    public final /* synthetic */ void ea(java.lang.Object obj) {
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState;
        defpackage.zbd zbdVar;
        defpackage.lrk lrkVar = (defpackage.lrk) obj;
        android.content.ComponentName componentName = lrkVar.a;
        if (componentName == null || lrkVar.b != defpackage.lor.b || (aaPlaybackState = lrkVar.c) == null) {
            return;
        }
        boolean z = true;
        boolean z2 = aaPlaybackState.Q() == 7;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(aaPlaybackState.W());
        boolean z3 = aaPlaybackState.P() != 0;
        if (z2 || !zIsEmpty) {
            z = z3;
        } else if (!z3) {
            return;
        }
        if (z2) {
            zbdVar = defpackage.zbd.fI;
        } else {
            zbdVar = !zIsEmpty ? defpackage.zbd.fG : defpackage.zbd.fH;
        }
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, zbdVar);
        rrvVarH.p(componentName);
        if (z) {
            rrvVarH.v((defpackage.zbf) a.getOrDefault(java.lang.Integer.valueOf(aaPlaybackState.P()), defpackage.zbf.MEDIA_PLAYBACK_ERROR_CODE_UNKNOWN_CUSTOM_ERROR));
        }
        defpackage.omf.u().F(rrvVarH.l());
    }
}
