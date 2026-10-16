package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class cdq implements cdp {
    private final afec a;
    private final aan b;
    private aan c;

    public cdq(Map map, afec afecVar) {
        this.a = afecVar;
        aan aanVar = null;
        if (map != null && !map.isEmpty()) {
            aanVar = new aan(map.size());
            for (Map.Entry entry : map.entrySet()) {
                aanVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = aanVar;
    }

    @Override // defpackage.cdp
    public final Object a(String str) {
        aan aanVar = this.b;
        List list = aanVar != null ? (List) aanVar.i(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.cdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdq.b():java.util.Map");
    }

    @Override // defpackage.cdp
    public final boolean d(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // defpackage.cdp
    public final rpp e(String str, afdr afdrVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!afuq.a(str.charAt(i))) {
                aan aanVar = this.c;
                if (aanVar == null) {
                    long[] jArr = aao.a;
                    aanVar = new aan(6);
                    this.c = aanVar;
                }
                Object objA = aanVar.a(str);
                if (objA == null) {
                    objA = new ArrayList();
                    aanVar.m(str, objA);
                }
                ((List) objA).add(afdrVar);
                return new rpp(aanVar, str, afdrVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
