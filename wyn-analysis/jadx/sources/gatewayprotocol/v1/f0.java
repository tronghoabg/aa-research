package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class f0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f35848a = new f0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return TransactionEventRequestOuterClass.StoreType.forNumber(i5) != null;
    }
}
