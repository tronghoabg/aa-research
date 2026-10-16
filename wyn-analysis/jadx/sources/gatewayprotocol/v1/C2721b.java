package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.AdFormatOuterClass;

/* renamed from: gatewayprotocol.v1.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2721b implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C2721b f35842a = new C2721b();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return AdFormatOuterClass.AdFormat.forNumber(i5) != null;
    }
}
