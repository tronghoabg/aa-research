package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fsr {
    public static final fsr a;
    public static final fsr b;
    public static final fsr c;
    public static final fsr d;
    private static final /* synthetic */ fsr[] g;
    public final boolean e;
    public final boolean f;

    static {
        fsr fsrVar = new fsr("ENABLED", 0, true, true);
        a = fsrVar;
        fsr fsrVar2 = new fsr("READ_ONLY", 1, true, false);
        b = fsrVar2;
        fsr fsrVar3 = new fsr("WRITE_ONLY", 2, false, true);
        c = fsrVar3;
        fsr fsrVar4 = new fsr("DISABLED", 3, false, false);
        d = fsrVar4;
        fsr[] fsrVarArr = {fsrVar, fsrVar2, fsrVar3, fsrVar4};
        g = fsrVarArr;
        affa.p(fsrVarArr);
    }

    private fsr(String str, int i, boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }

    public static fsr valueOf(String str) {
        return (fsr) Enum.valueOf(fsr.class, str);
    }

    public static fsr[] values() {
        return (fsr[]) g.clone();
    }
}
