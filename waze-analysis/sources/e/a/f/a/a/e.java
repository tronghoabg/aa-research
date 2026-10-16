package e.a.f.a.a;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k.k f47490a;

    /* renamed from: b, reason: collision with root package name */
    public static final k.k f47491b;

    /* renamed from: c, reason: collision with root package name */
    public static final k.k f47492c;

    /* renamed from: d, reason: collision with root package name */
    public static final k.k f47493d;

    /* renamed from: e, reason: collision with root package name */
    public static final k.k f47494e;

    /* renamed from: f, reason: collision with root package name */
    public final k.k f47495f;

    /* renamed from: g, reason: collision with root package name */
    public final k.k f47496g;

    /* renamed from: h, reason: collision with root package name */
    final int f47497h;

    static {
        k.k kVar = k.k.f50843a;
        f47490a = okhttp3.internal.publicsuffix.a.d(":status");
        f47491b = okhttp3.internal.publicsuffix.a.d(":method");
        f47492c = okhttp3.internal.publicsuffix.a.d(":path");
        f47493d = okhttp3.internal.publicsuffix.a.d(":scheme");
        f47494e = okhttp3.internal.publicsuffix.a.d(":authority");
        okhttp3.internal.publicsuffix.a.d(":host");
        okhttp3.internal.publicsuffix.a.d(":version");
    }

    public e(k.k kVar, k.k kVar2) {
        this.f47495f = kVar;
        this.f47496g = kVar2;
        this.f47497h = kVar.d() + 32 + kVar2.d();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f47495f.equals(eVar.f47495f) && this.f47496g.equals(eVar.f47496g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f47495f.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.f47496g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f47495f.i(), this.f47496g.i());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(k.k kVar, String str) {
        this(kVar, okhttp3.internal.publicsuffix.a.d(str));
        k.k kVar2 = k.k.f50843a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        this(okhttp3.internal.publicsuffix.a.d(str), okhttp3.internal.publicsuffix.a.d(str2));
        k.k kVar = k.k.f50843a;
    }
}
