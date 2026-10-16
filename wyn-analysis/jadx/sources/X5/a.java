package X5;

import E5.C0448e0;
import E5.T;
import T6.f;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a implements W5.b {
    public static final Parcelable.Creator<a> CREATOR = new f(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f16120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16121b;

    public a(int i5, String str) {
        this.f16120a = i5;
        this.f16121b = str;
    }

    @Override // W5.b
    public final /* synthetic */ T a() {
        return null;
    }

    @Override // W5.b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // W5.b
    public final /* synthetic */ void d(C0448e0 c0448e0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f16120a);
        sb2.append(",url=");
        return wg.b.c(sb2, this.f16121b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f16121b);
        parcel.writeInt(this.f16120a);
    }
}
