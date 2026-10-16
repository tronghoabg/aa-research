package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.AdRequestOuterClass;

/* renamed from: gatewayprotocol.v1.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2725f implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2725f f35847a = new C2725f();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return AdRequestOuterClass.AdRequestType.forNumber(i5) != null;
    }
}
