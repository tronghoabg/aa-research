package com.google.d.f.b;

import com.google.d.d.fo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.d.f.e.d f7739a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7740b;

    public ag(com.google.d.f.e.d dVar, String str) {
        fo.o(dVar, "parser");
        this.f7739a = dVar;
        fo.o(str, "message");
        this.f7740b = str;
    }

    public final com.google.d.f.e.d a() {
        return this.f7739a;
    }

    public final String b() {
        return this.f7740b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ag) {
            ag agVar = (ag) obj;
            if (this.f7739a.equals(agVar.f7739a) && this.f7740b.equals(agVar.f7740b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7739a.hashCode() ^ this.f7740b.hashCode();
    }
}
