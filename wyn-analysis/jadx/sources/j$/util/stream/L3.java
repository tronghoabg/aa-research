package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class L3 {
    public static Stream d(Spliterator spliterator, boolean z2) {
        Objects.requireNonNull(spliterator);
        return new C2962h2(spliterator, EnumC2958g3.s(spliterator), z2);
    }

    public static IntStream b(Spliterator.OfInt ofInt) {
        return new Z(ofInt, EnumC2958g3.s(ofInt), false);
    }

    public static InterfaceC2990n0 c(j$.util.a0 a0Var) {
        return new C2965i0(a0Var, EnumC2958g3.s(a0Var), false);
    }

    public static E a(j$.util.V v2) {
        return new C3048z(v2, EnumC2958g3.s(v2), false);
    }
}
