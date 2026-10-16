package ka;

import com.google.protobuf.Internal;

/* renamed from: ka.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3234f1 implements Internal.EnumLite {
    OPERATOR_UNSPECIFIED(0),
    IS_NAN(2),
    IS_NULL(3),
    IS_NOT_NAN(4),
    IS_NOT_NULL(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f39417a;

    EnumC3234f1(int i5) {
        this.f39417a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39417a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
