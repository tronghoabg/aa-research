package com.google.android.libraries.phenotype.client.stable;

import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6072a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6073b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f6074c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6075d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6076e;

    /* renamed from: f, reason: collision with root package name */
    private final List f6077f;

    /* renamed from: g, reason: collision with root package name */
    private final List f6078g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6079h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6080i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f6081j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.b.l f6082k;

    public as(boolean z, List list, com.google.v.v vVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4, com.google.android.libraries.phenotype.client.b.l lVar) {
        h.g.b.x.f(list, "enabledBackings");
        h.g.b.x.f(vVar, "secret");
        h.g.b.x.f(str, "dirPath");
        h.g.b.x.f(str2, "gmsCoreDirPath");
        h.g.b.x.f(list2, "includeStaticConfigPackages");
        h.g.b.x.f(list3, "excludeStaticConfigPackages");
        h.g.b.x.f(lVar, "clientFlags");
        this.f6072a = z;
        this.f6073b = list;
        this.f6074c = vVar;
        this.f6075d = str;
        this.f6076e = str2;
        this.f6077f = list2;
        this.f6078g = list3;
        this.f6079h = z2;
        this.f6080i = z3;
        this.f6081j = z4;
        this.f6082k = lVar;
    }

    public final com.google.android.libraries.phenotype.client.a.c a(com.google.g.a.a.b bVar, String str) {
        h.g.b.x.f(bVar, "androidBacking");
        h.g.b.x.f(str, "staticPackageName");
        if (!this.f6079h) {
            return com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_INFO_NOT_FOUND;
        }
        h.g.b.x.f(bVar, "androidBacking");
        if (!this.f6072a || !this.f6073b.contains(bVar)) {
            return com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_DISABLED;
        }
        if (this.f6074c.w()) {
            return com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_EMPTY_SECRET;
        }
        List list = this.f6077f;
        if (!list.isEmpty() && !list.contains(str)) {
            return com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_PACKAGE_NOT_INCLUDED;
        }
        if (this.f6078g.contains(str)) {
            return com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_PACKAGE_EXCLUDED;
        }
        return null;
    }

    public final com.google.android.libraries.phenotype.client.b.l b() {
        return this.f6082k;
    }

    public final com.google.v.v c() {
        return this.f6074c;
    }

    public final String d() {
        return this.f6075d;
    }

    public final String e() {
        return this.f6076e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return this.f6072a == asVar.f6072a && h.g.b.x.n(this.f6073b, asVar.f6073b) && h.g.b.x.n(this.f6074c, asVar.f6074c) && h.g.b.x.n(this.f6075d, asVar.f6075d) && h.g.b.x.n(this.f6076e, asVar.f6076e) && h.g.b.x.n(this.f6077f, asVar.f6077f) && h.g.b.x.n(this.f6078g, asVar.f6078g) && this.f6079h == asVar.f6079h && this.f6080i == asVar.f6080i && this.f6081j == asVar.f6081j && h.g.b.x.n(this.f6082k, asVar.f6082k);
    }

    public final boolean f() {
        return this.f6080i;
    }

    public final boolean g() {
        return this.f6081j;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f6072a), this.f6073b, this.f6074c, this.f6075d, this.f6076e, this.f6077f, this.f6078g, Boolean.valueOf(this.f6079h), Boolean.valueOf(this.f6080i), Boolean.valueOf(this.f6081j));
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.f6072a + ", enabledBackings=" + this.f6073b + ", secret=" + this.f6074c + ", dirPath=" + this.f6075d + ", gmsCoreDirPath=" + this.f6076e + ", includeStaticConfigPackages=" + this.f6077f + ", excludeStaticConfigPackages=" + this.f6078g + ", hasStorageInfoFromGms=" + this.f6079h + ", allowEmptySnapshotToken=" + this.f6080i + ", enableCommitV2Api=" + this.f6081j + ", clientFlags=" + this.f6082k + ")";
    }
}
