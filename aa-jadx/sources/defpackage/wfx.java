package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wfx {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("[a-z]+(_[a-z]+)*");
    static final android.accounts.Account b = defpackage.wfu.a;
    public static final java.util.Set c = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    static {
        j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
    }
}
