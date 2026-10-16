package com.waze.uid.f;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f44492a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44493b;

    public a(String str, String str2) {
        this.f44492a = str;
        this.f44493b = str2;
    }

    public final String a() {
        return this.f44492a;
    }

    public final String b() {
        return this.f44493b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f44492a, aVar.f44492a) && x.n(this.f44493b, aVar.f44493b);
    }

    public final int hashCode() {
        String str = this.f44492a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f44493b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "HomeWorkLabels(home=" + this.f44492a + ", work=" + this.f44493b + ")";
    }

    public a() {
        this(null);
    }

    public /* synthetic */ a(byte[] bArr) {
        this(null, null);
    }
}
