package com.bytedance.adsdk.oa;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wrv<V> {

    /* renamed from: oa, reason: collision with root package name */
    private final Throwable f24599oa;
    private final V uef;

    public wrv(V v2) {
        this.uef = v2;
        this.f24599oa = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrv)) {
            return false;
        }
        wrv wrvVar = (wrv) obj;
        if (uef() != null && uef().equals(wrvVar.uef())) {
            return true;
        }
        if (oa() == null || wrvVar.oa() == null) {
            return false;
        }
        return oa().toString().equals(oa().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{uef(), oa()});
    }

    public Throwable oa() {
        return this.f24599oa;
    }

    public V uef() {
        return this.uef;
    }

    public wrv(Throwable th) {
        this.f24599oa = th;
        this.uef = null;
    }
}
