package w9;

/* renamed from: w9.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4390i {

    /* renamed from: d, reason: collision with root package name */
    public static final C4390i f47439d = new C4390i(null, null, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f47440a;

    /* renamed from: b, reason: collision with root package name */
    public final C4390i f47441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47442c;

    public C4390i(C4390i c4390i, String str, int i5) {
        this.f47441b = c4390i;
        this.f47442c = str;
        this.f47440a = i5;
    }

    public final String toString() {
        int i5 = this.f47440a;
        if (i5 == 0) {
            return "";
        }
        String str = this.f47442c;
        if (i5 == 1) {
            return str;
        }
        return this.f47441b.toString() + "." + str;
    }
}
