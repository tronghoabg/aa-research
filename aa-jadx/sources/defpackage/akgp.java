package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgp extends defpackage.akdl {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final defpackage.akdl f;
    private final transient defpackage.akgo[] g;

    static {
        java.lang.Integer integer;
        int i;
        try {
            integer = java.lang.Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (java.lang.SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE;
        } else {
            int iIntValue = integer.intValue() - 1;
            int i2 = 0;
            while (iIntValue > 0) {
                iIntValue >>= 1;
                i2++;
            }
            i = 1 << i2;
        }
        e = i - 1;
    }

    public akgp(defpackage.akdl akdlVar) {
        super(akdlVar.c);
        this.g = new defpackage.akgo[e + 1];
        this.f = akdlVar;
    }

    private final defpackage.akgo n(long j) {
        int i = (int) (j >> 32);
        int i2 = e & i;
        defpackage.akgo[] akgoVarArr = this.g;
        defpackage.akgo akgoVar = akgoVarArr[i2];
        if (akgoVar != null && ((int) (akgoVar.a >> 32)) == i) {
            return akgoVar;
        }
        long j2 = j & (-4294967296L);
        defpackage.akdl akdlVar = this.f;
        defpackage.akgo akgoVar2 = new defpackage.akgo(akdlVar, j2);
        long j3 = j2;
        defpackage.akgo akgoVar3 = akgoVar2;
        while (true) {
            long jE = akdlVar.e(j3);
            if (jE == j3 || jE > (4294967295L | j2)) {
                break;
            }
            defpackage.akgo akgoVar4 = new defpackage.akgo(akdlVar, jE);
            akgoVar3.c = akgoVar4;
            akgoVar3 = akgoVar4;
            j3 = jE;
        }
        akgoVarArr[i2] = akgoVar2;
        return akgoVar2;
    }

    @Override // defpackage.akdl
    public final int a(long j) {
        return n(j).a(j);
    }

    @Override // defpackage.akdl
    public final int c(long j) {
        return n(j).b(j);
    }

    @Override // defpackage.akdl
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.akdl
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akgp) {
            return this.f.equals(((defpackage.akgp) obj).f);
        }
        return false;
    }

    @Override // defpackage.akdl
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.akdl
    public final java.lang.String g(long j) {
        return n(j).c(j);
    }

    @Override // defpackage.akdl
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.akdl
    public final boolean k() {
        return false;
    }
}
