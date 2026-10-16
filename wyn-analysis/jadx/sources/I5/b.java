package I5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import u6.v;

/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new I2.d(5);

    /* renamed from: a, reason: collision with root package name */
    public int f5381a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f5382b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5383c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5384d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5385e;

    public b(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f5382b = uuid;
        this.f5383c = str;
        str2.getClass();
        this.f5384d = str2;
        this.f5385e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        return v.a(this.f5383c, bVar.f5383c) && v.a(this.f5384d, bVar.f5384d) && v.a(this.f5382b, bVar.f5382b) && Arrays.equals(this.f5385e, bVar.f5385e);
    }

    public final int hashCode() {
        if (this.f5381a == 0) {
            int iHashCode = this.f5382b.hashCode() * 31;
            String str = this.f5383c;
            this.f5381a = Arrays.hashCode(this.f5385e) + N0.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f5384d);
        }
        return this.f5381a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        UUID uuid = this.f5382b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f5383c);
        parcel.writeString(this.f5384d);
        parcel.writeByteArray(this.f5385e);
    }

    public b(Parcel parcel) {
        this.f5382b = new UUID(parcel.readLong(), parcel.readLong());
        this.f5383c = parcel.readString();
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f5384d = string;
        this.f5385e = parcel.createByteArray();
    }
}
