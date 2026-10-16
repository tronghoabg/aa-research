package defpackage;

import android.content.Context;
import android.media.session.MediaSession;

/* loaded from: classes2.dex */
public final class dy extends dx {
    @Override // defpackage.dv
    public final MediaSession c(Context context, String str) {
        return new MediaSession(context, str, null);
    }
}
