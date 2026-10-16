package com.waze.speech;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class Item {
    private final List<Alternative> alternative;

    /* renamed from: final, reason: not valid java name */
    private final boolean f63final;

    public Item(List<Alternative> list, boolean z) {
        h.g.b.x.f(list, "alternative");
        this.alternative = list;
        this.f63final = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Item copy$default(Item item, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = item.alternative;
        }
        if ((i2 & 2) != 0) {
            z = item.f63final;
        }
        return item.copy(list, z);
    }

    public final List<Alternative> component1() {
        return this.alternative;
    }

    public final boolean component2() {
        return this.f63final;
    }

    public final Item copy(List<Alternative> list, boolean z) {
        h.g.b.x.f(list, "alternative");
        return new Item(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return h.g.b.x.n(this.alternative, item.alternative) && this.f63final == item.f63final;
    }

    public final List<Alternative> getAlternative() {
        return this.alternative;
    }

    public final boolean getFinal() {
        return this.f63final;
    }

    public int hashCode() {
        return (this.alternative.hashCode() * 31) + a.a.a(this.f63final);
    }

    public String toString() {
        return "Item(alternative=" + this.alternative + ", final=" + this.f63final + ")";
    }
}
