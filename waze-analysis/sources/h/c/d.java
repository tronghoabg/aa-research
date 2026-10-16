package h.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.reports.az;
import h.ab;
import h.g.a.p;
import h.g.b.ao;
import h.g.b.x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements Serializable, j {

    /* renamed from: a, reason: collision with root package name */
    private final j f48056a;

    /* renamed from: b, reason: collision with root package name */
    private final h f48057b;

    public d(j jVar, h hVar) {
        x.f(jVar, TtmlNode.LEFT);
        x.f(hVar, "element");
        this.f48056a = jVar;
        this.f48057b = hVar;
    }

    private final int a() {
        int i2 = 2;
        while (true) {
            j jVar = this.f48056a;
            this = jVar instanceof d ? (d) jVar : null;
            if (this == null) {
                return i2;
            }
            i2++;
        }
    }

    private final boolean b(h hVar) {
        return x.n(get(hVar.getKey()), hVar);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iA = a();
        j[] jVarArr = new j[iA];
        ao aoVar = new ao();
        fold(ab.f48028a, new az(jVarArr, aoVar, 1));
        if (aoVar.f48103a == iA) {
            return new c(jVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.a() == a()) {
                while (true) {
                    if (!dVar.b(this.f48057b)) {
                        break;
                    }
                    j jVar = this.f48056a;
                    if (jVar instanceof d) {
                        this = (d) jVar;
                    } else {
                        x.d(jVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        if (dVar.b((h) jVar)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // h.c.j
    public final <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        x.f(pVar, "operation");
        return pVar.invoke((Object) this.f48056a.fold(r, pVar), this.f48057b);
    }

    @Override // h.c.j
    public final <E extends h> E get(i<E> iVar) {
        x.f(iVar, "key");
        while (true) {
            E e2 = (E) this.f48057b.get(iVar);
            if (e2 != null) {
                return e2;
            }
            j jVar = this.f48056a;
            if (!(jVar instanceof d)) {
                return (E) jVar.get(iVar);
            }
            this = (d) jVar;
        }
    }

    public final int hashCode() {
        return this.f48056a.hashCode() + this.f48057b.hashCode();
    }

    @Override // h.c.j
    public final j minusKey(i<?> iVar) {
        x.f(iVar, "key");
        h hVar = this.f48057b;
        h hVar2 = hVar.get(iVar);
        j jVar = this.f48056a;
        if (hVar2 != null) {
            return jVar;
        }
        j jVarMinusKey = jVar.minusKey(iVar);
        return jVarMinusKey == jVar ? this : jVarMinusKey == k.f48060a ? hVar : new d(jVarMinusKey, hVar);
    }

    @Override // h.c.j
    public final /* bridge */ j plus(j jVar) {
        return h.b.a.i(this, jVar);
    }

    public final String toString() {
        return "[" + fold("", new com.waze.cf.j(3)) + "]";
    }
}
