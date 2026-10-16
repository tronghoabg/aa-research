package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ak f51892a = new ak("CLOSED");

    public static final e a(e eVar) {
        while (true) {
            Object objB = eVar.b();
            if (objB == f51892a) {
                break;
            }
            e eVar2 = (e) objB;
            if (eVar2 != null) {
                eVar = eVar2;
            } else if (eVar.s()) {
                break;
            }
        }
        return eVar;
    }

    public static final Object c(e eVar, long j2, h.g.a.p pVar) {
        while (true) {
            long j3 = eVar.f51893a;
            if (j3 >= j2 && !eVar.w()) {
                return eVar;
            }
            Object objB = eVar.b();
            ak akVar = f51892a;
            if (objB == akVar) {
                return akVar;
            }
            e eVar2 = (e) objB;
            if (eVar2 != null) {
                eVar = eVar2;
            } else {
                e eVar3 = (e) pVar.invoke(Long.valueOf(j3 + 1), eVar);
                if (eVar.t(eVar3)) {
                    if (eVar.w()) {
                        eVar.q();
                    }
                    eVar = eVar3;
                }
            }
        }
    }
}
