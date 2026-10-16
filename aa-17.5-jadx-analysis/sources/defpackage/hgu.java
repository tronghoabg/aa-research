package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hgu extends gwc {
    public final geu a;
    public final Map b = new LinkedHashMap();
    public gwc c;
    public String d;
    public Class e;
    private final aiyk f;

    public hgu(geu geuVar) {
        this.a = geuVar;
        jxz jxzVar = new jxz(this.n, 6);
        gon gonVar = new gon((afck) null, this, 6);
        int i = aizc.a;
        this.f = new ajaq(gonVar, jxzVar);
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.f;
    }

    @Override // defpackage.gwc
    public final Object b() {
        d();
        return new hgs(woy.bd(this.b));
    }

    @Override // defpackage.gwc
    public final void c(Object obj) {
        hgs hgsVar = obj instanceof hgs ? (hgs) obj : null;
        if (hgsVar == null) {
            return;
        }
        this.b.putAll(hgsVar.a);
    }

    public final void d() {
        String str = this.d;
        gwc gwcVar = this.c;
        if (str == null || gwcVar == null) {
            return;
        }
        this.b.put(str, gwcVar.b());
    }
}
