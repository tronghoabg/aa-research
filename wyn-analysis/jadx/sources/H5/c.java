package H5;

import Q1.x;
import android.media.MediaCodec;
import u6.v;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4894a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4895b;

    /* renamed from: c, reason: collision with root package name */
    public int f4896c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4897d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f4898e;

    /* renamed from: f, reason: collision with root package name */
    public int f4899f;

    /* renamed from: g, reason: collision with root package name */
    public int f4900g;

    /* renamed from: h, reason: collision with root package name */
    public int f4901h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f4902i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4903j;

    public c(int i5) {
        switch (i5) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.f4902i = cryptoInfo;
                this.f4903j = x.f9724a >= 24 ? new S3.e(cryptoInfo) : null;
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.f4902i = cryptoInfo2;
                this.f4903j = v.f46721a >= 24 ? new S3.c(cryptoInfo2) : null;
                break;
        }
    }
}
