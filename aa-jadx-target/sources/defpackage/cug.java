package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cug implements defpackage.cty {
    private final defpackage.cuf a;

    public cug(defpackage.cuf cufVar) {
        this.a = cufVar;
    }

    @Override // defpackage.cty
    public final int a(defpackage.csz cszVar, java.util.List list, int i) {
        return this.a.a(cszVar, defpackage.ud.h(cszVar), i);
    }

    @Override // defpackage.cty
    public final int b(defpackage.csz cszVar, java.util.List list, int i) {
        return this.a.b(cszVar, defpackage.ud.h(cszVar), i);
    }

    @Override // defpackage.cty
    public final int c(defpackage.csz cszVar, java.util.List list, int i) {
        return this.a.c(cszVar, defpackage.ud.h(cszVar), i);
    }

    @Override // defpackage.cty
    public final int d(defpackage.csz cszVar, java.util.List list, int i) {
        return this.a.d(cszVar, defpackage.ud.h(cszVar), i);
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        return this.a.e(cubVar, defpackage.ud.h(cubVar), j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cug) && defpackage.afga.f(this.a, ((defpackage.cug) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
