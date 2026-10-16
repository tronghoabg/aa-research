package Va;

import android.media.MediaPlayer;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class Q9 extends G9 implements MediaPlayer.OnPreparedListener {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13633c = {'9', 'p', 'q', 'j', 'i', 'p', 'i', 'd', 'T', '[', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'X', 'd', 'k', 'i', 'h', 'j', 'k', 'a', '_', '^', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'F', '`', '[', 'W', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'I', 'G', 'n', '_', 'a', 'k', 'j', 'h', 'i', 'k', 'd'};

    /* renamed from: d, reason: collision with root package name */
    public static int f13634d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13635e = 1;

    /* renamed from: b, reason: collision with root package name */
    public P9 f13636b;

    public static String a(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13633c, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i5 = f13635e + 59;
        f13634d = i5 % 128;
        int i10 = i5 % 2;
        P9 p92 = this.f13636b;
        try {
        } catch (Throwable th) {
            Ab.a0(a("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{0, 27, 0, 0}, true).intern(), a("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{27, 31, 0, 0}, false).intern(), th, false);
        }
        if (i10 != 0) {
            p92.a(this, mediaPlayer);
            throw null;
        }
        p92.a(this, mediaPlayer);
        Object obj = this.f13381a;
        if (obj != null) {
            f13635e = (f13634d + 115) % 128;
            ((MediaPlayer.OnPreparedListener) obj).onPrepared(mediaPlayer);
        }
        f13634d = (f13635e + 95) % 128;
    }
}
