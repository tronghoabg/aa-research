package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class njy {
    public static final njy a;
    public static final njy b;
    private static final /* synthetic */ njy[] e;
    public final float c;
    public final float d;

    static {
        njy njyVar = new njy("Vertical", 0, 36.0f, 56.0f);
        a = njyVar;
        njy njyVar2 = new njy("Horizontal", 1, 56.0f, 36.0f);
        b = njyVar2;
        njy[] njyVarArr = {njyVar, njyVar2};
        e = njyVarArr;
        affa.p(njyVarArr);
    }

    private njy(String str, int i, float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public static njy valueOf(String str) {
        return (njy) Enum.valueOf(njy.class, str);
    }

    public static njy[] values() {
        return (njy[]) e.clone();
    }
}
