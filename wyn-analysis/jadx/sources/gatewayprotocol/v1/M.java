package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class M implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final M f35836a = new M();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return LifecycleEventRequestOuterClass.LifecycleEventType.forNumber(i5) != null;
    }
}
