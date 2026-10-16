package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* renamed from: gatewayprotocol.v1.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2733n implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2733n f35854a = new C2733n();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(i5) != null;
    }
}
