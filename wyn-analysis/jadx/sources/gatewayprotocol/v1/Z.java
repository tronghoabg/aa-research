package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class Z implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f35841a = new Z();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return OperativeEventRequestOuterClass.OperativeEventType.forNumber(i5) != null;
    }
}
