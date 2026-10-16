package J9;

import A.AbstractC0213f;
import A7.CallableC0255h0;
import Re.C0818m;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: J9.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0663w implements Le.b, Le.c, Le.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f5989b;

    public /* synthetic */ C0663w(C c10, int i5) {
        this.f5988a = i5;
        this.f5989b = c10;
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        ta.o oVar = (ta.o) obj;
        switch (this.f5988a) {
            case 0:
                C0661u c0661u = this.f5989b.f5849g;
                c0661u.getClass();
                HashSet hashSet = new HashSet();
                for (sa.f fVar : oVar.e()) {
                    hashSet.add(AbstractC0213f.b(fVar.f(), 1) ? fVar.i().c() : fVar.d().c());
                }
                ic.d.E("Potential impressions to clear: " + hashSet.toString());
                He.g gVarA = c0661u.a();
                ta.f fVar2 = C0661u.f5984c;
                Ne.b.a(fVar2, "item is null");
                new Qe.f(gVarA.d(He.g.a(fVar2)), new A5.h(9, c0661u, hashSet), 1).c();
                break;
            default:
                C0647f c0647f = this.f5989b.f5845c;
                I i5 = c0647f.f5926a;
                i5.getClass();
                new Qe.f(new Qe.e(new Qe.b(new B8.c(5, i5, oVar), 2).b(new A5.h(5, c0647f, oVar)).b(new F5.d(26)), new F5.d(27), Ne.b.f8673c), new F5.d(28), 0).c();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Le.c
    public Object apply(Object obj) throws Exception {
        He.i iVar;
        int i5 = 11;
        int i10 = 3;
        int i11 = 4;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        switch (this.f5988a) {
            case 1:
                String str = (String) obj;
                C c10 = this.f5989b;
                C0647f c0647f = c10.f5845c;
                c0647f.getClass();
                Se.k kVar = new Se.k(new G8.c(c0647f, i12));
                Se.k kVarA = c0647f.f5926a.a(ta.o.parser());
                C0646e c0646e = new C0646e(c0647f, 0);
                ya.b bVar = Ne.b.f8674d;
                Se.j jVar = new Se.j(new Se.r(new Se.r(new Se.r(new Se.g(kVar.d(new Se.r(kVarA, c0646e, bVar)), new C0646e(c0647f, 1), 0), bVar, new C0646e(c0647f, 2)), new C0664x(1), bVar), bVar, new C0664x(2)), new CallableC0255h0(Se.e.f11072a, 5), 2);
                C0663w c0663w = new C0663w(c10, i10);
                B b5 = new B(c10, str, new C0663w(c10, i11), new C0666z(c10, str, i13), new C0664x(3));
                Se.r rVar = new Se.r(c10.f5849g.a(), bVar, new C0664x(4));
                ta.f fVarD = ta.f.d();
                Ne.b.a(fVarD, "item is null");
                Se.j jVar2 = new Se.j(rVar.d(He.g.a(fVarD)), new CallableC0255h0(He.g.a(ta.f.d()), 5), 2);
                P9.c cVar = (P9.c) c10.f5854m;
                Task taskD = cVar.d();
                Executor executor = c10.f5856o;
                Se.h hVar = new Se.h(i13, new He.g[]{new Se.d(new A5.h(i5, taskD, executor), i14), new Se.d(new A5.h(i5, cVar.e(), executor), i14)}, new x4.d(new F5.d(20)));
                He.m mVar = c10.f5848f.f5906a;
                Ne.b.a(mVar, "scheduler is null");
                A5.h hVar2 = new A5.h(10, c10, new Se.g(hVar, mVar, 1));
                Z z2 = c10.k;
                if (!(z2.f5911c ? str.equals("ON_FOREGROUND") : z2.f5910b)) {
                    ic.d.E("Attempting to fetch campaigns using cache");
                    return new C0818m(new Se.j(jVar.d(new Se.r(new Se.j(jVar2, hVar2, 0), c0663w, bVar)), b5, 0), 4);
                }
                ic.d.F("Forcing fetch from service rather than cache. Test Device: " + z2.f5910b + " | App Fresh Install: " + z2.f5911c);
                return new C0818m(new Se.j(new Se.j(jVar2, hVar2, 0), b5, 0), 4);
            default:
                sa.f fVar = (sa.f) obj;
                C c11 = this.f5989b;
                c11.getClass();
                if (fVar.e()) {
                    return He.g.a(fVar);
                }
                C0661u c0661u = c11.f5849g;
                c0661u.getClass();
                String strC = AbstractC0213f.b(fVar.f(), 1) ? fVar.i().c() : fVar.d().c();
                Se.j jVar3 = new Se.j(c0661u.a(), new F5.d(16), 1);
                F5.d dVar = new F5.d(17);
                He.i iVarA = jVar3 instanceof Oe.b ? ((Oe.b) jVar3).a() : new Se.u(jVar3);
                int i15 = He.c.f5007a;
                Ne.b.b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, "maxConcurrency");
                Ne.b.b(i15, "bufferSize");
                if (iVarA instanceof Oe.f) {
                    Object objCall = ((Oe.f) iVarA).call();
                    iVar = objCall == null ? Te.e.f11843a : new Te.p(objCall, dVar);
                } else {
                    iVar = new Te.i(iVarA, dVar, i15);
                }
                Te.c cVar2 = new Te.c(iVar, new F5.d(18), 3);
                Ne.b.a(strC, "element is null");
                return new Se.j(new Se.h(i14, new Ue.a(new Ue.a(new Ue.a(new Te.d(cVar2, new Ne.a(strC, false)), new F5.d(29), i14), new CallableC0255h0(new Ue.b(), 5), i12), new C0662v(fVar), i13), new C0664x(0)), new C0662v(fVar), 1);
        }
    }

    @Override // Le.d
    public boolean test(Object obj) {
        long jE;
        long jB;
        sa.f fVar = (sa.f) obj;
        C c10 = this.f5989b;
        if (!c10.k.f5910b) {
            if (AbstractC0213f.b(fVar.f(), 1)) {
                jE = fVar.i().e();
                jB = fVar.i().b();
            } else {
                if (!AbstractC0213f.b(fVar.f(), 2)) {
                    return false;
                }
                jE = fVar.d().e();
                jB = fVar.d().b();
            }
            c10.f5846d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis <= jE || jCurrentTimeMillis >= jB) {
                return false;
            }
        }
        return true;
    }
}
