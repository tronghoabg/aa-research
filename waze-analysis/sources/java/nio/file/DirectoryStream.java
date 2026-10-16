package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    /* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
    public interface Filter<T> {
        /* renamed from: accept */
        boolean mo37425accept(T t) throws IOException;
    }

    Iterator<T> iterator();
}
