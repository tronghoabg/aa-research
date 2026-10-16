package Va;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class O9 extends G9 implements MediaPlayer.OnCompletionListener {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f13574c = {-35, 109, -107, 125, -127, 109, 98, -112, 79, -68, 99, -103, 103, -97, 111, 100, 115, -80, -111, 104, -101, 97, -105, -110, 109, -112, 66, -69, 113, -31, 58, -61, 48, -54, 60, 57, -58, 59, -23, 16, 58, -118, 107, -56, 50, -52, 52, -60, -49, -40, 47, -53, 34, -120, 119, -64, -116, 107, -58, 56, -59, -24};

    /* renamed from: d, reason: collision with root package name */
    public static int f13575d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13576e = 1;

    /* renamed from: b, reason: collision with root package name */
    public N9 f13577b;

    public static String a(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 64;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13574c[(-1112470941) + i11] + 64);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1112470943) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 1477946169);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13574c;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        f13575d = (f13576e + 55) % 128;
        try {
            this.f13577b.a(this, mediaPlayer);
        } catch (Throwable th) {
            Ab.a0(a((-1477946090) - View.MeasureSpec.getSize(0), (-65) - TextUtils.indexOf("", "", 0), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 110), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1112470941 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), a((ViewConfiguration.getScrollDefaultDelay() >> 16) - 1477946100, TextUtils.indexOf("", "") - 65, (byte) ((-60) - TextUtils.lastIndexOf("", '0', 0)), (short) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), 1112470970 - KeyEvent.normalizeMetaState(0)).intern(), th, false);
        }
        Object obj = this.f13381a;
        if (obj != null) {
            ((MediaPlayer.OnCompletionListener) obj).onCompletion(mediaPlayer);
        }
        int i5 = f13575d + 85;
        f13576e = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 12 / 0;
        }
    }
}
