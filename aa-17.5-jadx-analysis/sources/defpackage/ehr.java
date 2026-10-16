package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ehr {
    public ehp a;
    public boolean b;
    private final eha c;
    private final Callable d;
    private final List e = new ArrayList();
    private aitu f;

    public ehr(eha ehaVar, Callable callable) {
        this.c = ehaVar;
        this.d = callable;
        aitu aituVar = aium.a;
        this.f = ajdk.a;
    }

    public final void a(Executor executor) {
        executor.getClass();
        this.f = aiji.b(executor);
    }

    public final ncp b() {
        efa efaVarA;
        if (this.b) {
            ehq ehqVar = new ehq(this.d, 0);
            eha ehaVar = this.c;
            Object ehoVar = this.a;
            List list = this.e;
            aitx aitxVarB = ahni.b(this.f.plus(new aiwh(null)));
            eez eezVar = new eez(new egi(ehaVar, new ddz(aitxVarB, 17), ehqVar), dsz.i(aitxVarB));
            if (ehoVar == null) {
                ehoVar = new eho();
            }
            eezVar.b = ehoVar;
            eezVar.b(list);
            efaVarA = eezVar.a();
        } else {
            eez eezVar2 = new eez(new egi(this.c, new ehq(this.d, 2)), ((ajbw) ahni.b(this.f.plus(new aiwh(null)))).a);
            ehp ehpVar = this.a;
            if (ehpVar != null) {
                eezVar2.b = ehpVar;
            }
            eezVar2.b(this.e);
            efaVarA = eezVar2.a();
        }
        return new ncp((egd) efaVarA, this.f);
    }
}
