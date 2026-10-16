package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jfl {
    public static final defpackage.jfl a;
    public static final defpackage.jfl b;
    public static final defpackage.jfl c;
    public static final defpackage.ygw d;
    private static final /* synthetic */ defpackage.jfl[] e;

    static {
        defpackage.jfl jflVar = new defpackage.jfl("FULL", 0);
        a = jflVar;
        defpackage.jfl jflVar2 = new defpackage.jfl("BATTERY_OPTIMIZED", 1);
        b = jflVar2;
        defpackage.jfl jflVar3 = new defpackage.jfl("OFF", 2);
        c = jflVar3;
        e = new defpackage.jfl[]{jflVar, jflVar2, jflVar3};
        d = defpackage.ygw.s(jflVar, jflVar2, jflVar3);
    }

    public static defpackage.jfl a(defpackage.jfj jfjVar, defpackage.jfk jfkVar) {
        int iMin = java.lang.Math.min(jfjVar.e, jfkVar.e);
        if (iMin == 0) {
            return c;
        }
        return iMin == 1 ? b : a;
    }

    public static defpackage.jfl valueOf(java.lang.String str) {
        return (defpackage.jfl) java.lang.Enum.valueOf(defpackage.jfl.class, str);
    }

    public static defpackage.jfl[] values() {
        return (defpackage.jfl[]) e.clone();
    }
}
