package defpackage;

import android.graphics.Color;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uke {
    public final int b;
    public final int c;
    public final float d;
    public final int[] e;
    public final int f;
    public final int g;
    public final float h;
    public usf i;
    public usf j;
    public usf k;
    public final float l;
    public final float m;
    private static final int[] n = new int[0];
    public static final uke a = new uke(0, 1.0f, new int[0], BitmapDescriptorFactory.HUE_RED);

    public uke(int i, int i2, float f, int[] iArr, float f2, usf usfVar, float f3, float f4, usf usfVar2, usf usfVar3) {
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = iArr;
        this.h = f2;
        this.l = f3;
        this.m = f4;
        this.i = usfVar;
        this.j = usfVar2;
        this.k = usfVar3;
        int i3 = 1;
        if (iArr.length != 0) {
            int iD = 0;
            for (int i4 : iArr) {
                iD = iD == 0 ? i4 : iD;
                if (i4 > 0) {
                    iD = uzg.d(iD, i4);
                }
            }
            if (iD != 0) {
                i3 = iD;
            }
        }
        this.g = i3;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        this.f = i5;
    }

    public static uke a(abes abesVar, abfk abfkVar) {
        usf usfVar = usf.a;
        return b(abesVar, abfkVar, usfVar, usfVar, usfVar);
    }

    public static uke b(abes abesVar, abfk abfkVar, usf usfVar, usf usfVar2, usf usfVar3) {
        usf usfVar4;
        usf usfVar5 = usfVar == null ? usf.a : usfVar;
        usf usfVar6 = usfVar2 == null ? usf.a : usfVar2;
        usf usfVar7 = usfVar3 == null ? usf.a : usfVar3;
        int i = abesVar.c;
        if ((abesVar.b & 128) != 0) {
            i = -1;
        }
        int i2 = i;
        float fS = uqw.s(abesVar.e);
        int[] iArr = n;
        if (abesVar.f.size() > 0) {
            iArr = new int[abesVar.f.size()];
            for (int i3 = 0; i3 < abesVar.f.size(); i3++) {
                iArr[i3] = abesVar.f.e(i3);
            }
        }
        int[] iArr2 = iArr;
        float fS2 = uqw.s(abesVar.g);
        float fS3 = uqw.s(abesVar.i);
        float fS4 = uqw.s(abesVar.j);
        usf usfVar8 = usf.a;
        usf usfVar9 = (usfVar5 != usfVar8 || (abesVar.b & 128) == 0) ? usfVar5 : new usf(abesVar.h, usg.WRAP_T);
        if (usfVar6 != usfVar8 || (abesVar.b & 2048) == 0) {
            usfVar4 = usfVar6;
        } else {
            abbn abbnVar = abesVar.k;
            if (abbnVar == null) {
                abbnVar = abbn.a;
            }
            usfVar4 = new usf(ukv.a(abbnVar.c, (abbnVar.b & 2) != 0, abbnVar.d, abfkVar), usg.NO_WRAP);
        }
        if (usfVar7 == usfVar8 && (abesVar.b & 4096) != 0) {
            abbn abbnVar2 = abesVar.l;
            if (abbnVar2 == null) {
                abbnVar2 = abbn.a;
            }
            usfVar7 = new usf(ukv.a(abbnVar2.c, (abbnVar2.b & 2) != 0, abbnVar2.d, abfkVar), usg.NO_WRAP);
        }
        return new uke(i2, (abesVar.b & 4) != 0 ? abesVar.d : i2, fS, iArr2, fS2, usfVar9, fS3, fS4, usfVar4, usfVar7);
    }

    public final boolean c() {
        return this.e.length > 0;
    }

    public final boolean d() {
        if (this.d > BitmapDescriptorFactory.HUE_RED) {
            return (Color.alpha(this.b) <= 0 && Color.alpha(this.c) <= 0 && this.i.a() && this.j.a() && this.k.a()) ? false : true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uke)) {
            return false;
        }
        uke ukeVar = (uke) obj;
        if (this.b != ukeVar.b || this.c != ukeVar.c || !Arrays.equals(this.e, ukeVar.e)) {
            return false;
        }
        if (Float.floatToIntBits(this.h) == Float.floatToIntBits(ukeVar.h) && this.j.equals(ukeVar.j) && this.k.equals(ukeVar.k) && this.i.equals(ukeVar.i)) {
            return Float.floatToIntBits(this.d) == Float.floatToIntBits(ukeVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b + 31) * 31) + this.c) * 31) + Arrays.hashCode(this.e)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke{color=");
        int i = this.b;
        sb.append(Integer.toHexString(i));
        int i2 = this.c;
        if (i != i2) {
            sb.append(", endColor=");
            sb.append(Integer.toHexString(i2));
        }
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", offset=");
        sb.append(this.h);
        sb.append(", dashes=");
        sb.append(Arrays.toString(this.e));
        if (!this.i.a()) {
            sb.append(", stampTextureKey=");
            sb.append(this.i);
        }
        if (!this.j.a()) {
            sb.append(", startCapMaskTextureKey=");
            sb.append(this.j);
        }
        if (!this.k.a()) {
            sb.append(", endCapMaskTextureKey=");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uke(int i, float f, int[] iArr, float f2) {
        usf usfVar = usf.a;
        this(i, i, f, iArr, f2, usfVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, usfVar, usfVar);
    }
}
