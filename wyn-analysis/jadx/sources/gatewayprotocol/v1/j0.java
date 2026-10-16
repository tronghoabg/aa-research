package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class j0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f35852a = new j0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return TransactionEventRequestOuterClass.TransactionState.forNumber(i5) != null;
    }
}
