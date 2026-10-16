package defpackage;

/* loaded from: classes2.dex */
public final class akfp extends akcl {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final akcl f;
    private final transient akfo[] g;

    static {
        Integer integer;
        int i;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = sk.AUDIO_CONTENT_BUFFER_SIZE;
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

    public akfp(akcl akclVar) {
        super(akclVar.c);
        this.g = new akfo[e + 1];
        this.f = akclVar;
    }

    private final akfo n(long j) {
        int i = (int) (j >> 32);
        int i2 = e & i;
        akfo[] akfoVarArr = this.g;
        akfo akfoVar = akfoVarArr[i2];
        if (akfoVar != null && ((int) (akfoVar.a >> 32)) == i) {
            return akfoVar;
        }
        long j2 = j & (-4294967296L);
        akcl akclVar = this.f;
        akfo akfoVar2 = new akfo(akclVar, j2);
        long j3 = j2;
        akfo akfoVar3 = akfoVar2;
        while (true) {
            long jE = akclVar.e(j3);
            if (jE == j3 || jE > (4294967295L | j2)) {
                break;
            }
            akfo akfoVar4 = new akfo(akclVar, jE);
            akfoVar3.c = akfoVar4;
            akfoVar3 = akfoVar4;
            j3 = jE;
        }
        akfoVarArr[i2] = akfoVar2;
        return akfoVar2;
    }

    @Override // defpackage.akcl
    public final int a(long j) {
        return n(j).a(j);
    }

    @Override // defpackage.akcl
    public final int c(long j) {
        return n(j).b(j);
    }

    @Override // defpackage.akcl
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.akcl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akfp) {
            return this.f.equals(((akfp) obj).f);
        }
        return false;
    }

    @Override // defpackage.akcl
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.akcl
    public final String g(long j) {
        return n(j).c(j);
    }

    @Override // defpackage.akcl
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.akcl
    public final boolean k() {
        return false;
    }
}
