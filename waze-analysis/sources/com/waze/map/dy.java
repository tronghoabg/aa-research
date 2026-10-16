package com.waze.map;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dy extends dz {

    /* renamed from: a, reason: collision with root package name */
    private final dw f28784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(dw dwVar) {
        super(null);
        h.g.b.x.f(dwVar, "view");
        this.f28784a = dwVar;
    }

    @Override // com.waze.map.dz
    public final /* synthetic */ View a() {
        return this.f28784a;
    }

    public final dw b() {
        return this.f28784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy) && h.g.b.x.n(this.f28784a, ((dy) obj).f28784a);
    }

    public final int hashCode() {
        return this.f28784a.hashCode();
    }

    public final String toString() {
        return "Old(view=" + this.f28784a + ")";
    }
}
