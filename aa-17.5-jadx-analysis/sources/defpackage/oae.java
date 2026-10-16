package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oae {
    public static final oae a;
    public static final oae b;
    private static final /* synthetic */ oae[] e;
    public final float c;
    public final float d;

    static {
        oae oaeVar = new oae("Vertical", 0, 36.0f, 56.0f);
        a = oaeVar;
        oae oaeVar2 = new oae("Horizontal", 1, 56.0f, 36.0f);
        b = oaeVar2;
        oae[] oaeVarArr = {oaeVar, oaeVar2};
        e = oaeVarArr;
        affa.p(oaeVarArr);
    }

    private oae(String str, int i, float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public static oae valueOf(String str) {
        return (oae) Enum.valueOf(oae.class, str);
    }

    public static oae[] values() {
        return (oae[]) e.clone();
    }
}
