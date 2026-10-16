package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.ErrorOuterClass;

/* loaded from: classes5.dex */
public final class D implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i5) {
        return ErrorOuterClass.PublicErrorCode.forNumber(i5);
    }
}
