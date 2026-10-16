package androidx.core.net;

import android.net.Uri;
import h.g.b.x;
import java.io.File;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class UriKt {
    public static final File toFile(Uri uri) {
        x.f(uri, "<this>");
        if (!x.n(uri.getScheme(), "file")) {
            Objects.toString(uri);
            throw new IllegalArgumentException("Uri lacks 'file' scheme: ".concat(String.valueOf(uri)));
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        Objects.toString(uri);
        throw new IllegalArgumentException("Uri path is null: ".concat(String.valueOf(uri)));
    }

    public static final Uri toUri(File file) {
        x.f(file, "<this>");
        Uri uriFromFile = Uri.fromFile(file);
        x.e(uriFromFile, "fromFile(...)");
        return uriFromFile;
    }

    public static final Uri toUri(String str) {
        x.f(str, "<this>");
        Uri uri = Uri.parse(str);
        x.e(uri, "parse(...)");
        return uri;
    }
}
