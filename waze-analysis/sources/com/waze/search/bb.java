package com.waze.search;

import com.waze.sdk.bq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb extends bq {

    /* renamed from: a, reason: collision with root package name */
    private final int f35535a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35536b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.waze.sharedui.b bVar) {
        super(null);
        h.g.b.x.f(bVar, "error");
        int code = bVar.getCode();
        String errorMessage = bVar.getErrorMessage();
        h.g.b.x.e(errorMessage, "getErrorMessage(...)");
        h.g.b.x.f(errorMessage, "description");
        this.f35535a = code;
        this.f35536b = errorMessage;
    }

    public final int e() {
        return this.f35535a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.f35535a == bbVar.f35535a && h.g.b.x.n(this.f35536b, bbVar.f35536b);
    }

    public final String f() {
        return this.f35536b;
    }

    public final int hashCode() {
        return (this.f35535a * 31) + this.f35536b.hashCode();
    }

    public final String toString() {
        return "Error(errorCode=" + this.f35535a + ", description=" + this.f35536b + ")";
    }
}
