package zg;

import A7.AbstractC0279p0;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48522b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f48523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48524d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48525e;

    public /* synthetic */ C(Method method, int i5, boolean z2, int i10) {
        this.f48522b = i10;
        this.f48523c = method;
        this.f48524d = i5;
        this.f48525e = z2;
    }

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        switch (this.f48522b) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f48523c;
                int i5 = this.f48524d;
                if (map == null) {
                    throw a0.k(method, i5, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw a0.k(method, i5, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw a0.k(method, i5, AbstractC0279p0.l("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw a0.k(method, i5, "Field map value '" + value + "' converted to null by " + C4662a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    n10.a(str, string, this.f48525e);
                }
                return;
            default:
                Map map2 = (Map) obj;
                Method method2 = this.f48523c;
                int i10 = this.f48524d;
                if (map2 == null) {
                    throw a0.k(method2, i10, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw a0.k(method2, i10, "Query map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw a0.k(method2, i10, AbstractC0279p0.l("Query map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    String string2 = value2.toString();
                    if (string2 == null) {
                        throw a0.k(method2, i10, "Query map value '" + value2 + "' converted to null by " + C4662a.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                    }
                    n10.d(str2, string2, this.f48525e);
                }
                return;
        }
    }
}
