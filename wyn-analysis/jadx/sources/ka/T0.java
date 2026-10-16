package ka;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum T0 implements Internal.EnumLite {
    OPERATOR_UNSPECIFIED(0),
    LESS_THAN(1),
    LESS_THAN_OR_EQUAL(2),
    GREATER_THAN(3),
    GREATER_THAN_OR_EQUAL(4),
    EQUAL(5),
    NOT_EQUAL(6),
    ARRAY_CONTAINS(7),
    IN(8),
    ARRAY_CONTAINS_ANY(9),
    NOT_IN(10),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f39385a;

    T0(int i5) {
        this.f39385a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39385a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
