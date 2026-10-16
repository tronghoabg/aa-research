package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ilq implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        int i = this.b;
        if (i == 0) {
            if (j$.util.Objects.equals(str, "car_day_night_mode")) {
                java.lang.Object obj = this.a;
                ((defpackage.yqj) defpackage.ilr.a.l().ai((char) 283)).u("Day/Night mode setting changed, updating");
                ((defpackage.ilr) obj).d("PREFERENCE_CHANGED");
                return;
            }
            return;
        }
        if (i == 1) {
            int iHashCode = str.hashCode();
            if (iHashCode != 267290342) {
                if (iHashCode != 739972694) {
                    if (iHashCode != 2024027045 || !str.equals("touchpad_base_fraction")) {
                        return;
                    }
                } else if (!str.equals("touchpad_multimove_penalty_mm")) {
                    return;
                }
            } else if (!str.equals("touchpad_min_size_mm")) {
                return;
            }
            ((defpackage.ikk) this.a).l();
            return;
        }
        if (i == 2) {
            if (str.equals("car_enable_debug_background")) {
                defpackage.inh inhVar = (defpackage.inh) this.a;
                inhVar.aq.g(inhVar.m.n());
                return;
            }
            return;
        }
        if (i == 3) {
            java.lang.Object obj2 = this.a;
            defpackage.mlq mlqVar = (defpackage.mlq) obj2;
            if (defpackage.afga.f(mlqVar.a, str)) {
                ((defpackage.eqp) obj2).m(mlqVar.h.invoke());
                return;
            }
            return;
        }
        if (str == null) {
            ((defpackage.yqj) defpackage.qjj.a.l().ai((char) 7398)).u("Irrelevant preference changes observed with null key");
            return;
        }
        java.lang.String[] strArrSplit = str.split("_", -1);
        defpackage.ysr.bn(strArrSplit.length == 2 && str.contains("component"), "Invalid preference changes observed with key %s", str);
        defpackage.yqm yqmVar = defpackage.qjj.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 7396)).y("Default app has changed. preference key: %s", str);
        java.lang.String str2 = strArrSplit[1];
        int i2 = java.lang.Integer.parseInt(java.lang.String.valueOf(str2.charAt(0)));
        for (defpackage.mqg mqgVar : defpackage.mqg.values()) {
            if (mqgVar.h == i2) {
                java.lang.Object obj3 = this.a;
                mqgVar.getClass();
                defpackage.ysr.bn(strArrSplit[0].equals("component"), "Unexpected legacy key change with key %s", str);
                android.content.ComponentName componentNameC = sharedPreferences.getString(str, null) != null ? defpackage.qjj.c(mqgVar, sharedPreferences) : null;
                defpackage.ygw ygwVarO = defpackage.ygw.o(((defpackage.qjj) obj3).c.c(str2));
                ((defpackage.yqj) yqmVar.l().ai(7397)).R("Notify %d listeners for Facet: %s with ComponentName:%s ", java.lang.Integer.valueOf(ygwVarO.size()), mqgVar, componentNameC);
                int size = ygwVarO.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((lhg) ygwVarO.get(i3)).a(componentNameC);
                }
                return;
            }
        }
        defpackage.rox.n("GH.AppCategory", "Unexpected key: %s", java.lang.Integer.valueOf(i2));
        throw new defpackage.afap();
    }
}
