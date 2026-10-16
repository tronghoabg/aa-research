package N1;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: N1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760i implements Parcelable {
    public static final Parcelable.Creator<C0760i> CREATOR = new I2.d(22);

    /* renamed from: a, reason: collision with root package name */
    public int f8159a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f8160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8161c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8162d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8163e;

    public C0760i(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f8160b = uuid;
        this.f8161c = str;
        str2.getClass();
        this.f8162d = C.m(str2);
        this.f8163e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0760i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0760i c0760i = (C0760i) obj;
        String str = c0760i.f8161c;
        int i5 = Q1.x.f9724a;
        return Objects.equals(this.f8161c, str) && Objects.equals(this.f8162d, c0760i.f8162d) && Objects.equals(this.f8160b, c0760i.f8160b) && Arrays.equals(this.f8163e, c0760i.f8163e);
    }

    public final int hashCode() {
        if (this.f8159a == 0) {
            int iHashCode = this.f8160b.hashCode() * 31;
            String str = this.f8161c;
            this.f8159a = Arrays.hashCode(this.f8163e) + N0.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f8162d);
        }
        return this.f8159a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        UUID uuid = this.f8160b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f8161c);
        parcel.writeString(this.f8162d);
        parcel.writeByteArray(this.f8163e);
    }

    public C0760i(Parcel parcel) {
        this.f8160b = new UUID(parcel.readLong(), parcel.readLong());
        this.f8161c = parcel.readString();
        String string = parcel.readString();
        int i5 = Q1.x.f9724a;
        this.f8162d = string;
        this.f8163e = parcel.createByteArray();
    }
}
