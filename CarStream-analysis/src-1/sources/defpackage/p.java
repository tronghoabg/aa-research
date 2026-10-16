package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class p {
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final /* synthetic */ p[] e;

    static {
        p pVar = new p("IDLE", 0);
        a = pVar;
        p pVar2 = new p("LOADING", 1);
        b = pVar2;
        p pVar3 = new p("ERROR", 2);
        c = pVar3;
        p pVar4 = new p("OK", 3);
        d = pVar4;
        e = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) e.clone();
    }
}
