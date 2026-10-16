package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class iwy extends defpackage.iws {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.VIDEO");
    protected final defpackage.xzi b;
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
    public volatile android.view.Surface w;
    public final boolean x;
    public boolean y;
    private final java.lang.String z;

    protected iwy(iwq iwqVar, boolean z, java.lang.String str) {
        super("VIDEO", iwqVar);
        this.x = z;
        this.z = str;
        this.b = defpackage.ysr.aQ(new defpackage.iww(this));
    }

    public static final android.os.Bundle B(defpackage.ive iveVar) {
        iwt iwtVar = new iwt();
        iwtVar.c(iveVar.g);
        iwtVar.d(iveVar.h);
        iwtVar.e(iveVar.e);
        iwtVar.b(iveVar.f);
        iwtVar.f((int) defpackage.aczp.p());
        iwu iwuVarA = iwtVar.a();
        iwt iwtVar2 = new iwt();
        iwtVar2.c(0);
        iwtVar2.d(0);
        iwtVar2.e(iveVar.b);
        iwtVar2.b(iveVar.c);
        iwtVar2.f((int) defpackage.aczp.q());
        defpackage.ygw ygwVarR = defpackage.ygw.r(iwuVarA, iwtVar2.a());
        defpackage.yqm yqmVar = iwv.a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("qp-offset-rects", (java.lang.String) j$.util.Collection.-EL.stream(ygwVarR).map(new defpackage.ikc(13)).collect(j$.util.stream.Collectors.joining(";")));
        ((defpackage.yqj) iwv.a.l().ai((char) 1474)).y("ROI config: %s", bundle.getString("qp-offset-rects"));
        return bundle;
    }

    public static final int w(int i, int i2, int i3, int i4, double d, int i5, int i6, double d2) {
        int iMax = java.lang.Math.max((int) ((((double) ((i * i2) - i3)) * d) + ((double) i5)), i6);
        return i4 == 60 ? (int) (((double) iMax) * d2) : iMax;
    }

    public static int y(java.util.List list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.graphics.Rect rect = (android.graphics.Rect) it.next();
            if (rect == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1477)).u("Cutout is null");
            } else {
                int iWidth = rect.width() * rect.height();
                if (iWidth < 0) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1476)).w("Cutout area is negative: %d", iWidth);
                } else {
                    i += iWidth;
                }
            }
        }
        return i;
    }

    public final void A(int i) {
        if (i == this.n) {
            ((defpackage.yqj) a.l().ai(1486)).K("%s codec already has the bitrate: %d", q(), i);
            return;
        }
        this.n = i;
        if (this.j == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1485)).w("An attempt to update codec bitrate %d when encoder is null", this.n);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("video-bitrate", this.n);
        try {
            android.media.MediaCodec mediaCodec = this.j;
            mediaCodec.getClass();
            mediaCodec.setParameters(bundle);
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai(1484)).w("Failed to update video codec bitrate %d", this.n);
        }
    }

    @Override // defpackage.iws
    public final int b() {
        return -10;
    }

    @Override // defpackage.iws
    public final android.media.MediaCodec c() throws java.io.IOException {
        defpackage.iwx iwxVar = (defpackage.iwx) this.b.fF();
        iwxVar.getClass();
        android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(iwxVar.c);
        android.media.MediaFormat mediaFormatO = o();
        if (defpackage.a.O()) {
            android.media.MediaCodecInfo codecInfo = mediaCodecCreateByCodecName.getCodecInfo();
            java.lang.String str = this.z;
            defpackage.yqm yqmVar = iwv.a;
            boolean zIsFeatureSupported = codecInfo.getCapabilitiesForType(str).isFeatureSupported("region-of-interest");
            this.y = zIsFeatureSupported;
            ((defpackage.yqj) a.l().ai((char) 1482)).y("ROI supported: %s", java.lang.Boolean.valueOf(zIsFeatureSupported));
            if (this.y) {
                mediaFormatO.setFeatureEnabled("region-of-interest", true);
                defpackage.iuq iuqVar = new defpackage.iuq();
                iuqVar.c(this.l);
                iuqVar.b(this.m);
                iuqVar.g(this.r);
                iuqVar.d(this.s);
                iuqVar.e(this.t);
                iuqVar.f(this.u);
                mediaCodecCreateByCodecName.setParameters(B(iuqVar.a()));
            }
        }
        mediaCodecCreateByCodecName.configure(mediaFormatO, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        this.w = mediaCodecCreateByCodecName.createInputSurface();
        mediaCodecCreateByCodecName.start();
        return mediaCodecCreateByCodecName;
    }

    @Override // defpackage.iws
    protected final java.lang.String e() {
        return "Video EncodingThread.";
    }

    @Override // defpackage.iws
    public final void g(android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer) {
        iwq iwqVar;
        if (bufferInfo.size == 0 || (iwqVar = this.k) == null) {
            return;
        }
        iwqVar.b(byteBuffer, bufferInfo);
    }

    @Override // defpackage.iws
    public final void h() {
        android.media.MediaCodec mediaCodec = this.j;
        mediaCodec.getClass();
        mediaCodec.signalEndOfInputStream();
    }

    @Override // defpackage.iws
    public final void i() {
        iwb iwbVar = this.k;
        if (iwbVar != null) {
            android.media.MediaCodec mediaCodec = this.j;
            mediaCodec.getClass();
            iwb iwbVar2 = iwbVar;
            iwbVar2.c = iwbVar2.b.addTrack(mediaCodec.getOutputFormat());
        }
    }

    public abstract double j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    protected abstract int n();

    protected abstract android.media.MediaFormat o();

    protected abstract defpackage.iwx p(android.media.MediaCodecInfo mediaCodecInfo);

    public abstract java.lang.String q();

    public void r(defpackage.ive iveVar, int i) {
        defpackage.iwx iwxVar = (defpackage.iwx) this.b.fF();
        int i2 = iveVar.b;
        int i3 = iveVar.c;
        int i4 = iveVar.d;
        if (iwxVar != null && i2 * i3 > iwxVar.a) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(i3, i2, "width ", " height ", " too big"));
        }
        if (iwxVar != null && i2 * i3 * i4 > iwxVar.a * iwxVar.b) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(i4, "fps ", " too big"));
        }
        if (this.h) {
            throw new java.lang.IllegalStateException("configure called while encoding is on-going");
        }
        this.l = i2;
        this.m = i3;
        this.r = iveVar.e;
        this.s = iveVar.f;
        this.t = iveVar.g;
        this.u = iveVar.h;
        this.v = y(iveVar.p);
        this.o = i4;
        this.q = i;
        this.p = n();
        this.n = x();
        ((defpackage.yqj) a.l().ai(1475)).T("Configuring %s codec with width: %d height: %d bit rate: %d iframe interval: %d", q(), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(this.n), java.lang.Integer.valueOf(this.q));
    }

    public abstract void s();

    @Override // defpackage.iws
    public final synchronized void t() {
        android.view.Surface surface = this.w;
        if (surface != null) {
            surface.release();
        }
        super.t();
    }

    public final int x() {
        return w(this.r, this.s, this.v, this.o, k(), l(), m(), j());
    }

    public final defpackage.iwx z() {
        defpackage.iwx iwxVarP;
        for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                    if (defpackage.ysr.bD(str, this.z) && (iwxVarP = p(mediaCodecInfo)) != null) {
                        if (android.os.Build.VERSION.SDK_INT < 29) {
                            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1481)).y("Checking hardware support is not supported; choosing codec %s", iwxVarP.c);
                            return iwxVarP;
                        }
                        if (!defpackage.aczp.a.fF().w() || !ep$.ExternalSyntheticApiModelOutline0.m(mediaCodecInfo)) {
                            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1479)).y("Choosing codec %s", iwxVarP.c);
                            return iwxVarP;
                        }
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1480)).y("Codec %s is hardware accelerated, but force software codec is enabled, so skipping", iwxVarP.c);
                    }
                }
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1478)).u("No supported codec found");
        return null;
    }
}
