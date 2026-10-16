package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuj implements utf {
    public static final uuj a;
    public static final int b;
    private static final /* synthetic */ uuj[] c;

    static {
        uuj uujVar = new uuj();
        a = uujVar;
        c = new uuj[]{uujVar};
        b = uuw.b + uuw.values().length;
    }

    private uuj() {
    }

    public static uuj valueOf(String str) {
        return (uuj) Enum.valueOf(uuj.class, str);
    }

    public static uuj[] values() {
        return (uuj[]) c.clone();
    }

    @Override // defpackage.utf
    public final int a() {
        return b + ordinal();
    }

    @Override // defpackage.utf
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final uvp c() {
        return uvp.c;
    }
}
