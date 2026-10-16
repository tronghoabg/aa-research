package com.waze.app_nav;

import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final List f15166a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15167b;

    public aa(List list) {
        h.g.b.x.f(list, "destinations");
        this.f15166a = list;
        this.f15167b = false;
    }

    public static /* synthetic */ aa b(aa aaVar, List list) {
        boolean z = aaVar.f15167b;
        h.g.b.x.f(list, "destinations");
        return new aa(list);
    }

    public final List a() {
        return this.f15166a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        if (!h.g.b.x.n(this.f15166a, aaVar.f15166a)) {
            return false;
        }
        boolean z = aaVar.f15167b;
        return true;
    }

    public final int hashCode() {
        return (this.f15166a.hashCode() * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
    }

    public final String toString() {
        return "InternalState(destinations=" + this.f15166a + ", isRootLocked=false)";
    }
}
