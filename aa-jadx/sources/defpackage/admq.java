package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class admq extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1;

    public admq() {
        super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}
