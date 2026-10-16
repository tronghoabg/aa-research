package i1;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2839a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f36701e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f36702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36703b;

    /* renamed from: c, reason: collision with root package name */
    public int f36704c;

    /* renamed from: d, reason: collision with root package name */
    public char f36705d;

    static {
        for (int i5 = 0; i5 < 1792; i5++) {
            f36701e[i5] = Character.getDirectionality(i5);
        }
    }

    public C2839a(CharSequence charSequence) {
        this.f36702a = charSequence;
        this.f36703b = charSequence.length();
    }

    public final byte a() {
        int i5 = this.f36704c - 1;
        CharSequence charSequence = this.f36702a;
        char cCharAt = charSequence.charAt(i5);
        this.f36705d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f36704c);
            this.f36704c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f36704c--;
        char c10 = this.f36705d;
        return c10 < 1792 ? f36701e[c10] : Character.getDirectionality(c10);
    }
}
