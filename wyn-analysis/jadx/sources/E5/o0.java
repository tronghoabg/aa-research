package E5;

import java.io.IOException;

/* loaded from: classes3.dex */
public class o0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3493b;

    public o0(String str, Exception exc, boolean z2, int i5) {
        super(str, exc);
        this.f3492a = z2;
        this.f3493b = i5;
    }

    public static o0 a(String str, Exception exc) {
        return new o0(str, exc, true, 1);
    }

    public static o0 b(String str) {
        return new o0(str, null, false, 1);
    }
}
