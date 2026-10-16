package C8;

import cb.AbstractC1593a;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public long f1944a;

    /* renamed from: b, reason: collision with root package name */
    public long f1945b;

    public j(long j8, long j10) {
        this.f1944a = j8;
        this.f1945b = j10;
    }

    public void a(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC1593a.h(j8, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument"));
        }
        this.f1945b = j8;
    }

    public j(j jVar) {
        this.f1944a = jVar.f1944a;
        this.f1945b = jVar.f1945b;
    }

    public j(int i5) {
        switch (i5) {
            case 1:
                this.f1944a = 60L;
                this.f1945b = aa.h.f17435i;
                break;
            case 5:
                this.f1944a = -9223372036854775807L;
                this.f1945b = -9223372036854775807L;
                break;
            default:
                this.f1944a = 0L;
                this.f1945b = -1L;
                break;
        }
    }

    public j(long j8, long j10, int i5) {
        this.f1944a = j8;
        this.f1945b = j10;
    }
}
