package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahfo {
    public static final ajnr a(String str) {
        str.getClass();
        ajnb ajnbVar = ajoi.a;
        ajmy ajmyVar = new ajmy();
        ajmyVar.V(str);
        return ajoi.f(ajmyVar, false);
    }

    public static final ajnr b(File file) {
        String string = file.toString();
        string.getClass();
        return a(string);
    }

    public static final String signature(ahft ahftVar, agba agbaVar, String str) {
        ahftVar.getClass();
        agbaVar.getClass();
        str.getClass();
        return ahftVar.signature(ahfp.getInternalName(agbaVar), str);
    }

    public final void c(long j, ajmy ajmyVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        long j2;
        List list3;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        List list4 = list2;
        if (i8 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i8; i9 < i3; i9++) {
            if (((ajnb) list.get(i9)).c() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        ajnb ajnbVar = (ajnb) list.get(i2);
        ajnb ajnbVar2 = (ajnb) list.get(i3 - 1);
        if (i7 == ajnbVar.c()) {
            int iIntValue = ((Number) list4.get(i8)).intValue();
            i8++;
            i4 = iIntValue;
            ajnbVar = (ajnb) list.get(i8);
        } else {
            i4 = -1;
        }
        int i10 = i8 + 1;
        long j3 = 4;
        if (ajnbVar.a(i7) == ajnbVar2.a(i7)) {
            int iMin = Math.min(ajnbVar.c(), ajnbVar2.c());
            int i11 = 0;
            for (int i12 = i7; i12 < iMin && ajnbVar.a(i12) == ajnbVar2.a(i12); i12++) {
                i11++;
            }
            long j4 = j + (ajmyVar.b / 4) + 2;
            long j5 = i11;
            ajmyVar.O(-i11);
            ajmyVar.O(i4);
            int i13 = i7 + i11;
            while (i7 < i13) {
                ajmyVar.O(ajnbVar.a(i7) & 255);
                i7++;
            }
            if (i10 == i3) {
                if (i13 != ((ajnb) list.get(i8)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                ajmyVar.O(((Number) list4.get(i8)).intValue());
                return;
            } else {
                long j6 = j4 + j5 + 1;
                ajmy ajmyVar2 = new ajmy();
                ajmyVar.O(-((int) ((ajmyVar2.b / 4) + j6)));
                c(j6, ajmyVar2, i13, list, i8, i3, list4);
                ajmyVar.M(ajmyVar2);
                return;
            }
        }
        int i14 = 1;
        while (i10 < i3) {
            if (((ajnb) list.get(i10 - 1)).a(i7) != ((ajnb) list.get(i10)).a(i7)) {
                i14++;
            }
            i10++;
        }
        long j7 = j + (ajmyVar.b / 4) + 2;
        int i15 = i14 + i14;
        ajmyVar.O(i14);
        ajmyVar.O(i4);
        for (int i16 = i8; i16 < i3; i16++) {
            byte bA = ((ajnb) list.get(i16)).a(i7);
            if (i16 == i8 || bA != ((ajnb) list.get(i16 - 1)).a(i7)) {
                ajmyVar.O(bA & 255);
            }
        }
        ajmy ajmyVar3 = new ajmy();
        int i17 = i8;
        while (i17 < i3) {
            int i18 = i7 + 1;
            byte bA2 = ((ajnb) list.get(i17)).a(i7);
            int i19 = i17 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    j2 = j3;
                    i20 = i3;
                    break;
                } else {
                    j2 = j3;
                    if (bA2 != ((ajnb) list.get(i20)).a(i7)) {
                        break;
                    }
                    i20++;
                    j3 = j2;
                }
            }
            if (i19 == i20 && i18 == ((ajnb) list.get(i17)).c()) {
                ajmyVar.O(((Number) list4.get(i17)).intValue());
                int i21 = i20;
                list3 = list4;
                i5 = i21;
                i6 = i15;
            } else {
                long j8 = i15 + j7;
                ajmyVar.O(-((int) ((ajmyVar3.b / j2) + j8)));
                int i22 = i20;
                list3 = list4;
                i5 = i22;
                i6 = i15;
                c(j8, ajmyVar3, i18, list, i17, i5, list3);
            }
            i17 = i5;
            list4 = list3;
            i15 = i6;
            j3 = j2;
        }
        ajmyVar.M(ajmyVar3);
    }
}
