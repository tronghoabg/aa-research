package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuq implements utf {
    public static final uuq a;
    public static final uuq b;
    public static final int c;
    private static final /* synthetic */ uuq[] d;

    static {
        uuq uuqVar = new uuq("MAGIC_CARPET", 0);
        a = uuqVar;
        uuq uuqVar2 = new uuq("ABOVE_MAGIC_CARPET", 1);
        b = uuqVar2;
        d = new uuq[]{uuqVar, uuqVar2};
        c = uuj.b + uuj.values().length;
    }

    public static uuq valueOf(String str) {
        return (uuq) Enum.valueOf(uuq.class, str);
    }

    public static uuq[] values() {
        return (uuq[]) d.clone();
    }

    @Override // defpackage.utf
    public final int a() {
        return c + ordinal();
    }

    @Override // defpackage.utf
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final uvp c() {
        return uvp.d;
    }
}
