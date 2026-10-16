package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class ekm {
    public static final ekm a = new ekm();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final ejy c = new ejy();

    private ekm() {
    }

    public final ekp a(Class cls) {
        dtg dtgVarA;
        ekp ekpVarJ;
        Charset charset = ejn.a;
        a.al(cls, "messageType");
        ConcurrentMap concurrentMap = this.b;
        ekp ekpVar = (ekp) concurrentMap.get(cls);
        if (ekpVar != null) {
            return ekpVar;
        }
        ejy ejyVar = this.c;
        Class cls2 = ekq.a;
        if (!eji.class.isAssignableFrom(cls)) {
            Class cls3 = eig.a;
            Class cls4 = ekq.a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        ekb ekbVarA = ejyVar.a.a(cls);
        if (!ekbVarA.b()) {
            if (ejy.b(cls)) {
                dti dtiVar = ekj.a;
                dth dthVar = eju.a;
                eky ekyVar = ekq.c;
                dtgVarA = ejy.a(ekbVarA) ? ejb.a : null;
                dth dthVar2 = eka.a;
                ekpVarJ = ekh.j(ekbVarA, ekyVar, dtgVarA);
            } else {
                dti dtiVar2 = ekj.a;
                dth dthVar3 = eju.a;
                eky ekyVar2 = ekq.b;
                dtgVarA = ejy.a(ekbVarA) ? ejb.a() : null;
                dth dthVar4 = eka.a;
                ekpVarJ = ekh.j(ekbVarA, ekyVar2, dtgVarA);
            }
        } else if (ejy.b(cls)) {
            eky ekyVar3 = ekq.c;
            dtg dtgVar = ejb.a;
            ekpVarJ = new eki(ekyVar3, ekbVarA.a());
        } else {
            eky ekyVar4 = ekq.b;
            ejb.a();
            ekpVarJ = new eki(ekyVar4, ekbVarA.a());
        }
        a.al(cls, "messageType");
        ekp ekpVar2 = (ekp) concurrentMap.putIfAbsent(cls, ekpVarJ);
        return ekpVar2 != null ? ekpVar2 : ekpVarJ;
    }

    public final ekp b(Object obj) {
        return a(obj.getClass());
    }
}
