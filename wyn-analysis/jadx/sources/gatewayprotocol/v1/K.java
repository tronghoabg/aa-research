package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.InitializationResponseOuterClass;

/* loaded from: classes5.dex */
public final class K implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final K f35835a = new K();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return InitializationResponseOuterClass.RequestType.forNumber(i5) != null;
    }
}
