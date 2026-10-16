package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final class gux {
    public static final void a(gva gvaVar, cfy cfyVar, bux buxVar, int i, int i2) {
        int i3;
        long j;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(622542438);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(gvaVar) : buxVarC.E(gvaVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                cfyVar = cfy.e;
            }
            cjv cjvVar = gvaVar.b;
            if (cjvVar == null) {
                buxVarC.v(1262833997);
                j = czz.at(buxVarC).p;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1262832168);
                ((bvv) buxVarC).Y(false);
                j = cjvVar.a;
            }
            czz.am(ggf.a.b(new cjv(j)), bxc.i(1893724582, true, new guk(gvaVar, cfyVar, 3, null), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(gvaVar, cfyVar2, i, i2, 7);
        }
    }

    public static BitmapDrawable b(String str) throws acji {
        EnumMap enumMap = new EnumMap(acjh.class);
        enumMap.put((EnumMap) acjh.b, (acjh) StandardCharsets.UTF_8.name());
        acju acjuVar = acjv.b(str, acjp.M, enumMap).e;
        int i = acjuVar.b;
        int i2 = i + 10;
        int i3 = acjuVar.c;
        int i4 = i3 + 10;
        int[] iArr = new int[i2 * i4];
        Arrays.fill(iArr, -1);
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                iArr[((i5 + 5) * i2) + i6 + 5] = acjuVar.a(i6, i5) != 0 ? 0 : -1;
            }
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, Bitmap.createBitmap(iArr, 0, i2, i2, i4, Bitmap.Config.ALPHA_8));
        bitmapDrawable.setAntiAlias(false);
        bitmapDrawable.setFilterBitmap(false);
        return bitmapDrawable;
    }

    public static final hiu c(bux buxVar) {
        return (hiu) buxVar.f(hji.b);
    }

    public static final hix d(bux buxVar) {
        return (hix) buxVar.f(hji.d);
    }

    public static final hja e(bux buxVar) {
        return (hja) buxVar.f(hji.a);
    }

    public static final hje f(bux buxVar) {
        return (hje) buxVar.f(hji.c);
    }

    public static final hjf g(bux buxVar) {
        return (hjf) buxVar.f(hji.e);
    }

    public static final long h() {
        wnj wnjVar = hjb.a;
        return cjn.i(hjb.c.a(70));
    }

    public static final long i() {
        wnj wnjVar = hjb.a;
        return cjn.i(hjb.b.a(70));
    }

    public static final long j() {
        wnj wnjVar = hjb.a;
        return cjn.i(hjb.a.a(70));
    }

    public static final long k() {
        wnj wnjVar = hjb.a;
        return cjn.i(hjb.d.a(70));
    }
}
