package p9;

import java.util.ArrayList;

/* renamed from: p9.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3779D {

    /* renamed from: a, reason: collision with root package name */
    public final u f43329a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.i f43330b;

    /* renamed from: c, reason: collision with root package name */
    public final s9.i f43331c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f43332d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43333e;

    /* renamed from: f, reason: collision with root package name */
    public final c9.d f43334f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f43335g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f43336h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f43337i;

    public C3779D(u uVar, s9.i iVar, s9.i iVar2, ArrayList arrayList, boolean z2, c9.d dVar, boolean z10, boolean z11, boolean z12) {
        this.f43329a = uVar;
        this.f43330b = iVar;
        this.f43331c = iVar2;
        this.f43332d = arrayList;
        this.f43333e = z2;
        this.f43334f = dVar;
        this.f43335g = z10;
        this.f43336h = z11;
        this.f43337i = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3779D)) {
            return false;
        }
        C3779D c3779d = (C3779D) obj;
        if (this.f43333e == c3779d.f43333e && this.f43335g == c3779d.f43335g && this.f43336h == c3779d.f43336h && this.f43329a.equals(c3779d.f43329a) && this.f43334f.equals(c3779d.f43334f) && this.f43330b.equals(c3779d.f43330b) && this.f43331c.equals(c3779d.f43331c) && this.f43337i == c3779d.f43337i) {
            return this.f43332d.equals(c3779d.f43332d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f43334f.f19805a.hashCode() + ((this.f43332d.hashCode() + ((this.f43331c.hashCode() + ((this.f43330b.hashCode() + (this.f43329a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f43333e ? 1 : 0)) * 31) + (this.f43335g ? 1 : 0)) * 31) + (this.f43336h ? 1 : 0)) * 31) + (this.f43337i ? 1 : 0);
    }

    public final String toString() {
        return "ViewSnapshot(" + this.f43329a + ", " + this.f43330b + ", " + this.f43331c + ", " + this.f43332d + ", isFromCache=" + this.f43333e + ", mutatedKeys=" + this.f43334f.f19805a.size() + ", didSyncStateChange=" + this.f43335g + ", excludesMetadataChanges=" + this.f43336h + ", hasCachedResults=" + this.f43337i + ")";
    }
}
