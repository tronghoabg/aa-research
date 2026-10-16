package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* loaded from: classes5.dex */
public final class T implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final T f35838a = new T();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return NativeConfigurationOuterClass.NativeStartMode.forNumber(i5) != null;
    }
}
