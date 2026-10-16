package defpackage;

/* loaded from: classes3.dex */
public final class adlp extends RuntimeException {
    private static final long serialVersionUID = 1;

    public adlp() {
        super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}
