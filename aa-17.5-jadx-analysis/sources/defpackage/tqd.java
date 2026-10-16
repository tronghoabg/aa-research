package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tqd {
    public static final tqd a;
    public static final tqd b;
    private static final /* synthetic */ tqd[] c;

    static {
        tqd tqdVar = new tqd("TAP", 0);
        a = tqdVar;
        tqd tqdVar2 = new tqd("LONG_PRESS", 1);
        b = tqdVar2;
        c = new tqd[]{tqdVar, tqdVar2};
    }

    public static tqd valueOf(String str) {
        return (tqd) Enum.valueOf(tqd.class, str);
    }

    public static tqd[] values() {
        return (tqd[]) c.clone();
    }
}
