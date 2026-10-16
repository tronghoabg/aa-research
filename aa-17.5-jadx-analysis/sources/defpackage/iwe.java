package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class iwe extends iwq {
    private static final yph z = yph.c("CAR.VIDEO");

    public iwe(iwi iwiVar, boolean z2) {
        super(iwiVar, z2, "video/hevc");
    }

    @Override // defpackage.iwq
    public final double j() {
        return acyn.f();
    }

    @Override // defpackage.iwq
    public final double k() {
        return acyn.c();
    }

    @Override // defpackage.iwq
    public final int l() {
        return (int) acyn.i();
    }

    @Override // defpackage.iwq
    public final int m() {
        return (int) acyn.k();
    }

    @Override // defpackage.iwq
    protected final int n() {
        int iMax = Math.max(this.m, this.l);
        if (iMax == 3840) {
            return this.o > 30 ? 262144 : 65536;
        }
        if (iMax == 2560) {
            return this.o > 30 ? 262144 : 16384;
        }
        if (iMax == 1920) {
            return 4096;
        }
        return iMax != 1280 ? 256 : 1024;
    }

    @Override // defpackage.iwq
    protected final MediaFormat o() {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/hevc", this.l, this.m);
        mediaFormatCreateVideoFormat.setInteger("color-standard", 1);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.n);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.o);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.q);
        yph yphVar = z;
        ((ype) yphVar.l().ai(1454)).w("width is: %d", this.l);
        ((ype) yphVar.l().ai(1455)).w("fps is: %d", this.o);
        ((ype) yphVar.l().ai(1456)).w("level is: %d", this.p);
        iwp iwpVar = (iwp) this.b.gu();
        ((ype) yphVar.l().ai(1457)).y("codec name is: %s", iwpVar != null ? iwpVar.c : "");
        mediaFormatCreateVideoFormat.setInteger("profile", 1);
        mediaFormatCreateVideoFormat.setInteger("level", this.p);
        return mediaFormatCreateVideoFormat;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // defpackage.iwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.iwp p(android.media.MediaCodecInfo r13) {
        /*
            r12 = this;
            java.lang.String r12 = "video/hevc"
            android.media.MediaCodecInfo$CodecCapabilities r12 = r13.getCapabilitiesForType(r12)
            if (r12 != 0) goto La
            goto Lac
        La:
            iwp r0 = new iwp
            r0.<init>()
            android.media.MediaCodecInfo$CodecProfileLevel[] r1 = r12.profileLevels
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L14:
            r5 = 1
            if (r3 >= r2) goto L26
            r6 = r1[r3]
            int r7 = r6.profile
            if (r7 != r5) goto L23
            int r5 = r6.level
            if (r5 <= r4) goto L23
            int r4 = r6.level
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            if (r4 == 0) goto Lac
            if (r4 == r5) goto Lac
            r1 = 2
            if (r4 == r1) goto Lac
            r1 = 8912896(0x880000, float:1.2489627E-38)
            r2 = 60
            r3 = 2228224(0x220000, float:3.122407E-39)
            r5 = 30
            switch(r4) {
                case 4: goto Lac;
                case 8: goto Lac;
                case 16: goto Lac;
                case 32: goto Lac;
                case 64: goto L40;
                case 128: goto L40;
                case 256: goto L3d;
                case 512: goto L3d;
                case 1024: goto L3b;
                case 2048: goto L3b;
                case 4096: goto L39;
                case 8192: goto L39;
                case 16384: goto L43;
                case 32768: goto L43;
                default: goto L38;
            }
        L38:
            goto L44
        L39:
            r1 = r3
            goto L44
        L3b:
            r1 = r3
            goto L43
        L3d:
            r1 = 983040(0xf0000, float:1.377532E-39)
            goto L43
        L40:
            r1 = 552960(0x87000, float:7.74862E-40)
        L43:
            r2 = r5
        L44:
            r0.a = r1
            r0.b = r2
            java.lang.String r13 = r13.getName()
            r0.c = r13
            boolean r13 = defpackage.acyn.w()
            if (r13 == 0) goto L7b
            android.media.MediaCodecInfo$VideoCapabilities r12 = r12.getVideoCapabilities()
            r12.getClass()
            android.util.Range r13 = r12.getSupportedWidths()
            java.lang.Comparable r13 = r13.getUpper()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0.d = r13
            android.util.Range r12 = r12.getSupportedHeights()
            java.lang.Comparable r12 = r12.getUpper()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.e = r12
        L7b:
            yph r12 = defpackage.iwe.z
            yop r12 = r12.f()
            ype r12 = (defpackage.ype) r12
            r13 = 1453(0x5ad, float:2.036E-42)
            yop r12 = r12.ai(r13)
            r5 = r12
            ype r5 = (defpackage.ype) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            int r12 = r0.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            int r12 = r0.d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            int r12 = r0.e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.String r6 = "HEVC Level 0x%x fps %d pixel %d maxWidth %d maxHeight %d"
            r5.T(r6, r7, r8, r9, r10, r11)
            return r0
        Lac:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwe.p(android.media.MediaCodecInfo):iwp");
    }

    @Override // defpackage.iwq
    public final String q() {
        return "H265";
    }

    @Override // defpackage.iwq
    public final void s() {
    }
}
