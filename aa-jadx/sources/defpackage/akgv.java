package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgv extends defpackage.akdl {
    private static final long serialVersionUID = -3513011772763289092L;
    private final java.lang.String e;
    private final int f;
    private final int g;

    public akgv(java.lang.String str, java.lang.String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.akdl
    public final int a(long j) {
        return this.f;
    }

    @Override // defpackage.akdl
    public final int b(long j) {
        return this.f;
    }

    @Override // defpackage.akdl
    public final int c(long j) {
        return this.g;
    }

    @Override // defpackage.akdl
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akgv) {
            defpackage.akgv akgvVar = (defpackage.akgv) obj;
            if (this.c.equals(akgvVar.c) && this.g == akgvVar.g && this.f == akgvVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akdl
    public final java.lang.String g(long j) {
        return this.e;
    }

    @Override // defpackage.akdl
    public final int hashCode() {
        return this.c.hashCode() + (this.g * 37) + (this.f * 31);
    }

    @Override // defpackage.akdl
    public final boolean k() {
        return true;
    }

    @Override // defpackage.akdl
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.akdl
    public final long f(long j) {
        return j;
    }
}
