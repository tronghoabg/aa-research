package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: Va.e9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0959e9 extends AbstractC0933c9 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14138e = {-45, 108, -106, 7, -119, 60, -125, 121, 0, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14139d;

    public C0959e9(ArrayList arrayList) {
        this.f14139d = arrayList;
    }

    public static String e(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 95;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14138e[(-1965536651) + i11] + 95);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1965536653) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 1363000546);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14138e;
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

    @Override // Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        Iterator it = this.f14139d.iterator();
        while (true) {
            J8 j8 = null;
            if (!it.hasNext()) {
                return new C1139s8(null);
            }
            AbstractC1215y8 abstractC1215y8 = (AbstractC1215y8) it.next();
            if (!(!(abstractC1215y8 instanceof J8))) {
                j8 = (J8) abstractC1215y8;
            } else if (abstractC1215y8 instanceof C8) {
                C8 c82 = (C8) abstractC1215y8;
                c82.getClass();
                int i5 = (C8.f13253f + 83) % 128;
                C8.f13254g = i5;
                int i10 = i5 + 1;
                C8.f13253f = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                j8 = c82.f13255d;
            }
            if (j8 != null) {
                c1203x8.g(Arrays.asList(j8.e()));
            }
            abstractC1215y8.b(c1203x8, c1214y7);
        }
    }

    public final String toString() {
        ArrayList arrayList = this.f14139d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e((short) TextUtils.indexOf("", "", 0), 1363000664 - (ViewConfiguration.getTapTimeout() >> 16), (-91) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 1965536651, (byte) (Color.rgb(0, 0, 0) + 16777341)).intern());
        sb2.append(TextUtils.join(e((short) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1363000591, (-94) - TextUtils.lastIndexOf("", '0', 0), 1965536654 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((-13) - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), arrayList));
        sb2.append(e((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1363000605 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) - 94, ((Process.getThreadPriority(0) + 20) >> 6) + 1965536655, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62)).intern());
        return sb2.toString();
    }
}
