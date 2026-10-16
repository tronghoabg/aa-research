package L4;

import android.os.Build;
import java.io.File;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static final File f6920f = new File("/proc/self/fd");

    /* renamed from: g, reason: collision with root package name */
    public static volatile r f6921g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6922a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6923b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6924c;

    /* renamed from: d, reason: collision with root package name */
    public int f6925d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6926e = true;

    public r() {
        boolean z2 = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String strSubstring = str.substring(0, 7);
            strSubstring.getClass();
            switch (strSubstring) {
                case "SM-A520":
                case "SM-G930":
                case "SM-G935":
                case "SM-G960":
                case "SM-G965":
                case "SM-J720":
                case "SM-N935":
                    if (Build.VERSION.SDK_INT == 26) {
                        z2 = false;
                        break;
                    }
                    break;
            }
        }
        this.f6922a = z2;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6923b = 20000;
            this.f6924c = 0;
        } else {
            this.f6923b = 700;
            this.f6924c = 128;
        }
    }

    public static r a() {
        if (f6921g == null) {
            synchronized (r.class) {
                try {
                    if (f6921g == null) {
                        f6921g = new r();
                    }
                } finally {
                }
            }
        }
        return f6921g;
    }
}
