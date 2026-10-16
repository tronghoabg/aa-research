package defpackage;

import android.view.WindowInsets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ipm {
    public static final ipm a;
    public static final ipm b;
    public static final ipm c;
    public static final ipm d;
    private static final /* synthetic */ ipm[] h;
    public final int e;
    public final int f;
    public final int g;

    static {
        ipm ipmVar = new ipm("BOTTOM", 0, WindowInsets.Type.navigationBars(), 80, 2019);
        a = ipmVar;
        ipm ipmVar2 = new ipm("TOP", 1, WindowInsets.Type.statusBars(), 48, 2000);
        b = ipmVar2;
        ipm ipmVar3 = new ipm("LEFT", 2, WindowInsets.Type.navigationBars(), 3, 2024);
        c = ipmVar3;
        ipm ipmVar4 = new ipm("RIGHT", 3, WindowInsets.Type.navigationBars(), 5, 2038);
        d = ipmVar4;
        ipm[] ipmVarArr = {ipmVar, ipmVar2, ipmVar3, ipmVar4};
        h = ipmVarArr;
        affa.p(ipmVarArr);
    }

    private ipm(String str, int i, int i2, int i3, int i4) {
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public static ipm valueOf(String str) {
        return (ipm) Enum.valueOf(ipm.class, str);
    }

    public static ipm[] values() {
        return (ipm[]) h.clone();
    }

    public final boolean a() {
        return this == c || this == d;
    }
}
