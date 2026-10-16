package defpackage;

import android.graphics.Color;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uhl implements uhc {
    private static final ThreadLocal a = new uhk();
    private int b = 0;

    private uhl() {
    }

    public static uhl c(ukq ukqVar, roa roaVar, utz utzVar, ukw ukwVar, utf utfVar, uvx uvxVar, uhz uhzVar, List list) {
        ukp ukpVar;
        int i;
        ukd ukdVar;
        float f;
        float fMin;
        aeiy aeiyVar = (aeiy) a.get();
        uhl uhlVar = new uhl();
        ArrayList arrayList = new ArrayList();
        ukd ukdVar2 = null;
        while (true) {
            ukpVar = ukqVar.a;
            int i2 = 0;
            if (!ukwVar.hasNext()) {
                break;
            }
            ukd ukdVarB = ukwVar.b();
            if (!(ukdVarB instanceof ujy)) {
                break;
            }
            ujy ujyVar = (ujy) ukdVarB;
            if (ukdVar2 == null) {
                ukdVar2 = ukdVarB;
            }
            float f2 = ujyVar.c * 4.0f;
            byte b = (byte) (ujyVar.d * 4.0f);
            ujf ujfVarG = uhzVar.b.c(ujyVar.v).g(b);
            uke ukeVar = ujfVarG.q;
            if (ukeVar != null) {
                float f3 = ukeVar.d;
                int i3 = ukeVar.b;
                f = BitmapDescriptorFactory.HUE_RED;
                ukdVar = ukdVar2;
                fMin = Math.min(127.5f, f3);
                i2 = (((i3 >> 24) & 255) << 24) | ((i3 & 255) << 16) | (((i3 >> 8) & 255) << 8) | ((i3 >> 16) & 255);
            } else {
                ukdVar = ukdVar2;
                f = BitmapDescriptorFactory.HUE_RED;
                fMin = 0.0f;
            }
            int i4 = (int) f2;
            float f4 = ujfVarG.l;
            int iMin = Math.min(255, (int) (f4 + f4));
            int i5 = uzg.a;
            int i6 = b & 255;
            int i7 = ujyVar.a;
            int i8 = ujyVar.b;
            int i9 = ujfVarG.k;
            float f5 = fMin;
            int i10 = i9 >> 24;
            int i11 = i9 >> 16;
            int i12 = i9 >> 8;
            int i13 = i9 & 255;
            int i14 = (i8 << 16) | ((char) i7);
            aeiyVar.c(i14);
            int i15 = ((i10 & 255) << 24) | (i13 << 16) | ((i12 & 255) << 8) | (i11 & 255);
            aeiyVar.c(i15);
            aeiyVar.c(i2);
            int i16 = ((((byte) i4) & 255) << 16) | (i6 << 24) | ((((int) (f5 + f5)) & 255) << 8) | (iMin & 255);
            aeiyVar.c(i16);
            aeiyVar.c(i14);
            aeiyVar.c(i15);
            aeiyVar.c(i2);
            aeiyVar.c(8388608 | i16);
            aeiyVar.c(i14);
            aeiyVar.c(i15);
            aeiyVar.c(i2);
            aeiyVar.c(i16 | Integer.MIN_VALUE);
            yfy yfyVar = ujyVar.g;
            if (ujyVar.h && (((Color.alpha(i9) > 0 && f4 > f) || (ukeVar != null && ukeVar.d())) && yfyVar != null)) {
                int i17 = ukpVar.g;
                arrayList.add(new umc(a.ab(i7, i17, ukpVar.e), a.ab(i8, i17, ukpVar.f), f4 + f5, yfyVar));
            }
            ukwVar.next();
            ukdVar2 = ukdVar;
        }
        umo umoVar = new umo(utfVar, ukpVar, (umr) roaVar.b, ukdVar2 == null ? new uwt(0, 0, 0, 0) : umo.g(ukdVar2, uhzVar.b.e(ukdVar2)), false);
        umoVar.v(uvxVar);
        umoVar.t(770, 771);
        uws uwsVar = new uws("client_point", aeiyVar.k(), aeiyVar.b / 4, 482, 4, 16, utzVar);
        uhlVar.b = uwsVar.q;
        umoVar.w(uwsVar);
        umoVar.x = new umi(true, false, new umd(arrayList));
        list.add(umoVar);
        aeiyVar.clear();
        int length = aeiyVar.a.length;
        if (length > 16384 && (i = aeiyVar.b) != length) {
            int[] iArr = new int[Math.max(16384, i)];
            System.arraycopy(aeiyVar.a, 0, iArr, 0, aeiyVar.b);
            aeiyVar.a = iArr;
        }
        return uhlVar;
    }

    @Override // defpackage.uhc
    public final int a() {
        return this.b;
    }

    @Override // defpackage.uhc
    public final int b() {
        return 112;
    }
}
