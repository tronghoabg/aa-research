package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac extends com.waze.n.ac {

    /* renamed from: a, reason: collision with root package name */
    private final String f20534a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20535b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(String str, List list) {
        super(null, null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "itemGroups");
        this.f20534a = str;
        this.f20535b = list;
        this.f20536c = false;
    }

    public final String a() {
        return this.f20534a;
    }

    public final List b() {
        return this.f20535b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if (!h.g.b.x.n(this.f20534a, acVar.f20534a) || !h.g.b.x.n(this.f20535b, acVar.f20535b)) {
            return false;
        }
        boolean z = acVar.f20536c;
        return true;
    }

    public final int hashCode() {
        return (((this.f20534a.hashCode() * 31) + this.f20535b.hashCode()) * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
    }

    public final String toString() {
        return "Loaded(title=" + this.f20534a + ", itemGroups=" + this.f20535b + ", shouldShowCloseButton=false)";
    }
}
