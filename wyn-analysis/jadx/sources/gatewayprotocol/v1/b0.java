package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;

/* loaded from: classes5.dex */
public final class b0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f35843a = new b0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom.forNumber(i5) != null;
    }
}
