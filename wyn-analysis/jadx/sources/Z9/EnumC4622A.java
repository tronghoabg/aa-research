package z9;

import com.google.protobuf.Internal;

/* renamed from: z9.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4622A implements Internal.EnumLite {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f48413a;

    EnumC4622A(int i5) {
        this.f48413a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f48413a;
    }
}
