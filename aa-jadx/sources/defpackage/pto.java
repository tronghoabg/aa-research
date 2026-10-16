package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@defpackage.ptg
public final class pto implements defpackage.pth {
    public static final defpackage.pto a;
    public static final defpackage.pto b;
    private static final /* synthetic */ defpackage.pto[] c;

    static {
        defpackage.pto ptoVar = new defpackage.pto("FINISH", 0);
        a = ptoVar;
        defpackage.pto ptoVar2 = new defpackage.pto("CANCEL", 1);
        b = ptoVar2;
        c = new defpackage.pto[]{ptoVar, ptoVar2};
    }

    public static defpackage.pto valueOf(java.lang.String str) {
        return (defpackage.pto) java.lang.Enum.valueOf(defpackage.pto.class, str);
    }

    public static defpackage.pto[] values() {
        return (defpackage.pto[]) c.clone();
    }

    @Override // defpackage.pth
    public final /* synthetic */ void a() {
    }
}
