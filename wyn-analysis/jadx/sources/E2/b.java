package E2;

import A6.h;
import D6.B1;
import N1.A;
import N1.C0765n;
import N1.C0775y;
import Q1.x;
import S3.f;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class b implements A {
    public static final Parcelable.Creator<b> CREATOR = new B1(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2825b;

    public b(String str, String str2) {
        this.f2824a = h.P(str);
        this.f2825b = str2;
    }

    @Override // N1.A
    public final void P(C0775y c0775y) {
        String str;
        String str2 = this.f2824a;
        str2.getClass();
        str = this.f2825b;
        switch (str2) {
            case "TOTALTRACKS":
                Integer numQ = f.Q(str);
                if (numQ != null) {
                    c0775y.f8287i = numQ;
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numQ2 = f.Q(str);
                if (numQ2 != null) {
                    c0775y.f8299v = numQ2;
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numQ3 = f.Q(str);
                if (numQ3 != null) {
                    c0775y.f8286h = numQ3;
                    break;
                }
                break;
            case "ALBUM":
                c0775y.f8281c = str;
                break;
            case "GENRE":
                c0775y.f8300w = str;
                break;
            case "TITLE":
                c0775y.f8279a = str;
                break;
            case "DESCRIPTION":
                c0775y.f8283e = str;
                break;
            case "DISCNUMBER":
                Integer numQ4 = f.Q(str);
                if (numQ4 != null) {
                    c0775y.f8298u = numQ4;
                    break;
                }
                break;
            case "ALBUMARTIST":
                c0775y.f8282d = str;
                break;
            case "ARTIST":
                c0775y.f8280b = str;
                break;
        }
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f2824a.equals(bVar.f2824a) && this.f2825b.equals(bVar.f2825b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2825b.hashCode() + N0.a.c(527, 31, this.f2824a);
    }

    public final String toString() {
        return "VC: " + this.f2824a + "=" + this.f2825b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f2824a);
        parcel.writeString(this.f2825b);
    }

    public b(Parcel parcel) {
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f2824a = string;
        this.f2825b = parcel.readString();
    }
}
