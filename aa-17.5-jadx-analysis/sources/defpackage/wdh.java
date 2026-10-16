package defpackage;

import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public final class wdh {
    public final boolean a;
    public final List b;
    public final abms c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final wbi k;

    public wdh(boolean z, List list, abms abmsVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4, wbi wbiVar) {
        list.getClass();
        abmsVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        wbiVar.getClass();
        this.a = z;
        this.b = list;
        this.c = abmsVar;
        this.d = str;
        this.e = str2;
        this.f = list2;
        this.g = list3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = wbiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdh)) {
            return false;
        }
        wdh wdhVar = (wdh) obj;
        return this.a == wdhVar.a && affa.f(this.b, wdhVar.b) && affa.f(this.c, wdhVar.c) && affa.f(this.d, wdhVar.d) && affa.f(this.e, wdhVar.e) && affa.f(this.f, wdhVar.f) && affa.f(this.g, wdhVar.g) && this.h == wdhVar.h && this.i == wdhVar.i && this.j == wdhVar.j && affa.f(this.k, wdhVar.k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.a + ", enabledBackings=" + this.b + ", secret=" + this.c + ", dirPath=" + this.d + ", gmsCoreDirPath=" + this.e + ", includeStaticConfigPackages=" + this.f + ", excludeStaticConfigPackages=" + this.g + ", hasStorageInfoFromGms=" + this.h + ", allowEmptySnapshotToken=" + this.i + ", enableCommitV2Api=" + this.j + ", clientFlags=" + this.k + ")";
    }
}
