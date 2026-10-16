package defpackage;

import j$.util.Optional;

/* loaded from: classes3.dex */
public final class zwm {
    public achj a = achj.a;
    public abgi b = abgi.a;
    final /* synthetic */ zwn c;
    public final qsb d;

    public zwm(zwn zwnVar) {
        this.c = zwnVar;
        trd trdVar = new trd();
        ygp ygpVar = new ygp();
        ygp ygpVar2 = new ygp();
        abgx abgxVar = abgx.ROADMAP;
        ygpVar.c(abgxVar);
        abgx abgxVar2 = abgx.ROADMAP_DARK;
        ygpVar.c(abgxVar2);
        ygpVar2.c(abgxVar);
        ygpVar2.c(abgxVar2);
        adds addsVar = adds.a;
        if (addsVar.gu().b()) {
            ygpVar.c(abgx.NAVIGATION);
        }
        if (addsVar.gu().c()) {
            ygpVar.c(abgx.NAVIGATION_LOW_LIGHT);
        }
        if (addsVar.gu().a()) {
            ygpVar.c(abgx.ROADMAP_SATELLITE);
        }
        if (addsVar.gu().d()) {
            ygpVar.c(abgx.TERRAIN_VECTOR_CLIENT);
        }
        if (addsVar.gu().e()) {
            ygpVar.c(abgx.TERRAIN_VECTOR_CLIENT_DARK);
        }
        if (adds.c()) {
            ygpVar.c(abgx.TRANSIT_FOCUSED);
            ygpVar.c(abgx.TRANSIT_FOCUSED_DARK);
        }
        trdVar.a = ygpVar.g();
        trdVar.b = ygpVar2.g();
        this.d = new qsb(trdVar);
    }

    public static final tqz f() {
        return new tqz(xvy.a);
    }

    public final synchronized tra a() {
        Optional optionalEmpty;
        String str;
        aekg aekgVar;
        optionalEmpty = Optional.empty();
        str = this.a.d;
        str.getClass();
        aekgVar = aekj.a;
        aekgVar.getClass();
        return new tra(aekgVar, str, (int) addv.a.gu().a(), this.c.e, optionalEmpty);
    }

    public final synchronized tre b() {
        int iIntValue;
        acgk acgkVar;
        iIntValue = ((Integer) this.c.d.b().orElse(0)).intValue();
        acgkVar = acgk.b;
        acgkVar.getClass();
        return new tre(1.5f, 300, acgkVar, 10080, 43200, true, ygr.m(xxx.c(',').f().b().g("")), iIntValue);
    }

    public final synchronized aauo c() {
        return aauo.a;
    }

    public final synchronized abgi d() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.aavd r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwm.e(aavd):void");
    }

    public final synchronized void g() {
    }

    public final synchronized qsb h() {
        return this.d;
    }
}
