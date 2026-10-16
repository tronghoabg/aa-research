package defpackage;

/* loaded from: classes3.dex */
final class vzh implements vzi {
    private final /* synthetic */ int a;

    public vzh(int i) {
        this.a = i;
    }

    @Override // defpackage.vzi
    public final /* synthetic */ String a(abov abovVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((ajfl) ((abnr) abovVar).b).c : ((ajgu) ((abnp) abovVar).b).e : ((ajel) ((abnp) abovVar).b).f;
    }

    @Override // defpackage.vzi
    public final /* synthetic */ String b(abov abovVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((ajfl) ((abnr) abovVar).b).e : ((ajgu) ((abnp) abovVar).b).d : ((ajel) ((abnp) abovVar).b).e;
    }

    @Override // defpackage.vzi
    public final /* synthetic */ void c(abov abovVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                abnp abnpVar = (abnp) abovVar;
                abnpVar.t();
                ajel ajelVar = (ajel) abnpVar.b;
                ajel ajelVar2 = ajel.a;
                ajelVar.b &= -3;
                ajelVar.d = 0L;
                return;
            }
            long jLongValue = l.longValue();
            abnp abnpVar2 = (abnp) abovVar;
            abnpVar2.t();
            ajel ajelVar3 = (ajel) abnpVar2.b;
            ajel ajelVar4 = ajel.a;
            ajelVar3.b |= 2;
            ajelVar3.d = jLongValue;
            return;
        }
        if (i != 1) {
            abnr abnrVar = (abnr) abovVar;
            if (l == null) {
                abnrVar.t();
                ajfl ajflVar = (ajfl) abnrVar.b;
                ajfl ajflVar2 = ajfl.a;
                ajflVar.b &= -3;
                ajflVar.d = 0L;
                return;
            }
            long jLongValue2 = l.longValue();
            abnrVar.t();
            ajfl ajflVar3 = (ajfl) abnrVar.b;
            ajfl ajflVar4 = ajfl.a;
            ajflVar3.b |= 2;
            ajflVar3.d = jLongValue2;
            return;
        }
        if (l == null) {
            abnp abnpVar3 = (abnp) abovVar;
            abnpVar3.t();
            ajgu ajguVar = (ajgu) abnpVar3.b;
            ajgu ajguVar2 = ajgu.a;
            ajguVar.b &= -2;
            ajguVar.c = 0L;
            return;
        }
        long jLongValue3 = l.longValue();
        abnp abnpVar4 = (abnp) abovVar;
        abnpVar4.t();
        ajgu ajguVar3 = (ajgu) abnpVar4.b;
        ajgu ajguVar4 = ajgu.a;
        ajguVar3.b |= 1;
        ajguVar3.c = jLongValue3;
    }

    @Override // defpackage.vzi
    public final /* synthetic */ void d(abov abovVar) {
        int i = this.a;
        if (i == 0) {
            abnp abnpVar = (abnp) abovVar;
            abnpVar.t();
            ajel ajelVar = (ajel) abnpVar.b;
            ajel ajelVar2 = ajel.a;
            ajelVar.b &= -5;
            ajelVar.e = ajel.a.e;
            return;
        }
        if (i != 1) {
            abnr abnrVar = (abnr) abovVar;
            abnrVar.t();
            ajfl ajflVar = (ajfl) abnrVar.b;
            ajfl ajflVar2 = ajfl.a;
            ajflVar.b &= -5;
            ajflVar.e = ajfl.a.e;
            return;
        }
        abnp abnpVar2 = (abnp) abovVar;
        abnpVar2.t();
        ajgu ajguVar = (ajgu) abnpVar2.b;
        ajgu ajguVar2 = ajgu.a;
        ajguVar.b &= -3;
        ajguVar.d = ajgu.a.d;
    }
}
