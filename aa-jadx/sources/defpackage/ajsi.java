package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajsi implements java.lang.Cloneable {
    public static final defpackage.ajsi a = new defpackage.ajsi(false, null, null, false, null, true, true, false, 50, true, null, null, -1, -1, -1);
    public final boolean b;
    public final defpackage.ajqe c;
    public final java.net.InetAddress d;
    public final boolean e;
    public final java.lang.String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final java.util.Collection l;
    public final java.util.Collection m;
    public final int n;
    public final int o;
    public final int p;

    public ajsi(boolean z, defpackage.ajqe ajqeVar, java.net.InetAddress inetAddress, boolean z2, java.lang.String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, java.util.Collection collection, java.util.Collection collection2, int i2, int i3, int i4) {
        this.b = z;
        this.c = ajqeVar;
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

    protected final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return (defpackage.ajsi) super.clone();
    }

    public final java.lang.String toString() {
        return "[expectContinueEnabled=" + this.b + ", proxy=" + this.c + ", localAddress=" + this.d + ", cookieSpec=" + this.f + ", redirectsEnabled=" + this.g + ", relativeRedirectsAllowed=" + this.h + ", maxRedirects=" + this.j + ", circularRedirectsAllowed=" + this.i + ", authenticationEnabled=" + this.k + ", targetPreferredAuthSchemes=" + this.l + ", proxyPreferredAuthSchemes=" + this.m + ", connectionRequestTimeout=" + this.n + ", connectTimeout=" + this.o + ", socketTimeout=" + this.p + ", contentCompressionEnabled=true, normalizeUri=true]";
    }

    protected ajsi() {
        this(false, null, null, false, null, false, false, false, 0, false, null, null, 0, 0, 0);
    }
}
