package androidx.media3.common.util;

import android.os.Looper;
import android.text.TextUtils;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Assertions {
    private Assertions() {
    }

    @Deprecated
    public static void checkArgument(boolean z) {
        an.l(z);
    }

    @Deprecated
    public static int checkIndex(int i2, int i3, int i4) {
        if (i2 < i3 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return i2;
    }

    @Deprecated
    public static void checkMainThread() {
        an.v(Looper.myLooper() == Looper.getMainLooper(), "Not in application's main thread");
    }

    @Deprecated
    public static String checkNotEmpty(String str) {
        an.l(!TextUtils.isEmpty(str));
        return str;
    }

    @Deprecated
    public static <T> T checkNotNull(T t) {
        an.B(t);
        return t;
    }

    @Deprecated
    public static void checkState(boolean z) {
        an.u(z);
    }

    @Deprecated
    public static <T> T checkStateNotNull(T t) {
        an.B(t);
        return t;
    }

    @Deprecated
    public static void checkArgument(boolean z, Object obj) {
        an.m(z, obj);
    }

    @Deprecated
    public static <T> T checkNotNull(T t, Object obj) {
        an.C(t, obj);
        return t;
    }

    @Deprecated
    public static void checkState(boolean z, Object obj) {
        an.v(z, obj);
    }

    @Deprecated
    public static <T> T checkStateNotNull(T t, Object obj) {
        an.C(t, obj);
        return t;
    }

    @Deprecated
    public static String checkNotEmpty(String str, Object obj) {
        an.m(!TextUtils.isEmpty(str), obj);
        return str;
    }
}
