package G5;

import E5.T;
import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final T f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4242c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4244e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4245f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4246g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4247h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0532m[] f4248i;

    public D(T t10, int i5, int i10, int i11, int i12, int i13, int i14, int i15, InterfaceC0532m[] interfaceC0532mArr) {
        this.f4240a = t10;
        this.f4241b = i5;
        this.f4242c = i10;
        this.f4243d = i11;
        this.f4244e = i12;
        this.f4245f = i13;
        this.f4246g = i14;
        this.f4247h = i15;
        this.f4248i = interfaceC0532mArr;
    }

    public static AudioAttributes c(C0527h c0527h, boolean z2) {
        return z2 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c0527h.a().f152b;
    }

    public final AudioTrack a(boolean z2, C0527h c0527h, int i5) throws r {
        int i10 = this.f4242c;
        try {
            AudioTrack audioTrackB = b(z2, c0527h, i5);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new r(state, this.f4244e, this.f4245f, this.f4247h, this.f4240a, i10 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new r(0, this.f4244e, this.f4245f, this.f4247h, this.f4240a, i10 == 1, e7);
        }
    }

    public final AudioTrack b(boolean z2, C0527h c0527h, int i5) {
        int i10 = u6.v.f46721a;
        int i11 = this.f4246g;
        int i12 = this.f4245f;
        int i13 = this.f4244e;
        if (i10 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(c0527h, z2)).setAudioFormat(G.e(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(this.f4247h).setSessionId(i5).setOffloadedPlayback(this.f4242c == 1).build();
        }
        if (i10 >= 21) {
            return new AudioTrack(c(c0527h, z2), G.e(i13, i12, i11), this.f4247h, 1, i5);
        }
        int iQ = u6.v.q(c0527h.f4411c);
        if (i5 == 0) {
            return new AudioTrack(iQ, this.f4244e, this.f4245f, this.f4246g, this.f4247h, 1);
        }
        return new AudioTrack(iQ, this.f4244e, this.f4245f, this.f4246g, this.f4247h, 1, i5);
    }
}
