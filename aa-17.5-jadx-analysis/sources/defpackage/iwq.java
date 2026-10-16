package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class iwq extends iwk {
    public static final yph a = yph.c("CAR.VIDEO");
    protected final xyc b;
    protected int l;
    protected int m;
    protected int n;
    public int o;
    protected int p;
    protected int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public volatile Surface w;
    public final boolean x;
    public boolean y;
    private final String z;

    protected iwq(iwi iwiVar, boolean z, String str) {
        super("VIDEO", iwiVar);
        this.x = z;
        this.z = str;
        this.b = wub.L(new iwo(this));
    }

    public static final Bundle B(iuw iuwVar) {
        iwl iwlVar = new iwl();
        iwlVar.c(iuwVar.g);
        iwlVar.d(iuwVar.h);
        iwlVar.e(iuwVar.e);
        iwlVar.b(iuwVar.f);
        iwlVar.f((int) acyn.p());
        iwm iwmVarA = iwlVar.a();
        iwl iwlVar2 = new iwl();
        iwlVar2.c(0);
        iwlVar2.d(0);
        iwlVar2.e(iuwVar.b);
        iwlVar2.b(iuwVar.c);
        iwlVar2.f((int) acyn.q());
        yfq yfqVarR = yfq.r(iwmVarA, iwlVar2.a());
        yph yphVar = iwn.a;
        Bundle bundle = new Bundle();
        bundle.putString("qp-offset-rects", (String) Collection.EL.stream(yfqVarR).map(new ijt(13)).collect(Collectors.joining(";")));
        ((ype) iwn.a.l().ai((char) 1474)).y("ROI config: %s", bundle.getString("qp-offset-rects"));
        return bundle;
    }

    public static final int w(int i, int i2, int i3, int i4, double d, int i5, int i6, double d2) {
        int iMax = Math.max((int) ((((i * i2) - i3) * d) + i5), i6);
        return i4 == 60 ? (int) (iMax * d2) : iMax;
    }

    public static int y(List list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            if (rect == null) {
                ((ype) ((ype) a.h()).ai((char) 1477)).u("Cutout is null");
            } else {
                int iWidth = rect.width() * rect.height();
                if (iWidth < 0) {
                    ((ype) ((ype) a.h()).ai((char) 1476)).w("Cutout area is negative: %d", iWidth);
                } else {
                    i += iWidth;
                }
            }
        }
        return i;
    }

    public final void A(int i) {
        if (i == this.n) {
            ((ype) a.l().ai(1486)).K("%s codec already has the bitrate: %d", q(), i);
            return;
        }
        this.n = i;
        if (this.j == null) {
            ((ype) ((ype) a.h()).ai(1485)).w("An attempt to update codec bitrate %d when encoder is null", this.n);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("video-bitrate", this.n);
        try {
            MediaCodec mediaCodec = this.j;
            mediaCodec.getClass();
            mediaCodec.setParameters(bundle);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai(1484)).w("Failed to update video codec bitrate %d", this.n);
        }
    }

    @Override // defpackage.iwk
    public final int b() {
        return -10;
    }

    @Override // defpackage.iwk
    public final MediaCodec c() throws IOException {
        iwp iwpVar = (iwp) this.b.gu();
        iwpVar.getClass();
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(iwpVar.c);
        MediaFormat mediaFormatO = o();
        if (a.P()) {
            MediaCodecInfo codecInfo = mediaCodecCreateByCodecName.getCodecInfo();
            String str = this.z;
            yph yphVar = iwn.a;
            boolean zIsFeatureSupported = codecInfo.getCapabilitiesForType(str).isFeatureSupported("region-of-interest");
            this.y = zIsFeatureSupported;
            ((ype) a.l().ai((char) 1482)).y("ROI supported: %s", Boolean.valueOf(zIsFeatureSupported));
            if (this.y) {
                mediaFormatO.setFeatureEnabled("region-of-interest", true);
                iui iuiVar = new iui();
                iuiVar.c(this.l);
                iuiVar.b(this.m);
                iuiVar.g(this.r);
                iuiVar.d(this.s);
                iuiVar.e(this.t);
                iuiVar.f(this.u);
                mediaCodecCreateByCodecName.setParameters(B(iuiVar.a()));
            }
        }
        mediaCodecCreateByCodecName.configure(mediaFormatO, (Surface) null, (MediaCrypto) null, 1);
        this.w = mediaCodecCreateByCodecName.createInputSurface();
        mediaCodecCreateByCodecName.start();
        return mediaCodecCreateByCodecName;
    }

    @Override // defpackage.iwk
    protected final String e() {
        return "Video EncodingThread.";
    }

    @Override // defpackage.iwk
    public final void g(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        iwi iwiVar;
        if (bufferInfo.size == 0 || (iwiVar = this.k) == null) {
            return;
        }
        iwiVar.b(byteBuffer, bufferInfo);
    }

    @Override // defpackage.iwk
    public final void h() {
        MediaCodec mediaCodec = this.j;
        mediaCodec.getClass();
        mediaCodec.signalEndOfInputStream();
    }

    @Override // defpackage.iwk
    public final void i() {
        iwi iwiVar = this.k;
        if (iwiVar != null) {
            MediaCodec mediaCodec = this.j;
            mediaCodec.getClass();
            ivt ivtVar = (ivt) iwiVar;
            ivtVar.c = ivtVar.b.addTrack(mediaCodec.getOutputFormat());
        }
    }

    public abstract double j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    protected abstract int n();

    protected abstract MediaFormat o();

    protected abstract iwp p(MediaCodecInfo mediaCodecInfo);

    public abstract String q();

    public void r(iuw iuwVar, int i) {
        iwp iwpVar = (iwp) this.b.gu();
        int i2 = iuwVar.b;
        int i3 = iuwVar.c;
        int i4 = iuwVar.d;
        if (iwpVar != null && i2 * i3 > iwpVar.a) {
            throw new IllegalArgumentException(a.bB(i3, i2, "width ", " height ", " too big"));
        }
        if (iwpVar != null && i2 * i3 * i4 > iwpVar.a * iwpVar.b) {
            throw new IllegalArgumentException(a.bn(i4, "fps ", " too big"));
        }
        if (this.h) {
            throw new IllegalStateException("configure called while encoding is on-going");
        }
        this.l = i2;
        this.m = i3;
        this.r = iuwVar.e;
        this.s = iuwVar.f;
        this.t = iuwVar.g;
        this.u = iuwVar.h;
        this.v = y(iuwVar.p);
        this.o = i4;
        this.q = i;
        this.p = n();
        this.n = x();
        ((ype) a.l().ai(1475)).T("Configuring %s codec with width: %d height: %d bit rate: %d iframe interval: %d", q(), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.n), Integer.valueOf(this.q));
    }

    public abstract void s();

    @Override // defpackage.iwk
    public final synchronized void t() {
        Surface surface = this.w;
        if (surface != null) {
            surface.release();
        }
        super.t();
    }

    public final int x() {
        return w(this.r, this.s, this.v, this.o, k(), l(), m(), j());
    }

    public final iwp z() {
        iwp iwpVarP;
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (woy.at(str, this.z) && (iwpVarP = p(mediaCodecInfo)) != null) {
                        if (Build.VERSION.SDK_INT < 29) {
                            ((ype) ((ype) a.f()).ai(1481)).y("Checking hardware support is not supported; choosing codec %s", iwpVarP.c);
                            return iwpVarP;
                        }
                        if (!acyn.a.gu().w() || !mediaCodecInfo.isHardwareAccelerated()) {
                            ((ype) ((ype) a.f()).ai(1479)).y("Choosing codec %s", iwpVarP.c);
                            return iwpVarP;
                        }
                        ((ype) ((ype) a.f()).ai(1480)).y("Codec %s is hardware accelerated, but force software codec is enabled, so skipping", iwpVarP.c);
                    }
                }
            }
        }
        ((ype) ((ype) a.h()).ai((char) 1478)).u("No supported codec found");
        return null;
    }
}
