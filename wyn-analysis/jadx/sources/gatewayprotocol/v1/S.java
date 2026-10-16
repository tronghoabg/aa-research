package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* loaded from: classes5.dex */
public final class S implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i5) {
        return NativeConfigurationOuterClass.NativeStartMode.forNumber(i5);
    }
}
