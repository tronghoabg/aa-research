package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class ujl extends ukd {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final toq[] e;
    public final int f;
    public final ukf g;
    public final ukf h;
    public final int i;
    public final int j;
    public final int k;
    public final abiy l;
    public final abjp m;
    public final abjw n;
    public final abkn o;
    public final toc p;
    public final yfy q;
    public final abst r;
    public final abbb s;
    public final boolean t;
    public final yfh u;

    public ujl(float f, float f2, int i, int i2, toq[] toqVarArr, ukf ukfVar, ukf ukfVar2, uju ujuVar, int i3, int i4, int i5, int i6, abiy abiyVar, abjp abjpVar, abjw abjwVar, abkn abknVar, yfh yfhVar, toc tocVar, yfy yfyVar, abst abstVar, abbb abbbVar, boolean z, int i7) {
        super(ujuVar, i7);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = toqVarArr;
        this.f = i6;
        this.g = ukfVar;
        this.h = ukfVar2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = abiyVar;
        this.m = abjpVar;
        this.n = abjwVar;
        this.o = abknVar;
        this.s = abbbVar;
        this.u = yfhVar;
        this.p = tocVar;
        this.r = abstVar;
        this.q = yfyVar;
        this.t = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.abdd r42, defpackage.tof r43, defpackage.ujx r44, defpackage.ukq r45, boolean r46, java.util.List r47, defpackage.aekf r48) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujl.d(abdd, tof, ujx, ukq, boolean, java.util.List, aekf):void");
    }

    public static boolean e(ukd ukdVar, ujf ujfVar) {
        return ukdVar.a() == 8 && ujfVar.o.length != 0;
    }

    public static boolean f(ukd ukdVar, ujf ujfVar) {
        if (ukdVar.a() != 8) {
            return false;
        }
        ujl ujlVar = (ujl) ukdVar;
        abiy abiyVar = ujlVar.l;
        if ((abiyVar != null && !abiyVar.e.isEmpty()) || ujlVar.n != null || ujlVar.m != null || ujlVar.o != null) {
            return true;
        }
        if (uqw.x(ujlVar.f, 1)) {
            return false;
        }
        for (uke ukeVar : ujfVar.o) {
            if (ukeVar.h != BitmapDescriptorFactory.HUE_RED) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ukd
    public final int a() {
        return 8;
    }

    @Override // defpackage.ukd
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ukd
    public final int c() {
        return this.d;
    }
}
