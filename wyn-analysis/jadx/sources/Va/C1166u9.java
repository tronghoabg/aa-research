package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.IronSource;

/* renamed from: Va.u9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1166u9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14676c = {2, -15, -3, 6, 28, -27, -1, -3, 41, 27, -61, 7, -15, 5, -1, 6, -11, 19, -8, 5, -1, -8, Utf8.REPLACEMENT_BYTE, -55, 2, -15, -3, 6, -4, 5, -1, -3, 9, 59, -63, -2, 12, 2, -15, -3, 6, -4, 5, -1, -3, 9, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    public static int f14677d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14678e = 1;

    public static String f(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 78;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14676c[562498145 + i11] + 78);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-562498143)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 603558937);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14676c;
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        short sBlue;
        int iCombineMeasuredStates;
        int bitsPerPixel;
        int i5;
        int iMakeMeasureSpec;
        int i10 = f14677d + 95;
        f14678e = i10 % 128;
        if (i10 % 2 == 0) {
            sBlue = (short) Color.blue(0);
            iCombineMeasuredStates = (-603558832) >>> View.combineMeasuredStates(0, 0);
            bitsPerPixel = 16 % ImageFormat.getBitsPerPixel(0);
            i5 = (-562498107) % (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1);
        } else {
            sBlue = (short) Color.blue(0);
            iCombineMeasuredStates = (-603558832) - View.combineMeasuredStates(0, 0);
            bitsPerPixel = ImageFormat.getBitsPerPixel(0) - 67;
            i5 = (-562498107) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return f(sBlue, iCombineMeasuredStates, bitsPerPixel, i5, (byte) iMakeMeasureSpec).intern();
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1186w3 c1186w3 = new C1186w3(a());
        f14678e = (f14677d + 23) % 128;
        return c1186w3;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14677d = (f14678e + 79) % 128;
        String strIntern = f((short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-603558838) - Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 41, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 562498145, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i5 = f14677d + 33;
        f14678e = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 55 / 0;
        }
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14677d;
        f14678e = (i5 + 119) % 128;
        int i10 = i5 + 11;
        f14678e = i10 % 128;
        if (i10 % 2 != 0) {
            return IronSource.class;
        }
        throw null;
    }
}
