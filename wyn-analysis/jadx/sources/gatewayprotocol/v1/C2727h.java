package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;

/* renamed from: gatewayprotocol.v1.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2727h implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2727h f35849a = new C2727h();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return AdRevenueEventRequestOuterClass.AdRevenueOrigin.forNumber(i5) != null;
    }
}
