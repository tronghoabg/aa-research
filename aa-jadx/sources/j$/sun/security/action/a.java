package j$.sun.security.action;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.security.PrivilegedAction {
    public final /* synthetic */ byte a;

    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        switch (this.a) {
            case 0:
                java.lang.String property = java.lang.System.getProperty("file.encoding");
                if (property == null) {
                    return null;
                }
                return property;
            case 1:
                return java.lang.Boolean.valueOf(java.lang.Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 2:
                return java.lang.Boolean.valueOf(java.lang.Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return java.lang.Boolean.valueOf(java.lang.Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
