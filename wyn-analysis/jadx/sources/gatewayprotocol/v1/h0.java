package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class h0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f35850a = new h0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return TransactionEventRequestOuterClass.TransactionOrigin.forNumber(i5) != null;
    }
}
