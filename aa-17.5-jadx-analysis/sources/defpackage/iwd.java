package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import androidx.car.app.hardware.common.CarZone;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class iwd extends iwq {
    private static final yph z = yph.c("CAR.VIDEO");
    private volatile int A;
    private volatile int B;

    public iwd(iwi iwiVar, boolean z2) {
        super(iwiVar, z2, "video/avc");
        this.A = 0;
        this.B = 0;
    }

    @Override // defpackage.iwk
    public final void f(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
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

    @Override // defpackage.iwq
    public final double j() {
        return acyn.a.gu().d();
    }

    @Override // defpackage.iwq
    public final double k() {
        return acyn.a.gu().a();
    }

    @Override // defpackage.iwq
    public final int l() {
        return (int) acyn.a.gu().g();
    }

    @Override // defpackage.iwq
    public final int m() {
        return (int) acyn.a.gu().i();
    }

    @Override // defpackage.iwq
    protected final int n() {
        int iMax = Math.max(this.m, this.l);
        if (iMax == 3840) {
            return this.o > 30 ? 65536 : 32768;
        }
        if (iMax == 2560) {
            return this.o > 30 ? 65536 : 16384;
        }
        if (iMax == 1920) {
            return this.o > 30 ? 8192 : 2048;
        }
        if (iMax != 1280 || this.o <= 30) {
            return sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
        return 1024;
    }

    @Override // defpackage.iwq
    protected final MediaFormat o() {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.l, this.m);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.n);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.o);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.q);
        acyn acynVar = acyn.a;
        int i = 65536;
        if (!acynVar.gu().s() && !acynVar.gu().r()) {
            i = 1;
        }
        yph yphVar = z;
        ((ype) yphVar.l().ai(1449)).w("Setting profile level to: %d", i);
        mediaFormatCreateVideoFormat.setInteger("profile", i);
        mediaFormatCreateVideoFormat.setInteger("level", this.p);
        if (this.A > 0 && this.B > 0) {
            if (Build.VERSION.SDK_INT >= 31) {
                ((ype) yphVar.l().ai((char) 1451)).u("Setting MediaFormat QP values");
                mediaFormatCreateVideoFormat.setInteger("video-qp-min", this.A);
                mediaFormatCreateVideoFormat.setInteger("video-qp-max", this.B);
            }
            ((ype) yphVar.l().ai((char) 1450)).u("Setting vendor-specific QP values");
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
    @Override // defpackage.iwq
    protected final iwp p(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        iwp iwpVar = null;
        if (capabilitiesForType == null) {
            return null;
        }
        acyn acynVar = acyn.a;
        int i = true != acynVar.gu().r() ? 1 : 65536;
        int i2 = 0;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
            if (codecProfileLevel.profile == i && codecProfileLevel.level > i2) {
                i2 = codecProfileLevel.level;
            }
        }
        String name = mediaCodecInfo.getName();
        iwp iwpVar2 = new iwp();
        if (i2 != 1 && i2 != 2) {
            int i3 = 8294400;
            int i4 = 60;
            switch (i2) {
                case 4:
                case 8:
                case 16:
                case 32:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 128:
                case 256:
                    break;
                case sk.AUDIO_CONTENT_BUFFER_SIZE /* 512 */:
                    i3 = 921600;
                    i4 = 30;
                    iwpVar2.a = i3;
                    iwpVar2.b = i4;
                    iwpVar2.c = name;
                    ((ype) ((ype) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", Integer.valueOf(i2), Integer.valueOf(iwpVar2.b), Integer.valueOf(i3));
                    iwpVar = iwpVar2;
                    break;
                case 1024:
                    i3 = 921600;
                    iwpVar2.a = i3;
                    iwpVar2.b = i4;
                    iwpVar2.c = name;
                    ((ype) ((ype) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", Integer.valueOf(i2), Integer.valueOf(iwpVar2.b), Integer.valueOf(i3));
                    iwpVar = iwpVar2;
                    break;
                case 2048:
                case 4096:
                    i3 = 2073600;
                    i4 = 30;
                    iwpVar2.a = i3;
                    iwpVar2.b = i4;
                    iwpVar2.c = name;
                    ((ype) ((ype) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", Integer.valueOf(i2), Integer.valueOf(iwpVar2.b), Integer.valueOf(i3));
                    iwpVar = iwpVar2;
                    break;
                case 8192:
                    i3 = 2073600;
                    iwpVar2.a = i3;
                    iwpVar2.b = i4;
                    iwpVar2.c = name;
                    ((ype) ((ype) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", Integer.valueOf(i2), Integer.valueOf(iwpVar2.b), Integer.valueOf(i3));
                    iwpVar = iwpVar2;
                    break;
                case 16384:
                    i3 = 4915200;
                    i4 = 30;
                    iwpVar2.a = i3;
                    iwpVar2.b = i4;
                    iwpVar2.c = name;
                    ((ype) ((ype) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", Integer.valueOf(i2), Integer.valueOf(iwpVar2.b), Integer.valueOf(i3));
                    iwpVar = iwpVar2;
                    break;
                case 32768:
                    i4 = 30;
                    iwpVar2.a = i3;
                    iwpVar2.b = i4;
                    iwpVar2.c = name;
                    ((ype) ((ype) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", Integer.valueOf(i2), Integer.valueOf(iwpVar2.b), Integer.valueOf(i3));
                    iwpVar = iwpVar2;
                    break;
                default:
                    iwpVar2.a = i3;
                    iwpVar2.b = i4;
                    iwpVar2.c = name;
                    ((ype) ((ype) z.f()).ai(1452)).R("AVC Level 0x%x fps %d pixel %d", Integer.valueOf(i2), Integer.valueOf(iwpVar2.b), Integer.valueOf(i3));
                    iwpVar = iwpVar2;
                    break;
            }
        }
        if (acynVar.gu().u() && iwpVar != null) {
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            videoCapabilities.getClass();
            iwpVar.d = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
            iwpVar.e = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
        }
        return iwpVar;
    }

    @Override // defpackage.iwq
    public final String q() {
        return "H264";
    }

    @Override // defpackage.iwq
    public final void r(iuw iuwVar, int i) {
        acyn acynVar = acyn.a;
        this.A = (int) acynVar.gu().n();
        this.B = (int) acynVar.gu().m();
        super.r(iuwVar, i);
    }

    @Override // defpackage.iwq
    public final void s() {
    }
}
