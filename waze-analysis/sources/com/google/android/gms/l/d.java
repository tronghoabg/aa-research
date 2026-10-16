package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import com.google.d.d.fo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<d> CREATOR = new com.google.android.gms.auth.a.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f5592a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5593b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f5594c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[][] f5595d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[][] f5596e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f5597f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f5598g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[][] f5599h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f5600i;

    /* renamed from: j, reason: collision with root package name */
    final byte[][] f5601j;

    public d(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f5592a = str;
        this.f5593b = bArr;
        this.f5594c = bArr2;
        this.f5595d = bArr3;
        this.f5596e = bArr4;
        this.f5597f = bArr5;
        this.f5598g = iArr;
        this.f5599h = bArr6;
        this.f5600i = iArr2;
        this.f5601j = bArr7;
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i2 = 0; i2 < iArr.length; i2 += 2) {
            arrayList.add(new j(iArr[i2], iArr[i2 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set b() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f5599h;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f5593b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return d((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set c(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetD = fo.d(length);
        for (int i2 : iArr) {
            hashSetD.add(Integer.valueOf(i2));
        }
        return hashSetD;
    }

    private static Set d(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetD = fo.d(length);
        for (byte[] bArr2 : bArr) {
            av.m(bArr2);
            hashSetD.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetD;
    }

    private static void e(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i2 = 0;
        while (i2 < bArr.length) {
            byte[] bArr2 = bArr[i2];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            av.m(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i2++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (com.waze.c.c.e.b(this.f5592a, dVar.f5592a) && com.waze.c.c.e.b(b(), dVar.b()) && com.waze.c.c.e.b(d(this.f5594c), d(dVar.f5594c)) && com.waze.c.c.e.b(d(this.f5595d), d(dVar.f5595d)) && com.waze.c.c.e.b(d(this.f5596e), d(dVar.f5596e)) && com.waze.c.c.e.b(d(this.f5597f), d(dVar.f5597f)) && com.waze.c.c.e.b(c(this.f5598g), c(dVar.f5598g)) && com.waze.c.c.e.b(a(this.f5600i), a(dVar.f5600i)) && com.waze.c.c.e.b(d(this.f5601j), d(dVar.f5601j))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f5592a;
        if (str2 == null) {
            str = "null";
        } else {
            str = "'" + str2 + "'";
        }
        sb.append(str);
        byte[] bArr = this.f5593b;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        e(sb, "GAIA=", this.f5594c);
        sb.append(", ");
        e(sb, "PSEUDO=", this.f5595d);
        sb.append(", ");
        e(sb, "ALWAYS=", this.f5596e);
        sb.append(", ");
        e(sb, "OTHER=", this.f5597f);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f5598g));
        sb.append(", ");
        e(sb, "directs=", this.f5599h);
        sb.append(", genDims=");
        sb.append(Arrays.toString(a(this.f5600i).toArray()));
        sb.append(", ");
        e(sb, "external=", this.f5601j);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.u(parcel, 2, this.f5592a);
        bb.l(parcel, 3, this.f5593b);
        bb.m(parcel, 4, this.f5594c);
        bb.m(parcel, 5, this.f5595d);
        bb.m(parcel, 6, this.f5596e);
        bb.m(parcel, 7, this.f5597f);
        bb.r(parcel, 8, this.f5598g);
        bb.m(parcel, 9, this.f5599h);
        bb.r(parcel, 10, this.f5600i);
        bb.m(parcel, 11, this.f5601j);
        bb.e(parcel, iD);
    }
}
