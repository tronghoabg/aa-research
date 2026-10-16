package java.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface DirectoryStream<T> extends java.io.Closeable, java.lang.Iterable<T> {

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public interface Filter<T> {
        /* JADX INFO: renamed from: accept */
        boolean mo327accept(T t) throws java.io.IOException;
    }

    java.util.Iterator<T> iterator();
}
