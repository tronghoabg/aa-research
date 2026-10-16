package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class mrj {
    public static final yph a = yph.c("GH.ShortcutMgr");
    public final List b;
    public final eqm c;
    public final eqm d;

    public mrj() {
        yph yphVar = mrm.a;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        eqm eqmVar = new eqm();
        this.c = eqmVar;
        eqm eqmVar2 = new eqm();
        this.d = eqmVar2;
        int i = yfq.d;
        yfq yfqVar = yls.a;
        eqmVar.m(yfqVar);
        eqmVar2.m(yfqVar);
        if (acsi.e()) {
            int i2 = 19;
            Stream streamFilter = Collection.EL.stream(mki.a.c.getSharedPreferences("launcher_shortcuts", 0).getStringSet("shortcuts_key", yly.a)).map(new miw(19)).filter(new lye(17)).filter(new lye(18));
            List list = (List) (acsi.d() ? streamFilter : streamFilter.filter(new lye(i2))).collect(Collectors.toList());
            ((ype) a.l().ai((char) 5222)).w("loaded %d shortcuts from disk", list.size());
            arrayList.clear();
            arrayList.addAll(list);
            d();
            lbh.d().gL(new mri(this), true);
        }
    }

    public static mrj b() {
        return (mrj) mki.a.i(mrj.class);
    }

    @ResultIgnorabilityUnspecified
    public final mrg a(mrg mrgVar) {
        if (!acsi.e()) {
            return null;
        }
        wer.c();
        List list = this.b;
        if (list.contains(mrgVar)) {
            ((ype) a.l().ai((char) 5218)).u("shortcut already exists");
            return null;
        }
        list.add(mrgVar);
        c();
        d();
        return mrgVar;
    }

    public final void c() {
        List list = this.b;
        ((ype) a.l().ai((char) 5223)).w("persisting %d shortcuts to disk", list.size());
        mki.a.c.getSharedPreferences("launcher_shortcuts", 0).edit().putStringSet("shortcuts_key", (Set) Collection.EL.stream(list).map(new miw(18)).collect(ycm.b)).commit();
    }

    public final void d() {
        Stream streamFilter = Collection.EL.stream(this.b).map(new mrh()).filter(new lye(20));
        int i = yfq.d;
        List<mrl> list = (List) streamFilter.collect(ycm.a);
        Set set = (Set) Collection.EL.stream(list).map(new miw(20)).filter(new mqu(new HashSet(), 2)).collect(Collectors.toSet());
        for (mrl mrlVar : list) {
            if (set.contains(mrlVar.i()) && (mrlVar instanceof mrd)) {
                ((mrd) mrlVar).b = true;
            }
        }
        this.c.m(list);
    }
}
