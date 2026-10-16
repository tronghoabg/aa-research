package ka;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum Y implements Internal.EnumLite {
    SERVER_VALUE_UNSPECIFIED(0),
    REQUEST_TIME(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f39391a;

    Y(int i5) {
        this.f39391a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39391a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
