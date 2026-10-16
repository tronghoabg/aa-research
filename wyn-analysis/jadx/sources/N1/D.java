package N1;

import A7.AbstractC0279p0;
import java.io.IOException;

/* loaded from: classes.dex */
public class D extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8027a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8028b;

    public D(String str, Exception exc, boolean z2, int i5) {
        super(str, exc);
        this.f8027a = z2;
        this.f8028b = i5;
    }

    public static D a(RuntimeException runtimeException, String str) {
        return new D(str, runtimeException, true, 1);
    }

    public static D b(String str, Exception exc) {
        return new D(str, exc, true, 4);
    }

    public static D c(String str) {
        return new D(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(" {contentIsMalformed=");
        sb2.append(this.f8027a);
        sb2.append(", dataType=");
        return AbstractC0279p0.j(this.f8028b, "}", sb2);
    }
}
