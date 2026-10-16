package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uvl implements defpackage.uub {
    public static final defpackage.uvl a;
    public static final defpackage.uvl b;
    public static final int c;
    private static final /* synthetic */ defpackage.uvl[] d;

    static {
        defpackage.uvl uvlVar = new defpackage.uvl("CLIENT_INJECTED_AREAS_UNDER_LABELS", 0);
        a = uvlVar;
        defpackage.uvl uvlVar2 = new defpackage.uvl("LABELS", 1);
        b = uvlVar2;
        d = new defpackage.uvl[]{uvlVar, uvlVar2};
        c = defpackage.uvp.b + defpackage.uvp.values().length;
    }

    public static defpackage.uvl valueOf(java.lang.String str) {
        return (defpackage.uvl) java.lang.Enum.valueOf(defpackage.uvl.class, str);
    }

    public static defpackage.uvl[] values() {
        return (defpackage.uvl[]) d.clone();
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
        return defpackage.uwm.n;
    }
}
