package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* renamed from: gatewayprotocol.v1.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2735p implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2735p f35855a = new C2735p();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DeveloperConsentOuterClass.DeveloperConsentType.forNumber(i5) != null;
    }
}
