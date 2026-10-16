package m3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3484b {

    /* renamed from: a, reason: collision with root package name */
    public final String f40336a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40337b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40338c;

    /* renamed from: d, reason: collision with root package name */
    public final List f40339d;

    /* renamed from: e, reason: collision with root package name */
    public final List f40340e;

    public C3484b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        AbstractC3340k.e(columnNames, "columnNames");
        AbstractC3340k.e(referenceColumnNames, "referenceColumnNames");
        this.f40336a = str;
        this.f40337b = str2;
        this.f40338c = str3;
        this.f40339d = columnNames;
        this.f40340e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3484b)) {
            return false;
        }
        C3484b c3484b = (C3484b) obj;
        if (AbstractC3340k.a(this.f40336a, c3484b.f40336a) && AbstractC3340k.a(this.f40337b, c3484b.f40337b) && AbstractC3340k.a(this.f40338c, c3484b.f40338c) && AbstractC3340k.a(this.f40339d, c3484b.f40339d)) {
            return AbstractC3340k.a(this.f40340e, c3484b.f40340e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40340e.hashCode() + ((this.f40339d.hashCode() + N0.a.c(N0.a.c(this.f40336a.hashCode() * 31, 31, this.f40337b), 31, this.f40338c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f40336a + "', onDelete='" + this.f40337b + " +', onUpdate='" + this.f40338c + "', columnNames=" + this.f40339d + ", referenceColumnNames=" + this.f40340e + '}';
    }
}
