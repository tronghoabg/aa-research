package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lrv extends defpackage.mdl {
    private final defpackage.eqg a;

    public lrv(defpackage.eqg eqgVar) {
        this.a = eqgVar;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("MediaContentSuggestionNotifier.NotificationActionHandler");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra("media_suggestion_target_app_key");
        componentName.getClass();
        java.lang.String action = intent.getAction();
        action.getClass();
        defpackage.yqm yqmVar = defpackage.lrw.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(4226)).M("NotificationActionHandler handling intent. action=%s, componentName=%s", action, componentName);
        int iHashCode = action.hashCode();
        if (iHashCode != 2030859435) {
            if (iHashCode == 2031076198 && action.equals("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_PLAY")) {
                com.google.android.apps.auto.components.media.repository.suggestion.MediaSuggestionPlaybackPayload parcelableExtra = intent.getParcelableExtra("media_suggestion_playback_payload_key");
                parcelableExtra.getClass();
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4227)).y("Media suggestion payload = %s", parcelableExtra);
                defpackage.lrw.b(defpackage.zbd.gC, componentName);
                defpackage.eqg eqgVar = this.a;
                lqc.a();
                lqc.b(parcelableExtra, eqgVar);
                return;
            }
        } else if (action.equals("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_ICON")) {
            defpackage.lrw.b(defpackage.zbd.gB, componentName);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setComponent(componentName);
            defpackage.lxy.p().c(4, intent2);
            return;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unknown action: %s", action));
    }
}
