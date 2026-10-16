package ia;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum g implements Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    QUERY_SCOPE_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION(1),
    COLLECTION_GROUP(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f36930a;

    g(int i5) {
        this.f36930a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36930a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
