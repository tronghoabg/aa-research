package defpackage;

import android.content.ComponentName;
import android.content.SharedPreferences;
import j$.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class ilg implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws NumberFormatException {
        int i = this.b;
        if (i == 0) {
            if (Objects.equals(str, "car_day_night_mode")) {
                Object obj = this.a;
                ((ype) ilh.a.l().ai((char) 283)).u("Day/Night mode setting changed, updating");
                ((ilh) obj).d("PREFERENCE_CHANGED");
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
            ((ikb) this.a).l();
            return;
        }
        if (i == 2) {
            if (str.equals("car_enable_debug_background")) {
                ina inaVar = (ina) this.a;
                inaVar.aq.g(inaVar.m.n());
                return;
            }
            return;
        }
        if (i == 3) {
            Object obj2 = this.a;
            mll mllVar = (mll) obj2;
            if (affa.f(mllVar.a, str)) {
                ((eqj) obj2).m(mllVar.h.invoke());
                return;
            }
            return;
        }
        if (str == null) {
            ((ype) qin.a.l().ai((char) 7373)).u("Irrelevant preference changes observed with null key");
            return;
        }
        String[] strArrSplit = str.split("_", -1);
        woy.ad(strArrSplit.length == 2 && str.contains("component"), "Invalid preference changes observed with key %s", str);
        yph yphVar = qin.a;
        ((ype) yphVar.l().ai((char) 7371)).y("Default app has changed. preference key: %s", str);
        String str2 = strArrSplit[1];
        int i2 = Integer.parseInt(String.valueOf(str2.charAt(0)));
        for (mpz mpzVar : mpz.values()) {
            if (mpzVar.h == i2) {
                Object obj3 = this.a;
                mpzVar.getClass();
                woy.ad(strArrSplit[0].equals("component"), "Unexpected legacy key change with key %s", str);
                ComponentName componentNameC = sharedPreferences.getString(str, null) != null ? qin.c(mpzVar, sharedPreferences) : null;
                yfq yfqVarO = yfq.o(((qin) obj3).c.c(str2));
                ((ype) yphVar.l().ai(7372)).R("Notify %d listeners for Facet: %s with ComponentName:%s ", Integer.valueOf(yfqVarO.size()), mpzVar, componentNameC);
                int size = yfqVarO.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((lgz) yfqVarO.get(i3)).a(componentNameC);
                }
                return;
            }
        }
        tss.p("GH.AppCategory", "Unexpected key: %s", Integer.valueOf(i2));
        throw new aezp();
    }
}
