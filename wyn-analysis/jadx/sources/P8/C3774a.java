package p8;

/* renamed from: p8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3774a {

    /* renamed from: b, reason: collision with root package name */
    public static final C3774a f43269b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3774a f43270c;

    /* renamed from: a, reason: collision with root package name */
    public final RuntimeException f43271a;

    static {
        if (m.f43291d) {
            f43270c = null;
            f43269b = null;
        } else {
            f43270c = new C3774a(false, null);
            f43269b = new C3774a(true, null);
        }
    }

    public C3774a(boolean z2, RuntimeException runtimeException) {
        this.f43271a = runtimeException;
    }
}
