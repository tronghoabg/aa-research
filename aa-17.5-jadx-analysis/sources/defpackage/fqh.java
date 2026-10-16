package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fqh {
    public static final long a = dlf.v(0, 0);

    public static final long a(long j) {
        return (afgi.k(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (afgi.k(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final afec b(afec afecVar, afec afecVar2, afec afecVar3) {
        if (afecVar == null && afecVar2 == null && afecVar3 == null) {
            return null;
        }
        return new cib((Object) afecVar, (Object) afecVar2, (Object) afecVar3, 8, (byte[]) null);
    }

    public static final afec c(cmw cmwVar, cmw cmwVar2, cmw cmwVar3) {
        return (cmwVar == null && cmwVar2 == null && cmwVar3 == null) ? fqd.a : new cib((Object) cmwVar, (Object) cmwVar3, (Object) cmwVar2, 9, (byte[]) null);
    }

    public static final fsy d(Object obj, bux buxVar) {
        if (obj instanceof fsy) {
            buxVar.v(1699437212);
            ((bvv) buxVar).Y(false);
            return (fsy) obj;
        }
        buxVar.v(1699472707);
        fsw fswVar = new fsw((Context) buxVar.f(daa.b));
        fswVar.a = obj;
        fsy fsyVarA = fswVar.a();
        ((bvv) buxVar).Y(false);
        return fsyVarA;
    }
}
