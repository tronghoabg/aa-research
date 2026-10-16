package R1;

import N1.A;
import N1.C0765n;
import N1.C0775y;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements A {
    public static final Parcelable.Creator<a> CREATOR = new I2.d(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f10090a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10092c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10093d;

    public a(String str, byte[] bArr, int i5, int i10) {
        e(i10, str, bArr);
        this.f10090a = str;
        this.f10091b = bArr;
        this.f10092c = i5;
        this.f10093d = i10;
    }

    public static void e(int i5, String str, byte[] bArr) {
        boolean z2;
        byte b5;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i5 == 23 && bArr.length == 4) {
                    z2 = true;
                }
                Q1.k.c(z2);
                break;
            case "editable.tracks.samples.location":
                if (i5 == 75 && bArr.length == 1 && ((b5 = bArr[0]) == 0 || b5 == 1)) {
                    z2 = true;
                }
                Q1.k.c(z2);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i5 == 78 && bArr.length == 8) {
                    z2 = true;
                }
                Q1.k.c(z2);
                break;
            case "editable.tracks.map":
                Q1.k.c(i5 == 0);
                break;
        }
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

    public final ArrayList c() {
        Q1.k.f("Metadata is not an editable tracks map", this.f10090a.equals("editable.tracks.map"));
        byte[] bArr = this.f10091b;
        byte b5 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < b5; i5++) {
            arrayList.add(Integer.valueOf(bArr[i5 + 2]));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10090a.equals(aVar.f10090a) && Arrays.equals(this.f10091b, aVar.f10091b) && this.f10092c == aVar.f10092c && this.f10093d == aVar.f10093d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10091b) + N0.a.c(527, 31, this.f10090a)) * 31) + this.f10092c) * 31) + this.f10093d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f10090a
            byte[] r1 = r5.f10091b
            int r2 = r5.f10093d
            if (r2 == 0) goto L4f
            r3 = 1
            if (r2 == r3) goto L4a
            r3 = 23
            if (r2 == r3) goto L3d
            r3 = 67
            if (r2 == r3) goto L34
            r3 = 75
            if (r2 == r3) goto L2a
            r3 = 78
            if (r2 == r3) goto L1c
            goto L78
        L1c:
            Q1.o r2 = new Q1.o
            r2.<init>(r1)
            long r1 = r2.z()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L7c
        L2a:
            r2 = 0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L7c
        L34:
            int r1 = S3.f.s(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L7c
        L3d:
            int r1 = S3.f.s(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L7c
        L4a:
            java.lang.String r1 = Q1.x.n(r1)
            goto L7c
        L4f:
            java.lang.String r2 = "editable.tracks.map"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L78
            java.util.ArrayList r1 = r5.c()
            java.lang.String r2 = "track types = "
            java.lang.StringBuilder r2 = N0.a.j(r2)
            B8.e r3 = new B8.e
            r4 = 44
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r3.a(r2, r1)
            java.lang.String r1 = r2.toString()
            goto L7c
        L78:
            java.lang.String r1 = Q1.x.V(r1)
        L7c:
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = N0.a.h(r2, r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f10090a);
        parcel.writeByteArray(this.f10091b);
        parcel.writeInt(this.f10092c);
        parcel.writeInt(this.f10093d);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f10090a = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f10091b = bArrCreateByteArray;
        this.f10092c = parcel.readInt();
        int i10 = parcel.readInt();
        this.f10093d = i10;
        e(i10, string, bArrCreateByteArray);
    }
}
