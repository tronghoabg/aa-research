package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ajtj {
    public static final ajtj a;
    public static final ajtj b;
    private static final /* synthetic */ ajtj[] c;

    static {
        ajtj ajtjVar = new ajtj("PLAIN", 0);
        a = ajtjVar;
        ajtj ajtjVar2 = new ajtj("TUNNELLED", 1);
        b = ajtjVar2;
        c = new ajtj[]{ajtjVar, ajtjVar2};
    }

    public static ajtj valueOf(String str) {
        return (ajtj) Enum.valueOf(ajtj.class, str);
    }

    public static ajtj[] values() {
        return (ajtj[]) c.clone();
    }
}
