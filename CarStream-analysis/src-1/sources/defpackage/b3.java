package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class b3 {
    public static volatile int a = 0;
    public static volatile int b = 0;
    public static volatile int c = 0;
    public static volatile boolean d = false;
    public static volatile int e;
    public static volatile int f;
    public static volatile int g;
    public static volatile int h;
    public static final Handler i = new Handler(Looper.getMainLooper());
    public static final o1 j = new o1(2);

    public static void a() {
        if (a <= 0 || b <= 0) {
            u5.d("CO MAN XE: KHONG BAO DUOC — chua nhan tam ve nao tu AA (rong=" + a + " cao=" + b + "); bo chieu giu co mac dinh");
            return;
        }
        l7 l7Var = k1.g;
        if (l7Var != null && l7Var.d()) {
            try {
                l7Var.e(a, b, c);
                return;
            } catch (Throwable th) {
                u5.d("CO MAN XE: bao HONG — ".concat(th.getClass().getSimpleName()));
                return;
            }
        }
        u5.d("CO MAN XE: hoan bao " + a + "x" + b + "@" + c + " — chua co bo chieu noi vao");
    }

    public static void b() {
        int i2 = g > 0 ? g : e;
        int i3 = h > 0 ? h : f;
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        boolean z = true;
        if (c <= 0) {
            if (d) {
                return;
            }
            d = true;
            u5.d("CO MAN XE: CHUA BIET DPI (=" + c + ") — khong cong bo " + i2 + "x" + i3 + ", bo chieu se giu co mac dinh");
            return;
        }
        d = false;
        if (i2 == a && i3 == b) {
            z = false;
        }
        a = i2;
        b = i3;
        if (z) {
            Handler handler = i;
            o1 o1Var = j;
            handler.removeCallbacks(o1Var);
            handler.postDelayed(o1Var, 300L);
        }
    }

    public static void c(int i2, int i3, int i4) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        e = i2 - (i2 & 1);
        f = i3 - (i3 & 1);
        if (i4 <= 0) {
            i4 = c;
        }
        c = i4;
        b();
    }
}
