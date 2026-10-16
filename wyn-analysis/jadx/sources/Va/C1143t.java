package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: Va.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1143t extends Ba {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f14635g = {6, 106, 89, 118, -119, -125, -125, -127, -110, 119, -42, 48, -119, -84, -85, 118, 62, -118, -115, 115, -75, 101, 122, -115, 118, -41, 60, 120, -113, 118, -37, 61, 125, -125, -127, 127, -37, 48, -118, -115, 114, -37, 61, 125, -119, -123, 120, -109, 124, -126, -96, -44};

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ C1052lb f14636c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f14637d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f14638e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Ra f14639f;

    public static String d(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i11 + 45;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14635g[(-170201685) + i5] + 45);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i5 + i12) - 170201687) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i10 - 1481371320);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14635g;
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

    @Override // Va.Ba
    public final void c() {
        C1092p c1092p = (C1092p) ((S3.i) this.f14639f.f13665a).f10963c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(170201685 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1481371403, (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (short) (125 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-47) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        sb2.append(this.f14637d);
        sb2.append(d(170201736 - View.resolveSizeAndState(0, 0, 0), Color.blue(0) + 1481371352, (byte) View.MeasureSpec.getMode(0), (short) (10 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (-45) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        sb2.append(this.f14638e);
        c1092p.b(this.f14636c, sb2.toString());
    }
}
