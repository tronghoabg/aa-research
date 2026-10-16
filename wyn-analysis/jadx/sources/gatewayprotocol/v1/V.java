package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* loaded from: classes5.dex */
public final class V implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final V f35839a = new V();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return NativeConfigurationOuterClass.ShowCompletionState.forNumber(i5) != null;
    }
}
