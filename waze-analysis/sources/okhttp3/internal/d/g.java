package okhttp3.internal.d;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import java.util.List;
import okhttp3.ac;
import okhttp3.al;
import okhttp3.aq;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final okhttp3.internal.c.j f56063a;

    /* renamed from: b, reason: collision with root package name */
    private final List f56064b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56065c;

    /* renamed from: d, reason: collision with root package name */
    private final okhttp3.internal.c.e f56066d;

    /* renamed from: e, reason: collision with root package name */
    private final al f56067e;

    /* renamed from: f, reason: collision with root package name */
    private final int f56068f;

    /* renamed from: g, reason: collision with root package name */
    private final int f56069g;

    /* renamed from: h, reason: collision with root package name */
    private int f56070h;

    public g(okhttp3.internal.c.j jVar, List list, int i2, okhttp3.internal.c.e eVar, al alVar, int i3, int i4) {
        x.f(jVar, NotificationCompat.CATEGORY_CALL);
        x.f(list, "interceptors");
        x.f(alVar, "request");
        this.f56063a = jVar;
        this.f56064b = list;
        this.f56065c = i2;
        this.f56066d = eVar;
        this.f56067e = alVar;
        this.f56068f = i3;
        this.f56069g = i4;
    }

    public static /* synthetic */ g j(g gVar, int i2, okhttp3.internal.c.e eVar, al alVar, int i3) {
        if ((i3 & 1) != 0) {
            i2 = gVar.f56065c;
        }
        int i4 = i2;
        if ((i3 & 2) != 0) {
            eVar = gVar.f56066d;
        }
        okhttp3.internal.c.e eVar2 = eVar;
        if ((i3 & 4) != 0) {
            alVar = gVar.f56067e;
        }
        al alVar2 = alVar;
        int i5 = gVar.f56068f;
        int i6 = gVar.f56069g;
        x.f(alVar2, "request");
        return new g(gVar.f56063a, gVar.f56064b, i4, eVar2, alVar2, i5, i6);
    }

    public final int a() {
        return this.f56068f;
    }

    public final int b() {
        return this.f56069g;
    }

    public final int c() {
        return this.f56068f;
    }

    public final okhttp3.f d() {
        return this.f56063a;
    }

    public final al e() {
        return this.f56067e;
    }

    public final al f() {
        return this.f56067e;
    }

    public final aq g(al alVar) {
        x.f(alVar, "request");
        List list = this.f56064b;
        int i2 = this.f56065c;
        if (i2 >= list.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f56070h++;
        okhttp3.internal.c.e eVar = this.f56066d;
        if (eVar != null) {
            if (!eVar.c().e(alVar.g())) {
                throw new IllegalStateException("network interceptor " + list.get(i2 - 1) + " must retain the same host and port");
            }
            if (this.f56070h != 1) {
                throw new IllegalStateException("network interceptor " + list.get(i2 - 1) + " must call proceed() exactly once");
            }
        }
        int i3 = i2 + 1;
        g gVarJ = j(this, i3, null, alVar, 58);
        ac acVar = (ac) list.get(i2);
        aq aqVarC = acVar.c(gVarJ);
        if (eVar != null && i3 < list.size() && gVarJ.f56070h != 1) {
            throw new IllegalStateException("network interceptor " + acVar + " must call proceed() exactly once");
        }
        if (aqVarC.m() != null) {
            return aqVarC;
        }
        throw new IllegalStateException("interceptor " + acVar + " returned a response with no body");
    }

    public final okhttp3.internal.c.e h() {
        return this.f56066d;
    }

    public final okhttp3.internal.c.j i() {
        return this.f56063a;
    }
}
