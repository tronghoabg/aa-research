package x3;

/* renamed from: x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4465h {

    /* renamed from: a, reason: collision with root package name */
    public final String f47674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47675b;

    /* renamed from: c, reason: collision with root package name */
    public final C4464g f47676c;

    public C4465h(String str, C4464g c4464g) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f47674a = "appassets.androidplatform.net";
        this.f47675b = str;
        this.f47676c = c4464g;
    }
}
