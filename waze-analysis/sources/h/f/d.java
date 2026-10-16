package h.f;

import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d extends IOException {
    public d(File file, File file2, String str) {
        x.f(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            Objects.toString(file2);
            sb.append(" -> ".concat(file2.toString()));
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        x.e(string, "toString(...)");
        super(string);
    }
}
