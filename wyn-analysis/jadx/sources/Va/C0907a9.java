package Va;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: Va.a9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0907a9 extends AbstractC0933c9 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13979e = {0};

    /* renamed from: f, reason: collision with root package name */
    public static int f13980f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13981g = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8 f13982d;

    public C0907a9(AbstractC1215y8 abstractC1215y8) {
        this.f13982d = abstractC1215y8;
    }

    public static String e(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 98;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13979e[(-1760077769) + i11] + 98);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1760077771) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 116114876);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13979e;
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
    public C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        int i5 = f13980f;
        f13981g = (i5 + 29) % 128;
        AbstractC1215y8 abstractC1215y8 = this.f13982d;
        if (abstractC1215y8 == null) {
            return new C1139s8(null);
        }
        int i10 = i5 + 73;
        f13981g = i10 % 128;
        if (i10 % 2 != 0) {
            return abstractC1215y8.c(c1203x8, c1214y7);
        }
        abstractC1215y8.c(c1203x8, c1214y7);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L4f
            int r2 = Va.C0907a9.f13980f
            int r2 = r2 + 125
            int r3 = r2 % 128
            Va.C0907a9.f13981g = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L21
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            r4 = 51
            int r4 = r4 / r1
            if (r2 == r3) goto L2c
            goto L4f
        L21:
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L2c
            goto L4f
        L2c:
            Va.a9 r6 = (Va.C0907a9) r6
            Va.y8 r2 = r5.f13982d
            Va.y8 r6 = r6.f13982d
            if (r2 == 0) goto L39
            boolean r6 = r2.equals(r6)
            return r6
        L39:
            if (r6 != 0) goto L4f
            int r6 = Va.C0907a9.f13980f
            int r6 = r6 + r0
            int r6 = r6 % 128
            Va.C0907a9.f13981g = r6
            int r6 = r6 + 31
            int r1 = r6 % 128
            Va.C0907a9.f13980f = r1
            int r6 = r6 % 2
            if (r6 != 0) goto L4d
            return r0
        L4d:
            r6 = 0
            throw r6
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0907a9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AbstractC1215y8 abstractC1215y8 = this.f13982d;
        if (abstractC1215y8 != null) {
            f13981g = (f13980f + 73) % 128;
            return abstractC1215y8.hashCode();
        }
        int i5 = f13981g + 41;
        f13980f = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public String toString() {
        int i5 = f13980f + 69;
        f13981g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        AbstractC1215y8 abstractC1215y8 = this.f13982d;
        if (abstractC1215y8 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(abstractC1215y8);
            sb2.append(e((short) View.MeasureSpec.getSize(0), Color.alpha(0) - 116114817, (-97) - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1760077769, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 48)).intern());
            return sb2.toString();
        }
        String strIntern = e((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) - 116114816, (-98) - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1760077770, (byte) (46 - TextUtils.lastIndexOf("", '0', 0, 0))).intern();
        int i10 = f13981g + 53;
        f13980f = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }
}
