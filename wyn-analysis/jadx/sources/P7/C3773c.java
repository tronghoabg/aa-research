package p7;

import android.content.Context;

/* renamed from: p7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3773c {

    /* renamed from: b, reason: collision with root package name */
    public static final C3773c f43267b;

    /* renamed from: a, reason: collision with root package name */
    public E0.a f43268a;

    static {
        C3773c c3773c = new C3773c();
        c3773c.f43268a = null;
        f43267b = c3773c;
    }

    public static E0.a a(Context context) {
        E0.a aVar;
        C3773c c3773c = f43267b;
        synchronized (c3773c) {
            try {
                if (c3773c.f43268a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c3773c.f43268a = new E0.a(context, false);
                }
                aVar = c3773c.f43268a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
