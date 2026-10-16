package com.google.android.apps.auto.components.media.compat;

/* JADX INFO: loaded from: classes.dex */
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
        return g(((android.support.v4.media.session.PlaybackStateCompat) this.b).i, new defpackage.lkg(7));
    }

    public final java.lang.CharSequence W() {
        return ((android.support.v4.media.session.PlaybackStateCompat) this.b).g;
    }

    @Override // defpackage.lma
    public final android.os.Bundle n() {
        return (android.os.Bundle) new defpackage.nub(((android.support.v4.media.session.PlaybackStateCompat) this.b).k).i(android.os.Bundle.EMPTY);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class AaCustomAction extends defpackage.lma<android.support.v4.media.session.PlaybackStateCompat.CustomAction> implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction> CREATOR = new defpackage.kid(4);

        public AaCustomAction(android.os.Parcel parcel) {
            this.b = android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR.createFromParcel(parcel);
        }

        public final int O() {
            return ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) this.b).c;
        }

        public final java.lang.CharSequence P() {
            return ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) this.b).b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // defpackage.lma
        public final android.os.Bundle n() {
            return (android.os.Bundle) new defpackage.nub(((android.support.v4.media.session.PlaybackStateCompat.CustomAction) this.b).d).i(android.os.Bundle.EMPTY);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) this.b).writeToParcel(parcel, i);
        }

        public AaCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction) {
            this.b = customAction;
        }
    }
}
