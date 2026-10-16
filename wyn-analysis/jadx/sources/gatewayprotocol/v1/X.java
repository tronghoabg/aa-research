package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class X implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final X f35840a = new X();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(i5) != null;
    }
}
