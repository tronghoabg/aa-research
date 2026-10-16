package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adyj implements adoe {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adyj.class.getName());
    private static final defpackage.aeao c = new defpackage.aeao();
    private static final defpackage.xzi b = new defpackage.qcv(3);

    public adyj() {
        defpackage.xzi xziVar = b;
        defpackage.aeao aeaoVar = c;
        xziVar.getClass();
        aeaoVar.getClass();
    }

    public static final adod a(java.net.InetSocketAddress inetSocketAddress) throws java.io.IOException {
        try {
            java.net.URI uri = new java.net.URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            java.net.ProxySelector proxySelector = java.net.ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            java.util.List<java.net.Proxy> listSelect = proxySelector.select(uri);
            if (listSelect == null || listSelect.isEmpty()) {
                java.lang.String name = proxySelector.getClass().getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ProxySelector ");
                sb.append(name);
                sb.append(" returned ");
                sb.append(listSelect == null ? "null" : "an empty list");
                sb.append(", which violates the java.net.ProxySelector#select(URI) contract");
                throw new java.io.IOException(sb.toString());
            }
            if (listSelect.size() > 1) {
                a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            java.net.Proxy proxy = listSelect.get(0);
            if (proxy.type() == java.net.Proxy.Type.DIRECT) {
                return null;
            }
            java.net.InetSocketAddress inetSocketAddress2 = (java.net.InetSocketAddress) proxy.address();
            java.net.PasswordAuthentication passwordAuthenticationB = defpackage.aeao.b(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            java.net.InetSocketAddress inetSocketAddress3 = inetSocketAddress2.isUnresolved() ? new java.net.InetSocketAddress(java.net.InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort()) : inetSocketAddress2;
            java.util.Map map = java.util.Collections.EMPTY_MAP;
            inetSocketAddress.getClass();
            inetSocketAddress3.getClass();
            if (passwordAuthenticationB == null) {
                return new adlf(inetSocketAddress3, inetSocketAddress, map, (java.lang.String) null, (java.lang.String) null);
            }
            return new adlf(inetSocketAddress3, inetSocketAddress, map, passwordAuthenticationB.getUserName(), passwordAuthenticationB.getPassword() != null ? new java.lang.String(passwordAuthenticationB.getPassword()) : null);
        } catch (java.net.URISyntaxException e) {
            a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (java.lang.Throwable) e);
            return null;
        }
    }
}
