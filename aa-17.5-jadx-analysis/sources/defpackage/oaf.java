package defpackage;

import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oaf {
    public static final oaf a;
    public static final oaf b;
    public static final oaf c;
    private static final /* synthetic */ oaf[] f;
    public final int d;
    public final afdr e;

    static {
        oaf oafVar = new oaf("Exit", 0, R.drawable.gs_expand_more_vd_theme_24, new nqy(5));
        a = oafVar;
        oaf oafVar2 = new oaf("Smaller", 1, R.drawable.gs_hide_vd_theme_24, new nqy(6));
        b = oafVar2;
        oaf oafVar3 = new oaf("Larger", 2, R.drawable.resize_max, new nqy(7));
        c = oafVar3;
        oaf[] oafVarArr = {oafVar, oafVar2, oafVar3};
        f = oafVarArr;
        affa.p(oafVarArr);
    }

    private oaf(String str, int i, int i2, afdr afdrVar) {
        this.d = i2;
        this.e = afdrVar;
    }

    public static oaf valueOf(String str) {
        return (oaf) Enum.valueOf(oaf.class, str);
    }

    public static oaf[] values() {
        return (oaf[]) f.clone();
    }
}
