package Z5;

import E5.C0448e0;
import E5.T;
import T6.f;
import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* loaded from: classes3.dex */
public class b implements W5.b {
    public static final Parcelable.Creator<b> CREATOR = new f(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f16995a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16996b;

    public b(String str, String str2) {
        this.f16995a = str;
        this.f16996b = str2;
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
    public final void d(C0448e0 c0448e0) {
        String str;
        String str2 = this.f16995a;
        str2.getClass();
        str = this.f16996b;
        switch (str2) {
            case "ALBUM":
                c0448e0.f3322c = str;
                break;
            case "TITLE":
                c0448e0.f3320a = str;
                break;
            case "DESCRIPTION":
                c0448e0.f3326g = str;
                break;
            case "ALBUMARTIST":
                c0448e0.f3323d = str;
                break;
            case "ARTIST":
                c0448e0.f3321b = str;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f16995a.equals(bVar.f16995a) && this.f16996b.equals(bVar.f16996b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16996b.hashCode() + N0.a.c(527, 31, this.f16995a);
    }

    public final String toString() {
        return "VC: " + this.f16995a + "=" + this.f16996b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f16995a);
        parcel.writeString(this.f16996b);
    }

    public b(Parcel parcel) {
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f16995a = string;
        this.f16996b = parcel.readString();
    }
}
