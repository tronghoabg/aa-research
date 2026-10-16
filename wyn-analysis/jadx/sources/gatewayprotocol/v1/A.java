package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* loaded from: classes5.dex */
public final class A implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final A f35829a = new A();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(i5) != null;
    }
}
