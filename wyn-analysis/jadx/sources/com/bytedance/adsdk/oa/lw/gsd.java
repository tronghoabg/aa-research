package com.bytedance.adsdk.oa.lw;

/* loaded from: classes.dex */
class gsd {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.adsdk.oa.yo.oa.bcc uef(android.util.JsonReader r11, com.bytedance.adsdk.oa.xs r12) throws java.io.IOException {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = -1
            r11.beginObject()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        Lc:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto Lbd
            java.lang.String r9 = r11.nextName()
            r9.getClass()
            int r10 = r9.hashCode()
            switch(r10) {
                case 111: goto L43;
                case 3588: goto L38;
                case 104433: goto L2d;
                case 3357091: goto L22;
                default: goto L20;
            }
        L20:
            r9 = r3
            goto L4d
        L22:
            java.lang.String r10 = "mode"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L2b
            goto L20
        L2b:
            r9 = r0
            goto L4d
        L2d:
            java.lang.String r10 = "inv"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L36
            goto L20
        L36:
            r9 = r1
            goto L4d
        L38:
            java.lang.String r10 = "pt"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L41
            goto L20
        L41:
            r9 = r2
            goto L4d
        L43:
            java.lang.String r10 = "o"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L4c
            goto L20
        L4c:
            r9 = r5
        L4d:
            switch(r9) {
                case 0: goto Lb7;
                case 1: goto Lb1;
                case 2: goto Lab;
                case 3: goto L54;
                default: goto L50;
            }
        L50:
            r11.skipValue()
            goto Lc
        L54:
            java.lang.String r4 = r11.nextString()
            r4.getClass()
            int r9 = r4.hashCode()
            switch(r9) {
                case 97: goto L85;
                case 105: goto L7a;
                case 110: goto L6f;
                case 115: goto L64;
                default: goto L62;
            }
        L62:
            r4 = r3
            goto L8f
        L64:
            java.lang.String r9 = "s"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L6d
            goto L62
        L6d:
            r4 = r0
            goto L8f
        L6f:
            java.lang.String r9 = "n"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L78
            goto L62
        L78:
            r4 = r1
            goto L8f
        L7a:
            java.lang.String r9 = "i"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L83
            goto L62
        L83:
            r4 = r2
            goto L8f
        L85:
            java.lang.String r9 = "a"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L8e
            goto L62
        L8e:
            r4 = r5
        L8f:
            switch(r4) {
                case 0: goto La7;
                case 1: goto L9e;
                case 2: goto L9a;
                case 3: goto L96;
                default: goto L92;
            }
        L92:
            com.bytedance.adsdk.oa.yo.oa.bcc$uef r4 = com.bytedance.adsdk.oa.yo.oa.bcc.uef.MASK_MODE_ADD
            goto Lc
        L96:
            com.bytedance.adsdk.oa.yo.oa.bcc$uef r4 = com.bytedance.adsdk.oa.yo.oa.bcc.uef.MASK_MODE_SUBTRACT
            goto Lc
        L9a:
            com.bytedance.adsdk.oa.yo.oa.bcc$uef r4 = com.bytedance.adsdk.oa.yo.oa.bcc.uef.MASK_MODE_NONE
            goto Lc
        L9e:
            java.lang.String r4 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.uef(r4)
            com.bytedance.adsdk.oa.yo.oa.bcc$uef r4 = com.bytedance.adsdk.oa.yo.oa.bcc.uef.MASK_MODE_INTERSECT
            goto Lc
        La7:
            com.bytedance.adsdk.oa.yo.oa.bcc$uef r4 = com.bytedance.adsdk.oa.yo.oa.bcc.uef.MASK_MODE_ADD
            goto Lc
        Lab:
            boolean r8 = r11.nextBoolean()
            goto Lc
        Lb1:
            com.bytedance.adsdk.oa.yo.uef.bcc r6 = com.bytedance.adsdk.oa.lw.moa.lw(r11, r12)
            goto Lc
        Lb7:
            com.bytedance.adsdk.oa.yo.uef.moa r7 = com.bytedance.adsdk.oa.lw.moa.oa(r11, r12)
            goto Lc
        Lbd:
            r11.endObject()
            com.bytedance.adsdk.oa.yo.oa.bcc r11 = new com.bytedance.adsdk.oa.yo.oa.bcc
            r11.<init>(r4, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gsd.uef(android.util.JsonReader, com.bytedance.adsdk.oa.xs):com.bytedance.adsdk.oa.yo.oa.bcc");
    }
}
