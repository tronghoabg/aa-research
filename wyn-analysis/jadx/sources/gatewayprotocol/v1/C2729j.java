package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* renamed from: gatewayprotocol.v1.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2729j implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2729j f35851a = new C2729j();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return ClientInfoOuterClass.MediationProvider.forNumber(i5) != null;
    }
}
