package com.waze.sharedrive.c.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f38075a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38076b;

    /* renamed from: c, reason: collision with root package name */
    private final b f38077c;

    /* renamed from: d, reason: collision with root package name */
    private final List f38078d;

    public m(String str, String str2, b bVar, List list) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "shareUrl");
        x.f(bVar, "destination");
        x.f(list, "participants");
        this.f38075a = str;
        this.f38076b = str2;
        this.f38077c = bVar;
        this.f38078d = list;
    }

    public static /* synthetic */ m e(m mVar, List list) {
        String str = mVar.f38075a;
        String str2 = mVar.f38076b;
        b bVar = mVar.f38077c;
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "shareUrl");
        x.f(bVar, "destination");
        x.f(list, "participants");
        return new m(str, str2, bVar, list);
    }

    public final b a() {
        return this.f38077c;
    }

    public final String b() {
        return this.f38075a;
    }

    public final String c() {
        return this.f38076b;
    }

    public final List d() {
        return this.f38078d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return x.n(this.f38075a, mVar.f38075a) && x.n(this.f38076b, mVar.f38076b) && x.n(this.f38077c, mVar.f38077c) && x.n(this.f38078d, mVar.f38078d);
    }

    public final int hashCode() {
        return (((((this.f38075a.hashCode() * 31) + this.f38076b.hashCode()) * 31) + this.f38077c.hashCode()) * 31) + this.f38078d.hashCode();
    }

    public final String toString() {
        return "SharedDrive(id=" + this.f38075a + ", shareUrl=" + this.f38076b + ", destination=" + this.f38077c + ", participants=" + this.f38078d + ")";
    }
}
