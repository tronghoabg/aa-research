package W1;

import N1.C0754c;
import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f15098a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final u f15099b = new u();

    public static AudioAttributes b(C0754c c0754c, boolean z2) {
        return z2 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c0754c.a().f48001b;
    }

    public static int c(int i5) {
        if (i5 == 20) {
            return 63750;
        }
        if (i5 == 30) {
            return 2250000;
        }
        switch (i5) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i5) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public AudioTrack a(g gVar, C0754c c0754c, int i5) {
        int i10 = Q1.x.f9724a;
        boolean z2 = gVar.f14960a;
        int i11 = gVar.f14961b;
        int i12 = gVar.f14964e;
        int i13 = gVar.f14962c;
        if (i10 < 23) {
            return new AudioTrack(b(c0754c, z2), Q1.x.p(i13, i12, i11), gVar.f14965f, 1, i5);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(c0754c, z2)).setAudioFormat(Q1.x.p(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(gVar.f14965f).setSessionId(i5);
        if (i10 >= 29) {
            sessionId.setOffloadedPlayback(gVar.f14963d);
        }
        return sessionId.build();
    }
}
