package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mrn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ShortcutMgr");
    public final java.util.List b;
    public final defpackage.eqs c;
    public final defpackage.eqs d;

    public mrn() {
        defpackage.yqm yqmVar = mrq.a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        defpackage.eqs eqsVar = new defpackage.eqs();
        this.c = eqsVar;
        defpackage.eqs eqsVar2 = new defpackage.eqs();
        this.d = eqsVar2;
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        eqsVar.m(ygwVar);
        eqsVar2.m(ygwVar);
        if (actk.e()) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(defpackage.mkp.a.c.getSharedPreferences("launcher_shortcuts", 0).getStringSet("shortcuts_key", defpackage.ynd.a)).map(new mjb(20)).filter(new defpackage.lyk(18)).filter(new defpackage.lyk(19));
            java.util.List list = (java.util.List) (actk.d() ? streamFilter : streamFilter.filter(new defpackage.lyk(20))).collect(j$.util.stream.Collectors.toList());
            ((defpackage.yqj) a.l().ai((char) 5224)).w("loaded %d shortcuts from disk", list.size());
            arrayList.clear();
            arrayList.addAll(list);
            d();
            defpackage.ler.c().fW(new mrm(this), true);
        }
    }

    public static defpackage.mrn b() {
        return (defpackage.mrn) defpackage.mkp.a.i(defpackage.mrn.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final mrk a(mrk mrkVar) throws wfo {
        if (!actk.e()) {
            return null;
        }
        defpackage.wfp.c();
        java.util.List list = this.b;
        if (list.contains(mrkVar)) {
            ((defpackage.yqj) a.l().ai((char) 5220)).u("shortcut already exists");
            return null;
        }
        list.add(mrkVar);
        c();
        d();
        return mrkVar;
    }

    public final void c() {
        java.util.List list = this.b;
        ((defpackage.yqj) a.l().ai((char) 5225)).w("persisting %d shortcuts to disk", list.size());
        defpackage.mkp.a.c.getSharedPreferences("launcher_shortcuts", 0).edit().putStringSet("shortcuts_key", (java.util.Set) j$.util.Collection.-EL.stream(list).map(new mjb(19)).collect(defpackage.yds.b)).commit();
    }

    public final void d() {
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(this.b).map(new mrl()).filter(new mrx(1));
        int i = defpackage.ygw.d;
        java.util.List<mrh> list = (java.util.List) streamFilter.collect(defpackage.yds.a);
        java.util.Set set = (java.util.Set) j$.util.Collection.-EL.stream(list).map(new defpackage.ngh(1)).filter(new defpackage.mpw(new java.util.HashSet(), 3)).collect(j$.util.stream.Collectors.toSet());
        for (mrh mrhVar : list) {
            if (set.contains(mrhVar.i()) && (mrhVar instanceof mrh)) {
                mrhVar.b = true;
            }
        }
        this.c.m(list);
    }
}
