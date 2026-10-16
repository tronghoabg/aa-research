package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uvm implements defpackage.uub {
    public static final defpackage.uvm a;
    public static final defpackage.uvm b;
    public static final int c;
    private static final /* synthetic */ defpackage.uvm[] d;

    static {
        defpackage.uvm uvmVar = new defpackage.uvm("MAGIC_CARPET", 0);
        a = uvmVar;
        defpackage.uvm uvmVar2 = new defpackage.uvm("ABOVE_MAGIC_CARPET", 1);
        b = uvmVar2;
        d = new defpackage.uvm[]{uvmVar, uvmVar2};
        c = defpackage.uvf.b + defpackage.uvf.values().length;
    }

    public static defpackage.uvm valueOf(java.lang.String str) {
        return (defpackage.uvm) java.lang.Enum.valueOf(defpackage.uvm.class, str);
    }

    public static defpackage.uvm[] values() {
        return (defpackage.uvm[]) d.clone();
    }

    @Override // defpackage.uub
    public final int a() {
        return c + ordinal();
    }

    @Override // defpackage.uub
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.uub
    public final defpackage.uwm c() {
        return defpackage.uwm.d;
    }
}
