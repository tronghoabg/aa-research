package ka;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum P0 implements Internal.EnumLite {
    OPERATOR_UNSPECIFIED(0),
    AND(1),
    OR(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f39365a;

    P0(int i5) {
        this.f39365a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39365a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
