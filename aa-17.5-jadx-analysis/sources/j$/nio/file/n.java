package j$.nio.file;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class n {
    public final Path a;
    public final Object b;
    public final DirectoryStream c;
    public final Iterator d;

    public n(Path path, Object obj, DirectoryStream directoryStream) {
        this.a = path;
        this.b = obj;
        this.c = directoryStream;
        this.d = directoryStream.iterator();
    }
}
