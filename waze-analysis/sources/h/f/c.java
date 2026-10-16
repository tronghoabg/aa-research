package h.f;

import h.g.b.x;
import java.io.File;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final File f48071a;

    /* renamed from: b, reason: collision with root package name */
    private final List f48072b;

    public c(File file, List list) {
        x.f(file, "root");
        x.f(list, "segments");
        this.f48071a = file;
        this.f48072b = list;
    }

    public final int a() {
        return this.f48072b.size();
    }

    public final File b() {
        return this.f48071a;
    }

    public final List c() {
        return this.f48072b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f48071a, cVar.f48071a) && x.n(this.f48072b, cVar.f48072b);
    }

    public final int hashCode() {
        return (this.f48071a.hashCode() * 31) + this.f48072b.hashCode();
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f48071a + ", segments=" + this.f48072b + ")";
    }
}
