package la;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f40186d = new i("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f40187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40188b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40189c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z2) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f40187a = str;
        this.f40188b = str2;
        this.f40189c = z2;
    }
}
