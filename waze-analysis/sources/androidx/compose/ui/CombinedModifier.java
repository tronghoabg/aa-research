package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    private final Modifier inner;
    private final Modifier outer;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.CombinedModifier$toString$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<String, Modifier.Element, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // h.g.a.p
        public final String invoke(String str, Modifier.Element element) {
            if (str.length() == 0) {
                return element.toString();
            }
            return str + ", " + element;
        }
    }

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(l<? super Modifier.Element, Boolean> lVar) {
        return this.outer.all(lVar) && this.inner.all(lVar);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(l<? super Modifier.Element, Boolean> lVar) {
        return this.outer.any(lVar) || this.inner.any(lVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return x.n(this.outer, combinedModifier.outer) && x.n(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
        return (R) this.inner.foldIn(this.outer.foldIn(r, pVar), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
        return (R) this.outer.foldOut(this.inner.foldOut(r, pVar), pVar);
    }

    public final Modifier getInner$ui() {
        return this.inner;
    }

    public final Modifier getOuter$ui() {
        return this.outer;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return Modifier.CC.$default$then(this, modifier);
    }

    public String toString() {
        return "[" + ((String) foldIn("", AnonymousClass1.INSTANCE)) + ']';
    }
}
