package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.snf;
import defpackage.spu;
import defpackage.suh;
import defpackage.yrm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new snf(5);
    public static final byte[][] a;
    public static final ExperimentTokens b;
    public final String c;
    public final byte[] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;
    public final int[] k;
    public final byte[][] l;

    static {
        byte[][] bArr = new byte[0][];
        a = bArr;
        b = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
        this.h = bArr5;
        this.i = iArr;
        this.j = bArr6;
        this.k = iArr2;
        this.l = bArr7;
    }

    public static byte[][] a(List list, suh suhVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            ExperimentTokens experimentTokens = (ExperimentTokens) it.next();
            if (experimentTokens != null && (bArrA2 = suhVar.a(experimentTokens)) != null) {
                length += bArrA2.length;
            }
        }
        if (length == 0) {
            return a;
        }
        byte[][] bArr = new byte[length][];
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ExperimentTokens experimentTokens2 = (ExperimentTokens) it2.next();
            if (experimentTokens2 != null && (bArrA = suhVar.a(experimentTokens2)) != null) {
                for (byte[] bArr2 : bArrA) {
                    if (bArr2 != null) {
                        bArr[i] = bArr2;
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.j;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetR = yrm.r(length);
        for (int i : iArr) {
            hashSetR.add(Integer.valueOf(i));
        }
        return hashSetR;
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetR = yrm.r(length);
        for (byte[] bArr2 : bArr) {
            spu.aw(bArr2);
            hashSetR.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetR;
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            spu.aw(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (a.C(this.c, experimentTokens.c) && a.C(c(), experimentTokens.c()) && a.C(e(this.e), e(experimentTokens.e)) && a.C(e(this.f), e(experimentTokens.f)) && a.C(e(this.g), e(experimentTokens.g)) && a.C(e(this.h), e(experimentTokens.h)) && a.C(d(this.i), d(experimentTokens.i)) && a.C(b(this.k), b(experimentTokens.k)) && a.C(e(this.l), e(experimentTokens.l))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.c;
        sb.append(str == null ? "null" : a.bq(str, "'", "'"));
        byte[] bArr = this.d;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.e);
        sb.append(", ");
        f(sb, "PSEUDO=", this.f);
        sb.append(", ");
        f(sb, "ALWAYS=", this.g);
        sb.append(", ");
        f(sb, "OTHER=", this.h);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.i));
        sb.append(", ");
        f(sb, "directs=", this.j);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.k).toArray()));
        sb.append(", ");
        f(sb, "external=", this.l);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        String str = this.c;
        if (str != null) {
            int iL2 = spu.l(parcel, 2);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        byte[] bArr = this.d;
        if (bArr != null) {
            int iL3 = spu.l(parcel, 3);
            parcel.writeByteArray(bArr);
            spu.m(parcel, iL3);
        }
        spu.w(parcel, 4, this.e);
        spu.w(parcel, 5, this.f);
        spu.w(parcel, 6, this.g);
        spu.w(parcel, 7, this.h);
        int[] iArr = this.i;
        if (iArr != null) {
            int iL4 = spu.l(parcel, 8);
            parcel.writeIntArray(iArr);
            spu.m(parcel, iL4);
        }
        spu.w(parcel, 9, this.j);
        int[] iArr2 = this.k;
        if (iArr2 != null) {
            int iL5 = spu.l(parcel, 10);
            parcel.writeIntArray(iArr2);
            spu.m(parcel, iL5);
        }
        spu.w(parcel, 11, this.l);
        spu.m(parcel, iL);
    }
}
