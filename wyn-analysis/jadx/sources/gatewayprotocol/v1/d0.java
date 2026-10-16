package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class d0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f35846a = new d0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return TransactionEventRequestOuterClass.StoreKitVersion.forNumber(i5) != null;
    }
}
