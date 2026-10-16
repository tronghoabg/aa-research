package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wed {
    public final boolean a;
    public final java.util.List b;
    public final defpackage.abnv c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.util.List f;
    public final java.util.List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final defpackage.wce k;

    public wed(boolean z, java.util.List list, defpackage.abnv abnvVar, java.lang.String str, java.lang.String str2, java.util.List list2, java.util.List list3, boolean z2, boolean z3, boolean z4, defpackage.wce wceVar) {
        list.getClass();
        abnvVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        wceVar.getClass();
        this.a = z;
        this.b = list;
        this.c = abnvVar;
        this.d = str;
        this.e = str2;
        this.f = list2;
        this.g = list3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = wceVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wed)) {
            return false;
        }
        defpackage.wed wedVar = (defpackage.wed) obj;
        return this.a == wedVar.a && defpackage.afga.f(this.b, wedVar.b) && defpackage.afga.f(this.c, wedVar.c) && defpackage.afga.f(this.d, wedVar.d) && defpackage.afga.f(this.e, wedVar.e) && defpackage.afga.f(this.f, wedVar.f) && defpackage.afga.f(this.g, wedVar.g) && this.h == wedVar.h && this.i == wedVar.i && this.j == wedVar.j && defpackage.afga.f(this.k, wedVar.k);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, java.lang.Boolean.valueOf(this.h), java.lang.Boolean.valueOf(this.i), java.lang.Boolean.valueOf(this.j)});
    }

    public final java.lang.String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.a + ", enabledBackings=" + this.b + ", secret=" + this.c + ", dirPath=" + this.d + ", gmsCoreDirPath=" + this.e + ", includeStaticConfigPackages=" + this.f + ", excludeStaticConfigPackages=" + this.g + ", hasStorageInfoFromGms=" + this.h + ", allowEmptySnapshotToken=" + this.i + ", enableCommitV2Api=" + this.j + ", clientFlags=" + this.k + ")";
    }
}
