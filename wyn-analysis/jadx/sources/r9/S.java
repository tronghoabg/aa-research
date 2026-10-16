package r9;

import com.google.protobuf.ByteString;
import j$.util.Objects;
import p9.C3776A;
import v9.C4333A;

/* loaded from: classes4.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final C3776A f44596a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44597b;

    /* renamed from: c, reason: collision with root package name */
    public final long f44598c;

    /* renamed from: d, reason: collision with root package name */
    public final y f44599d;

    /* renamed from: e, reason: collision with root package name */
    public final s9.o f44600e;

    /* renamed from: f, reason: collision with root package name */
    public final s9.o f44601f;

    /* renamed from: g, reason: collision with root package name */
    public final ByteString f44602g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f44603h;

    public S(C3776A c3776a, int i5, long j8, y yVar, s9.o oVar, s9.o oVar2, ByteString byteString, Integer num) {
        c3776a.getClass();
        this.f44596a = c3776a;
        this.f44597b = i5;
        this.f44598c = j8;
        this.f44601f = oVar2;
        this.f44599d = yVar;
        oVar.getClass();
        this.f44600e = oVar;
        byteString.getClass();
        this.f44602g = byteString;
        this.f44603h = num;
    }

    public final S a(ByteString byteString, s9.o oVar) {
        return new S(this.f44596a, this.f44597b, this.f44598c, this.f44599d, oVar, this.f44601f, byteString, null);
    }

    public final S b(long j8) {
        return new S(this.f44596a, this.f44597b, j8, this.f44599d, this.f44600e, this.f44601f, this.f44602g, this.f44603h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            S s10 = (S) obj;
            if (this.f44596a.equals(s10.f44596a) && this.f44597b == s10.f44597b && this.f44598c == s10.f44598c && this.f44599d.equals(s10.f44599d) && this.f44600e.equals(s10.f44600e) && this.f44601f.equals(s10.f44601f) && this.f44602g.equals(s10.f44602g) && Objects.equals(this.f44603h, s10.f44603h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44603h) + ((this.f44602g.hashCode() + ((this.f44601f.f45390a.hashCode() + ((this.f44600e.f45390a.hashCode() + ((this.f44599d.hashCode() + (((((this.f44596a.hashCode() * 31) + this.f44597b) * 31) + ((int) this.f44598c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetData{target=" + this.f44596a + ", targetId=" + this.f44597b + ", sequenceNumber=" + this.f44598c + ", purpose=" + this.f44599d + ", snapshotVersion=" + this.f44600e + ", lastLimboFreeSnapshotVersion=" + this.f44601f + ", resumeToken=" + this.f44602g + ", expectedCount=" + this.f44603h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S(C3776A c3776a, int i5, long j8, y yVar) {
        s9.o oVar = s9.o.f45389b;
        this(c3776a, i5, j8, yVar, oVar, oVar, C4333A.f47035s, null);
    }
}
