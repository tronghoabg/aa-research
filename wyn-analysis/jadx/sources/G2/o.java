package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import l8.AbstractC3409K;
import l8.e0;

/* loaded from: classes.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new B1(21);

    /* renamed from: b, reason: collision with root package name */
    public final String f4197b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3409K f4198c;

    public o(String str, String str2, e0 e0Var) {
        super(str);
        Q1.k.c(!e0Var.isEmpty());
        this.f4197b = str2;
        AbstractC3409K abstractC3409KJ = AbstractC3409K.j(e0Var);
        this.f4198c = abstractC3409KJ;
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
    @Override // G2.j, N1.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(N1.C0775y r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.o.P(N1.y):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            int i5 = x.f9724a;
            if (Objects.equals(this.f4185a, oVar.f4185a) && Objects.equals(this.f4197b, oVar.f4197b) && this.f4198c.equals(oVar.f4198c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = N0.a.c(527, 31, this.f4185a);
        String str = this.f4197b;
        return this.f4198c.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // G2.j
    public final String toString() {
        return this.f4185a + ": description=" + this.f4197b + ": values=" + this.f4198c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4185a);
        parcel.writeString(this.f4197b);
        parcel.writeStringArray((String[]) this.f4198c.toArray(new String[0]));
    }
}
