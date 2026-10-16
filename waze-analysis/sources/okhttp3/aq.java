package okhttp3;

import androidx.autofill.HintConstants;
import java.io.Closeable;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aq implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final al f55909a;

    /* renamed from: b, reason: collision with root package name */
    private final aj f55910b;

    /* renamed from: c, reason: collision with root package name */
    private final String f55911c;

    /* renamed from: d, reason: collision with root package name */
    private final int f55912d;

    /* renamed from: e, reason: collision with root package name */
    private final y f55913e;

    /* renamed from: f, reason: collision with root package name */
    private final z f55914f;

    /* renamed from: g, reason: collision with root package name */
    private final at f55915g;

    /* renamed from: h, reason: collision with root package name */
    private final aq f55916h;

    /* renamed from: i, reason: collision with root package name */
    private final aq f55917i;

    /* renamed from: j, reason: collision with root package name */
    private final aq f55918j;

    /* renamed from: k, reason: collision with root package name */
    private final long f55919k;

    /* renamed from: l, reason: collision with root package name */
    private final long f55920l;
    private final okhttp3.internal.c.e m;

    public aq(al alVar, aj ajVar, String str, int i2, y yVar, z zVar, at atVar, aq aqVar, aq aqVar2, aq aqVar3, long j2, long j3, okhttp3.internal.c.e eVar) {
        h.g.b.x.f(alVar, "request");
        h.g.b.x.f(ajVar, "protocol");
        h.g.b.x.f(str, "message");
        h.g.b.x.f(zVar, "headers");
        this.f55909a = alVar;
        this.f55910b = ajVar;
        this.f55911c = str;
        this.f55912d = i2;
        this.f55913e = yVar;
        this.f55914f = zVar;
        this.f55915g = atVar;
        this.f55916h = aqVar;
        this.f55917i = aqVar2;
        this.f55918j = aqVar3;
        this.f55919k = j2;
        this.f55920l = j3;
        this.m = eVar;
    }

    public static /* synthetic */ String p(aq aqVar, String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        String strB = aqVar.f55914f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public final int a() {
        return this.f55912d;
    }

    public final long b() {
        return this.f55920l;
    }

    public final long c() {
        return this.f55919k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        at atVar = this.f55915g;
        if (atVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        atVar.close();
    }

    public final String d() {
        return this.f55911c;
    }

    public final List e() {
        String str;
        int i2 = this.f55912d;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i2 != 407) {
                return h.a.i.h();
            }
            str = "Proxy-Authenticate";
        }
        return okhttp3.internal.d.f.a(this.f55914f, str);
    }

    public final y f() {
        return this.f55913e;
    }

    public final z g() {
        return this.f55914f;
    }

    public final aj h() {
        return this.f55910b;
    }

    public final al i() {
        return this.f55909a;
    }

    public final aq j() {
        return this.f55917i;
    }

    public final aq k() {
        return this.f55916h;
    }

    public final aq l() {
        return this.f55918j;
    }

    public final at m() {
        return this.f55915g;
    }

    public final okhttp3.internal.c.e n() {
        return this.m;
    }

    public final boolean o() {
        int i2 = this.f55912d;
        return i2 >= 200 && i2 < 300;
    }

    public final List q() {
        h.g.b.x.f("content-type", HintConstants.AUTOFILL_HINT_NAME);
        return this.f55914f.e("content-type");
    }

    public final String toString() {
        return "Response{protocol=" + this.f55910b + ", code=" + this.f55912d + ", message=" + this.f55911c + ", url=" + this.f55909a.g() + "}";
    }
}
