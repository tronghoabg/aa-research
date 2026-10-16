package d2;

import N1.C0765n;

/* loaded from: classes.dex */
public final class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f34001a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34002b;

    /* renamed from: c, reason: collision with root package name */
    public final m f34003c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34004d;

    public o(C0765n c0765n, s sVar, boolean z2, int i5) {
        this("Decoder init failed: [" + i5 + "], " + c0765n, sVar, c0765n.f8232n, z2, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i5 < 0 ? "neg_" : "") + Math.abs(i5));
    }

    public o(String str, Throwable th, String str2, boolean z2, m mVar, String str3) {
        super(str, th);
        this.f34001a = str2;
        this.f34002b = z2;
        this.f34003c = mVar;
        this.f34004d = str3;
    }
}
