package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.repository.suggestion.AppBrowserMediaSuggestionPayload;
import com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload;
import com.google.android.apps.auto.components.media.repository.suggestion.MediaSuggestionPlaybackPayload;

/* loaded from: classes2.dex */
public final class lpv {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.MediaSuggPlayer");

    public static lpv a() {
        return (lpv) mki.a.b(lpv.class, new lpu(0));
    }

    public static final void b(MediaSuggestionPlaybackPayload mediaSuggestionPlaybackPayload, eqa eqaVar) {
        if (mediaSuggestionPlaybackPayload instanceof AppBrowserMediaSuggestionPayload) {
            AppBrowserMediaSuggestionPayload appBrowserMediaSuggestionPayload = (AppBrowserMediaSuggestionPayload) mediaSuggestionPlaybackPayload;
            ype ypeVar = (ype) ((ype) b.f()).ai(4172);
            ComponentName componentName = appBrowserMediaSuggestionPayload.b;
            ypeVar.M("Play app browser suggestion component: %s, mediaId: %s", componentName, appBrowserMediaSuggestionPayload.a);
            szp.i(tby.t(tby.v(loy.j().f(componentName), new lmv(11))), eqaVar, new lnc(appBrowserMediaSuggestionPayload, 5));
            return;
        }
        if (!(mediaSuggestionPlaybackPayload instanceof AssistantMediaSuggestionPlaybackPayload)) {
            throw new IllegalStateException(String.format("Invalid payload type: %s", mediaSuggestionPlaybackPayload.getClass()));
        }
        ype ypeVar2 = (ype) ((ype) b.f()).ai(4173);
        ory oryVar = ((AssistantMediaSuggestionPlaybackPayload) mediaSuggestionPlaybackPayload).b;
        ypeVar2.y("Play Assistant suggestion, suggestionId: %s", oryVar.c);
        kfl.h().o(oryVar);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.MEDIA_ASSISTANT_SUGGESTION, yzy.eW).l());
    }
}
