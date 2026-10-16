package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class dq {
    public final android.support.v4.media.session.MediaSessionCompat.Token a;
    public final java.util.Set b;
    public final defpackage.ajer c;

    public dq(android.content.Context context, android.support.v4.media.session.MediaSessionCompat.Token token) {
        if (token == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        this.b = j$.util.DesugarCollections.synchronizedSet(new java.util.HashSet());
        this.a = token;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.c = new defpackage.ajer(context, token);
        } else {
            this.c = new defpackage.ajer(context, token);
        }
    }

    static void d(java.lang.String str, android.os.Bundle bundle) {
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
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", "."));
        }
    }

    public final android.support.v4.media.MediaMetadataCompat a() {
        android.media.MediaMetadata metadata = ((android.media.session.MediaController) this.c.e).getMetadata();
        if (metadata != null) {
            return android.support.v4.media.MediaMetadataCompat.d(metadata);
        }
        return null;
    }

    public final defpackage.AbstractC0001do b() {
        return new defpackage.dp(((android.media.session.MediaController) this.c.e).getTransportControls());
    }

    public final java.lang.String c() {
        return ((android.media.session.MediaController) this.c.e).getPackageName();
    }
}
