package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jn extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final String f24954a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24955b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24956c;

    public jn(String str, String str2, long j2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        this.f24954a = str;
        this.f24955b = str2;
        this.f24956c = j2;
    }

    public final long a() {
        return this.f24956c;
    }

    public final String b() {
        return this.f24955b;
    }

    public final String c() {
        return this.f24954a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return h.g.b.x.n(this.f24954a, jnVar.f24954a) && h.g.b.x.n(this.f24955b, jnVar.f24955b) && this.f24956c == jnVar.f24956c;
    }

    public final int hashCode() {
        return (((this.f24954a.hashCode() * 31) + this.f24955b.hashCode()) * 31) + a.a.b(this.f24956c);
    }

    public final String toString() {
        return "CallbackTechCodePopup(title=" + this.f24954a + ", message=" + this.f24955b + ", callback=" + this.f24956c + ")";
    }
}
