package com.waze.search.d.a.a;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ui.ac.i;
import com.waze.ui.ac.n;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f35599a;

    /* renamed from: b, reason: collision with root package name */
    private final n f35600b;

    /* renamed from: c, reason: collision with root package name */
    private final i f35601c;

    /* renamed from: d, reason: collision with root package name */
    private final i f35602d;

    /* renamed from: e, reason: collision with root package name */
    private final l f35603e;

    public a(String str, n nVar, i iVar, i iVar2, l lVar) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(nVar, HintConstants.AUTOFILL_HINT_NAME);
        x.f(iVar, "icon");
        x.f(iVar2, "outlineIcon");
        x.f(lVar, "onClick");
        this.f35599a = str;
        this.f35600b = nVar;
        this.f35601c = iVar;
        this.f35602d = iVar2;
        this.f35603e = lVar;
    }

    public final i a() {
        return this.f35601c;
    }

    public final i b() {
        return this.f35602d;
    }

    public final n c() {
        return this.f35600b;
    }

    public final String d() {
        return this.f35599a;
    }

    public final void e() {
        this.f35603e.invoke(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f35599a, aVar.f35599a) && x.n(this.f35600b, aVar.f35600b) && x.n(this.f35601c, aVar.f35601c) && x.n(this.f35602d, aVar.f35602d) && x.n(this.f35603e, aVar.f35603e);
    }

    public final int hashCode() {
        return (((((((this.f35599a.hashCode() * 31) + this.f35600b.hashCode()) * 31) + this.f35601c.hashCode()) * 31) + this.f35602d.hashCode()) * 31) + this.f35603e.hashCode();
    }

    public final String toString() {
        return "CategoryGroupItem(id=" + this.f35599a + ", name=" + this.f35600b + ", icon=" + this.f35601c + ", outlineIcon=" + this.f35602d + ", onClick=" + this.f35603e + ")";
    }
}
