package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lmh implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lmh(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((do) ((defpackage.lma) this.a).b).a();
                break;
            case 1:
                ((do) ((defpackage.lma) this.a).b).i();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((do) ((defpackage.lma) this.a).b).h();
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.lni) this.a).k = false;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((lns) this.a).r();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((lns) this.a).a();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.yqj) lns.a.l().ai((char) 4063)).u("Resetting reconnect count.");
                lns lnsVar = (lns) this.a;
                lnsVar.p = 0;
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fz);
                rrvVarH.p(lnsVar.l);
                oimVarU.F(rrvVarH.l());
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.yqj) lns.a.l().ai((char) 4059)).u("Executing delayed disconnect");
                ((lns) this.a).b();
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar = defpackage.lpx.a;
                java.lang.Object obj = this.a;
                lpv lpvVar = (lpv) obj;
                java.lang.String str = lpvVar.h;
                try {
                    lmi lmiVar = ((lpv) obj).a;
                    ((defpackage.eqp) obj).m(new lpm(str, lmiVar.P(), lmiVar.O(), lpv.a(lmiVar.U()), lmiVar.n(), lmiVar.L()));
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lpx.a.h()).p(e)).ai(4163)).y("Failed to poll session state for %s; remote process likely died.", lpvVar.h);
                    return;
                }
                break;
            case 9:
                java.lang.Object obj2 = this.a;
                ((defpackage.eqp) obj2).m(((lql) obj2).i);
                break;
            case 10:
                ((defpackage.lqq) this.a).b("was_any_playback_interval_over_threshold", true);
                break;
            case 11:
                defpackage.lqq lqqVar = (defpackage.lqq) this.a;
                lqqVar.b("autoplay_on_start", lqqVar.g);
                break;
            case 12:
                lqu lquVar = lqv.b;
                ohy ohyVar = ((lqy) this.a).a().d;
                ohyVar.getClass();
                ohyVar.h(defpackage.zbe.MEDIA_AUTOPLAY).c();
                break;
            case 13:
                java.lang.Object obj3 = this.a;
                lru lruVar = (lru) obj3;
                lruVar.h = true;
                if (lruVar.i) {
                    ((defpackage.eqp) obj3).m(lruVar.a);
                }
                break;
            case 14:
                java.lang.Object obj4 = this.a;
                ((defpackage.eqp) obj4).m(((lsh) obj4).h);
                break;
            case 15:
                ((defpackage.yqj) ((defpackage.yqj) ltc.a.f()).ai((char) 4267)).u("Media stream item hasn't been interacted with in a while. Removing");
                ((ltc) this.a).a();
                break;
            case 16:
                defpackage.mcj.b().a((java.lang.String) this.a).b(defpackage.ogv.k() ? defpackage.nve.h : null);
                break;
            case 17:
                defpackage.yqm yqmVar2 = defpackage.lvx.a;
                java.lang.Object obj5 = this.a;
                moi moiVar = (moi) obj5;
                lxk lxkVarA = defpackage.lxy.o().a(moiVar.j, moiVar.k);
                mog lxkVar = obj5;
                if (lxkVarA instanceof lxk) {
                    lxk lxkVar2 = lxkVarA;
                    ((defpackage.yqj) defpackage.lvx.a.l().ai((char) 4326)).u("Updating existing SMS conversation");
                    defpackage.ygw ygwVarO = defpackage.ygw.o(((lxk) obj5).b);
                    java.util.ArrayList arrayList = new java.util.ArrayList(lxkVar2.b);
                    arrayList.addAll(ygwVarO);
                    lxj lxjVar = new lxj();
                    lxjVar.b(lxkVar2);
                    defpackage.ojm.a();
                    ((moh) lxjVar).m = j$.time.Instant.now().toEpochMilli();
                    lxjVar.a = arrayList;
                    lxjVar.b = lxkVar2.a;
                    lxjVar.c = lxkVar2.c;
                    defpackage.ojm.a();
                    lxjVar.d = j$.time.Instant.now().toEpochMilli();
                    ((moh) lxjVar).i = ((moi) lxkVar2).l;
                    lxjVar.f = lxkVar2.f;
                    lxjVar.g = lxkVar2.g;
                    lxkVar = new lxk(lxjVar);
                }
                ((moi) lxkVar).r = ((lxi) lxkVar).m() && ((lxk) lxkVar).a() > 0;
                defpackage.lxy.o().j(lxkVar);
                break;
            case 18:
                defpackage.yqm yqmVar3 = defpackage.lws.a;
                defpackage.lwn.a().b((java.lang.String) this.a);
                break;
            case 19:
                defpackage.yqm yqmVar4 = lwt.a;
                defpackage.lwn.a().b((java.lang.String) this.a);
                break;
            default:
                defpackage.yqm yqmVar5 = lwt.a;
                lvn lvnVarA = defpackage.lnt.m().a(((android.content.Intent) this.a).getLongExtra("EXTRA_CONVERSATION_ID", 0L));
                ((defpackage.yqj) lwt.a.l().ai((char) 4420)).y("Muting conversation %s", lvnVarA);
                defpackage.lnt.j().g(lvnVarA, true);
                break;
        }
    }

    public lmh(lns lnsVar, int i, short[] sArr) {
        this.b = i;
        this.a = lnsVar;
    }
}
