package lf;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: lf.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3467f {

    /* renamed from: a, reason: collision with root package name */
    public Method f40279a;

    /* renamed from: b, reason: collision with root package name */
    public Method f40280b;

    /* renamed from: c, reason: collision with root package name */
    public Method f40281c;

    public C3467f(Method method, Method method2, Method method3) {
        this.f40279a = method;
        this.f40280b = method2;
        this.f40281c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
