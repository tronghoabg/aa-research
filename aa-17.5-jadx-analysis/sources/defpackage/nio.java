package defpackage;

import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nio {
    public static final nio a;
    public static final nio b;
    private static final /* synthetic */ nio[] f;
    public final int c;
    public final int d;
    public final int e;

    static {
        nio nioVar = new nio("DASHBOARD", 0, R.drawable.cielo_dashboard_lhd, R.drawable.cielo_dashboard_rhd, R.drawable.cielo_dashboard_landscape);
        a = nioVar;
        nio nioVar2 = new nio("LAUNCHER", 1, R.drawable.cielo_dashboard_app, R.drawable.cielo_dashboard_app, R.drawable.cielo_dashboard_app);
        b = nioVar2;
        nio[] nioVarArr = {nioVar, nioVar2};
        f = nioVarArr;
        affa.p(nioVarArr);
    }

    private nio(String str, int i, int i2, int i3, int i4) {
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static nio valueOf(String str) {
        return (nio) Enum.valueOf(nio.class, str);
    }

    public static nio[] values() {
        return (nio[]) f.clone();
    }
}
