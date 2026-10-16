package com.bumptech.glide.load.a.a;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final e f2945a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    private final Map f2946b = new HashMap();

    f() {
    }

    private static void d(e eVar) {
        e eVar2 = eVar.f2943c;
        eVar2.f2942b = eVar.f2942b;
        eVar.f2942b.f2943c = eVar2;
    }

    private static void e(e eVar) {
        eVar.f2942b.f2943c = eVar;
        eVar.f2943c.f2942b = eVar;
    }

    public final Object a(m mVar) {
        Map map = this.f2946b;
        e eVar = (e) map.get(mVar);
        if (eVar == null) {
            eVar = new e(mVar);
            map.put(mVar, eVar);
        } else {
            mVar.b();
        }
        d(eVar);
        e eVar2 = this.f2945a;
        eVar.f2943c = eVar2;
        eVar.f2942b = eVar2.f2942b;
        e(eVar);
        return eVar.b();
    }

    public final Object b() {
        e eVar = this.f2945a;
        for (e eVar2 = eVar.f2943c; !eVar2.equals(eVar); eVar2 = eVar2.f2943c) {
            Object objB = eVar2.b();
            if (objB != null) {
                return objB;
            }
            d(eVar2);
            Map map = this.f2946b;
            Object obj = eVar2.f2941a;
            map.remove(obj);
            ((m) obj).b();
        }
        return null;
    }

    public final void c(m mVar, Object obj) {
        Map map = this.f2946b;
        e eVar = (e) map.get(mVar);
        if (eVar == null) {
            eVar = new e(mVar);
            d(eVar);
            e eVar2 = this.f2945a;
            eVar.f2943c = eVar2.f2943c;
            eVar.f2942b = eVar2;
            e(eVar);
            map.put(mVar, eVar);
        } else {
            mVar.b();
        }
        eVar.c(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        e eVar = this.f2945a;
        e eVar2 = eVar.f2942b;
        boolean z = false;
        while (!eVar2.equals(eVar)) {
            sb.append('{');
            sb.append(eVar2.f2941a);
            sb.append(':');
            sb.append(eVar2.a());
            sb.append("}, ");
            eVar2 = eVar2.f2942b;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
