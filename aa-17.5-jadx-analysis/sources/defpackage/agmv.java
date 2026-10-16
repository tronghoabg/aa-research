package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agmv extends agnp {
    private final List<agnp> elements;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public agmv(List<? extends agnp> list) {
        super(null);
        list.getClass();
        this.elements = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agmv) && affa.f(this.elements, ((agmv) obj).elements);
    }

    public final List<agnp> getElements() {
        return this.elements;
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    @Override // defpackage.agnp
    public String toString() {
        return "ArrayValue(" + this.elements + ')';
    }
}
