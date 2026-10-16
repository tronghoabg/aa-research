package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uun implements utf {
    public static final uun a;
    public static final uun b;
    public static final uun c;
    public static final int d;
    private static final /* synthetic */ uun[] e;

    static {
        uun uunVar = new uun("INDOOR_GROUND", 0);
        a = uunVar;
        uun uunVar2 = new uun("INDOOR", 1);
        b = uunVar2;
        uun uunVar3 = new uun("INDOOR_LINES", 2);
        c = uunVar3;
        e = new uun[]{uunVar, uunVar2, uunVar3};
        d = uuu.h + uuu.values().length;
    }

    public static uun valueOf(String str) {
        return (uun) Enum.valueOf(uun.class, str);
    }

    public static uun[] values() {
        return (uun[]) e.clone();
    }

    @Override // defpackage.utf
    public final int a() {
        return d + ordinal();
    }

    @Override // defpackage.utf
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final uvp c() {
        return uvp.f;
    }
}
