package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iwl extends defpackage.iwy {
    private static final defpackage.yqm z = defpackage.yqm.c("CAR.VIDEO");
    private volatile int A;
    private volatile int B;

    public iwl(iwq iwqVar, boolean z2) {
        super(iwqVar, z2, "video/avc");
        this.A = 0;
        this.B = 0;
    }

    @Override // defpackage.iws
    public final void f(android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        while (iLimit > 3) {
            int i = iLimit - 1;
            if (byteBuffer.get(i) != 0) {
                break;
            } else {
                iLimit = i;
            }
        }
        byteBuffer.limit(iLimit);
    }

    @Override // defpackage.iwy
    public final double j() {
        return defpackage.aczp.a.fF().d();
    }

    @Override // defpackage.iwy
    public final double k() {
        return defpackage.aczp.a.fF().a();
    }

    @Override // defpackage.iwy
    public final int l() {
        return (int) defpackage.aczp.a.fF().g();
    }

    @Override // defpackage.iwy
    public final int m() {
        return (int) defpackage.aczp.a.fF().i();
    }

    @Override // defpackage.iwy
    protected final int n() {
        int iMax = java.lang.Math.max(this.m, this.l);
        if (iMax == 3840) {
            return this.o > 30 ? 65536 : 32768;
        }
        if (iMax == 2560) {
            return this.o > 30 ? 65536 : 16384;
        }
        if (iMax == 1920) {
            return this.o > 30 ? 8192 : 2048;
        }
        return (iMax != 1280 || this.o <= 30) ? 512 : 1024;
    }

    @Override // defpackage.iwy
    protected final android.media.MediaFormat o() {
        android.media.MediaFormat mediaFormatCreateVideoFormat = android.media.MediaFormat.createVideoFormat("video/avc", this.l, this.m);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.n);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.o);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.q);
        defpackage.aczp aczpVar = defpackage.aczp.a;
        int i = 65536;
        if (!aczpVar.fF().s() && !aczpVar.fF().r()) {
            i = 1;
        }
        defpackage.yqm yqmVar = z;
        ((defpackage.yqj) yqmVar.l().ai(1449)).w("Setting profile level to: %d", i);
        mediaFormatCreateVideoFormat.setInteger("profile", i);
        mediaFormatCreateVideoFormat.setInteger("level", this.p);
        if (this.A > 0 && this.B > 0) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                ((defpackage.yqj) yqmVar.l().ai((char) 1451)).u("Setting MediaFormat QP values");
                mediaFormatCreateVideoFormat.setInteger("video-qp-min", this.A);
                mediaFormatCreateVideoFormat.setInteger("video-qp-max", this.B);
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 1450)).u("Setting vendor-specific QP values");
            mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", this.A);
            mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", this.B);
            mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", this.A);
            mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", this.B);
            mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-b-min", this.A);
            mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-b-max", this.B);
            mediaFormatCreateVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.I-minQP", this.A);
            mediaFormatCreateVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.I-maxQP", this.B);
            mediaFormatCreateVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.P-minQP", this.A);
            mediaFormatCreateVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.P-maxQP", this.B);
            mediaFormatCreateVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.B-minQP", this.A);
            mediaFormatCreateVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.B-maxQP", this.B);
        }
        return mediaFormatCreateVideoFormat;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.iwy
    protected final defpackage.iwx p(android.media.MediaCodecInfo mediaCodecInfo) {
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        defpackage.iwx iwxVar = null;
        if (capabilitiesForType == null) {
            return null;
        }
        defpackage.aczp aczpVar = defpackage.aczp.a;
        int i = true != aczpVar.fF().r() ? 1 : 65536;
        int i2 = 0;
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
            if (codecProfileLevel.profile == i && codecProfileLevel.level > i2) {
                i2 = codecProfileLevel.level;
            }
        }
        java.lang.String name = mediaCodecInfo.getName();
        defpackage.iwx iwxVar2 = new defpackage.iwx();
        if (i2 != 1 && i2 != 2) {
            int i3 = 8294400;
            int i4 = 60;
            switch (i2) {
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                case 16:
                case 32:
                case 64:
                case 128:
                case 256:
                    break;
                case 512:
                    i3 = 921600;
                    i4 = 30;
                    iwxVar2.a = i3;
                    iwxVar2.b = i4;
                    iwxVar2.c = name;
                    ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar2.b), java.lang.Integer.valueOf(i3));
                    iwxVar = iwxVar2;
                    break;
                case 1024:
                    i3 = 921600;
                    iwxVar2.a = i3;
                    iwxVar2.b = i4;
                    iwxVar2.c = name;
                    ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar2.b), java.lang.Integer.valueOf(i3));
                    iwxVar = iwxVar2;
                    break;
                case 2048:
                case 4096:
                    i3 = 2073600;
                    i4 = 30;
                    iwxVar2.a = i3;
                    iwxVar2.b = i4;
                    iwxVar2.c = name;
                    ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar2.b), java.lang.Integer.valueOf(i3));
                    iwxVar = iwxVar2;
                    break;
                case 8192:
                    i3 = 2073600;
                    iwxVar2.a = i3;
                    iwxVar2.b = i4;
                    iwxVar2.c = name;
                    ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar2.b), java.lang.Integer.valueOf(i3));
                    iwxVar = iwxVar2;
                    break;
                case 16384:
                    i3 = 4915200;
                    i4 = 30;
                    iwxVar2.a = i3;
                    iwxVar2.b = i4;
                    iwxVar2.c = name;
                    ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar2.b), java.lang.Integer.valueOf(i3));
                    iwxVar = iwxVar2;
                    break;
                case 32768:
                    i4 = 30;
                    iwxVar2.a = i3;
                    iwxVar2.b = i4;
                    iwxVar2.c = name;
                    ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar2.b), java.lang.Integer.valueOf(i3));
                    iwxVar = iwxVar2;
                    break;
                default:
                    iwxVar2.a = i3;
                    iwxVar2.b = i4;
                    iwxVar2.c = name;
                    ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar2.b), java.lang.Integer.valueOf(i3));
                    iwxVar = iwxVar2;
                    break;
            }
        }
        if (aczpVar.fF().u() && iwxVar != null) {
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            videoCapabilities.getClass();
            iwxVar.d = ((java.lang.Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
            iwxVar.e = ((java.lang.Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
        }
        return iwxVar;
    }

    @Override // defpackage.iwy
    public final java.lang.String q() {
        return "H264";
    }

    @Override // defpackage.iwy
    public final void r(defpackage.ive iveVar, int i) {
        defpackage.aczp aczpVar = defpackage.aczp.a;
        this.A = (int) aczpVar.fF().n();
        this.B = (int) aczpVar.fF().m();
        super.r(iveVar, i);
    }

    @Override // defpackage.iwy
    public final void s() {
    }
}
