package defpackage;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes2.dex */
public final class dq {
    public final MediaSessionCompat.Token a;
    public final Set b;
    public final ajdr c;

    public dq(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.b = DesugarCollections.synchronizedSet(new HashSet());
        this.a = token;
        if (Build.VERSION.SDK_INT >= 29) {
            this.c = new ajdr(context, token);
        } else {
            this.c = new ajdr(context, token);
        }
    }

    static void d(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1348483723) {
            if (iHashCode != 503011406 || !str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
                return;
            }
        } else if (!str.equals("android.support.v4.media.session.action.FOLLOW")) {
            return;
        }
        if (!bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
            throw new IllegalArgumentException(a.bq(str, "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", "."));
        }
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = ((MediaController) this.c.e).getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.d(metadata);
        }
        return null;
    }

    public final AbstractC0001do b() {
        return new dp(((MediaController) this.c.e).getTransportControls());
    }

    public final String c() {
        return ((MediaController) this.c.e).getPackageName();
    }
}
