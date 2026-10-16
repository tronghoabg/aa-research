package D9;

import android.util.Log;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2569a = new f(0);

    /* renamed from: b, reason: collision with root package name */
    public static final f f2570b = new f(1);

    public static void a(String str) {
        if (Log.isLoggable("FIAM.Display", 3)) {
            Log.d("FIAM.Display", str);
        }
    }

    public static void b(String str, float f10) {
        a(str + ": " + f10);
    }

    public static void c(String str, float f10, float f11) {
        a(str + ": (" + f10 + ", " + f11 + ")");
    }

    public static void d(String str) {
        Log.e("FIAM.Display", str);
    }

    public static void e(String str) {
        if (Log.isLoggable("FIAM.Display", 4)) {
            Log.i("FIAM.Display", str);
        }
    }
}
