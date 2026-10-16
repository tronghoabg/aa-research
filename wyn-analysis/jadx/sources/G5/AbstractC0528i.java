package G5;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.t0;

/* renamed from: G5.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0528i {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f4415a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        C3406H c3406hI = AbstractC3409K.i();
        t0 it = C0529j.f4418e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f4415a)) {
                c3406hI.a(num);
            }
        }
        c3406hI.a(2);
        return S3.f.K(c3406hI.g());
    }

    public static int b(int i5, int i10) {
        for (int i11 = 8; i11 > 0; i11--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i5).setSampleRate(i10).setChannelMask(u6.v.k(i11)).build(), f4415a)) {
                return i11;
            }
        }
        return 0;
    }
}
