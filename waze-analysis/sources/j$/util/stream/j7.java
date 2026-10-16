package j$.util.stream;

import j$.util.Map;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j7 {
    public static final j7 DISTINCT;
    public static final j7 ORDERED;
    public static final j7 SHORT_CIRCUIT;
    public static final j7 SIZED;
    public static final j7 SORTED;

    /* renamed from: f, reason: collision with root package name */
    public static final int f50471f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f50472g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f50473h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f50474i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f50475j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f50476k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f50477l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ j7[] v;

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f50478a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50479b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50480c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50481d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50482e;

    static {
        i7 i7Var = i7.SPLITERATOR;
        j$.desugar.sun.nio.fs.g gVarM = m(i7Var);
        i7 i7Var2 = i7.STREAM;
        gVarM.g(i7Var2);
        i7 i7Var3 = i7.OP;
        ((EnumMap) gVarM.f49665b).put((EnumMap) i7Var3, (i7) 3);
        j7 j7Var = new j7("DISTINCT", 0, 0, gVarM);
        DISTINCT = j7Var;
        j$.desugar.sun.nio.fs.g gVarM2 = m(i7Var);
        gVarM2.g(i7Var2);
        ((EnumMap) gVarM2.f49665b).put((EnumMap) i7Var3, (i7) 3);
        j7 j7Var2 = new j7("SORTED", 1, 1, gVarM2);
        SORTED = j7Var2;
        j$.desugar.sun.nio.fs.g gVarM3 = m(i7Var);
        gVarM3.g(i7Var2);
        EnumMap enumMap = (EnumMap) gVarM3.f49665b;
        enumMap.put((EnumMap) i7Var3, (i7) 3);
        i7 i7Var4 = i7.TERMINAL_OP;
        enumMap.put((EnumMap) i7Var4, (i7) 2);
        i7 i7Var5 = i7.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) i7Var5, (i7) 2);
        j7 j7Var3 = new j7("ORDERED", 2, 2, gVarM3);
        ORDERED = j7Var3;
        j$.desugar.sun.nio.fs.g gVarM4 = m(i7Var);
        gVarM4.g(i7Var2);
        ((EnumMap) gVarM4.f49665b).put((EnumMap) i7Var3, (i7) 2);
        j7 j7Var4 = new j7("SIZED", 3, 3, gVarM4);
        SIZED = j7Var4;
        j$.desugar.sun.nio.fs.g gVarM5 = m(i7Var3);
        gVarM5.g(i7Var4);
        int i2 = 0;
        j7 j7Var5 = new j7("SHORT_CIRCUIT", 4, 12, gVarM5);
        SHORT_CIRCUIT = j7Var5;
        v = new j7[]{j7Var, j7Var2, j7Var3, j7Var4, j7Var5};
        f50471f = h(i7Var);
        f50472g = h(i7Var2);
        f50473h = h(i7Var3);
        h(i7Var4);
        h(i7Var5);
        for (j7 j7Var6 : values()) {
            i2 |= j7Var6.f50482e;
        }
        f50474i = i2;
        int i3 = f50472g;
        f50475j = i3;
        int i4 = i3 << 1;
        f50476k = i4;
        f50477l = i3 | i4;
        j7 j7Var7 = DISTINCT;
        m = j7Var7.f50480c;
        n = j7Var7.f50481d;
        j7 j7Var8 = SORTED;
        o = j7Var8.f50480c;
        p = j7Var8.f50481d;
        j7 j7Var9 = ORDERED;
        q = j7Var9.f50480c;
        r = j7Var9.f50481d;
        j7 j7Var10 = SIZED;
        s = j7Var10.f50480c;
        t = j7Var10.f50481d;
        u = SHORT_CIRCUIT.f50480c;
    }

    public j7(String str, int i2, int i3, j$.desugar.sun.nio.fs.g gVar) {
        EnumMap enumMap = (EnumMap) gVar.f49665b;
        for (i7 i7Var : i7.values()) {
            Map.EL.putIfAbsent(enumMap, i7Var, 0);
        }
        this.f50478a = enumMap;
        int i4 = i3 * 2;
        this.f50479b = i4;
        this.f50480c = 1 << i4;
        this.f50481d = 2 << i4;
        this.f50482e = 3 << i4;
    }

    public static int f(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? f50474i : ~(((f50475j & i2) << 1) | i2 | ((f50476k & i2) >> 1))));
    }

    public static int h(i7 i7Var) {
        int iIntValue = 0;
        for (j7 j7Var : values()) {
            iIntValue |= ((Integer) j7Var.f50478a.get(i7Var)).intValue() << j7Var.f50479b;
        }
        return iIntValue;
    }

    public static j$.desugar.sun.nio.fs.g m(i7 i7Var) {
        j$.desugar.sun.nio.fs.g gVar = new j$.desugar.sun.nio.fs.g(10, new EnumMap(i7.class));
        gVar.g(i7Var);
        return gVar;
    }

    public static j7 valueOf(String str) {
        return (j7) Enum.valueOf(j7.class, str);
    }

    public static j7[] values() {
        return (j7[]) v.clone();
    }

    public final boolean k(int i2) {
        return (i2 & this.f50482e) == this.f50480c;
    }
}
