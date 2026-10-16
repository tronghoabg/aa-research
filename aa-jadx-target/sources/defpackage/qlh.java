package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qlh implements mnv {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public qlh(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final void c(mog mogVar) {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.ndd) obj).n(mogVar);
        } else {
            ((defpackage.qli) obj).e(mogVar);
        }
    }

    public final void d(mog mogVar, mog mogVar2) {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i == 0) {
            ((defpackage.qli) obj).e(mogVar2);
            return;
        }
        if (mogVar2 != null) {
            mogVar = mogVar2;
        }
        ((defpackage.ndd) obj).n(mogVar);
    }

    public final void e(mog mogVar) {
        if (this.b != 0) {
            ((defpackage.ndd) this.a).n(mogVar);
            return;
        }
        defpackage.yqm yqmVar = defpackage.qli.a;
        if (yqmVar.l().Z()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 7517)).y("processStreamItemRemoved %s", j$.util.Objects.toString(mogVar));
        }
        qle qleVar = (qle) ((defpackage.qli) this.a).b.remove(new android.util.Pair(java.lang.Long.valueOf(mogVar.A()), mogVar.J()));
        if (qleVar == null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 7516)).u("no adapter found for removed SI");
            return;
        }
        nvh nvhVarE = qleVar.e(mogVar);
        java.lang.String strB = nvhVarE == null ? defpackage.qli.b(mogVar) : nvhVarE.f;
        qleVar.c();
        defpackage.nuz.b().g(mogVar.J().name(), mogVar.A(), strB);
    }

    public final void a() {
    }

    public final void b() {
    }
}
