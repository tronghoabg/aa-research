package Va;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class Cb {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f13261a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f13262b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f13263c;

    /* renamed from: d, reason: collision with root package name */
    public static int f13264d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13265e = 1;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            Va.Cb.f13261a = r0
            int r0 = Va.Cb.f13265e
            int r0 = r0 + 103
            int r1 = r0 % 128
            Va.Cb.f13264d = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L1a
            r0 = 0
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r0 = r0 ^ r1
        L1c:
            r2 = 3
            r3 = 0
            if (r0 >= r2) goto L9a
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "\ue948\uf4d0䭏톇ᝈ❱\uf7f1뤏눿綁"
            float r5 = android.media.AudioTrack.getMinVolume()     // Catch: java.lang.Throwable -> L45
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            int r5 = 10 - r5
            java.lang.String r4 = b(r5, r4)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r4.intern()     // Catch: java.lang.Throwable -> L45
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L45
            r2.start()     // Catch: java.lang.Throwable -> L46
            android.os.Handler r4 = new android.os.Handler     // Catch: java.lang.Throwable -> L46
            android.os.Looper r5 = r2.getLooper()     // Catch: java.lang.Throwable -> L46
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L46
            goto La3
        L45:
            r2 = r3
        L46:
            java.lang.String r4 = "阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱"
            java.lang.String r5 = ""
            if (r2 == 0) goto L4f
            r2.quitSafely()     // Catch: java.lang.Throwable -> L76
        L4f:
            r2 = 48
            int r6 = android.text.TextUtils.indexOf(r5, r2)     // Catch: java.lang.Throwable -> L76
            int r6 = 11 - r6
            java.lang.String r6 = b(r6, r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = r6.intern()     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f\uee0c민䄽鲒⍀臲炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷ࠝೋ웧䆒찹臩⍞嬨䷎㘟ྼ眚\udd2a㧞"
            int r8 = android.view.ViewConfiguration.getScrollBarSize()     // Catch: java.lang.Throwable -> L76
            int r8 = r8 >> 8
            int r8 = r8 + r2
            java.lang.String r2 = b(r8, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r2.intern()     // Catch: java.lang.Throwable -> L76
            Va.Ab.C(r6, r2, r1)     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + 1
            goto L1c
        L76:
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r0 = r0 >> 16
            int r0 = r0 + 12
            java.lang.String r0 = b(r0, r4)
            java.lang.String r0 = r0.intern()
            int r2 = android.text.TextUtils.indexOf(r5, r5)
            int r2 = 35 - r2
            java.lang.String r4 = "\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f\uee0c민䄽鲒⍀臲炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷ꄐ빇"
            java.lang.String r2 = b(r2, r4)
            java.lang.String r2 = r2.intern()
            Va.Ab.C(r0, r2, r1)
            goto La2
        L9a:
            int r0 = Va.Cb.f13265e
            int r0 = r0 + 121
            int r0 = r0 % 128
            Va.Cb.f13264d = r0
        La2:
            r4 = r3
        La3:
            Va.Cb.f13262b = r4
            if (r4 != 0) goto Lb4
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            int r0 = Va.Cb.f13264d
            int r0 = r0 + 29
            int r0 = r0 % 128
            Va.Cb.f13265e = r0
            goto Lbc
        Lb4:
            int r0 = Va.Cb.f13265e
            int r0 = r0 + 17
            int r0 = r0 % 128
            Va.Cb.f13264d = r0
        Lbc:
            Va.Cb.f13263c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Cb.<clinit>():void");
    }

    public static void a(Ba ba2, long j8) {
        int i5 = f13265e + 39;
        f13264d = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                i().postDelayed(ba2, j8);
                throw null;
            }
            i().postDelayed(ba2, j8);
            int i10 = f13264d + 33;
            f13265e = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
            Ab.C(b(13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱").intern(), b(((Process.getThreadPriority(0) + 20) >> 6) + 37, "\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20䜺澶㻃⑨焽롥឴ꋥ遟悝밻ᶩ欁企䷎㘟ᒉ華ꧦ\uf816䄽鲒\u242b緻").intern(), false);
        }
    }

    public static String b(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 56036)) ^ ((c11 >>> 5) + 29167)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 3934) ^ ((c12 + i11) ^ ((c12 << 4) + 23061))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static void c(Ba ba2) {
        f13265e = (f13264d + 39) % 128;
        try {
            i().post(ba2);
            f13264d = (f13265e + 123) % 128;
        } catch (Throwable unused) {
            Ab.C(b(View.MeasureSpec.makeMeasureSpec(0, 0) + 12, "阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱").intern(), b(28 - TextUtils.lastIndexOf("", '0'), "\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20遟悝밻ᶩ欁企䷎㘟ᒉ華ꧦ\uf816䄽鲒\u242b緻").intern(), false);
        }
    }

    public static Handler d() {
        int i5 = f13264d;
        int i10 = i5 + 61;
        f13265e = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i11 = i5 + 85;
        f13265e = i11 % 128;
        if (i11 % 2 != 0) {
            return f13262b;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(Va.Ba r7) {
        /*
            int r0 = Va.Cb.f13265e
            int r0 = r0 + 33
            int r1 = r0 % 128
            Va.Cb.f13264d = r1
            int r0 = r0 % 2
            java.lang.String r1 = "阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱"
            r2 = 0
            if (r0 == 0) goto L19
            android.os.Handler r0 = d()     // Catch: java.lang.Throwable -> L61
            r3 = 79
            int r3 = r3 / r2
            if (r0 == 0) goto L23
            goto L1f
        L19:
            android.os.Handler r0 = d()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L23
        L1f:
            r0.post(r7)     // Catch: java.lang.Throwable -> L61
            return
        L23:
            java.util.concurrent.ScheduledExecutorService r0 = Va.Cb.f13263c     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L39
            r0.execute(r7)     // Catch: java.lang.Throwable -> L61
            int r7 = Va.Cb.f13264d
            int r7 = r7 + 113
            int r0 = r7 % 128
            Va.Cb.f13265e = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L37
            return
        L37:
            r7 = 0
            throw r7
        L39:
            long r3 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> L61
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r7 = r7 + 11
            java.lang.String r7 = b(r7, r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r7.intern()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "稐៴炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷屨–丹╤眥든憤\u2d74뷥唚糷뇆ᙨ\uf716吼縔\uedf7ᑙ榷℘丹╤딘䅖︎萱蔂V婥鴈罰谷"
            java.lang.String r3 = ""
            int r3 = android.view.KeyEvent.keyCodeFromString(r3)     // Catch: java.lang.Throwable -> L61
            int r3 = r3 + 52
            java.lang.String r0 = b(r3, r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> L61
            Va.Ab.C(r7, r0, r2)     // Catch: java.lang.Throwable -> L61
            return
        L61:
            float r7 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            int r7 = 13 - r7
            java.lang.String r7 = b(r7, r1)
            java.lang.String r7 = r7.intern()
            int r0 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r0 = r0 >> 16
            int r0 = r0 + 36
            java.lang.String r1 = "\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20遟悝밻ᶩ䚽ﴮ퐋ڴ귢벳\u0dcb蕞ৄ掞㙭ྖ\ue70e\udfc7ោ틩玑䀩"
            java.lang.String r0 = b(r0, r1)
            java.lang.String r0 = r0.intern()
            Va.Ab.C(r7, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Cb.e(Va.Ba):void");
    }

    public static void f(Ba ba2, long j8) {
        int i5 = f13264d + 49;
        f13265e = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                d();
                throw null;
            }
            Handler handlerD = d();
            if (handlerD != null) {
                handlerD.postDelayed(ba2, j8);
                return;
            }
            ScheduledExecutorService scheduledExecutorService = f13263c;
            if (scheduledExecutorService == null) {
                Ab.C(b(Color.alpha(0) + 12, "阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱").intern(), b(52 - (KeyEvent.getMaxKeyCode() >> 16), "稐៴炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷屨–丹╤眥든憤\u2d74뷥唚糷뇆ᙨ\uf716吼縔\uedf7ᑙ榷℘丹╤딘䅖︎萱蔂V婥鴈罰谷").intern(), false);
                int i10 = f13264d + 61;
                f13265e = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i11 = f13264d + 61;
            f13265e = i11 % 128;
            if (i11 % 2 != 0) {
                scheduledExecutorService.schedule(ba2, j8, TimeUnit.MILLISECONDS);
            } else {
                scheduledExecutorService.schedule(ba2, j8, TimeUnit.MILLISECONDS);
                throw null;
            }
        } catch (Throwable unused) {
            Ab.C(b(13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱").intern(), b(44 - (Process.myPid() >> 22), "\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20䜺澶㻃⑨焽롥឴ꋥ遟悝밻ᶩ䚽ﴮ퐋ڴ귢벳\u0dcb蕞ৄ掞㙭ྖ\ue70e\udfc7ោ틩玑䀩").intern(), false);
        }
    }

    public static void g(Ba ba2) {
        int i5 = f13264d + 61;
        f13265e = i5 % 128;
        if (i5 % 2 == 0) {
            h();
            throw null;
        }
        if (!h()) {
            c(ba2);
            int i10 = f13264d + 63;
            f13265e = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            return;
        }
        ba2.run();
        int i11 = f13264d + 11;
        f13265e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 43 / 0;
        }
    }

    public static boolean h() {
        int i5 = f13264d + 97;
        f13265e = i5 % 128;
        if (i5 % 2 == 0) {
            Looper.myLooper();
            Looper.getMainLooper();
            throw null;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            f13264d = (f13265e + 79) % 128;
            return false;
        }
        int i10 = f13264d + 49;
        f13265e = i10 % 128;
        return i10 % 2 != 0;
    }

    public static Handler i() {
        int i5 = f13265e;
        Handler handler = f13261a;
        int i10 = i5 + 67;
        f13264d = i10 % 128;
        if (i10 % 2 == 0) {
            return handler;
        }
        throw null;
    }

    public static void j(Ba ba2) {
        f13265e = (f13264d + 73) % 128;
        if (h()) {
            e(ba2);
        } else {
            ba2.run();
            f13264d = (f13265e + 53) % 128;
        }
    }
}
