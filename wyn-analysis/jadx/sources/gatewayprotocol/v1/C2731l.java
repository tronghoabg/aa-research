package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* renamed from: gatewayprotocol.v1.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2731l implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2731l f35853a = new C2731l();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return ClientInfoOuterClass.Platform.forNumber(i5) != null;
    }
}
