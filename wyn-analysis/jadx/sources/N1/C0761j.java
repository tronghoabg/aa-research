package N1;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: N1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761j implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0761j> CREATOR = new I2.d(21);

    /* renamed from: a, reason: collision with root package name */
    public final C0760i[] f8164a;

    /* renamed from: b, reason: collision with root package name */
    public int f8165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8166c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8167d;

    public C0761j(String str, ArrayList arrayList) {
        this(str, false, (C0760i[]) arrayList.toArray(new C0760i[0]));
    }

    public final C0761j c(String str) {
        int i5 = Q1.x.f9724a;
        return Objects.equals(this.f8166c, str) ? this : new C0761j(str, false, this.f8164a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0760i c0760i = (C0760i) obj;
        C0760i c0760i2 = (C0760i) obj2;
        UUID uuid = AbstractC0756e.f8144a;
        return uuid.equals(c0760i.f8160b) ? uuid.equals(c0760i2.f8160b) ? 0 : 1 : c0760i.f8160b.compareTo(c0760i2.f8160b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0761j.class == obj.getClass()) {
            C0761j c0761j = (C0761j) obj;
            int i5 = Q1.x.f9724a;
            if (Objects.equals(this.f8166c, c0761j.f8166c) && Arrays.equals(this.f8164a, c0761j.f8164a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8165b == 0) {
            String str = this.f8166c;
            this.f8165b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f8164a);
        }
        return this.f8165b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f8166c);
        parcel.writeTypedArray(this.f8164a, 0);
    }

    public C0761j(C0760i... c0760iArr) {
        this(null, true, c0760iArr);
    }

    public C0761j(String str, boolean z2, C0760i... c0760iArr) {
        this.f8166c = str;
        c0760iArr = z2 ? (C0760i[]) c0760iArr.clone() : c0760iArr;
        this.f8164a = c0760iArr;
        this.f8167d = c0760iArr.length;
        Arrays.sort(c0760iArr, this);
    }

    public C0761j(Parcel parcel) {
        this.f8166c = parcel.readString();
        C0760i[] c0760iArr = (C0760i[]) parcel.createTypedArray(C0760i.CREATOR);
        int i5 = Q1.x.f9724a;
        this.f8164a = c0760iArr;
        this.f8167d = c0760iArr.length;
    }
}
