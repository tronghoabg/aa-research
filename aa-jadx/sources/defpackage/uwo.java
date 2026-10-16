package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uwo {
    public static final defpackage.uwo a;
    public static final defpackage.uwo b;
    public static final defpackage.uwo c;
    public static final defpackage.uwo d;
    public static final defpackage.uwo e;
    public static final defpackage.uwo f;
    public static final defpackage.uwo g;
    public static final defpackage.uwo h;
    public static final java.lang.ThreadLocal i;
    public static final defpackage.ypg j;
    public static long k;
    public static int l;
    public static final long[] m;
    public static final long[] n;
    private static final /* synthetic */ defpackage.uwo[] o;

    static {
        defpackage.uwo uwoVar = new defpackage.uwo("INVALID", 0);
        a = uwoVar;
        defpackage.uwo uwoVar2 = new defpackage.uwo("IDLE", 1);
        b = uwoVar2;
        defpackage.uwo uwoVar3 = new defpackage.uwo("BEGIN_FRAME", 2);
        c = uwoVar3;
        defpackage.uwo uwoVar4 = new defpackage.uwo("UPDATE", 3);
        d = uwoVar4;
        defpackage.uwo uwoVar5 = new defpackage.uwo("PRE_DRAW", 4);
        e = uwoVar5;
        defpackage.uwo uwoVar6 = new defpackage.uwo("DRAW", 5);
        f = uwoVar6;
        defpackage.uwo uwoVar7 = new defpackage.uwo("POST_DRAW", 6);
        g = uwoVar7;
        defpackage.uwo uwoVar8 = new defpackage.uwo("END_FRAME", 7);
        h = uwoVar8;
        o = new defpackage.uwo[]{uwoVar, uwoVar2, uwoVar3, uwoVar4, uwoVar5, uwoVar6, uwoVar7, uwoVar8};
        i = new defpackage.uwn();
        j = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/renderer/RenderPhase");
        l = 0;
        m = new long[values().length];
        n = new long[values().length];
    }

    static void a(defpackage.uwo uwoVar, defpackage.uwo uwoVar2) {
        if (uwoVar == b) {
            l++;
        }
        long jNanoTime = java.lang.System.nanoTime();
        long j2 = jNanoTime - k;
        k = jNanoTime;
        long[] jArr = m;
        int iOrdinal = uwoVar.ordinal();
        jArr[iOrdinal] = jArr[iOrdinal] + j2;
        long[] jArr2 = n;
        int iOrdinal2 = uwoVar.ordinal();
        jArr2[iOrdinal2] = jArr2[iOrdinal2] + (j2 * j2);
        i.set(uwoVar2);
    }

    public static defpackage.uwo valueOf(java.lang.String str) {
        return (defpackage.uwo) java.lang.Enum.valueOf(defpackage.uwo.class, str);
    }

    public static defpackage.uwo[] values() {
        return (defpackage.uwo[]) o.clone();
    }
}
