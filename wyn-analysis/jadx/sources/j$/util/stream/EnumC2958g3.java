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
/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC2958g3 {
    public static final EnumC2958g3 DISTINCT;
    public static final EnumC2958g3 ORDERED;
    public static final EnumC2958g3 SHORT_CIRCUIT;
    public static final EnumC2958g3 SIZED;
    public static final EnumC2958g3 SORTED;

    /* renamed from: f, reason: collision with root package name */
    static final int f38197f;

    /* renamed from: g, reason: collision with root package name */
    static final int f38198g;

    /* renamed from: h, reason: collision with root package name */
    static final int f38199h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f38200i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f38201j;
    private static final int k;

    /* renamed from: l, reason: collision with root package name */
    static final int f38202l;

    /* renamed from: m, reason: collision with root package name */
    static final int f38203m;

    /* renamed from: n, reason: collision with root package name */
    static final int f38204n;

    /* renamed from: o, reason: collision with root package name */
    static final int f38205o;

    /* renamed from: p, reason: collision with root package name */
    static final int f38206p;

    /* renamed from: q, reason: collision with root package name */
    static final int f38207q;

    /* renamed from: r, reason: collision with root package name */
    static final int f38208r;

    /* renamed from: s, reason: collision with root package name */
    static final int f38209s;

    /* renamed from: t, reason: collision with root package name */
    static final int f38210t;

    /* renamed from: u, reason: collision with root package name */
    static final int f38211u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC2958g3[] f38212v;

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f38213a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38214b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38215c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38216d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38217e;

    public static EnumC2958g3 valueOf(String str) {
        return (EnumC2958g3) Enum.valueOf(EnumC2958g3.class, str);
    }

    public static EnumC2958g3[] values() {
        return (EnumC2958g3[]) f38212v.clone();
    }

    static {
        EnumC2953f3 enumC2953f3 = EnumC2953f3.SPLITERATOR;
        C2948e3 c2948e3B = B(enumC2953f3);
        EnumC2953f3 enumC2953f32 = EnumC2953f3.STREAM;
        c2948e3B.a(enumC2953f32);
        EnumC2953f3 enumC2953f33 = EnumC2953f3.OP;
        c2948e3B.f38184a.put((EnumMap) enumC2953f33, (EnumC2953f3) 3);
        EnumC2958g3 enumC2958g3 = new EnumC2958g3("DISTINCT", 0, 0, c2948e3B);
        DISTINCT = enumC2958g3;
        C2948e3 c2948e3B2 = B(enumC2953f3);
        c2948e3B2.a(enumC2953f32);
        c2948e3B2.f38184a.put((EnumMap) enumC2953f33, (EnumC2953f3) 3);
        EnumC2958g3 enumC2958g32 = new EnumC2958g3("SORTED", 1, 1, c2948e3B2);
        SORTED = enumC2958g32;
        C2948e3 c2948e3B3 = B(enumC2953f3);
        c2948e3B3.a(enumC2953f32);
        EnumMap enumMap = c2948e3B3.f38184a;
        enumMap.put((EnumMap) enumC2953f33, (EnumC2953f3) 3);
        EnumC2953f3 enumC2953f34 = EnumC2953f3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC2953f34, (EnumC2953f3) 2);
        EnumC2953f3 enumC2953f35 = EnumC2953f3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC2953f35, (EnumC2953f3) 2);
        EnumC2958g3 enumC2958g33 = new EnumC2958g3("ORDERED", 2, 2, c2948e3B3);
        ORDERED = enumC2958g33;
        C2948e3 c2948e3B4 = B(enumC2953f3);
        c2948e3B4.a(enumC2953f32);
        c2948e3B4.f38184a.put((EnumMap) enumC2953f33, (EnumC2953f3) 2);
        EnumC2958g3 enumC2958g34 = new EnumC2958g3("SIZED", 3, 3, c2948e3B4);
        SIZED = enumC2958g34;
        C2948e3 c2948e3B5 = B(enumC2953f33);
        c2948e3B5.a(enumC2953f34);
        int i5 = 0;
        EnumC2958g3 enumC2958g35 = new EnumC2958g3("SHORT_CIRCUIT", 4, 12, c2948e3B5);
        SHORT_CIRCUIT = enumC2958g35;
        f38212v = new EnumC2958g3[]{enumC2958g3, enumC2958g32, enumC2958g33, enumC2958g34, enumC2958g35};
        f38197f = q(enumC2953f3);
        f38198g = q(enumC2953f32);
        f38199h = q(enumC2953f33);
        q(enumC2953f34);
        q(enumC2953f35);
        for (EnumC2958g3 enumC2958g36 : values()) {
            i5 |= enumC2958g36.f38217e;
        }
        f38200i = i5;
        int i10 = f38198g;
        f38201j = i10;
        int i11 = i10 << 1;
        k = i11;
        f38202l = i10 | i11;
        EnumC2958g3 enumC2958g37 = DISTINCT;
        f38203m = enumC2958g37.f38215c;
        f38204n = enumC2958g37.f38216d;
        EnumC2958g3 enumC2958g38 = SORTED;
        f38205o = enumC2958g38.f38215c;
        f38206p = enumC2958g38.f38216d;
        EnumC2958g3 enumC2958g39 = ORDERED;
        f38207q = enumC2958g39.f38215c;
        f38208r = enumC2958g39.f38216d;
        EnumC2958g3 enumC2958g310 = SIZED;
        f38209s = enumC2958g310.f38215c;
        f38210t = enumC2958g310.f38216d;
        f38211u = SHORT_CIRCUIT.f38215c;
    }

    private static C2948e3 B(EnumC2953f3 enumC2953f3) {
        C2948e3 c2948e3 = new C2948e3(new EnumMap(EnumC2953f3.class));
        c2948e3.a(enumC2953f3);
        return c2948e3;
    }

    private EnumC2958g3(String str, int i5, int i10, C2948e3 c2948e3) {
        EnumC2953f3[] enumC2953f3ArrValues = EnumC2953f3.values();
        int length = enumC2953f3ArrValues.length;
        int i11 = 0;
        while (true) {
            EnumMap enumMap = c2948e3.f38184a;
            if (i11 < length) {
                Map.EL.b(enumMap, enumC2953f3ArrValues[i11], 0);
                i11++;
            } else {
                this.f38213a = enumMap;
                int i12 = i10 * 2;
                this.f38214b = i12;
                this.f38215c = 1 << i12;
                this.f38216d = 2 << i12;
                this.f38217e = 3 << i12;
                return;
            }
        }
    }

    final boolean t(int i5) {
        return (i5 & this.f38217e) == this.f38215c;
    }

    final boolean w(int i5) {
        int i10 = this.f38217e;
        return (i5 & i10) == i10;
    }

    private static int q(EnumC2953f3 enumC2953f3) {
        int iIntValue = 0;
        for (EnumC2958g3 enumC2958g3 : values()) {
            iIntValue |= ((Integer) enumC2958g3.f38213a.get(enumC2953f3)).intValue() << enumC2958g3.f38214b;
        }
        return iIntValue;
    }

    static int o(int i5, int i10) {
        int i11;
        if (i5 == 0) {
            i11 = f38200i;
        } else {
            i11 = ~(((f38201j & i5) << 1) | i5 | ((k & i5) >> 1));
        }
        return i5 | (i10 & i11);
    }

    static int D(int i5) {
        return i5 & ((~i5) >> 1) & f38201j;
    }

    static int s(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i5 = iCharacteristics & 4;
        int i10 = f38197f;
        return (i5 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i10 : iCharacteristics & i10 & (-5);
    }
}
