package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* renamed from: gatewayprotocol.v1.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2742x implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2742x f35860a = new C2742x();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(i5) != null;
    }
}
