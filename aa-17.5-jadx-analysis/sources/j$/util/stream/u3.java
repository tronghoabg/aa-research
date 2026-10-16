package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
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
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class u3 {
    public static final u3 DISTINCT;
    public static final u3 ORDERED;
    public static final u3 SHORT_CIRCUIT;
    public static final u3 SIZED;
    public static final u3 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final /* synthetic */ u3[] u;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        t3 t3Var = t3.SPLITERATOR;
        j$.desugar.sun.nio.fs.h hVarR = r(t3Var);
        t3 t3Var2 = t3.STREAM;
        hVarR.f(t3Var2);
        t3 t3Var3 = t3.OP;
        ((EnumMap) hVarR.b).put((EnumMap) t3Var3, (t3) 3);
        u3 u3Var = new u3("DISTINCT", 0, 0, hVarR);
        DISTINCT = u3Var;
        j$.desugar.sun.nio.fs.h hVarR2 = r(t3Var);
        hVarR2.f(t3Var2);
        ((EnumMap) hVarR2.b).put((EnumMap) t3Var3, (t3) 3);
        u3 u3Var2 = new u3("SORTED", 1, 1, hVarR2);
        SORTED = u3Var2;
        j$.desugar.sun.nio.fs.h hVarR3 = r(t3Var);
        hVarR3.f(t3Var2);
        EnumMap enumMap = (EnumMap) hVarR3.b;
        enumMap.put((EnumMap) t3Var3, (t3) 3);
        t3 t3Var4 = t3.TERMINAL_OP;
        enumMap.put((EnumMap) t3Var4, (t3) 2);
        t3 t3Var5 = t3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) t3Var5, (t3) 2);
        u3 u3Var3 = new u3("ORDERED", 2, 2, hVarR3);
        ORDERED = u3Var3;
        j$.desugar.sun.nio.fs.h hVarR4 = r(t3Var);
        hVarR4.f(t3Var2);
        ((EnumMap) hVarR4.b).put((EnumMap) t3Var3, (t3) 2);
        u3 u3Var4 = new u3("SIZED", 3, 3, hVarR4);
        SIZED = u3Var4;
        j$.desugar.sun.nio.fs.h hVarR5 = r(t3Var3);
        hVarR5.f(t3Var4);
        int i2 = 0;
        u3 u3Var5 = new u3("SHORT_CIRCUIT", 4, 12, hVarR5);
        SHORT_CIRCUIT = u3Var5;
        u = new u3[]{u3Var, u3Var2, u3Var3, u3Var4, u3Var5};
        f = k(t3Var);
        g = k(t3Var2);
        h = k(t3Var3);
        k(t3Var4);
        k(t3Var5);
        for (u3 u3Var6 : values()) {
            i2 |= u3Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        u3 u3Var7 = DISTINCT;
        m = u3Var7.c;
        n = u3Var7.d;
        u3 u3Var8 = SORTED;
        int i5 = u3Var8.c;
        o = u3Var8.d;
        u3 u3Var9 = ORDERED;
        p = u3Var9.c;
        q = u3Var9.d;
        u3 u3Var10 = SIZED;
        r = u3Var10.c;
        s = u3Var10.d;
        t = SHORT_CIRCUIT.c;
    }

    public u3(String str, int i2, int i3, j$.desugar.sun.nio.fs.h hVar) {
        EnumMap enumMap = (EnumMap) hVar.b;
        for (t3 t3Var : t3.values()) {
            Map.EL.putIfAbsent(enumMap, t3Var, 0);
        }
        this.a = enumMap;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int h(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int k(t3 t3Var) {
        int iIntValue = 0;
        for (u3 u3Var : values()) {
            iIntValue |= ((Integer) u3Var.a.get(t3Var)).intValue() << u3Var.b;
        }
        return iIntValue;
    }

    public static int l(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static j$.desugar.sun.nio.fs.h r(t3 t3Var) {
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h((byte) 14, new EnumMap(t3.class));
        hVar.f(t3Var);
        return hVar;
    }

    public static u3 valueOf(String str) {
        return (u3) Enum.valueOf(u3.class, str);
    }

    public static u3[] values() {
        return (u3[]) u.clone();
    }

    public final boolean p(int i2) {
        return (i2 & this.e) == this.c;
    }
}
