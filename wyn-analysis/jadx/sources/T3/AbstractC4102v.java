package t3;

import android.os.Build;

/* renamed from: t3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4102v {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f45729a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f45730b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f45731c;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f45729a = true;
        f45730b = true;
        f45731c = i5 >= 28;
    }
}
