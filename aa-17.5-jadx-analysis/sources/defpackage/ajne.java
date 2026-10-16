package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ajne {
    public final boolean a;
    public final boolean b;
    public final ajnr c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;

    public ajne(boolean z, boolean z2, ajnr ajnrVar, Long l, Long l2, Long l3, Long l4) {
        this.a = z;
        this.b = z2;
        this.c = ajnrVar;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            Objects.toString(l);
            arrayList.add("byteCount=".concat(l.toString()));
        }
        Long l2 = this.e;
        if (l2 != null) {
            Objects.toString(l2);
            arrayList.add("createdAt=".concat(l2.toString()));
        }
        Long l3 = this.f;
        if (l3 != null) {
            Objects.toString(l3);
            arrayList.add("lastModifiedAt=".concat(l3.toString()));
        }
        Long l4 = this.g;
        if (l4 != null) {
            Objects.toString(l4);
            arrayList.add("lastAccessedAt=".concat(l4.toString()));
        }
        return woy.cu(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
