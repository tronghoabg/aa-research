package defpackage;

import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nip {
    public static final nip a;
    public static final nip b;
    private static final /* synthetic */ nip[] c;
    private final int d;
    private final int e;
    private final int f;

    static {
        nip nipVar = new nip("DASHBOARD", 0, R.drawable.ic_dashboard_icon_lhd, R.drawable.ic_dashboard_icon_rhd, R.drawable.ic_dashboard_icon_landscape);
        a = nipVar;
        nip nipVar2 = new nip("LAUNCHER", 1, 2131233082, 2131233082, 2131233082);
        b = nipVar2;
        nip[] nipVarArr = {nipVar, nipVar2};
        c = nipVarArr;
        affa.p(nipVarArr);
    }

    private nip(String str, int i, int i2, int i3, int i4) {
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static nip valueOf(String str) {
        return (nip) Enum.valueOf(nip.class, str);
    }

    public static nip[] values() {
        return (nip[]) c.clone();
    }

    public final int a(nso nsoVar) {
        nsoVar.getClass();
        if (nsoVar.E()) {
            return this.f;
        }
        boolean zJ = nsoVar.J();
        mmc.c();
        return zJ != mmc.h() ? this.e : this.d;
    }
}
