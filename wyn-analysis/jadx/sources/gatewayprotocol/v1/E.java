package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.ErrorOuterClass;

/* loaded from: classes5.dex */
public final class E implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final E f35831a = new E();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return ErrorOuterClass.PublicErrorCode.forNumber(i5) != null;
    }
}
