package Ag;

import E5.Q;
import cg.C1621j;
import cg.InterfaceC1620i;
import hb.r;
import hb.v;
import hb.x;
import okhttp3.ResponseBody;
import zg.InterfaceC4671j;

/* loaded from: classes5.dex */
public final class c implements InterfaceC4671j {

    /* renamed from: b, reason: collision with root package name */
    public static final C1621j f1346b;

    /* renamed from: a, reason: collision with root package name */
    public final r f1347a;

    static {
        C1621j c1621j = C1621j.f19903d;
        f1346b = ab.b.b("EFBBBF");
    }

    public c(r rVar) {
        this.f1347a = rVar;
    }

    @Override // zg.InterfaceC4671j
    public final Object convert(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        InterfaceC1620i f42426f = responseBody.getF42426f();
        try {
            if (f42426f.e(0L, f1346b)) {
                f42426f.skip(r1.f19904a.length);
            }
            x xVar = new x(f42426f);
            Object objFromJson = this.f1347a.fromJson(xVar);
            if (xVar.P() != v.f36357j) {
                throw new Q("JSON document was not fully consumed.", 11);
            }
            responseBody.close();
            return objFromJson;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
