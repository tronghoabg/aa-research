package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uvr {
    public static final uvr a;
    public static final uvr b;
    public static final uvr c;
    public static final uvr d;
    public static final uvr e;
    public static final uvr f;
    public static final uvr g;
    public static final uvr h;
    public static final ThreadLocal i;
    public static final yob j;
    public static long k;
    public static int l;
    public static final long[] m;
    public static final long[] n;
    private static final /* synthetic */ uvr[] o;

    static {
        uvr uvrVar = new uvr("INVALID", 0);
        a = uvrVar;
        uvr uvrVar2 = new uvr("IDLE", 1);
        b = uvrVar2;
        uvr uvrVar3 = new uvr("BEGIN_FRAME", 2);
        c = uvrVar3;
        uvr uvrVar4 = new uvr("UPDATE", 3);
        d = uvrVar4;
        uvr uvrVar5 = new uvr("PRE_DRAW", 4);
        e = uvrVar5;
        uvr uvrVar6 = new uvr("DRAW", 5);
        f = uvrVar6;
        uvr uvrVar7 = new uvr("POST_DRAW", 6);
        g = uvrVar7;
        uvr uvrVar8 = new uvr("END_FRAME", 7);
        h = uvrVar8;
        o = new uvr[]{uvrVar, uvrVar2, uvrVar3, uvrVar4, uvrVar5, uvrVar6, uvrVar7, uvrVar8};
        i = new uvq();
        j = yob.c("com/google/android/libraries/geo/mapcore/renderer/RenderPhase");
        l = 0;
        m = new long[values().length];
        n = new long[values().length];
    }

    static void a(uvr uvrVar, uvr uvrVar2) {
        if (uvrVar == b) {
            l++;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime - k;
        k = jNanoTime;
        long[] jArr = m;
        int iOrdinal = uvrVar.ordinal();
        jArr[iOrdinal] = jArr[iOrdinal] + j2;
        long[] jArr2 = n;
        int iOrdinal2 = uvrVar.ordinal();
        jArr2[iOrdinal2] = jArr2[iOrdinal2] + (j2 * j2);
        i.set(uvrVar2);
    }

    public static uvr valueOf(String str) {
        return (uvr) Enum.valueOf(uvr.class, str);
    }

    public static uvr[] values() {
        return (uvr[]) o.clone();
    }
}
