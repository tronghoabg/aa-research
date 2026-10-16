package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ixc implements java.util.function.Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ixc(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.ixd) obj).a();
                break;
            case 1:
                defpackage.ikn.l((defpackage.iko) obj);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.ixd) obj).b();
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((jlc) obj).f.e(defpackage.rsr.a);
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                jlc jlcVar = (jlc) obj;
                jld jldVar = jlcVar.f;
                jldVar.e(defpackage.rsr.b);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jqk.a.f()).ai(2624)).T("Wifi socket connect event: status = %d, socket retry count = %s, network retry count = %s, error code = %d, connection time = %s ms", java.lang.Integer.valueOf(1), java.lang.Integer.valueOf(jlcVar.e), java.lang.Integer.valueOf(jldVar.f), java.lang.Integer.valueOf(0 == 0 ? 0 : 0 - 1), java.lang.Integer.valueOf((int) jldVar.g.a(java.util.concurrent.TimeUnit.MILLISECONDS)));
                rxy.i(jldVar.b, jldVar.d, yyt.j);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar = defpackage.jpf.a;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar2 = defpackage.jpf.a;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((gfa) obj).p();
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar3 = jsq.a;
                ((gfa) obj).y().a(13);
                break;
            case 9:
                ((rlt) obj).a();
                break;
            case 10:
                ((rls) obj).a();
                break;
            case 11:
                ((defpackage.yqj) defpackage.lni.a.l().ai(4029)).y("isCarMedia()=%s", (java.lang.Boolean) obj);
                break;
            case 12:
                defpackage.yqm yqmVar4 = lwc.a;
                defpackage.lvs.a((lvn) obj);
                break;
            case 13:
                android.os.Bundle bundle = (android.os.Bundle) obj;
                lvn.i(bundle, lwc.n(bundle));
                break;
            case 14:
                android.os.Bundle bundle2 = (android.os.Bundle) obj;
                int i = lvn.l;
                if (bundle2.getBoolean("group_conversation")) {
                    lvn.i(bundle2, lwc.n(bundle2));
                }
                break;
            case 15:
                defpackage.yqm yqmVar5 = lwc.a;
                defpackage.lvs.a((lvn) obj);
                break;
            case 16:
                defpackage.yqm yqmVar6 = lwc.a;
                defpackage.lvs.a((lvn) obj);
                break;
            case 17:
                ((defpackage.nrr) obj).a = false;
                break;
            case 18:
                defpackage.yqm yqmVar7 = ped.a;
                ((pap) obj).c(pao.t);
                break;
            case 19:
                defpackage.yqm yqmVar8 = ped.a;
                ((pap) obj).b(pao.v);
                break;
            default:
                defpackage.yqm yqmVar9 = ped.a;
                ((pap) obj).b(pao.v);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
