package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class U8 extends AbstractC1215y8 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f13754f = {57, -96, 0, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    public final Object f13755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13756e;

    public U8(Object obj, int i5) {
        this.f13756e = i5;
        this.f13755d = obj;
    }

    public static String f(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 45;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13754f[(-1968038511) + i11] + 45);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1968038513) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 549531294);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13754f;
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

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        return new C1139s8(this.f13755d);
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13755d);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Object obj2 = ((U8) obj).f13755d;
            Object obj3 = this.f13755d;
            if (obj3 != null) {
                return obj3.equals(obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13755d;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        switch (this.f13756e) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f((short) (Color.blue(0) - 116), (-549531260) - KeyEvent.getDeadChar(0, 0), (-44) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1968038510 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) Gravity.getAbsoluteGravity(0, 0)).intern());
                sb2.append(e().replace(f((short) ((-71) - TextUtils.indexOf((CharSequence) "", '0')), (-549531202) - View.MeasureSpec.getSize(0), (-44) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1968038511 - (Process.myPid() >> 22), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), f((short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 57), (ViewConfiguration.getJumpTapTimeout() >> 16) - 549531202, (-44) - ((byte) KeyEvent.getModifierMetaStateMask()), 1968038511 - (Process.myTid() >> 22), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()).replace(f((short) ((ViewConfiguration.getTapTimeout() >> 16) - 116), (-549531259) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 45, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1968038510, (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), f((short) (38 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), View.resolveSize(0, 0) - 549531202, (-43) - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 1968038512, (byte) Color.alpha(0)).intern()));
                sb2.append(f((short) ((-116) - View.MeasureSpec.getSize(0)), 53684 - AndroidCharacter.getMirror('0'), Process.getGidForName("") - 43, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1968038511, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern());
                return sb2.toString();
            default:
                return e();
        }
    }
}
