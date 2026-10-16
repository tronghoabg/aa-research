package e.a;

import androidx.autofill.HintConstants;
import j$.util.Objects;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends dq {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final SocketAddress f46270a;

    /* renamed from: b, reason: collision with root package name */
    private final InetSocketAddress f46271b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f46272c;

    /* renamed from: d, reason: collision with root package name */
    private final String f46273d;

    /* renamed from: e, reason: collision with root package name */
    private final String f46274e;

    /* synthetic */ aq(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, Map map, String str, String str2) {
        com.google.d.b.an.C(socketAddress, "proxyAddress");
        com.google.d.b.an.C(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            com.google.d.b.an.y(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f46270a = socketAddress;
        this.f46271b = inetSocketAddress;
        this.f46272c = map;
        this.f46273d = str;
        this.f46274e = str2;
    }

    public static ap a() {
        return new ap();
    }

    public final String b() {
        return this.f46274e;
    }

    public final String c() {
        return this.f46273d;
    }

    public final InetSocketAddress d() {
        return this.f46271b;
    }

    public final SocketAddress e() {
        return this.f46270a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return Objects.equals(this.f46270a, aqVar.f46270a) && Objects.equals(this.f46271b, aqVar.f46271b) && Objects.equals(this.f46272c, aqVar.f46272c) && Objects.equals(this.f46273d, aqVar.f46273d) && Objects.equals(this.f46274e, aqVar.f46274e);
    }

    public final int hashCode() {
        return Objects.hash(this.f46270a, this.f46271b, this.f46273d, this.f46274e, this.f46272c);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("proxyAddr", this.f46270a);
        zVarH.d("targetAddr", this.f46271b);
        zVarH.d("headers", this.f46272c);
        zVarH.d(HintConstants.AUTOFILL_HINT_USERNAME, this.f46273d);
        zVarH.e("hasPassword", this.f46274e != null);
        return zVarH.toString();
    }
}
