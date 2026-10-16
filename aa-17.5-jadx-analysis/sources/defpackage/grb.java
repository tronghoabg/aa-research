package defpackage;

import com.google.android.projection.gearhead.R;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class grb extends gwc {
    public static final yob a = yob.c("com/android/car/libraries/apphost/media/emitter/MediaPlaybackTemplateInternalToUiModelEmitter");
    private final aiyk A;
    private final aiyk B;
    private final aiyk C;
    private final aiyk D;
    private final aiyk E;
    private final aiyk F;
    private final aiyk G;
    public final geu b;
    public final ggk c;
    public final boolean d;
    public final gqo e;
    public final gqh f;
    public final aiyk g;
    public final aiyk h;
    public final gpk i;
    public final gql j;
    public final aiyk k;
    public final aiyk l;
    public final usw m;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final String t;
    private final aiyk u;
    private final aiyk v;
    private final gbg w;
    private final gbg x;
    private final aiyk y;
    private final aiyk z;

    public grb(geu geuVar) {
        fmn fmnVar;
        boolean z;
        aiyk aiykVar;
        aiyk aiykVar2;
        fuu fuuVar;
        aiyk aiykVar3;
        jyc jycVar;
        boolean z2;
        this.b = geuVar;
        ggk ggkVar = (ggk) geuVar.F(ggk.class);
        this.c = ggkVar;
        boolean zU = ggkVar.u();
        this.q = zU;
        boolean zY = ggkVar.y();
        this.r = zY;
        this.d = ggkVar.f();
        boolean zM = ggkVar.m();
        this.s = zM;
        gqo gqoVar = new gqo(geuVar);
        this.e = gqoVar;
        usw uswVar = gqoVar.o;
        this.m = uswVar;
        String packageName = ((gmh) geuVar.d()).a.getPackageName();
        packageName.getClass();
        this.t = packageName;
        aiyk aiykVar4 = gqoVar.e;
        this.u = aiykVar4;
        aiyk aiykVar5 = gqoVar.f;
        this.v = aiykVar5;
        gbg gbgVarC = gax.c(geuVar, R.drawable.gs_close_vd_24, null);
        this.w = gbgVarC;
        gbg gbgVarC2 = gax.c(geuVar, R.drawable.gs_more_vert_vd_24, null);
        this.x = gbgVarC2;
        fmn fmnVar2 = new fmn(dtx.m(uswVar.b()), 9);
        this.y = fmnVar2;
        aiyk aiykVar6 = gqoVar.g;
        aiyk aiykVar7 = gqoVar.h;
        aiyk aiykVar8 = gqoVar.i;
        aiyk aiykVar9 = gqoVar.j;
        if (zM && geuVar.d().e()) {
            fmnVar = fmnVar2;
            z = true;
        } else {
            fmnVar = fmnVar2;
            z = false;
        }
        this.f = new gqh(aiykVar6, aiykVar7, aiykVar8, aiykVar9, gbgVarC2, gbgVarC, zU, aiykVar5, fmnVar, z);
        aiyb aiybVar = new aiyb(new gqu(this, null));
        this.z = aiybVar;
        fuu fuuVar2 = new fuu(aiybVar, this, 11);
        this.A = fuuVar2;
        this.g = !ggkVar.z(packageName) ? new fmn(aiykVar4, 10) : new aiyb(new gqn((afck) null, 2, (char[]) null));
        this.h = new fmn(aiykVar4, 11);
        this.i = new gpk(gqoVar.k, gqoVar.l, gqoVar.m);
        jyc jycVar2 = new jyc(dtx.m(uswVar.c()), dtx.m(uswVar.a()), new grz((Object) this, 1, (byte[]) null), 5);
        this.B = jycVar2;
        fuu fuuVar3 = new fuu(dtx.m(uswVar.a()), this, 12);
        this.C = fuuVar3;
        aiyk fmnVar3 = !ggkVar.z(packageName) ? new fmn(aiykVar4, 12) : new aiyb(new gqn((afck) null, 3, (short[]) null));
        this.D = fmnVar3;
        aiyk aiykVarA = aiyr.a(new jyc(dtx.m(uswVar.b()), dtx.m(uswVar.a()), new gqx(null, 0), 5));
        this.E = aiykVarA;
        aiyk aiykVar10 = gqoVar.n;
        if (!zY || ggkVar.z(packageName)) {
            aiykVar = fmnVar3;
            aiykVar2 = aiykVar10;
            fuuVar = fuuVar3;
            aiykVar3 = aiykVarA;
            jycVar = jycVar2;
            z2 = false;
        } else {
            aiykVar = fmnVar3;
            aiykVar2 = aiykVar10;
            fuuVar = fuuVar3;
            aiykVar3 = aiykVarA;
            z2 = true;
            jycVar = jycVar2;
        }
        this.j = new gql(jycVar, aiykVar2, fuuVar, aiykVar, aiykVar3, fmnVar, z2);
        this.k = aiyr.a(dtx.m((eqj) uswVar.e));
        this.l = ajac.a(null);
        jxz jxzVar = new jxz(this.n, 6);
        gon gonVar = new gon((afck) null, this, 3);
        int i = aizc.a;
        ajaq ajaqVar = new ajaq(gonVar, jxzVar);
        this.F = ajaqVar;
        this.G = new jyc(new jxz(ajaqVar, 6), fuuVar2, new gra(this, (afck) null, 0), 5);
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.G;
    }

    public final String d(long j) {
        if (j < 0) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j2 = j / 3600000;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long j3 = (j / 60000) % 60;
        TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
        long j4 = (j / 1000) % 60;
        geu geuVar = this.b;
        return j2 > 0 ? geuVar.getResources().getString(R.string.time_with_hours, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)) : geuVar.getResources().getString(R.string.time_without_hours, Long.valueOf(j3), Long.valueOf(j4));
    }
}
