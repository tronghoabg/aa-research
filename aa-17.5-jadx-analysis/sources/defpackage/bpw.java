package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class bpw {
    public static final bpw a;
    public static final bpw b;
    private static final /* synthetic */ bpw[] c;

    static {
        bpw bpwVar = new bpw("THUMB", 0);
        a = bpwVar;
        bpw bpwVar2 = new bpw("TRACK", 1);
        b = bpwVar2;
        bpw[] bpwVarArr = {bpwVar, bpwVar2};
        c = bpwVarArr;
        affa.p(bpwVarArr);
    }

    public static bpw valueOf(String str) {
        return (bpw) Enum.valueOf(bpw.class, str);
    }

    public static bpw[] values() {
        return (bpw[]) c.clone();
    }
}
