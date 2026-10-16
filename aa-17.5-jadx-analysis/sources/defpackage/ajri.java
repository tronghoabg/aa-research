package defpackage;

import java.net.InetAddress;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class ajri implements Cloneable {
    public static final ajri a = new ajri(false, null, null, false, null, true, true, false, 50, true, null, null, -1, -1, -1);
    public final boolean b;
    public final ajpe c;
    public final InetAddress d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final Collection l;
    public final Collection m;
    public final int n;
    public final int o;
    public final int p;

    public ajri(boolean z, ajpe ajpeVar, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection collection, Collection collection2, int i2, int i3, int i4) {
        this.b = z;
        this.c = ajpeVar;
        this.d = inetAddress;
        this.e = z2;
        this.f = str;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i;
        this.k = z6;
        this.l = collection;
        this.m = collection2;
        this.n = i2;
        this.o = i3;
        this.p = i4;
    }

    protected final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (ajri) super.clone();
    }

    public final String toString() {
        return "[expectContinueEnabled=" + this.b + ", proxy=" + this.c + ", localAddress=" + this.d + ", cookieSpec=" + this.f + ", redirectsEnabled=" + this.g + ", relativeRedirectsAllowed=" + this.h + ", maxRedirects=" + this.j + ", circularRedirectsAllowed=" + this.i + ", authenticationEnabled=" + this.k + ", targetPreferredAuthSchemes=" + this.l + ", proxyPreferredAuthSchemes=" + this.m + ", connectionRequestTimeout=" + this.n + ", connectTimeout=" + this.o + ", socketTimeout=" + this.p + ", contentCompressionEnabled=true, normalizeUri=true]";
    }

    protected ajri() {
        this(false, null, null, false, null, false, false, false, 0, false, null, null, 0, 0, 0);
    }
}
