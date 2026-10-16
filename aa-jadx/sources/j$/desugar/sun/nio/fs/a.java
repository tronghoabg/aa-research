package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public java.util.HashSet a;
    public java.util.HashMap b;
    public boolean c;

    public final void a(java.lang.Object obj, java.lang.String str) {
        this.b.put(str, obj);
    }

    public final boolean b(java.lang.String str) {
        return this.c || this.a.contains(str);
    }
}
