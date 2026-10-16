package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class nhb implements afeg {
    public final /* synthetic */ njw a;
    public final /* synthetic */ njp b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ bwq e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    private final /* synthetic */ int l;

    public /* synthetic */ nhb(njw njwVar, njp njpVar, boolean z, boolean z2, afec afecVar, Map map, bwq bwqVar, afdr afdrVar, boolean z3, boolean z4, boolean z5, int i) {
        this.l = i;
        this.a = njwVar;
        this.b = njpVar;
        this.c = z;
        this.d = z2;
        this.k = afecVar;
        this.i = map;
        this.e = bwqVar;
        this.j = afdrVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.l == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int i = iIntValue & 3;
            int i2 = iIntValue & 1;
            yph yphVar = nhm.a;
            if (buxVar.I(i != 2, i2)) {
                boolean z = this.h;
                boolean z2 = this.g;
                boolean z3 = this.f;
                ?? r9 = this.k;
                bwq bwqVar = this.e;
                ?? r7 = this.j;
                Object obj3 = this.i;
                boolean z4 = this.d;
                boolean z5 = this.c;
                njp njpVar = this.b;
                njw njwVar = this.a;
                cfy cfyVarB = awd.b(cfy.e, 1.0f);
                yph yphVar2 = njw.a;
                nhm.k(njwVar, njpVar, z5, z4, (nok) obj3, cfyVarB, r7, bwqVar, r9, z3, z2, z, buxVar, 229448, 0);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        int i3 = iIntValue2 & 3;
        int i4 = iIntValue2 & 1;
        yph yphVar3 = nhm.a;
        if (buxVar2.I(i3 != 2, i4)) {
            boolean z6 = this.h;
            boolean z7 = this.g;
            boolean z8 = this.f;
            ?? r14 = this.j;
            bwq bwqVar2 = this.e;
            ?? r12 = this.i;
            ?? r5 = this.k;
            boolean z9 = this.d;
            boolean z10 = this.c;
            njp njpVar2 = this.b;
            njw njwVar2 = this.a;
            nok nokVar = (nok) r5.invoke(nlz.e);
            cfy cfyVarB2 = awd.b(cfy.e, 1.0f);
            yph yphVar4 = njw.a;
            nhm.l(njwVar2, njpVar2, z10, z9, nokVar, cfyVarB2, r12, bwqVar2, r14, z8, z7, z6, buxVar2, 229448, 0);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ nhb(njw njwVar, njp njpVar, boolean z, boolean z2, nok nokVar, Map map, bwq bwqVar, afdr afdrVar, boolean z3, boolean z4, boolean z5, int i) {
        this.l = i;
        this.a = njwVar;
        this.b = njpVar;
        this.c = z;
        this.d = z2;
        this.i = nokVar;
        this.j = map;
        this.e = bwqVar;
        this.k = afdrVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }
}
