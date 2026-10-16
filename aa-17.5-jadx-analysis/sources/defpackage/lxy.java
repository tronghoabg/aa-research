package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class lxy {
    public final eqj a;
    public final String b;
    public final Map c = new LinkedHashMap();
    public final eqj d;

    public lxy(eqj eqjVar, String str) {
        this.a = eqjVar;
        this.b = str;
        this.d = tby.v(eqjVar, new lpx(this, 18));
    }

    public final boolean a(kqz kqzVar) {
        return kqzVar != null && kqzVar.a.length() > 0 && kqzVar.c != null && affa.f(kqzVar.d, this.b);
    }
}
