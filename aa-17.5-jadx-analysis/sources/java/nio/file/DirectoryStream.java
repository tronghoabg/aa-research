package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    public interface Filter<T> {
        /* renamed from: accept */
        boolean mo326accept(T t) throws IOException;
    }

    Iterator<T> iterator();
}
