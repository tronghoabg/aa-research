package com.waze.ev;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f23691a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23692b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.n f23693c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.ac.n f23694d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f23695e;

    public f(String str, int i2, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, Set set) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(nVar, "longName");
        x.f(nVar2, "shortName");
        x.f(set, "compatibleVenuePlugs");
        this.f23691a = str;
        this.f23692b = i2;
        this.f23693c = nVar;
        this.f23694d = nVar2;
        this.f23695e = set;
    }

    public final int a() {
        return this.f23692b;
    }

    public final com.waze.ui.ac.n b() {
        return this.f23693c;
    }

    public final com.waze.ui.ac.n c() {
        return this.f23694d;
    }

    public final String d() {
        return this.f23691a;
    }

    public final Set e() {
        return this.f23695e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f23691a, fVar.f23691a) && this.f23692b == fVar.f23692b && x.n(this.f23693c, fVar.f23693c) && x.n(this.f23694d, fVar.f23694d) && x.n(this.f23695e, fVar.f23695e);
    }

    public final int hashCode() {
        return (((((((this.f23691a.hashCode() * 31) + this.f23692b) * 31) + this.f23693c.hashCode()) * 31) + this.f23694d.hashCode()) * 31) + this.f23695e.hashCode();
    }

    public final String toString() {
        return "Connector(id=" + this.f23691a + ", icon=" + this.f23692b + ", longName=" + this.f23693c + ", shortName=" + this.f23694d + ", compatibleVenuePlugs=" + this.f23695e + ")";
    }

    public /* synthetic */ f(String str, int i2, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2) {
        this(str, i2, nVar, nVar2, e.c.d.a.p());
    }
}
