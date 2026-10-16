package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aahf {
    public static final String a = "aahf";
    public static final aahf b = new aahf();
    public static final acho c;
    public static final acij d;

    static {
        abnp abnpVarN = acho.a.n();
        achn achnVar = achn.CJPEG;
        abnpVarN.t();
        acho achoVar = (acho) abnpVarN.b;
        abod abodVar = achoVar.f;
        if (!abodVar.c()) {
            achoVar.f = abnv.G(abodVar);
        }
        achoVar.f.g(achnVar.e);
        c = (acho) abnpVarN.q();
        abnp abnpVarN2 = acij.a.n();
        abnpVarN2.t();
        acij acijVar = (acij) abnpVarN2.b;
        acijVar.b |= 2;
        acijVar.d = true;
        abnpVarN2.t();
        acij acijVar2 = (acij) abnpVarN2.b;
        acijVar2.b |= 4;
        acijVar2.e = true;
        d = (acij) abnpVarN2.q();
    }

    private aahf() {
    }

    public static final Map a(aciy aciyVar) {
        zkt.n(aciyVar, "responseProto");
        HashMap map = new HashMap();
        String str = aciyVar.c;
        acix acixVar = aciyVar.f;
        if (acixVar == null) {
            acixVar = acix.a;
        }
        int i = acixVar.b;
        for (aciw aciwVar : acixVar.e) {
            map.put(new aagj(str, aciwVar.c, aciwVar.d, i), aciwVar.f.D());
        }
        return map;
    }

    public static final abnp b(int i, int i2, int i3) {
        abnp abnpVarN = aciq.a.n();
        abnp abnpVarN2 = acip.a.n();
        abnpVarN2.t();
        acip acipVar = (acip) abnpVarN2.b;
        acipVar.b |= 1;
        acipVar.c = i;
        abnpVarN2.t();
        acip acipVar2 = (acip) abnpVarN2.b;
        acipVar2.b |= 2;
        acipVar2.d = i2;
        abnpVarN.t();
        aciq aciqVar = (aciq) abnpVarN.b;
        acip acipVar3 = (acip) abnpVarN2.q();
        acipVar3.getClass();
        aboh abohVar = aciqVar.f;
        if (!abohVar.c()) {
            aciqVar.f = abnv.I(abohVar);
        }
        aciqVar.f.add(acipVar3);
        abnpVarN.t();
        aciq aciqVar2 = (aciq) abnpVarN.b;
        aciqVar2.b |= 4;
        aciqVar2.e = i3;
        acho achoVar = c;
        abnpVarN.t();
        aciq aciqVar3 = (aciq) abnpVarN.b;
        achoVar.getClass();
        aciqVar3.c = achoVar;
        aciqVar3.b |= 1;
        abnpVarN.t();
        aciq aciqVar4 = (aciq) abnpVarN.b;
        aciqVar4.b |= 2;
        aciqVar4.d = sk.AUDIO_CONTENT_BUFFER_SIZE;
        aciq aciqVar5 = (aciq) abnpVarN.q();
        abnp abnpVarN3 = acir.a.n();
        abnpVarN3.t();
        acir acirVar = (acir) abnpVarN3.b;
        aciqVar5.getClass();
        acirVar.j = aciqVar5;
        acirVar.b |= 128;
        abnpVarN3.t();
        acir acirVar2 = (acir) abnpVarN3.b;
        acirVar2.b |= 4096;
        acirVar2.o = 4;
        abnpVarN3.t();
        acir acirVar3 = (acir) abnpVarN3.b;
        acirVar3.b |= 2048;
        acirVar3.n = true;
        acik acikVar = acik.SPHERICAL;
        abnpVarN3.t();
        acir acirVar4 = (acir) abnpVarN3.b;
        abod abodVar = acirVar4.p;
        if (!abodVar.c()) {
            acirVar4.p = abnv.G(abodVar);
        }
        acirVar4.p.g(acikVar.c);
        return abnpVarN3;
    }
}
