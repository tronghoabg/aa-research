package com.google.android.apps.auto.components.media.compat;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.khy;
import defpackage.lka;
import defpackage.llu;
import defpackage.ntn;
import defpackage.yfq;

/* loaded from: classes.dex */
public final class AaPlaybackState extends llu {
    public static final AaPlaybackState a = new llu((byte[][]) null).K();

    public AaPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.b = playbackStateCompat;
    }

    public final float O() {
        return ((PlaybackStateCompat) this.b).d;
    }

    public final int P() {
        return ((PlaybackStateCompat) this.b).f;
    }

    public final int Q() {
        return ((PlaybackStateCompat) this.b).a;
    }

    public final long R() {
        return ((PlaybackStateCompat) this.b).e;
    }

    public final long S() {
        return ((PlaybackStateCompat) this.b).j;
    }

    public final long T() {
        return ((PlaybackStateCompat) this.b).h;
    }

    public final long U() {
        return ((PlaybackStateCompat) this.b).b;
    }

    public final yfq V() {
        return g(((PlaybackStateCompat) this.b).i, new lka(6));
    }

    public final CharSequence W() {
        return ((PlaybackStateCompat) this.b).g;
    }

    @Override // defpackage.llu
    public final Bundle n() {
        return (Bundle) new ntn(((PlaybackStateCompat) this.b).k).i(Bundle.EMPTY);
    }

    /* loaded from: classes2.dex */
    public static class AaCustomAction extends llu<PlaybackStateCompat.CustomAction> implements Parcelable {
        public static final Parcelable.Creator<AaCustomAction> CREATOR = new khy(4);

        public AaCustomAction(Parcel parcel) {
            this.b = PlaybackStateCompat.CustomAction.CREATOR.createFromParcel(parcel);
        }

        public final int O() {
            return ((PlaybackStateCompat.CustomAction) this.b).c;
        }

        public final CharSequence P() {
            return ((PlaybackStateCompat.CustomAction) this.b).b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // defpackage.llu
        public final Bundle n() {
            return (Bundle) new ntn(((PlaybackStateCompat.CustomAction) this.b).d).i(Bundle.EMPTY);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ((PlaybackStateCompat.CustomAction) this.b).writeToParcel(parcel, i);
        }

        public AaCustomAction(PlaybackStateCompat.CustomAction customAction) {
            this.b = customAction;
        }
    }
}
