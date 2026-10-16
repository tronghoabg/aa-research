package okhttp3.internal.ws;

import A7.AbstractC0279p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42930a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f42931b = null;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42932c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f42933d = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f42934e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f42935f = false;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "<init>", "()V", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f42930a == webSocketExtensions.f42930a && AbstractC3340k.a(this.f42931b, webSocketExtensions.f42931b) && this.f42932c == webSocketExtensions.f42932c && AbstractC3340k.a(this.f42933d, webSocketExtensions.f42933d) && this.f42934e == webSocketExtensions.f42934e && this.f42935f == webSocketExtensions.f42935f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z2 = this.f42930a;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = i5 * 31;
        Integer num = this.f42931b;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.f42932c;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (iHashCode + i11) * 31;
        Integer num2 = this.f42933d;
        int iHashCode2 = (i12 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z11 = this.f42934e;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (iHashCode2 + i13) * 31;
        boolean z12 = this.f42935f;
        return i14 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f42930a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f42931b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f42932c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f42933d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f42934e);
        sb2.append(", unknownValues=");
        return AbstractC0279p0.p(sb2, this.f42935f, ')');
    }
}
