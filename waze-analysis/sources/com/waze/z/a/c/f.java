package com.waze.z.a.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f45834a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45835b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f45836c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f45837d;

    public f(String str, boolean z, h.g.a.l lVar) {
        x.f(str, "text");
        x.f(lVar, "onCheckedChange");
        this.f45834a = str;
        this.f45835b = z;
        this.f45836c = lVar;
        this.f45837d = true;
    }

    public final String a() {
        return this.f45834a;
    }

    public final h.g.a.l b() {
        return this.f45836c;
    }

    public final boolean c() {
        return this.f45835b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!x.n(this.f45834a, fVar.f45834a) || this.f45835b != fVar.f45835b || !x.n(this.f45836c, fVar.f45836c)) {
            return false;
        }
        boolean z = fVar.f45837d;
        return true;
    }

    public final int hashCode() {
        return (((((this.f45834a.hashCode() * 31) + a.a.a(this.f45835b)) * 31) + this.f45836c.hashCode()) * 31) + a.a.a(true);
    }

    public final String toString() {
        return "WazeDialogCheckboxData(text=" + this.f45834a + ", isChecked=" + this.f45835b + ", onCheckedChange=" + this.f45836c + ", enabled=true)";
    }
}
