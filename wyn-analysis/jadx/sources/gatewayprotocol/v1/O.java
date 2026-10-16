package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class O implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final O f35837a = new O();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return MonitoringEventRequestOuterClass.MonitoringEventType.forNumber(i5) != null;
    }
}
