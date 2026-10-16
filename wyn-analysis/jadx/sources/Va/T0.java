package Va;

import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.google.android.gms.ads.AdListener;
import x6.C4481l;

/* loaded from: classes4.dex */
public final class T0 extends AdListener implements H9 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f13710d = {'A', 'd', 'L', 'i', 's', 't', 'e', 'n', 'r', '.', 'o', 'C', 'l', 'F', 'a', 'T', 'W', 'h', 'E', 'f', 'p', 'c', 'O', 'I', 'm', 'S', 'w', 'G', 'u', 'k', 'B', 'D', 'H', 'J', 'K', 'M'};

    /* renamed from: e, reason: collision with root package name */
    public static int f13711e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13712f = 1;

    /* renamed from: a, reason: collision with root package name */
    public AdListener f13713a;

    /* renamed from: b, reason: collision with root package name */
    public Ra f13714b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ W0 f13715c;

    public static String a(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13710d;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.H9
    public final Object d() {
        int i5 = (f13712f + 91) % 128;
        f13711e = i5;
        int i10 = i5 + 45;
        int i11 = i10 % 128;
        f13712f = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 111;
        f13711e = i12 % 128;
        int i13 = i12 % 2;
        AdListener adListener = this.f13713a;
        if (i13 != 0) {
            int i14 = 48 / 0;
        }
        return adListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        f13711e = (f13712f + 97) % 128;
        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 21;
        this.f13715c.B0(this, this.f13714b, a((byte) (114 - ((Process.getThreadPriority(0) + 20) >> 6)), threadPriority, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0007\t\n\u000b\u0006\u0001\u0005\u0007\u0010\u0006\u0000\nÖ").intern(), new Object[0]);
        AdListener adListener = this.f13713a;
        if (adListener != null) {
            f13712f = (f13711e + 41) % 128;
            adListener.onAdClosed();
            f13711e = (f13712f + 93) % 128;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.f13715c.B0(this, this.f13714b, a((byte) (84 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 38, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0007\t\n\u000b\u0006\u0001\u0007\u0013\u000f\u0002\u0012\f\u0003\r\b\u0004\b\u0010\u0004\r\u0004\u0000\f\u0005\u0000\u0013ÆÆ\u000b\t").intern(), c4481l);
        AdListener adListener = this.f13713a;
        if (adListener != null) {
            f13712f = (f13711e + 61) % 128;
            adListener.onAdFailedToLoad(c4481l);
        }
        f13712f = (f13711e + 93) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    @Override // com.google.android.gms.ads.AdListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAdImpression() {
        /*
            r7 = this;
            int r0 = Va.T0.f13711e
            int r0 = r0 + 51
            int r1 = r0 % 128
            Va.T0.f13712f = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0007\t\n\u000b\u0006\u0001\u0005\u0013\u001a\u0012\t\u0007yy\u0004\tt"
            Va.Ra r2 = r7.f13714b
            Va.W0 r3 = r7.f13715c
            com.google.android.gms.ads.AdListener r4 = r7.f13713a
            r5 = 0
            if (r0 != 0) goto L36
            r0 = 1
            int r0 = android.view.Gravity.getAbsoluteGravity(r5, r0)
            r6 = 119(0x77, float:1.67E-43)
            int r6 = r6 % r0
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r0 = r0 % 12
            int r0 = r0 * 125
            byte r0 = (byte) r0
            java.lang.String r0 = a(r0, r6, r1)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r3.B0(r7, r2, r0, r1)
            if (r4 == 0) goto L57
            goto L54
        L36:
            int r0 = android.view.Gravity.getAbsoluteGravity(r5, r5)
            int r0 = 25 - r0
            int r6 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r6 = r6 >> 16
            int r6 = r6 + 6
            byte r6 = (byte) r6
            java.lang.String r0 = a(r6, r0, r1)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r3.B0(r7, r2, r0, r1)
            if (r4 == 0) goto L57
        L54:
            r4.onAdImpression()
        L57:
            int r0 = Va.T0.f13711e
            int r0 = r0 + 81
            int r0 = r0 % 128
            Va.T0.f13712f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.T0.onAdImpression():void");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        f13712f = (f13711e + 17) % 128;
        int i5 = 22 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        this.f13715c.B0(this, this.f13714b, a((byte) ((Process.myPid() >> 22) + 77), i5, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0007\t\n\u000b\u0006\u0001\u0002\u0003\b\u0010\u0000\u0007±").intern(), new Object[0]);
        AdListener adListener = this.f13713a;
        if (adListener != null) {
            int i10 = f13711e + 25;
            f13712f = i10 % 128;
            int i11 = i10 % 2;
            adListener.onAdLoaded();
            if (i11 == 0) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20;
        this.f13715c.B0(this, this.f13714b, a((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71), i5, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0007\t\n\u000b\u0006\u0001\u0004\u0013\u0012\b\b\u0007¬").intern(), new Object[0]);
        AdListener adListener = this.f13713a;
        if (adListener != null) {
            f13712f = (f13711e + 5) % 128;
            adListener.onAdOpened();
            f13712f = (f13711e + 83) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    @Override // com.google.android.gms.ads.AdListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAdSwipeGestureClicked() {
        /*
            r11 = this;
            int r0 = Va.T0.f13711e
            int r0 = r0 + 3
            int r1 = r0 % 128
            Va.T0.f13712f = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            java.lang.String r2 = "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0007\t\n\u000b\u0006\u0001\u0007\u001f\u001b\u0002\u0012\b\u0018\t\u0005\u0000\u001a\n\u0007\u0006\u000f\u0000\u0017\u001b\u0007\u0000"
            Va.Ra r3 = r11.f13714b
            Va.W0 r4 = r11.f13715c
            com.google.android.gms.ads.AdListener r5 = r11.f13713a
            r6 = 0
            if (r0 != 0) goto L3c
            long r7 = android.os.Process.getElapsedCpuTime()
            r9 = 1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r7 = 123(0x7b, float:1.72E-43)
            int r7 = r7 % r0
            r0 = 49
            r8 = 1
            int r0 = android.text.TextUtils.indexOf(r1, r0, r6, r8)
            int r0 = r0 * 30
            byte r0 = (byte) r0
            java.lang.String r0 = a(r0, r7, r2)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r4.B0(r11, r3, r0, r1)
            if (r5 == 0) goto L70
            goto L5e
        L3c:
            long r7 = android.os.Process.getElapsedCpuTime()
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            int r0 = r0 + 33
            r7 = 48
            int r1 = android.text.TextUtils.indexOf(r1, r7, r6, r6)
            int r1 = r1 + 7
            byte r1 = (byte) r1
            java.lang.String r0 = a(r1, r0, r2)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r4.B0(r11, r3, r0, r1)
            if (r5 == 0) goto L70
        L5e:
            int r0 = Va.T0.f13711e
            int r0 = r0 + 53
            int r1 = r0 % 128
            Va.T0.f13712f = r1
            int r0 = r0 % 2
            r5.onAdSwipeGestureClicked()
            if (r0 != 0) goto L70
            r0 = 24
            int r0 = r0 / r6
        L70:
            int r0 = Va.T0.f13711e
            int r0 = r0 + 109
            int r1 = r0 % 128
            Va.T0.f13712f = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L7d
            return
        L7d:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.T0.onAdSwipeGestureClicked():void");
    }
}
