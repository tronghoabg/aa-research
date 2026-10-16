package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zbvq implements zbvx {
    private final zbvm zba;
    private final zbwl zbb;
    private final boolean zbc;
    private final zbtq zbd;

    private zbvq(zbwl zbwlVar, zbtq zbtqVar, zbvm zbvmVar) {
        this.zbb = zbwlVar;
        this.zbc = zbvmVar instanceof zbub;
        this.zbd = zbtqVar;
        this.zba = zbvmVar;
    }

    public static zbvq zbc(zbwl zbwlVar, zbtq zbtqVar, zbvm zbvmVar) {
        return new zbvq(zbwlVar, zbtqVar, zbvmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zba(Object obj) {
        int iZbb = ((zbuf) obj).zbc.zbb();
        return this.zbc ? iZbb + ((zbub) obj).zbb.zbc() : iZbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(Object obj) {
        int iHashCode = ((zbuf) obj).zbc.hashCode();
        return this.zbc ? (iHashCode * 53) + ((zbub) obj).zbb.zba.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final Object zbe() {
        zbvm zbvmVar = this.zba;
        return zbvmVar instanceof zbuf ? ((zbuf) zbvmVar).zbt() : zbvmVar.zbJ().zbl();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbf(Object obj) {
        this.zbb.zbb(obj);
        this.zbd.zba(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(Object obj, Object obj2) {
        zbvz.zbp(this.zbb, obj, obj2);
        if (this.zbc) {
            zbvz.zbo(this.zbd, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zbh(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = r0.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbf()
            r0.zbc = r1
        L11:
            r6 = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r11
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r11 = r11.zbg()
            r0 = 0
            r1 = r0
        L1a:
            if (r13 >= r14) goto Lc5
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r12, r13, r15)
            int r2 = r15.zba
            r13 = 11
            r3 = 2
            if (r2 == r13) goto L60
            r13 = r2 & 7
            if (r13 != r3) goto L59
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r13 = r15.zbd
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r10.zba
            int r3 = r2 >>> 3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r1 = r13.zbc(r1, r3)
            if (r1 == 0) goto L51
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r13 = r1.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r13 = r13.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r13 = r2.zbb(r13)
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbe(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r3 = r1.zbb
            r11.zbj(r3, r2)
            goto L1a
        L51:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbj(r2, r3, r4, r5, r6, r7)
            goto L1a
        L59:
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbq(r2, r12, r4, r5, r7)
            goto L1a
        L60:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L64:
            if (r4 >= r5) goto Lb7
            int r15 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r12, r4, r7)
            int r2 = r7.zba
            int r4 = r2 >>> 3
            r8 = r2 & 7
            if (r4 == r3) goto L9d
            r9 = 3
            if (r4 == r9) goto L76
            goto Lae
        L76:
            if (r1 == 0) goto L92
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = r1.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r4.zbb(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbe(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r2 = r1.zbb
            r11.zbj(r2, r15)
            goto L64
        L92:
            if (r8 != r3) goto Lae
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zba(r12, r15, r7)
            java.lang.Object r14 = r7.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r14 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r14
            goto L64
        L9d:
            if (r8 != 0) goto Lae
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r12, r15, r7)
            int r13 = r7.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r15 = r7.zbd
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r10.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r1 = r15.zbc(r1, r13)
            goto L64
        Lae:
            r4 = 12
            if (r2 == r4) goto Lb8
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbq(r2, r12, r15, r5, r7)
            goto L64
        Lb7:
            r15 = r4
        Lb8:
            if (r14 == 0) goto Lc0
            int r13 = r13 << 3
            r13 = r13 | r3
            r6.zbj(r13, r14)
        Lc0:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L1a
        Lc5:
            r5 = r14
            if (r13 != r5) goto Lc9
            return
        Lc9:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq r11 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvq.zbh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbi(Object obj, zbwy zbwyVar) throws IOException {
        Iterator itZbg = ((zbub) obj).zbb.zbg();
        while (itZbg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZbg.next();
            zbtt zbttVar = (zbtt) entry.getKey();
            if (zbttVar.zbe() != zbwx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zbttVar.zbg();
            zbttVar.zbf();
            if (entry instanceof zbut) {
                zbttVar.zba();
                zbwyVar.zbx(32149011, ((zbut) entry).zba().zbb());
            } else {
                zbttVar.zba();
                zbwyVar.zbx(32149011, entry.getValue());
            }
        }
        ((zbuf) obj).zbc.zbk(zbwyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(Object obj, Object obj2) {
        if (!((zbuf) obj).zbc.equals(((zbuf) obj2).zbc)) {
            return false;
        }
        if (this.zbc) {
            return ((zbub) obj).zbb.equals(((zbub) obj2).zbb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbk(Object obj) {
        return ((zbub) obj).zbb.zbm();
    }
}
