package ia;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum e implements Internal.EnumLite {
    ORDER_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f36926a;

    e(int i5) {
        this.f36926a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36926a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
