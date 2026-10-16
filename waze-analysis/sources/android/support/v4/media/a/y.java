package android.support.v4.media.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new t(4);

    /* renamed from: a, reason: collision with root package name */
    private final String f432a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f433b;

    /* renamed from: c, reason: collision with root package name */
    private final int f434c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f435d;

    y(Parcel parcel) {
        this.f432a = parcel.readString();
        this.f433b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f434c = parcel.readInt();
        this.f435d = parcel.readBundle(v.class.getClassLoader());
    }

    public final String a() {
        return this.f432a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f433b) + ", mIcon=" + this.f434c + ", mExtras=" + this.f435d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f432a);
        TextUtils.writeToParcel(this.f433b, parcel, i2);
        parcel.writeInt(this.f434c);
        parcel.writeBundle(this.f435d);
    }

    y(String str, CharSequence charSequence, int i2, Bundle bundle) {
        this.f432a = str;
        this.f433b = charSequence;
        this.f434c = i2;
        this.f435d = bundle;
    }
}
