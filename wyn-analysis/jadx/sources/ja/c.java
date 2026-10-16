package ja;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum c implements Internal.EnumLite {
    FIRST(0),
    LAST(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f38697a;

    c(int i5) {
        this.f38697a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f38697a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
