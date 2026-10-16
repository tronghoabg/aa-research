package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.media.repository.suggestion.MediaSuggestionPlaybackPayload;

/* loaded from: classes.dex */
public final class lrp extends mdd {
    private final eqa a;

    public lrp(eqa eqaVar) {
        this.a = eqaVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("MediaContentSuggestionNotifier.NotificationActionHandler");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("media_suggestion_target_app_key");
        componentName.getClass();
        String action = intent.getAction();
        action.getClass();
        yph yphVar = lrq.a;
        ((ype) ((ype) yphVar.f()).ai(4223)).M("NotificationActionHandler handling intent. action=%s, componentName=%s", action, componentName);
        int iHashCode = action.hashCode();
        if (iHashCode != 2030859435) {
            if (iHashCode == 2031076198 && action.equals("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_PLAY")) {
                MediaSuggestionPlaybackPayload mediaSuggestionPlaybackPayload = (MediaSuggestionPlaybackPayload) intent.getParcelableExtra("media_suggestion_playback_payload_key");
                mediaSuggestionPlaybackPayload.getClass();
                ((ype) ((ype) yphVar.f()).ai((char) 4224)).y("Media suggestion payload = %s", mediaSuggestionPlaybackPayload);
                lrq.b(yzy.gC, componentName);
                eqa eqaVar = this.a;
                lpv.a();
                lpv.b(mediaSuggestionPlaybackPayload, eqaVar);
                return;
            }
        } else if (action.equals("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_ICON")) {
            lrq.b(yzy.gB, componentName);
            Intent intent2 = new Intent();
            intent2.setComponent(componentName);
            mlq.f().c(4, intent2);
            return;
        }
        throw new IllegalArgumentException(String.format("Unknown action: %s", action));
    }
}
