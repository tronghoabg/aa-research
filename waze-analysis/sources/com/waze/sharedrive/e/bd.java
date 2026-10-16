package com.waze.sharedrive.e;

import android.graphics.Bitmap;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final String f38408a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f38409b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap f38410c;

    /* renamed from: d, reason: collision with root package name */
    private final List f38411d;

    public bd(String str, com.waze.shared_infra.h.c cVar, Bitmap bitmap, List list) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(bitmap, "pinBitmap");
        this.f38408a = str;
        this.f38409b = cVar;
        this.f38410c = bitmap;
        this.f38411d = list;
    }

    public final Bitmap a() {
        return this.f38410c;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f38409b;
    }

    public final String c() {
        return this.f38408a;
    }

    public final List d() {
        return this.f38411d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return h.g.b.x.n(this.f38408a, bdVar.f38408a) && h.g.b.x.n(this.f38409b, bdVar.f38409b) && h.g.b.x.n(this.f38410c, bdVar.f38410c) && h.g.b.x.n(this.f38411d, bdVar.f38411d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f38408a.hashCode() * 31) + this.f38409b.hashCode()) * 31) + this.f38410c.hashCode();
        List list = this.f38411d;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "RenderedParticipant(id=" + this.f38408a + ", coordinate=" + this.f38409b + ", pinBitmap=" + this.f38410c + ", routeGeometry=" + this.f38411d + ")";
    }
}
