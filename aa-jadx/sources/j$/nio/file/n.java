package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    public final j$.nio.file.Path a;
    public final java.lang.Object b;
    public final java.nio.file.DirectoryStream c;
    public final java.util.Iterator d;

    public n(j$.nio.file.Path path, java.lang.Object obj, java.nio.file.DirectoryStream directoryStream) {
        this.a = path;
        this.b = obj;
        this.c = directoryStream;
        this.d = directoryStream.iterator();
    }
}
