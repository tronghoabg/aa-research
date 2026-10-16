package I5;

import E5.AbstractC0455i;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import u6.v;

/* loaded from: classes3.dex */
public final class c implements Comparator, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new I2.d(4);

    /* renamed from: a, reason: collision with root package name */
    public final b[] f5386a;

    /* renamed from: b, reason: collision with root package name */
    public int f5387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5389d;

    public c(String str, boolean z2, b... bVarArr) {
        this.f5388c = str;
        bVarArr = z2 ? (b[]) bVarArr.clone() : bVarArr;
        this.f5386a = bVarArr;
        this.f5389d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public final c c(String str) {
        return v.a(this.f5388c, str) ? this : new c(str, false, this.f5386a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        UUID uuid = AbstractC0455i.f3412a;
        return uuid.equals(bVar.f5382b) ? uuid.equals(bVar2.f5382b) ? 0 : 1 : bVar.f5382b.compareTo(bVar2.f5382b);
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
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (v.a(this.f5388c, cVar.f5388c) && Arrays.equals(this.f5386a, cVar.f5386a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5387b == 0) {
            String str = this.f5388c;
            this.f5387b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f5386a);
        }
        return this.f5387b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f5388c);
        parcel.writeTypedArray(this.f5386a, 0);
    }

    public c(Parcel parcel) {
        this.f5388c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i5 = v.f46721a;
        this.f5386a = bVarArr;
        this.f5389d = bVarArr.length;
    }
}
