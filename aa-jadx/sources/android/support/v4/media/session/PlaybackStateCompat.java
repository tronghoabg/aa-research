package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat> CREATOR = new defpackage.ea(0);
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final java.lang.CharSequence g;
    public final long h;
    public final java.util.List i;
    public final long j;
    public final android.os.Bundle k;
    public android.media.session.PlaybackState l;

    public PlaybackStateCompat(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(android.support.v4.media.session.MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
    }

    public static android.support.v4.media.session.PlaybackStateCompat a(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction;
        if (obj == null) {
            return null;
        }
        android.media.session.PlaybackState playbackState = (android.media.session.PlaybackState) obj;
        java.util.List<android.media.session.PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(customActions.size());
            for (android.media.session.PlaybackState.CustomAction customAction2 : customActions) {
                if (customAction2 == null) {
                    customAction = null;
                } else {
                    android.media.session.PlaybackState.CustomAction customAction3 = customAction2;
                    android.os.Bundle extras = customAction3.getExtras();
                    android.support.v4.media.session.MediaSessionCompat.c(extras);
                    customAction = new android.support.v4.media.session.PlaybackStateCompat.CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), extras);
                    customAction.e = customAction3;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        android.os.Bundle extras2 = playbackState.getExtras();
        android.support.v4.media.session.MediaSessionCompat.c(extras2);
        android.support.v4.media.session.PlaybackStateCompat playbackStateCompat = new android.support.v4.media.session.PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2);
        playbackStateCompat.l = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "PlaybackState {state=" + this.a + ", position=" + this.b + ", buffered position=" + this.c + ", speed=" + this.d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        android.text.TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat.CustomAction> CREATOR = new defpackage.x(12);
        public final java.lang.String a;
        public final java.lang.CharSequence b;
        public final int c;
        public final android.os.Bundle d;
        public android.media.session.PlaybackState.CustomAction e;

        public CustomAction(android.os.Parcel parcel) {
            this.a = parcel.readString();
            this.b = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle(android.support.v4.media.session.MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String toString() {
            return "Action:mName='" + ((java.lang.Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.a);
            android.text.TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }

        public CustomAction(java.lang.String str, java.lang.CharSequence charSequence, int i, android.os.Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
            this.d = bundle;
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, java.lang.CharSequence charSequence, long j4, java.util.List list, long j5, android.os.Bundle bundle) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = i2;
        this.g = charSequence;
        this.h = j4;
        this.i = new java.util.ArrayList(list);
        this.j = j5;
        this.k = bundle;
    }
}
