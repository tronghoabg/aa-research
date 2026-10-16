package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hdl implements hju {
    public final gcq a;
    public final List b;
    public final aiyk c;
    public final boolean d;
    private final int e = 2;

    public hdl(gcq gcqVar, List list, aiyk aiykVar, boolean z) {
        this.a = gcqVar;
        this.b = list;
        this.c = aiykVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdl)) {
            return false;
        }
        hdl hdlVar = (hdl) obj;
        if (!affa.f(this.a, hdlVar.a) || !affa.f(this.b, hdlVar.b) || !affa.f(this.c, hdlVar.c)) {
            return false;
        }
        int i = hdlVar.e;
        return this.d == hdlVar.d;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 2) * 31) + a.f(this.d);
    }

    public final String toString() {
        return "RowTitleUiModel(title=" + this.a + ", subtitles=" + this.b + ", truncateSubtitle=" + this.c + ", maxLinesWhenTruncated=2, emphasize=" + this.d + ")";
    }
}
