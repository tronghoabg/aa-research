package com.waze.design_components.c;

import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final d f23381a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23382b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.design_components.d f23383c;

    public c(com.waze.design_components.d dVar, d dVar2) {
        x.f(dVar, "imageData");
        x.f(dVar2, "imageSize");
        this.f23383c = dVar;
        this.f23381a = dVar2;
        this.f23382b = false;
    }

    public final d a() {
        return this.f23381a;
    }

    public final com.waze.design_components.d b() {
        return this.f23383c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!x.n(this.f23383c, cVar.f23383c) || this.f23381a != cVar.f23381a) {
            return false;
        }
        boolean z = cVar.f23382b;
        return true;
    }

    public final int hashCode() {
        return (((this.f23383c.hashCode() * 31) + this.f23381a.hashCode()) * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
    }

    public final String toString() {
        return "DialogImage(imageData=" + this.f23383c + ", imageSize=" + this.f23381a + ", cropCircleImage=false)";
    }
}
