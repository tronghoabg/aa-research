package md;

import A7.C0237b0;
import com.applovin.sdk.AppLovinEventParameters;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* renamed from: md.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3557z extends SocketAddress {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f40731e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f40732a;

    /* renamed from: b, reason: collision with root package name */
    public final InetSocketAddress f40733b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40734c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40735d;

    public C3557z(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Fe.e.t(inetSocketAddress, "proxyAddress");
        Fe.e.t(inetSocketAddress2, "targetAddress");
        Fe.e.y(!inetSocketAddress.isUnresolved(), "The proxy address %s is not resolved", inetSocketAddress);
        this.f40732a = inetSocketAddress;
        this.f40733b = inetSocketAddress2;
        this.f40734c = str;
        this.f40735d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3557z)) {
            return false;
        }
        C3557z c3557z = (C3557z) obj;
        return Fe.b.v(this.f40732a, c3557z.f40732a) && Fe.b.v(this.f40733b, c3557z.f40733b) && Fe.b.v(this.f40734c, c3557z.f40734c) && Fe.b.v(this.f40735d, c3557z.f40735d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40732a, this.f40733b, this.f40734c, this.f40735d});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f40732a, "proxyAddr");
        c0237b0S.f(this.f40733b, "targetAddr");
        c0237b0S.f(this.f40734c, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        c0237b0S.g("hasPassword", this.f40735d != null);
        return c0237b0S.toString();
    }
}
