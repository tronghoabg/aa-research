package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfo {
    public static final long a;

    static {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        a = defpackage.dmh.h(0L, Float.NaN);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    public static final defpackage.dfn a(defpackage.dfn dfnVar, int i, int i2, long j, defpackage.dlh dlhVar, defpackage.dfq dfqVar, defpackage.dla dlaVar, int i3, int i4, defpackage.dli dliVar) {
        int i5;
        defpackage.dlh dlhVar2 = dlhVar;
        defpackage.dli dliVar2 = dliVar;
        long j2 = 1095216660480L & j;
        if (i == 0 || i == dfnVar.a) {
            defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
            if ((j2 == 0 || j == dfnVar.c) && ((dlhVar2 == null || defpackage.afga.f(dlhVar2, dfnVar.d)) && ((i2 == 0 || i2 == dfnVar.b) && ((dfqVar == null || defpackage.afga.f(dfqVar, dfnVar.e)) && ((dlaVar == null || defpackage.afga.f(dlaVar, dfnVar.f)) && (i3 == 0 || i3 == dfnVar.g)))))) {
                if (i4 != 0) {
                    i5 = 1;
                    if (dfnVar.h == 1) {
                    }
                } else {
                    i5 = i4;
                }
                if (dliVar2 == null || defpackage.afga.f(dliVar2, dfnVar.i)) {
                    return dfnVar;
                }
            } else {
                i5 = i4;
            }
        } else {
            i5 = i4;
        }
        defpackage.dmc[] dmcVarArr2 = defpackage.dmb.a;
        long j3 = j2 == 0 ? dfnVar.c : j;
        if (dlhVar2 == null) {
            dlhVar2 = dfnVar.d;
        }
        if (i == 0) {
            i = dfnVar.a;
        }
        int i6 = i2 == 0 ? dfnVar.b : i2;
        defpackage.dfq dfqVar2 = dfnVar.e;
        if (dfqVar2 == null || dfqVar != null) {
            dfqVar2 = dfqVar;
        }
        defpackage.dla dlaVar2 = dlaVar == null ? dfnVar.f : dlaVar;
        int i7 = i3 == 0 ? dfnVar.g : i3;
        if (i5 == 0) {
            i5 = dfnVar.h;
        }
        if (dliVar2 == null) {
            dliVar2 = dfnVar.i;
        }
        return new defpackage.dfn(i, i6, j3, dlhVar2, dfqVar2, dlaVar2, i7, i5, dliVar2);
    }
}
