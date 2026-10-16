package android.support.v4.media.session;

import Va.M6;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f17680a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17681b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17682c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17683d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17684e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17685f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f17686g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17687h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f17688i;

    /* renamed from: j, reason: collision with root package name */
    public final long f17689j;
    public final Bundle k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        public final String f17690a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f17691b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17692c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f17693d;

        public CustomAction(Parcel parcel) {
            this.f17690a = parcel.readString();
            this.f17691b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f17692c = parcel.readInt();
            this.f17693d = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f17691b) + ", mIcon=" + this.f17692c + ", mExtras=" + this.f17693d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            parcel.writeString(this.f17690a);
            TextUtils.writeToParcel(this.f17691b, parcel, i5);
            parcel.writeInt(this.f17692c);
            parcel.writeBundle(this.f17693d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f17680a = parcel.readInt();
        this.f17681b = parcel.readLong();
        this.f17683d = parcel.readFloat();
        this.f17687h = parcel.readLong();
        this.f17682c = parcel.readLong();
        this.f17684e = parcel.readLong();
        this.f17686g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f17688i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f17689j = parcel.readLong();
        this.k = parcel.readBundle(b.class.getClassLoader());
        this.f17685f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f17680a);
        sb2.append(", position=");
        sb2.append(this.f17681b);
        sb2.append(", buffered position=");
        sb2.append(this.f17682c);
        sb2.append(", speed=");
        sb2.append(this.f17683d);
        sb2.append(", updated=");
        sb2.append(this.f17687h);
        sb2.append(", actions=");
        sb2.append(this.f17684e);
        sb2.append(", error code=");
        sb2.append(this.f17685f);
        sb2.append(", error message=");
        sb2.append(this.f17686g);
        sb2.append(", custom actions=");
        sb2.append(this.f17688i);
        sb2.append(", active item id=");
        return M6.s(sb2, this.f17689j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f17680a);
        parcel.writeLong(this.f17681b);
        parcel.writeFloat(this.f17683d);
        parcel.writeLong(this.f17687h);
        parcel.writeLong(this.f17682c);
        parcel.writeLong(this.f17684e);
        TextUtils.writeToParcel(this.f17686g, parcel, i5);
        parcel.writeTypedList(this.f17688i);
        parcel.writeLong(this.f17689j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f17685f);
    }
}
