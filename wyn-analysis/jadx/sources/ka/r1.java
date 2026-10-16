package ka;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum r1 implements Internal.EnumLite {
    NO_CHANGE(0),
    ADD(1),
    REMOVE(2),
    CURRENT(3),
    RESET(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f39435a;

    r1(int i5) {
        this.f39435a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39435a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
