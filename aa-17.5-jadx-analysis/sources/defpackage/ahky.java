package defpackage;

import defpackage.ahor;
import java.util.Objects;

/* loaded from: classes3.dex */
final class ahky<E extends ahor> extends ahkz<E> {
    private final E[] values;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
    }

    public ahky(int i, E[] eArr) {
        super(i, bitWidth(eArr), null);
        this.values = eArr;
    }

    private static <E> int bitWidth(E[] eArr) {
        if (eArr == null) {
            $$$reportNull$$$0(0);
        }
        int length = eArr.length - 1;
        if (length == 0) {
            return 1;
        }
        for (int i = 31; i >= 0; i--) {
            if (((1 << i) & length) != 0) {
                return i + 1;
            }
        }
        Class<?> cls = eArr.getClass();
        Objects.toString(cls);
        throw new IllegalStateException("Empty enum: ".concat(String.valueOf(cls)));
    }

    @Override // defpackage.ahkz
    public E get(int i) {
        for (E e : this.values) {
            int i2 = this.bitWidth;
            int i3 = this.offset;
            if (e.getNumber() == (((((1 << i2) - 1) << i3) & i) >> i3)) {
                return e;
            }
        }
        return null;
    }

    @Override // defpackage.ahkz
    public int toFlags(E e) {
        return e.getNumber() << this.offset;
    }
}
