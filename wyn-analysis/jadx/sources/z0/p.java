package z0;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import e0.C2465q;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f48336c = new p(0, 0, null, null, 0, null, 0, 262143);

    /* renamed from: a, reason: collision with root package name */
    public final j f48337a;

    /* renamed from: b, reason: collision with root package name */
    public final h f48338b;

    public p(j spanStyle, h hVar, int i5) {
        AbstractC3340k.e(spanStyle, "spanStyle");
        this.f48337a = spanStyle;
        this.f48338b = hVar;
    }

    public final p a(p pVar) {
        return (pVar == null || pVar.equals(f48336c)) ? this : new p(this.f48337a.b(pVar.f48337a), this.f48338b.a(pVar.f48338b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC3340k.a(this.f48337a, pVar.f48337a) && AbstractC3340k.a(this.f48338b, pVar.f48338b);
    }

    public final int hashCode() {
        return (this.f48338b.hashCode() + (this.f48337a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        j jVar = this.f48337a;
        sb2.append((Object) C2465q.h(jVar.f48300a.a()));
        sb2.append(", brush=null, fontSize=");
        jVar.f48300a.getClass();
        sb2.append((Object) L0.j.e(jVar.f48301b));
        sb2.append(", fontWeight=");
        sb2.append(jVar.f48302c);
        sb2.append(", fontStyle=");
        sb2.append(jVar.f48303d);
        sb2.append(", fontSynthesis=");
        sb2.append(jVar.f48304e);
        sb2.append(", fontFamily=");
        sb2.append(jVar.f48305f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(jVar.f48306g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) L0.j.e(jVar.f48307h));
        sb2.append(", baselineShift=");
        sb2.append(jVar.f48308i);
        sb2.append(", textGeometricTransform=");
        sb2.append(jVar.f48309j);
        sb2.append(", localeList=");
        sb2.append(jVar.k);
        sb2.append(", background=");
        sb2.append((Object) C2465q.h(jVar.f48310l));
        sb2.append(", textDecoration=");
        sb2.append(jVar.f48311m);
        sb2.append(", shadow=");
        sb2.append(jVar.f48312n);
        sb2.append(", textAlign=");
        h hVar = this.f48338b;
        sb2.append(hVar.f48294a);
        sb2.append(", textDirection=");
        sb2.append(hVar.f48295b);
        sb2.append(", lineHeight=");
        sb2.append((Object) L0.j.e(hVar.f48296c));
        sb2.append(", textIndent=");
        sb2.append(hVar.f48297d);
        sb2.append(", platformStyle=nulllineHeightStyle=");
        sb2.append((Object) null);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(j spanStyle, h hVar) {
        this(spanStyle, hVar, 0);
        AbstractC3340k.e(spanStyle, "spanStyle");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(long j8, long j10, E0.l lVar, E0.o oVar, long j11, K0.c cVar, long j12, int i5) {
        long j13 = (i5 & 1) != 0 ? C2465q.f34380i : j8;
        long j14 = (i5 & 2) != 0 ? L0.j.f6810c : j10;
        E0.l lVar2 = (i5 & 4) != 0 ? null : lVar;
        E0.o oVar2 = (i5 & 32) != 0 ? null : oVar;
        long j15 = (i5 & 128) != 0 ? L0.j.f6810c : j11;
        long j16 = C2465q.f34380i;
        this(new j(j13 != j16 ? new K0.b(j13) : K0.f.f6318a, j14, lVar2, null, null, oVar2, null, j15, null, null, null, j16, null, null), new h((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? cVar : null, null, (i5 & 65536) != 0 ? L0.j.f6810c : j12, null, null), 0);
    }
}
