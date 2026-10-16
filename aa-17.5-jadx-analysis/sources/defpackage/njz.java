package defpackage;

import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class njz {
    public static final njz a;
    public static final njz b;
    public static final njz c;
    private static final /* synthetic */ njz[] f;
    public final int d;
    public final afdr e;

    static {
        njz njzVar = new njz("Exit", 0, R.drawable.gs_expand_more_vd_theme_24, new ngv(8));
        a = njzVar;
        njz njzVar2 = new njz("Smaller", 1, R.drawable.gs_hide_vd_theme_24, new ngv(9));
        b = njzVar2;
        njz njzVar3 = new njz("Larger", 2, R.drawable.resize_max, new ngv(10));
        c = njzVar3;
        njz[] njzVarArr = {njzVar, njzVar2, njzVar3};
        f = njzVarArr;
        affa.p(njzVarArr);
    }

    private njz(String str, int i, int i2, afdr afdrVar) {
        this.d = i2;
        this.e = afdrVar;
    }

    public static njz valueOf(String str) {
        return (njz) Enum.valueOf(njz.class, str);
    }

    public static njz[] values() {
        return (njz[]) f.clone();
    }
}
