package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class y {
    public static final h.c.j a(h.c.j jVar, h.c.j jVar2) {
        return !e(jVar2) ? jVar.plus(jVar2) : d(jVar, jVar2, false);
    }

    public static final h.c.j b(af afVar, h.c.j jVar) {
        h.c.j jVarD = d(afVar.getCoroutineContext(), jVar, true);
        h.c.j jVarPlus = ai.b() ? jVarD.plus(new ad(ai.a().incrementAndGet())) : jVarD;
        return (jVarD == av.a() || jVarD.get(h.c.g.f48059a) != null) ? jVarPlus : jVarPlus.plus(av.a());
    }

    public static final dj c(h.c.e eVar, h.c.j jVar, Object obj) {
        dj djVar = null;
        if (!(eVar instanceof h.c.b.a.d)) {
            return null;
        }
        if (jVar.get(dk.f51847a) != null) {
            h.c.b.a.d callerFrame = (h.c.b.a.d) eVar;
            while (true) {
                if ((callerFrame instanceof as) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof dj) {
                    djVar = (dj) callerFrame;
                    break;
                }
            }
            if (djVar != null) {
                djVar.j(jVar, obj);
            }
        }
        return djVar;
    }

    private static final h.c.j d(h.c.j jVar, h.c.j jVar2, boolean z) {
        boolean zE = e(jVar);
        boolean zE2 = e(jVar2);
        if (!zE && !zE2) {
            return jVar.plus(jVar2);
        }
        h.g.b.aq aqVar = new h.g.b.aq();
        aqVar.f48105a = jVar2;
        h.c.k kVar = h.c.k.f48060a;
        h.c.j jVar3 = (h.c.j) jVar.fold(kVar, new com.waze.z.a.a.g(aqVar, z, 2));
        if (zE2) {
            aqVar.f48105a = ((h.c.j) aqVar.f48105a).fold(kVar, new com.waze.cf.j(7));
        }
        return jVar3.plus((h.c.j) aqVar.f48105a);
    }

    private static final boolean e(h.c.j jVar) {
        return ((Boolean) jVar.fold(false, new com.waze.cf.j(6))).booleanValue();
    }
}
