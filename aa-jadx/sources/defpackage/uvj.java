package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uvj implements defpackage.uub {
    public static final defpackage.uvj a;
    public static final defpackage.uvj b;
    public static final defpackage.uvj c;
    public static final int d;
    private static final /* synthetic */ defpackage.uvj[] e;

    static {
        defpackage.uvj uvjVar = new defpackage.uvj("INDOOR_GROUND", 0);
        a = uvjVar;
        defpackage.uvj uvjVar2 = new defpackage.uvj("INDOOR", 1);
        b = uvjVar2;
        defpackage.uvj uvjVar3 = new defpackage.uvj("INDOOR_LINES", 2);
        c = uvjVar3;
        e = new defpackage.uvj[]{uvjVar, uvjVar2, uvjVar3};
        d = defpackage.uvq.h + defpackage.uvq.values().length;
    }

    public static defpackage.uvj valueOf(java.lang.String str) {
        return (defpackage.uvj) java.lang.Enum.valueOf(defpackage.uvj.class, str);
    }

    public static defpackage.uvj[] values() {
        return (defpackage.uvj[]) e.clone();
    }

    @Override // defpackage.uub
    public final int a() {
        return d + ordinal();
    }

    @Override // defpackage.uub
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.uub
    public final defpackage.uwm c() {
        return defpackage.uwm.f;
    }
}
