package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jfd {
    public static final jfd a;
    public static final jfd b;
    public static final jfd c;
    public static final yfq d;
    private static final /* synthetic */ jfd[] e;

    static {
        jfd jfdVar = new jfd("FULL", 0);
        a = jfdVar;
        jfd jfdVar2 = new jfd("BATTERY_OPTIMIZED", 1);
        b = jfdVar2;
        jfd jfdVar3 = new jfd("OFF", 2);
        c = jfdVar3;
        e = new jfd[]{jfdVar, jfdVar2, jfdVar3};
        d = yfq.s(jfdVar, jfdVar2, jfdVar3);
    }

    public static jfd a(jfb jfbVar, jfc jfcVar) {
        int iMin = Math.min(jfbVar.e, jfcVar.e);
        return iMin == 0 ? c : iMin == 1 ? b : a;
    }

    public static jfd valueOf(String str) {
        return (jfd) Enum.valueOf(jfd.class, str);
    }

    public static jfd[] values() {
        return (jfd[]) e.clone();
    }
}
