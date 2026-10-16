package com.waze.sharedui.b;

import androidx.autofill.HintConstants;
import h.g.b.x;
import i.b.a.m;
import i.b.a.o;
import i.b.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final p f38828a;

    /* renamed from: b, reason: collision with root package name */
    private final m f38829b;

    /* renamed from: c, reason: collision with root package name */
    private final o f38830c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38831d;

    /* renamed from: e, reason: collision with root package name */
    private final List f38832e;

    public a(p pVar, m mVar, o oVar, String str, List list) {
        x.f(pVar, HintConstants.AUTOFILL_HINT_NAME);
        x.f(mVar, "context");
        x.f(oVar, "value");
        x.f(str, "selectedOption");
        x.f(list, "stringResIDs");
        this.f38828a = pVar;
        this.f38829b = mVar;
        this.f38830c = oVar;
        this.f38831d = str;
        this.f38832e = list;
    }

    public static /* synthetic */ a f(a aVar, String str) {
        p pVar = aVar.f38828a;
        m mVar = aVar.f38829b;
        o oVar = aVar.f38830c;
        List list = aVar.f38832e;
        x.f(pVar, HintConstants.AUTOFILL_HINT_NAME);
        x.f(mVar, "context");
        x.f(oVar, "value");
        x.f(str, "selectedOption");
        x.f(list, "stringResIDs");
        return new a(pVar, mVar, oVar, str, list);
    }

    public final String a() {
        return this.f38831d;
    }

    public final List b() {
        return this.f38832e;
    }

    public final m c() {
        return this.f38829b;
    }

    public final o d() {
        return this.f38830c;
    }

    public final p e() {
        return this.f38828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f38828a == aVar.f38828a && this.f38829b == aVar.f38829b && this.f38830c == aVar.f38830c && x.n(this.f38831d, aVar.f38831d) && x.n(this.f38832e, aVar.f38832e);
    }

    public final int hashCode() {
        return (((((((this.f38828a.hashCode() * 31) + this.f38829b.hashCode()) * 31) + this.f38830c.hashCode()) * 31) + this.f38831d.hashCode()) * 31) + this.f38832e.hashCode();
    }

    public final String toString() {
        return "AuditEvent(name=" + this.f38828a + ", context=" + this.f38829b + ", value=" + this.f38830c + ", selectedOption=" + this.f38831d + ", stringResIDs=" + this.f38832e + ")";
    }
}
