package com.google.d.f;

import com.google.d.d.fo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj implements s {

    /* renamed from: a, reason: collision with root package name */
    private final s f7684a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7685b;

    private aj(s sVar, Object obj) {
        fo.o(sVar, "log site key");
        this.f7684a = sVar;
        fo.o(obj, "log site qualifier");
        this.f7685b = obj;
    }

    static s a(s sVar, Object obj) {
        return new aj(sVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return this.f7684a.equals(ajVar.f7684a) && this.f7685b.equals(ajVar.f7685b);
    }

    public final int hashCode() {
        return this.f7684a.hashCode() ^ this.f7685b.hashCode();
    }

    public final String toString() {
        Object obj = this.f7685b;
        return "SpecializedLogSiteKey{ delegate='" + this.f7684a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
