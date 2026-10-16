package Va;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class M9 extends G9 implements MediaPlayer.OnInfoListener {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13531c = {215, 246, 209, 238, 247, 212, 241, 251, 252, 237, 250, 204, 235, 233, 205, 168, 245, 220, 234};

    /* renamed from: b, reason: collision with root package name */
    public L9 f13532b;

    public static String a(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13531c;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 136);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i5, int i10) {
        try {
            this.f13532b.a(this, mediaPlayer, i5, i10);
        } catch (Throwable th) {
            Ab.a0(a(TextUtils.lastIndexOf("", '0', 0) + 128, "\u008b\u0085\u0089\u008e\u008b\u0085\u008d\u008a\u008c\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081").intern(), a((-16777089) - Color.rgb(0, 0, 0), "\u0085\u0084\u0082\u0083\u0082\u0085\u0090\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0093\u0092\u0091\u0090\u0082\u0087\u0090\u008b\u0085\u008b\u008b\u008f").intern(), th, false);
        }
        Object obj = this.f13381a;
        if (obj != null) {
            return ((MediaPlayer.OnInfoListener) obj).onInfo(mediaPlayer, i5, i10);
        }
        return false;
    }
}
