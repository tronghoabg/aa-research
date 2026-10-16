package defpackage;

/* loaded from: classes2.dex */
public final class aits {
    public static final afco a(afco afcoVar, afco afcoVar2) {
        return !e(afcoVar2) ? afcoVar.plus(afcoVar2) : d(afcoVar, afcoVar2, false);
    }

    public static final afco b(aitx aitxVar, afco afcoVar) {
        afco afcoVarD = d(aitxVar.c(), afcoVar, true);
        afco afcoVarPlus = aitz.a ? afcoVarD.plus(new aitv(aitz.c.incrementAndGet())) : afcoVarD;
        aitu aituVar = aium.a;
        return (afcoVarD == aituVar || afcoVarD.get(afcl.k) != null) ? afcoVarPlus : afcoVarPlus.plus(aituVar);
    }

    public static final aiwp c(afck afckVar, afco afcoVar, Object obj) {
        aiwp aiwpVar = null;
        if (!(afckVar instanceof afdb)) {
            return null;
        }
        if (afcoVar.get(aiwq.a) != null) {
            afdb afdbVarEb = (afdb) afckVar;
            while (true) {
                if ((afdbVarEb instanceof aiuj) || (afdbVarEb = afdbVarEb.eb()) == null) {
                    break;
                }
                if (afdbVarEb instanceof aiwp) {
                    aiwpVar = (aiwp) afdbVarEb;
                    break;
                }
            }
            if (aiwpVar != null) {
                aiwpVar.R(afcoVar, obj);
            }
        }
        return aiwpVar;
    }

    private static final afco d(afco afcoVar, afco afcoVar2, boolean z) {
        boolean zE = e(afcoVar);
        boolean zE2 = e(afcoVar2);
        if (!zE && !zE2) {
            return afcoVar.plus(afcoVar2);
        }
        affv affvVar = new affv();
        affvVar.a = afcoVar2;
        afcp afcpVar = afcp.a;
        afco afcoVar3 = (afco) afcoVar.fold(afcpVar, new jtl(affvVar, z, 7));
        if (zE2) {
            affvVar.a = ((afco) affvVar.a).fold(afcpVar, new ooh(13));
        }
        return afcoVar3.plus((afco) affvVar.a);
    }

    private static final boolean e(afco afcoVar) {
        return ((Boolean) afcoVar.fold(false, new nno(12))).booleanValue();
    }
}
