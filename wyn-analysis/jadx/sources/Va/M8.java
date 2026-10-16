package Va;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public abstract class M8 extends N8 {

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13530j = {0, 78, 6, -88, 8, -74, 17, -61, 118, 99, -68, -72, -73, -60, -79, -10, -68, 114, 75, 7};

    public static String g(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 15;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13530j[1762381680 + i11] + 15);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1762381678)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 2018478604);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13530j;
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

    @Override // Va.N8
    public final boolean j(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 101), (-2018478537) - KeyEvent.getDeadChar(0, 0), (-16) - Color.red(0), Color.red(0) - 1762381680, (byte) (81 - ExpandableListView.getPackedPositionChild(0L))).intern());
        sb2.append(obj);
        sb2.append(g((short) ((Process.myPid() >> 22) + 31), KeyEvent.getDeadChar(0, 0) - 2018478572, (-16) - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getOffsetAfter("", 0) - 1762381665, (byte) (Process.getGidForName("") + 104)).intern());
        sb2.append(obj2);
        throw new RuntimeException(sb2.toString());
    }

    @Override // Va.N8
    public final boolean k(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g((short) ((-102) - TextUtils.indexOf((CharSequence) "", '0', 0)), KeyEvent.getDeadChar(0, 0) - 2018478537, (-16) - KeyEvent.keyCodeFromString(""), (-1762381681) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) (Color.rgb(0, 0, 0) + 16777298)).intern());
        sb2.append(str);
        sb2.append(g((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 2018478572, ExpandableListView.getPackedPositionType(0L) - 16, (-1762381665) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (103 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern());
        sb2.append(str2);
        throw new RuntimeException(sb2.toString());
    }
}
