package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class airq {
    private airq() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ defpackage.airc create$default(defpackage.airq airqVar, defpackage.airc aircVar, defpackage.airc aircVar2, boolean z, defpackage.afer aferVar, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            aferVar = null;
        }
        return airqVar.create(aircVar, aircVar2, z, aferVar);
    }

    public final void a(long j, defpackage.ajny ajnyVar, int i, java.util.List list, int i2, int i3, java.util.List list2) {
        int i4;
        long j2;
        java.util.List list3;
        int i5;
        int i6 = i;
        int i7 = i2;
        java.util.List list4 = list2;
        if (i7 >= i3) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (((defpackage.ajob) list.get(i8)).c() < i6) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
        }
        defpackage.ajob ajobVar = (defpackage.ajob) list.get(i2);
        defpackage.ajob ajobVar2 = (defpackage.ajob) list.get(i3 - 1);
        if (i6 == ajobVar.c()) {
            int iIntValue = ((java.lang.Number) list4.get(i7)).intValue();
            i7++;
            i4 = iIntValue;
            ajobVar = (defpackage.ajob) list.get(i7);
        } else {
            i4 = -1;
        }
        int i9 = i7 + 1;
        long j3 = 4;
        if (ajobVar.a(i6) == ajobVar2.a(i6)) {
            int iMin = java.lang.Math.min(ajobVar.c(), ajobVar2.c());
            int i10 = 0;
            for (int i11 = i6; i11 < iMin && ajobVar.a(i11) == ajobVar2.a(i11); i11++) {
                i10++;
            }
            long j4 = j + (ajnyVar.b / 4) + 2;
            long j5 = i10;
            ajnyVar.O(-i10);
            ajnyVar.O(i4);
            int i12 = i6 + i10;
            while (i6 < i12) {
                ajnyVar.O(ajobVar.a(i6) & 255);
                i6++;
            }
            if (i9 == i3) {
                if (i12 != ((defpackage.ajob) list.get(i7)).c()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                ajnyVar.O(((java.lang.Number) list4.get(i7)).intValue());
                return;
            } else {
                long j6 = j4 + j5 + 1;
                defpackage.ajny ajnyVar2 = new defpackage.ajny();
                ajnyVar.O(-((int) ((ajnyVar2.b / 4) + j6)));
                a(j6, ajnyVar2, i12, list, i7, i3, list4);
                ajnyVar.M(ajnyVar2);
                return;
            }
        }
        int i13 = 1;
        while (i9 < i3) {
            if (((defpackage.ajob) list.get(i9 - 1)).a(i6) != ((defpackage.ajob) list.get(i9)).a(i6)) {
                i13++;
            }
            i9++;
        }
        long j7 = j + (ajnyVar.b / 4) + 2;
        int i14 = i13 + i13;
        ajnyVar.O(i13);
        ajnyVar.O(i4);
        for (int i15 = i7; i15 < i3; i15++) {
            byte bA = ((defpackage.ajob) list.get(i15)).a(i6);
            if (i15 == i7 || bA != ((defpackage.ajob) list.get(i15 - 1)).a(i6)) {
                ajnyVar.O(bA & 255);
            }
        }
        defpackage.ajny ajnyVar3 = new defpackage.ajny();
        int i16 = i7;
        while (i16 < i3) {
            int i17 = i6 + 1;
            byte bA2 = ((defpackage.ajob) list.get(i16)).a(i6);
            int i18 = i16 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    j2 = j3;
                    i19 = i3;
                    break;
                } else {
                    j2 = j3;
                    if (bA2 != ((defpackage.ajob) list.get(i19)).a(i6)) {
                        break;
                    }
                    i19++;
                    j3 = j2;
                }
            }
            if (i18 == i19 && i17 == ((defpackage.ajob) list.get(i16)).c()) {
                ajnyVar.O(((java.lang.Number) list4.get(i16)).intValue());
                int i20 = i19;
                list3 = list4;
                i5 = i20;
            } else {
                long j8 = ((long) i14) + j7;
                ajnyVar.O(-((int) ((ajnyVar3.b / j2) + j8)));
                int i21 = i19;
                list3 = list4;
                i5 = i21;
                a(j8, ajnyVar3, i17, list, i16, i5, list3);
            }
            i16 = i5;
            list4 = list3;
            i14 = i14;
            j3 = j2;
        }
        ajnyVar.M(ajnyVar3);
    }

    public final defpackage.airc create(defpackage.airc aircVar, defpackage.airc aircVar2, boolean z, defpackage.afer<? extends java.lang.reflect.Type> aferVar) {
        aircVar.getClass();
        aircVar2.getClass();
        return defpackage.afga.f(aircVar, aircVar2) ? aircVar : new defpackage.airr(aircVar, aircVar2, z, aferVar, null);
    }

    public /* synthetic */ airq(defpackage.affu affuVar) {
        this();
    }

    public airq(byte[] bArr) {
    }
}
