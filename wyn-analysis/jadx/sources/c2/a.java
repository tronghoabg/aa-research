package C2;

import A6.j;
import N1.A;
import N1.C0765n;
import N1.C0775y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements A {
    public static final Parcelable.Creator<a> CREATOR = new j(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f1778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1779b;

    public a(int i5, String str) {
        this.f1778a = i5;
        this.f1779b = str;
    }

    @Override // N1.A
    public final /* synthetic */ void P(C0775y c0775y) {
    }

    @Override // N1.A
    public final /* synthetic */ C0765n a() {
        return null;
    }

    @Override // N1.A
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f1778a);
        sb2.append(",url=");
        return wg.b.c(sb2, this.f1779b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f1779b);
        parcel.writeInt(this.f1778a);
    }
}
