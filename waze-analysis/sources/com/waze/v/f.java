package com.waze.v;

import com.waze.av.b.n;
import com.waze.gas.GasNativeManager;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final n f44920a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44921b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f44922c;

    /* renamed from: d, reason: collision with root package name */
    private final String f44923d;

    /* renamed from: e, reason: collision with root package name */
    private final List f44924e;

    public f(n nVar, String str, com.waze.ui.ac.i iVar, String str2, List list) {
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(iVar, "image");
        x.f(list, "badges");
        this.f44920a = nVar;
        this.f44921b = str;
        this.f44922c = iVar;
        this.f44923d = str2;
        this.f44924e = list;
    }

    public static /* synthetic */ f f(f fVar, List list) {
        String str = fVar.f44921b;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        com.waze.ui.ac.i iVar = fVar.f44922c;
        x.f(iVar, "image");
        x.f(list, "badges");
        return new f(fVar.f44920a, str, iVar, fVar.f44923d, list);
    }

    public final n a() {
        return this.f44920a;
    }

    public final com.waze.ui.ac.i b() {
        return this.f44922c;
    }

    public final String c() {
        return this.f44923d;
    }

    public final String d() {
        return this.f44921b;
    }

    public final List e() {
        return this.f44924e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f44920a, fVar.f44920a) && x.n(this.f44921b, fVar.f44921b) && x.n(this.f44922c, fVar.f44922c) && x.n(this.f44923d, fVar.f44923d) && x.n(this.f44924e, fVar.f44924e);
    }

    public final int hashCode() {
        n nVar = this.f44920a;
        int iHashCode = ((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f44921b.hashCode()) * 31) + this.f44922c.hashCode();
        String str = this.f44923d;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f44924e.hashCode();
    }

    public final String toString() {
        return "CrisisResponseState(genericPlace=" + this.f44920a + ", title=" + this.f44921b + ", image=" + this.f44922c + ", address=" + this.f44923d + ", badges=" + this.f44924e + ")";
    }
}
