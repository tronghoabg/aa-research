package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4373a implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    ABSENT(0),
    STRING(1),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(2);

    public static final Parcelable.Creator<EnumC4373a> CREATOR = new C4381i(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f47373a;

    EnumC4373a(int i5) {
        this.f47373a = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f47373a);
    }
}
