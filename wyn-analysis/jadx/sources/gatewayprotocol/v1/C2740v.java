package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* renamed from: gatewayprotocol.v1.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2740v implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2740v f35859a = new C2740v();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(i5) != null;
    }
}
