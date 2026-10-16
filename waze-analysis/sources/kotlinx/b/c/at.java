package kotlinx.b.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class at implements h.l.s {

    /* renamed from: a, reason: collision with root package name */
    private final h.l.s f50972a;

    public at(h.l.s sVar) {
        h.g.b.x.f(sVar, TtmlNode.ATTR_TTS_ORIGIN);
        this.f50972a = sVar;
    }

    @Override // h.l.s
    public final List a() {
        return this.f50972a.a();
    }

    @Override // h.l.s
    public final h.l.d b() {
        return this.f50972a.b();
    }

    @Override // h.l.s
    public final boolean c() {
        return this.f50972a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        h.l.s sVar = this.f50972a;
        at atVar = obj instanceof at ? (at) obj : null;
        if (!h.g.b.x.n(sVar, atVar != null ? atVar.f50972a : null)) {
            return false;
        }
        h.l.d dVarB = b();
        if (!(dVarB instanceof h.l.c)) {
            return false;
        }
        h.l.s sVar2 = obj instanceof h.l.s ? (h.l.s) obj : null;
        h.l.d dVarB2 = sVar2 != null ? sVar2.b() : null;
        if (dVarB2 == null || !(dVarB2 instanceof h.l.c)) {
            return false;
        }
        return h.g.b.x.n(h.g.b.o.w((h.l.c) dVarB), h.g.b.o.w((h.l.c) dVarB2));
    }

    @Override // h.l.a
    public final List<Annotation> getAnnotations() {
        throw null;
    }

    public final int hashCode() {
        return this.f50972a.hashCode();
    }

    public final String toString() {
        h.l.s sVar = this.f50972a;
        Objects.toString(sVar);
        return "KTypeWrapper: ".concat(String.valueOf(sVar));
    }
}
