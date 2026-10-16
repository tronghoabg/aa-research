package z9;

import com.google.protobuf.Internal;

/* renamed from: z9.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4657z implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C4657z f48469a = new C4657z();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return (i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? null : EnumC4622A.NETWORK_ERROR : EnumC4622A.CLIENT_ERROR : EnumC4622A.SERVER_ERROR : EnumC4622A.UNSPECIFIED_FETCH_ERROR) != null;
    }
}
