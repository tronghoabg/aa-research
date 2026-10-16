package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class bfu {
    public static final bfu a = new bfu(afbe.a);
    public final List b;

    public bfu(List list) {
        this.b = list;
    }

    public final String toString() throws IOException {
        return "TextContextMenuData(components=" + dlz.c(this.b, "\n\t", "[\n\t", "\n]", null, 56) + ")";
    }
}
