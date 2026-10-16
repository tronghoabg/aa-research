package defpackage;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
final class vtq {
    public final Context a;
    final aezk b;
    final aezk c;
    final aezk d;
    public final aezk e;
    public final aezk f;
    public final aezk g;
    public final aezk h;
    public final aezk i;
    public final aezk j;
    public final aezk k;
    public final aezk l;
    public final aezk m;
    public final aezk n;
    public final vou o;

    public vtq(Context context, vou vouVar, aezk aezkVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4, aezk aezkVar5, aezk aezkVar6, aezk aezkVar7, aezk aezkVar8, aezk aezkVar9, aezk aezkVar10, aezk aezkVar11, aezk aezkVar12, aezk aezkVar13) {
        this.a = context;
        this.o = vouVar;
        this.b = aezkVar;
        this.c = aezkVar2;
        this.d = aezkVar3;
        this.e = aezkVar4;
        this.h = aezkVar7;
        this.i = aezkVar8;
        this.j = aezkVar9;
        this.f = aezkVar5;
        this.g = aezkVar6;
        this.k = aezkVar10;
        this.l = aezkVar11;
        this.m = aezkVar12;
        this.n = aezkVar13;
    }

    public static yfq a(abzr abzrVar, Map map, long j) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        long j2 = 0;
        for (abzp abzpVar : abzrVar.c) {
            if (j >= 0) {
                long j3 = 1 + j2;
                if (j2 >= j) {
                    break;
                }
                j2 = j3;
            }
            abnp abnpVarN = abso.a.n();
            long j4 = abzpVar.b;
            abnpVarN.t();
            abso absoVar = (abso) abnpVarN.b;
            absoVar.b |= 1;
            absoVar.c = j4;
            if (!abzpVar.c.isEmpty()) {
                String str = abzpVar.c;
                abnpVarN.t();
                abso absoVar2 = (abso) abnpVarN.b;
                str.getClass();
                absoVar2.b |= 2;
                absoVar2.d = str;
            }
            acjs acjsVar = (acjs) map.get(abzpVar.e);
            if (acjsVar != null) {
                abnpVarN.t();
                abso absoVar3 = (abso) abnpVarN.b;
                absoVar3.b |= 4;
                absoVar3.e = acjsVar.a;
            }
            yflVar.i((abso) abnpVarN.q());
        }
        return yflVar.g();
    }
}
