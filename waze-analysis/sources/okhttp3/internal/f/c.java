package okhttp3.internal.f;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final k.k f56151a;

    /* renamed from: b, reason: collision with root package name */
    public static final k.k f56152b;

    /* renamed from: c, reason: collision with root package name */
    public static final k.k f56153c;

    /* renamed from: d, reason: collision with root package name */
    public static final k.k f56154d;

    /* renamed from: e, reason: collision with root package name */
    public static final k.k f56155e;

    /* renamed from: f, reason: collision with root package name */
    public static final k.k f56156f;

    /* renamed from: g, reason: collision with root package name */
    public final k.k f56157g;

    /* renamed from: h, reason: collision with root package name */
    public final k.k f56158h;

    /* renamed from: i, reason: collision with root package name */
    public final int f56159i;

    static {
        k.k kVar = k.k.f50843a;
        f56151a = okhttp3.internal.publicsuffix.a.d(":");
        f56152b = okhttp3.internal.publicsuffix.a.d(":status");
        f56153c = okhttp3.internal.publicsuffix.a.d(":method");
        f56154d = okhttp3.internal.publicsuffix.a.d(":path");
        f56155e = okhttp3.internal.publicsuffix.a.d(":scheme");
        f56156f = okhttp3.internal.publicsuffix.a.d(":authority");
    }

    public c(k.k kVar, k.k kVar2) {
        h.g.b.x.f(kVar, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(kVar2, "value");
        this.f56157g = kVar;
        this.f56158h = kVar2;
        this.f56159i = kVar.d() + 32 + kVar2.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f56157g, cVar.f56157g) && h.g.b.x.n(this.f56158h, cVar.f56158h);
    }

    public final int hashCode() {
        return (this.f56157g.hashCode() * 31) + this.f56158h.hashCode();
    }

    public final String toString() {
        k.k kVar = this.f56158h;
        return this.f56157g.i() + ": " + kVar.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(k.k kVar, String str) {
        this(kVar, okhttp3.internal.publicsuffix.a.d(str));
        h.g.b.x.f(kVar, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str, "value");
        k.k kVar2 = k.k.f50843a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(okhttp3.internal.publicsuffix.a.d(str), okhttp3.internal.publicsuffix.a.d(str2));
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "value");
        k.k kVar = k.k.f50843a;
    }
}
