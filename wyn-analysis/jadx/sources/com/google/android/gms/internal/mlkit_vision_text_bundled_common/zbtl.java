package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zbtl implements zbwy {
    private final zbtk zba;

    private zbtl(zbtk zbtkVar) {
        byte[] bArr = zbuo.zbb;
        this.zba = zbtkVar;
        zbtkVar.zba = this;
    }

    public static zbtl zba(zbtk zbtkVar) {
        zbtl zbtlVar = zbtkVar.zba;
        return zbtlVar != null ? zbtlVar : new zbtl(zbtkVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbA(int i5, long j8) throws IOException {
        this.zba.zbj(i5, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbB(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbva)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbj(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zba.zbw(i11);
            while (i10 < list.size()) {
                this.zba.zbk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z2) {
            while (i10 < zbvaVar.size()) {
                this.zba.zbj(i5, zbvaVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zbvaVar.size(); i14++) {
            zbvaVar.zbe(i14);
            i13 += 8;
        }
        this.zba.zbw(i13);
        while (i10 < zbvaVar.size()) {
            this.zba.zbk(zbvaVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbC(int i5, int i10) throws IOException {
        this.zba.zbv(i5, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbD(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbug)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zbtk zbtkVar = this.zba;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zbtkVar.zbv(i5, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int iZbD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZbD += zbtk.zbD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zba.zbw(iZbD);
            while (i10 < list.size()) {
                zbtk zbtkVar2 = this.zba;
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zbtkVar2.zbw((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z2) {
            while (i10 < zbugVar.size()) {
                zbtk zbtkVar3 = this.zba;
                int iZbe = zbugVar.zbe(i10);
                zbtkVar3.zbv(i5, (iZbe >> 31) ^ (iZbe + iZbe));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int iZbD2 = 0;
        for (int i12 = 0; i12 < zbugVar.size(); i12++) {
            int iZbe2 = zbugVar.zbe(i12);
            iZbD2 += zbtk.zbD((iZbe2 >> 31) ^ (iZbe2 + iZbe2));
        }
        this.zba.zbw(iZbD2);
        while (i10 < zbugVar.size()) {
            zbtk zbtkVar4 = this.zba;
            int iZbe3 = zbugVar.zbe(i10);
            zbtkVar4.zbw((iZbe3 >> 31) ^ (iZbe3 + iZbe3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbE(int i5, long j8) throws IOException {
        this.zba.zbx(i5, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbF(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbva)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zbtk zbtkVar = this.zba;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zbtkVar.zbx(i5, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int iZbE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZbE += zbtk.zbE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zba.zbw(iZbE);
            while (i10 < list.size()) {
                zbtk zbtkVar2 = this.zba;
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zbtkVar2.zby((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z2) {
            while (i10 < zbvaVar.size()) {
                zbtk zbtkVar3 = this.zba;
                long jZbe = zbvaVar.zbe(i10);
                zbtkVar3.zbx(i5, (jZbe >> 63) ^ (jZbe + jZbe));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int iZbE2 = 0;
        for (int i12 = 0; i12 < zbvaVar.size(); i12++) {
            long jZbe2 = zbvaVar.zbe(i12);
            iZbE2 += zbtk.zbE((jZbe2 >> 63) ^ (jZbe2 + jZbe2));
        }
        this.zba.zbw(iZbE2);
        while (i10 < zbvaVar.size()) {
            zbtk zbtkVar4 = this.zba;
            long jZbe3 = zbvaVar.zbe(i10);
            zbtkVar4.zby((jZbe3 >> 63) ^ (jZbe3 + jZbe3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @Deprecated
    public final void zbG(int i5) throws IOException {
        this.zba.zbu(i5, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbH(int i5, String str) throws IOException {
        this.zba.zbs(i5, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbI(int i5, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbux)) {
            while (i10 < list.size()) {
                this.zba.zbs(i5, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zbux zbuxVar = (zbux) list;
        while (i10 < list.size()) {
            Object objZba = zbuxVar.zba();
            if (objZba instanceof String) {
                this.zba.zbs(i5, (String) objZba);
            } else {
                this.zba.zbf(i5, (zbtc) objZba);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbJ(int i5, int i10) throws IOException {
        this.zba.zbv(i5, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbK(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbug)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbv(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int iZbD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZbD += zbtk.zbD(((Integer) list.get(i11)).intValue());
            }
            this.zba.zbw(iZbD);
            while (i10 < list.size()) {
                this.zba.zbw(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z2) {
            while (i10 < zbugVar.size()) {
                this.zba.zbv(i5, zbugVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int iZbD2 = 0;
        for (int i12 = 0; i12 < zbugVar.size(); i12++) {
            iZbD2 += zbtk.zbD(zbugVar.zbe(i12));
        }
        this.zba.zbw(iZbD2);
        while (i10 < zbugVar.size()) {
            this.zba.zbw(zbugVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbL(int i5, long j8) throws IOException {
        this.zba.zbx(i5, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbM(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbva)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbx(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int iZbE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZbE += zbtk.zbE(((Long) list.get(i11)).longValue());
            }
            this.zba.zbw(iZbE);
            while (i10 < list.size()) {
                this.zba.zby(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z2) {
            while (i10 < zbvaVar.size()) {
                this.zba.zbx(i5, zbvaVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int iZbE2 = 0;
        for (int i12 = 0; i12 < zbvaVar.size(); i12++) {
            iZbE2 += zbtk.zbE(zbvaVar.zbe(i12));
        }
        this.zba.zbw(iZbE2);
        while (i10 < zbvaVar.size()) {
            this.zba.zby(zbvaVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbb(int i5, boolean z2) throws IOException {
        this.zba.zbd(i5, z2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbc(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbss)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbd(i5, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            this.zba.zbw(i11);
            while (i10 < list.size()) {
                this.zba.zbb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zbss zbssVar = (zbss) list;
        if (!z2) {
            while (i10 < zbssVar.size()) {
                this.zba.zbd(i5, zbssVar.zbf(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zbssVar.size(); i14++) {
            zbssVar.zbf(i14);
            i13++;
        }
        this.zba.zbw(i13);
        while (i10 < zbssVar.size()) {
            this.zba.zbb(zbssVar.zbf(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbd(int i5, zbtc zbtcVar) throws IOException {
        this.zba.zbf(i5, zbtcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbe(int i5, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zba.zbf(i5, (zbtc) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbf(int i5, double d3) throws IOException {
        this.zba.zbj(i5, Double.doubleToRawLongBits(d3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbg(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbtm)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbj(i5, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zba.zbw(i11);
            while (i10 < list.size()) {
                this.zba.zbk(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zbtm zbtmVar = (zbtm) list;
        if (!z2) {
            while (i10 < zbtmVar.size()) {
                this.zba.zbj(i5, Double.doubleToRawLongBits(zbtmVar.zbe(i10)));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zbtmVar.size(); i14++) {
            zbtmVar.zbe(i14);
            i13 += 8;
        }
        this.zba.zbw(i13);
        while (i10 < zbtmVar.size()) {
            this.zba.zbk(Double.doubleToRawLongBits(zbtmVar.zbe(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @Deprecated
    public final void zbh(int i5) throws IOException {
        this.zba.zbu(i5, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbi(int i5, int i10) throws IOException {
        this.zba.zbl(i5, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbj(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbug)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbl(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int iZbE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZbE += zbtk.zbE(((Integer) list.get(i11)).intValue());
            }
            this.zba.zbw(iZbE);
            while (i10 < list.size()) {
                this.zba.zbm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z2) {
            while (i10 < zbugVar.size()) {
                this.zba.zbl(i5, zbugVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int iZbE2 = 0;
        for (int i12 = 0; i12 < zbugVar.size(); i12++) {
            iZbE2 += zbtk.zbE(zbugVar.zbe(i12));
        }
        this.zba.zbw(iZbE2);
        while (i10 < zbugVar.size()) {
            this.zba.zbm(zbugVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbk(int i5, int i10) throws IOException {
        this.zba.zbh(i5, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbl(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbug)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbh(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zba.zbw(i11);
            while (i10 < list.size()) {
                this.zba.zbi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z2) {
            while (i10 < zbugVar.size()) {
                this.zba.zbh(i5, zbugVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zbugVar.size(); i14++) {
            zbugVar.zbe(i14);
            i13 += 4;
        }
        this.zba.zbw(i13);
        while (i10 < zbugVar.size()) {
            this.zba.zbi(zbugVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbm(int i5, long j8) throws IOException {
        this.zba.zbj(i5, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbn(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbva)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbj(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zba.zbw(i11);
            while (i10 < list.size()) {
                this.zba.zbk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z2) {
            while (i10 < zbvaVar.size()) {
                this.zba.zbj(i5, zbvaVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zbvaVar.size(); i14++) {
            zbvaVar.zbe(i14);
            i13 += 8;
        }
        this.zba.zbw(i13);
        while (i10 < zbvaVar.size()) {
            this.zba.zbk(zbvaVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbo(int i5, float f10) throws IOException {
        this.zba.zbh(i5, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbp(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbtw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbh(i5, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zba.zbw(i11);
            while (i10 < list.size()) {
                this.zba.zbi(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zbtw zbtwVar = (zbtw) list;
        if (!z2) {
            while (i10 < zbtwVar.size()) {
                this.zba.zbh(i5, Float.floatToRawIntBits(zbtwVar.zbe(i10)));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zbtwVar.size(); i14++) {
            zbtwVar.zbe(i14);
            i13 += 4;
        }
        this.zba.zbw(i13);
        while (i10 < zbtwVar.size()) {
            this.zba.zbi(Float.floatToRawIntBits(zbtwVar.zbe(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbq(int i5, Object obj, zbvx zbvxVar) throws IOException {
        zbtk zbtkVar = this.zba;
        zbtkVar.zbu(i5, 3);
        zbvxVar.zbi((zbvm) obj, zbtkVar.zba);
        zbtkVar.zbu(i5, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbr(int i5, int i10) throws IOException {
        this.zba.zbl(i5, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbs(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbug)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbl(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int iZbE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZbE += zbtk.zbE(((Integer) list.get(i11)).intValue());
            }
            this.zba.zbw(iZbE);
            while (i10 < list.size()) {
                this.zba.zbm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z2) {
            while (i10 < zbugVar.size()) {
                this.zba.zbl(i5, zbugVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int iZbE2 = 0;
        for (int i12 = 0; i12 < zbugVar.size(); i12++) {
            iZbE2 += zbtk.zbE(zbugVar.zbe(i12));
        }
        this.zba.zbw(iZbE2);
        while (i10 < zbugVar.size()) {
            this.zba.zbm(zbugVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbt(int i5, long j8) throws IOException {
        this.zba.zbx(i5, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbu(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbva)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbx(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int iZbE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZbE += zbtk.zbE(((Long) list.get(i11)).longValue());
            }
            this.zba.zbw(iZbE);
            while (i10 < list.size()) {
                this.zba.zby(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z2) {
            while (i10 < zbvaVar.size()) {
                this.zba.zbx(i5, zbvaVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int iZbE2 = 0;
        for (int i12 = 0; i12 < zbvaVar.size(); i12++) {
            iZbE2 += zbtk.zbE(zbvaVar.zbe(i12));
        }
        this.zba.zbw(iZbE2);
        while (i10 < zbvaVar.size()) {
            this.zba.zby(zbvaVar.zbe(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbv(int i5, zbve zbveVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.zba.zbu(i5, 2);
            this.zba.zbw(zbvf.zbb(zbveVar, entry.getKey(), entry.getValue()));
            zbvf.zbe(this.zba, zbveVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbw(int i5, Object obj, zbvx zbvxVar) throws IOException {
        this.zba.zbo(i5, (zbvm) obj, zbvxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbx(int i5, Object obj) throws IOException {
        if (obj instanceof zbtc) {
            this.zba.zbr(i5, (zbtc) obj);
        } else {
            this.zba.zbq(i5, (zbvm) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zby(int i5, int i10) throws IOException {
        this.zba.zbh(i5, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbz(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zbug)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zba.zbh(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zba.zbu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zba.zbw(i11);
            while (i10 < list.size()) {
                this.zba.zbi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z2) {
            while (i10 < zbugVar.size()) {
                this.zba.zbh(i5, zbugVar.zbe(i10));
                i10++;
            }
            return;
        }
        this.zba.zbu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zbugVar.size(); i14++) {
            zbugVar.zbe(i14);
            i13 += 4;
        }
        this.zba.zbw(i13);
        while (i10 < zbugVar.size()) {
            this.zba.zbi(zbugVar.zbe(i10));
            i10++;
        }
    }
}
