package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iwm extends defpackage.iwy {
    private static final defpackage.yqm z = defpackage.yqm.c("CAR.VIDEO");

    public iwm(iwq iwqVar, boolean z2) {
        super(iwqVar, z2, "video/hevc");
    }

    @Override // defpackage.iwy
    public final double j() {
        return defpackage.aczp.f();
    }

    @Override // defpackage.iwy
    public final double k() {
        return defpackage.aczp.c();
    }

    @Override // defpackage.iwy
    public final int l() {
        return (int) defpackage.aczp.i();
    }

    @Override // defpackage.iwy
    public final int m() {
        return (int) defpackage.aczp.k();
    }

    @Override // defpackage.iwy
    protected final int n() {
        int iMax = java.lang.Math.max(this.m, this.l);
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

    @Override // defpackage.iwy
    protected final android.media.MediaFormat o() {
        android.media.MediaFormat mediaFormatCreateVideoFormat = android.media.MediaFormat.createVideoFormat("video/hevc", this.l, this.m);
        mediaFormatCreateVideoFormat.setInteger("color-standard", 1);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.n);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.o);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.q);
        defpackage.yqm yqmVar = z;
        ((defpackage.yqj) yqmVar.l().ai(1454)).w("width is: %d", this.l);
        ((defpackage.yqj) yqmVar.l().ai(1455)).w("fps is: %d", this.o);
        ((defpackage.yqj) yqmVar.l().ai(1456)).w("level is: %d", this.p);
        defpackage.iwx iwxVar = (defpackage.iwx) this.b.fF();
        ((defpackage.yqj) yqmVar.l().ai(1457)).y("codec name is: %s", iwxVar != null ? iwxVar.c : "");
        mediaFormatCreateVideoFormat.setInteger("profile", 1);
        mediaFormatCreateVideoFormat.setInteger("level", this.p);
        return mediaFormatCreateVideoFormat;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // defpackage.iwy
    protected final defpackage.iwx p(android.media.MediaCodecInfo mediaCodecInfo) {
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc");
        if (capabilitiesForType == null) {
            return null;
        }
        defpackage.iwx iwxVar = new defpackage.iwx();
        int i = 0;
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
            if (codecProfileLevel.profile == 1 && codecProfileLevel.level > i) {
                i = codecProfileLevel.level;
            }
        }
        if (i == 0 || i == 1 || i == 2) {
            return null;
        }
        int i2 = 8912896;
        int i3 = 60;
        switch (i) {
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
            case 16:
            case 32:
                return null;
            case 64:
            case 128:
                i2 = 552960;
                i3 = 30;
                iwxVar.a = i2;
                iwxVar.b = i3;
                iwxVar.c = mediaCodecInfo.getName();
                if (defpackage.aczp.w()) {
                    android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                    videoCapabilities.getClass();
                    iwxVar.d = ((java.lang.Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                    iwxVar.e = ((java.lang.Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                }
                ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1453)).T("HEVC Level 0x%x fps %d pixel %d maxWidth %d maxHeight %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iwxVar.b), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar.d), java.lang.Integer.valueOf(iwxVar.e));
                return iwxVar;
            case 256:
            case 512:
                i2 = 983040;
                i3 = 30;
                iwxVar.a = i2;
                iwxVar.b = i3;
                iwxVar.c = mediaCodecInfo.getName();
                if (defpackage.aczp.w()) {
                    android.media.MediaCodecInfo.VideoCapabilities videoCapabilities2 = capabilitiesForType.getVideoCapabilities();
                    videoCapabilities2.getClass();
                    iwxVar.d = ((java.lang.Integer) videoCapabilities2.getSupportedWidths().getUpper()).intValue();
                    iwxVar.e = ((java.lang.Integer) videoCapabilities2.getSupportedHeights().getUpper()).intValue();
                }
                ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1453)).T("HEVC Level 0x%x fps %d pixel %d maxWidth %d maxHeight %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iwxVar.b), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar.d), java.lang.Integer.valueOf(iwxVar.e));
                return iwxVar;
            case 1024:
            case 2048:
                i2 = 2228224;
                i3 = 30;
                iwxVar.a = i2;
                iwxVar.b = i3;
                iwxVar.c = mediaCodecInfo.getName();
                if (defpackage.aczp.w()) {
                    android.media.MediaCodecInfo.VideoCapabilities videoCapabilities3 = capabilitiesForType.getVideoCapabilities();
                    videoCapabilities3.getClass();
                    iwxVar.d = ((java.lang.Integer) videoCapabilities3.getSupportedWidths().getUpper()).intValue();
                    iwxVar.e = ((java.lang.Integer) videoCapabilities3.getSupportedHeights().getUpper()).intValue();
                }
                ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1453)).T("HEVC Level 0x%x fps %d pixel %d maxWidth %d maxHeight %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iwxVar.b), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar.d), java.lang.Integer.valueOf(iwxVar.e));
                return iwxVar;
            case 4096:
            case 8192:
                i2 = 2228224;
                iwxVar.a = i2;
                iwxVar.b = i3;
                iwxVar.c = mediaCodecInfo.getName();
                if (defpackage.aczp.w()) {
                    android.media.MediaCodecInfo.VideoCapabilities videoCapabilities4 = capabilitiesForType.getVideoCapabilities();
                    videoCapabilities4.getClass();
                    iwxVar.d = ((java.lang.Integer) videoCapabilities4.getSupportedWidths().getUpper()).intValue();
                    iwxVar.e = ((java.lang.Integer) videoCapabilities4.getSupportedHeights().getUpper()).intValue();
                }
                ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1453)).T("HEVC Level 0x%x fps %d pixel %d maxWidth %d maxHeight %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iwxVar.b), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar.d), java.lang.Integer.valueOf(iwxVar.e));
                return iwxVar;
            case 16384:
            case 32768:
                i3 = 30;
                iwxVar.a = i2;
                iwxVar.b = i3;
                iwxVar.c = mediaCodecInfo.getName();
                if (defpackage.aczp.w()) {
                    android.media.MediaCodecInfo.VideoCapabilities videoCapabilities5 = capabilitiesForType.getVideoCapabilities();
                    videoCapabilities5.getClass();
                    iwxVar.d = ((java.lang.Integer) videoCapabilities5.getSupportedWidths().getUpper()).intValue();
                    iwxVar.e = ((java.lang.Integer) videoCapabilities5.getSupportedHeights().getUpper()).intValue();
                }
                ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1453)).T("HEVC Level 0x%x fps %d pixel %d maxWidth %d maxHeight %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iwxVar.b), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar.d), java.lang.Integer.valueOf(iwxVar.e));
                return iwxVar;
            default:
                iwxVar.a = i2;
                iwxVar.b = i3;
                iwxVar.c = mediaCodecInfo.getName();
                if (defpackage.aczp.w()) {
                    android.media.MediaCodecInfo.VideoCapabilities videoCapabilities6 = capabilitiesForType.getVideoCapabilities();
                    videoCapabilities6.getClass();
                    iwxVar.d = ((java.lang.Integer) videoCapabilities6.getSupportedWidths().getUpper()).intValue();
                    iwxVar.e = ((java.lang.Integer) videoCapabilities6.getSupportedHeights().getUpper()).intValue();
                }
                ((defpackage.yqj) ((defpackage.yqj) z.f()).ai(1453)).T("HEVC Level 0x%x fps %d pixel %d maxWidth %d maxHeight %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iwxVar.b), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iwxVar.d), java.lang.Integer.valueOf(iwxVar.e));
                return iwxVar;
        }
    }

    @Override // defpackage.iwy
    public final java.lang.String q() {
        return "H265";
    }

    @Override // defpackage.iwy
    public final void s() {
    }
}
