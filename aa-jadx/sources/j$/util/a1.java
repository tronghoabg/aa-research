package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a1 {
    public static final boolean a = ((java.lang.Boolean) java.security.AccessController.doPrivileged(new j$.sun.security.action.a((byte) 1))).booleanValue();

    public static void a(java.lang.Class cls, java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(java.lang.String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
