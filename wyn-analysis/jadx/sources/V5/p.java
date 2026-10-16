package V5;

import E5.T;

/* loaded from: classes3.dex */
public final class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f13069a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13070b;

    /* renamed from: c, reason: collision with root package name */
    public final n f13071c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13072d;

    public p(T t10, u uVar, boolean z2, int i5) {
        this("Decoder init failed: [" + i5 + "], " + t10, uVar, t10.f3238l, z2, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i5 < 0 ? "neg_" : "") + Math.abs(i5));
    }

    public p(String str, Throwable th, String str2, boolean z2, n nVar, String str3) {
        super(str, th);
        this.f13069a = str2;
        this.f13070b = z2;
        this.f13071c = nVar;
        this.f13072d = str3;
    }
}
