package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gzc {
    public static final gzc a;
    public static final gzc b;
    public static final gzc c;
    public static final gzc d;
    public static final gzc e;
    private static final /* synthetic */ gzc[] f;

    static {
        gzc gzcVar = new gzc("FULL_SCREEN", 0);
        a = gzcVar;
        gzc gzcVar2 = new gzc("FULL_SCREEN_NO_HEADER", 1);
        b = gzcVar2;
        gzc gzcVar3 = new gzc("HALF_SCREEN", 2);
        c = gzcVar3;
        gzc gzcVar4 = new gzc("MINIMIZED_SCREEN", 3);
        d = gzcVar4;
        gzc gzcVar5 = new gzc("MAP_CONTENT_SCREEN", 4);
        e = gzcVar5;
        gzc[] gzcVarArr = {gzcVar, gzcVar2, gzcVar3, gzcVar4, gzcVar5};
        f = gzcVarArr;
        affa.p(gzcVarArr);
    }

    public static gzc valueOf(String str) {
        return (gzc) Enum.valueOf(gzc.class, str);
    }

    public static gzc[] values() {
        return (gzc[]) f.clone();
    }

    public final boolean a() {
        return this == c || this == e || this == d;
    }
}
