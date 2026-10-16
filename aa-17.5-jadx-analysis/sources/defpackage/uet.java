package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uet {
    public static final uet a;
    public static final uet b;
    private static final /* synthetic */ uet[] c;

    static {
        uet uetVar = new uet("PHONES_AND_TABLETS", 0);
        a = uetVar;
        uet uetVar2 = new uet("CAR_HEAD_UNIT", 1);
        b = uetVar2;
        c = new uet[]{uetVar, uetVar2};
    }

    public static uet valueOf(String str) {
        return (uet) Enum.valueOf(uet.class, str);
    }

    public static uet[] values() {
        return (uet[]) c.clone();
    }
}
