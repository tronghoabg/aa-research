package com.waze.resources;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f35093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35094b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35095c;

    public g(String str, int i2) {
        this.f35095c = 1;
        this.f35094b = str;
        this.f35093a = i2;
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        int i2 = this.f35095c;
        return i2 == 2 ? str.startsWith(this.f35094b) : (i2 == 1 || i2 == 0) ? this.f35094b.equals(str) : false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f35095c == 0 ? gVar.a(this.f35094b) : a(gVar.f35094b);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f35093a), this.f35094b, Integer.valueOf(this.f35095c));
    }

    public g(String str, int i2, int i3) {
        this.f35094b = str;
        this.f35093a = i2;
        this.f35095c = i3;
    }
}
