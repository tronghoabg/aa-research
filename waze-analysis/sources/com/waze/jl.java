package com.waze;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jl extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final String f24952a;

    /* renamed from: b, reason: collision with root package name */
    private final jk f24953b;

    public jl(String str, jk jkVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(jkVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f24952a = str;
        this.f24953b = jkVar;
    }

    public final jk a() {
        return this.f24953b;
    }

    public final String b() {
        return this.f24952a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        jl jlVar = (jl) obj;
        return h.g.b.x.n(this.f24952a, jlVar.f24952a) && this.f24953b == jlVar.f24953b;
    }

    public final int hashCode() {
        return (this.f24952a.hashCode() * 31) + this.f24953b.hashCode();
    }

    public final String toString() {
        return "NotificationMessage(title=" + this.f24952a + ", type=" + this.f24953b + ")";
    }
}
