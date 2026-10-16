package ka;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum R0 implements Internal.EnumLite {
    DIRECTION_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f39371a;

    R0(int i5) {
        this.f39371a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39371a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
