package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u6.v;

/* loaded from: classes3.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new Z6.c(26);

    /* renamed from: b, reason: collision with root package name */
    public final String f19362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19363c;

    public m(String str, String str2, String str3) {
        super(str);
        this.f19362b = str2;
        this.f19363c = str3;
    }

    public static ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    @Override // b6.i, W5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(E5.C0448e0 r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.m.d(E5.e0):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (v.a(this.f19351a, mVar.f19351a) && v.a(this.f19362b, mVar.f19362b) && v.a(this.f19363c, mVar.f19363c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = N0.a.c(527, 31, this.f19351a);
        String str = this.f19362b;
        int iHashCode = (iC + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19363c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // b6.i
    public final String toString() {
        return this.f19351a + ": description=" + this.f19362b + ": value=" + this.f19363c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19351a);
        parcel.writeString(this.f19362b);
        parcel.writeString(this.f19363c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(Parcel parcel) {
        String string = parcel.readString();
        int i5 = v.f46721a;
        super(string);
        this.f19362b = parcel.readString();
        this.f19363c = parcel.readString();
    }
}
