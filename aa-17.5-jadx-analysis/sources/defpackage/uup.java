package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uup implements utf {
    public static final uup a;
    public static final uup b;
    public static final int c;
    private static final /* synthetic */ uup[] d;

    static {
        uup uupVar = new uup("CLIENT_INJECTED_AREAS_UNDER_LABELS", 0);
        a = uupVar;
        uup uupVar2 = new uup("LABELS", 1);
        b = uupVar2;
        d = new uup[]{uupVar, uupVar2};
        c = uut.b + uut.values().length;
    }

    public static uup valueOf(String str) {
        return (uup) Enum.valueOf(uup.class, str);
    }

    public static uup[] values() {
        return (uup[]) d.clone();
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
        return uvp.n;
    }
}
