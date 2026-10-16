package V5;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes3.dex */
public final class w implements v, d2.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13148b;

    /* renamed from: c, reason: collision with root package name */
    public MediaCodecInfo[] f13149c;

    public w(int i5, boolean z2, boolean z10) {
        this.f13147a = i5;
        switch (i5) {
            case 1:
                this.f13148b = (z2 || z10) ? 1 : 0;
                break;
            default:
                this.f13148b = (z2 || z10) ? 1 : 0;
                break;
        }
    }

    @Override // V5.v, d2.t
    public final MediaCodecInfo b(int i5) {
        switch (this.f13147a) {
            case 0:
                if (this.f13149c == null) {
                    this.f13149c = new MediaCodecList(this.f13148b).getCodecInfos();
                }
                break;
            default:
                if (this.f13149c == null) {
                    this.f13149c = new MediaCodecList(this.f13148b).getCodecInfos();
                }
                break;
        }
        return this.f13149c[i5];
    }

    @Override // V5.v, d2.t
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f13147a) {
        }
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // V5.v, d2.t
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f13147a) {
        }
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // V5.v, d2.t
    public final int e() {
        switch (this.f13147a) {
            case 0:
                if (this.f13149c == null) {
                    this.f13149c = new MediaCodecList(this.f13148b).getCodecInfos();
                }
                break;
            default:
                if (this.f13149c == null) {
                    this.f13149c = new MediaCodecList(this.f13148b).getCodecInfos();
                }
                break;
        }
        return this.f13149c.length;
    }

    @Override // V5.v, d2.t
    public final boolean g() {
        switch (this.f13147a) {
        }
        return true;
    }
}
