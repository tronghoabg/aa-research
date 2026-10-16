package g5;

import A7.AbstractC0279p0;
import Va.X7;
import Wa.h;
import h5.C2778b;
import h5.C2779c;
import h5.C2780d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uc.C4278o;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2705b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4278o f35729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f35730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2704a f35731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2708e f35732e;

    public /* synthetic */ RunnableC2705b(C2708e c2708e, C4278o c4278o, h hVar, C2704a c2704a, int i5) {
        this.f35728a = i5;
        this.f35732e = c2708e;
        this.f35729b = c4278o;
        this.f35730c = hVar;
        this.f35731d = c2704a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2778b c2778b;
        String str;
        X7 x72;
        C2708e c2708e = this.f35732e;
        C2704a c2704a = this.f35731d;
        h hVar = this.f35730c;
        C4278o c4278o = this.f35729b;
        switch (this.f35728a) {
            case 0:
                C2708e.c(c2708e, c2704a, new C2780d(c4278o, hVar));
                break;
            case 1:
                boolean zEquals = Boolean.TRUE.equals(c4278o.a("noResult"));
                boolean zEquals2 = Boolean.TRUE.equals(c4278o.a("continueOnError"));
                List<Map> list = (List) c4278o.a("operations");
                ArrayList arrayList = new ArrayList();
                for (Map map : list) {
                    c2778b = new C2778b(map, zEquals);
                    str = (String) map.get("method");
                    str.getClass();
                    x72 = c2778b.f36143b;
                    switch (str) {
                        case "execute":
                            HashMap map2 = C2708e.f35744c;
                            c2708e.getClass();
                            if (C2708e.g(c2704a, c2778b)) {
                                c2778b.b(null);
                                c2778b.v0(arrayList);
                                break;
                            } else if (zEquals2) {
                                c2778b.u0(arrayList);
                                break;
                            } else {
                                hVar.b((String) x72.f13842b, (String) x72.f13843c, (HashMap) x72.f13844d);
                                break;
                            }
                        case "insert":
                            if (C2708e.b(c2708e, c2704a, c2778b)) {
                                c2778b.v0(arrayList);
                                break;
                            } else if (zEquals2) {
                                c2778b.u0(arrayList);
                                break;
                            } else {
                                hVar.b((String) x72.f13842b, (String) x72.f13843c, (HashMap) x72.f13844d);
                                break;
                            }
                        case "update":
                            if (C2708e.d(c2708e, c2704a, c2778b)) {
                                c2778b.v0(arrayList);
                                break;
                            } else if (zEquals2) {
                                c2778b.u0(arrayList);
                                break;
                            } else {
                                hVar.b((String) x72.f13842b, (String) x72.f13843c, (HashMap) x72.f13844d);
                                break;
                            }
                        case "query":
                            if (C2708e.c(c2708e, c2704a, c2778b)) {
                                c2778b.v0(arrayList);
                                break;
                            } else if (zEquals2) {
                                c2778b.u0(arrayList);
                                break;
                            } else {
                                hVar.b((String) x72.f13842b, (String) x72.f13843c, (HashMap) x72.f13844d);
                                break;
                            }
                        default:
                            hVar.b("bad_param", AbstractC0279p0.l("Batch method '", str, "' not supported"), null);
                            break;
                    }
                }
                if (zEquals) {
                    hVar.a(null);
                    break;
                } else {
                    hVar.a(arrayList);
                    break;
                }
            case 2:
                C2708e.b(c2708e, c2704a, new C2780d(c4278o, hVar));
                break;
            case 3:
                HashMap map3 = C2708e.f35744c;
                c2708e.getClass();
                if (!C2708e.g(c2704a, new C2779c(hVar, new C2709f((String) c4278o.a("sql"), (List) c4278o.a("arguments")), (Boolean) c4278o.a("inTransaction")))) {
                    c2704a = null;
                }
                if (c2704a != null) {
                    hVar.a(null);
                    break;
                }
                break;
            default:
                C2708e.d(c2708e, c2704a, new C2780d(c4278o, hVar));
                break;
        }
    }

    public RunnableC2705b(C2708e c2708e, C2704a c2704a, C4278o c4278o, h hVar) {
        this.f35728a = 3;
        this.f35732e = c2708e;
        this.f35731d = c2704a;
        this.f35729b = c4278o;
        this.f35730c = hVar;
    }
}
