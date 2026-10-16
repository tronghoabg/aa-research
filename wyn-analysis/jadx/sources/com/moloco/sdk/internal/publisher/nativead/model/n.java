package com.moloco.sdk.internal.publisher.nativead.model;

import Af.q;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f29197a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f29198b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f29199c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f29200d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f29201e;

    public n(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, ArrayList arrayList) {
        this.f29197a = linkedHashMap;
        this.f29198b = linkedHashMap2;
        this.f29199c = linkedHashMap3;
        this.f29200d = linkedHashMap4;
        this.f29201e = arrayList;
        Fe.c.z(new q(this, 12));
    }

    public final String a(int i5) {
        i iVar = (i) this.f29197a.get(Integer.valueOf(i5));
        if (iVar != null) {
            return iVar.f29192b;
        }
        return null;
    }

    public final Uri b(int i5) {
        j jVar = (j) this.f29198b.get(Integer.valueOf(i5));
        if (jVar != null) {
            return jVar.f29193b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f29197a.equals(nVar.f29197a) && this.f29198b.equals(nVar.f29198b) && this.f29199c.equals(nVar.f29199c) && this.f29200d.equals(nVar.f29200d) && this.f29201e.equals(nVar.f29201e);
    }

    public final int hashCode() {
        return this.f29201e.hashCode() + ((this.f29200d.hashCode() + ((this.f29199c.hashCode() + ((this.f29198b.hashCode() + (this.f29197a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PreparedNativeAssets(data=" + this.f29197a + ", images=" + this.f29198b + ", titles=" + this.f29199c + ", videos=" + this.f29200d + ", failedAssets=" + this.f29201e + ')';
    }
}
