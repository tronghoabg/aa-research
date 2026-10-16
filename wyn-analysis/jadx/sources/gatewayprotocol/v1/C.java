package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;

/* loaded from: classes5.dex */
public final class C implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C f35830a = new C();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DynamicDeviceInfoOuterClass.ConnectionType.forNumber(i5) != null;
    }
}
