package qd;

/* loaded from: classes5.dex */
public enum l {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: a, reason: collision with root package name */
    public final String f44250a;

    l(String str) {
        this.f44250a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f44250a;
    }
}
