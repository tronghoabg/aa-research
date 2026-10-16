package ia;

import com.google.protobuf.Internal;

/* renamed from: ia.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC2863c implements Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_CONFIG_UNSPECIFIED(0),
    CONTAINS(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f36920a;

    EnumC2863c(int i5) {
        this.f36920a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36920a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
