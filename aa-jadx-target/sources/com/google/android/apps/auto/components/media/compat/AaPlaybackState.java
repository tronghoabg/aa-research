package com.google.android.apps.auto.components.media.compat;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class AaPlaybackState extends defpackage.lma {
    public static final com.google.android.apps.auto.components.media.compat.AaPlaybackState a = new defpackage.lma((byte[][]) null).K();

    public AaPlaybackState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        this.b = playbackStateCompat;
    }

    public final float O() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).d;
    }

    public final int P() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).f;
    }

    public final int Q() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).a;
    }

    public final long R() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).e;
    }

    public final long S() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).j;
    }

    public final long T() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).h;
    }

    public final long U() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).b;
    }

    public final defpackage.ygw V() {
        return g(((android.support.v4.media.session.PlaybackStateCompat) this.b).i, new lkg(7));
    }

    public final java.lang.CharSequence W() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).g;
    }

    @Override // defpackage.lma
    public final android.os.Bundle n() {
        return (android.os.Bundle) new defpackage.nub(((android.support.v4.media.session.PlaybackStateCompat) this.b).k).i(android.os.Bundle.EMPTY);
    }
}
