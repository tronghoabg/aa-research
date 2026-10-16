package Va;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;

/* loaded from: classes4.dex */
public final class U9 extends G9 implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public T9 f13757b;

    public static String a(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 9950)) ^ ((c11 >>> 5) + 17407)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 47709) ^ ((c12 + i11) ^ ((c12 << 4) + 6734))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.f13757b.a(this, mediaPlayer);
        } catch (Throwable th) {
            Ab.a0(a("튽窣塹㌷홍໗⋢晖礷宰ю芛텫腹犢䈧䖑唳팢\ud89c\ue8c6첩픙㳩⩙⚜\u128f\uf688凞᮴꽖\ud81d", 31 - (Process.myPid() >> 22)).intern(), a("뎏桱慔䫺꼌ꬰŃ좈Ｎ᧣雛㧫犢䈧䖑唳팢\ud89c\ue8c6첩蓑愀㳻粎ᮃ㺥秳\uf6df荍뒽䨧錜ꎵ鏷唄᳚", 35 - Color.green(0)).intern(), th, false);
        }
        Object obj = this.f13381a;
        if (obj != null) {
            ((MediaPlayer.OnSeekCompleteListener) obj).onSeekComplete(mediaPlayer);
        }
    }
}
