package okhttp3;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final ab f55886a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55887b;

    /* renamed from: c, reason: collision with root package name */
    private final z f55888c;

    /* renamed from: d, reason: collision with root package name */
    private final ao f55889d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f55890e;

    /* renamed from: f, reason: collision with root package name */
    private e f55891f;

    public al(ab abVar, String str, z zVar, ao aoVar, Map map) {
        h.g.b.x.f(abVar, "url");
        h.g.b.x.f(str, "method");
        h.g.b.x.f(zVar, "headers");
        h.g.b.x.f(map, "tags");
        this.f55886a = abVar;
        this.f55887b = str;
        this.f55888c = zVar;
        this.f55889d = aoVar;
        this.f55890e = map;
    }

    public final Object a(Class cls) {
        h.g.b.x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return cls.cast(this.f55890e.get(cls));
    }

    public final String b(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return this.f55888c.b(str);
    }

    public final String c() {
        return this.f55887b;
    }

    public final Map d() {
        return this.f55890e;
    }

    public final e e() throws NumberFormatException {
        e eVar = this.f55891f;
        if (eVar != null) {
            return eVar;
        }
        z zVar = this.f55888c;
        e eVar2 = e.f55936a;
        e eVarF = kotlinx.coroutines.i.c.f(zVar);
        this.f55891f = eVarF;
        return eVarF;
    }

    public final z f() {
        return this.f55888c;
    }

    public final ab g() {
        return this.f55886a;
    }

    public final ao h() {
        return this.f55889d;
    }

    public final boolean i() {
        return this.f55886a.q();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f55887b);
        sb.append(", url=");
        sb.append(this.f55886a);
        z zVar = this.f55888c;
        if (zVar.a() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (Object obj : zVar) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.i.p();
                }
                h.k kVar = (h.k) obj;
                String str = (String) kVar.a();
                String str2 = (String) kVar.b();
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i2 = i3;
            }
            sb.append(']');
        }
        Map map = this.f55890e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
