package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes3.dex */
final class ahpm implements Iterator {
    private final Stack<ahpp> breadCrumbs;
    private ahpe next;

    private ahpm(ahoa ahoaVar) {
        this.breadCrumbs = new Stack<>();
        this.next = getLeafByLeft(ahoaVar);
    }

    private ahpe getLeafByLeft(ahoa ahoaVar) {
        while (ahoaVar instanceof ahpp) {
            ahpp ahppVar = (ahpp) ahoaVar;
            this.breadCrumbs.push(ahppVar);
            ahoaVar = ahppVar.left;
        }
        return (ahpe) ahoaVar;
    }

    private ahpe getNextNonEmptyLeaf() {
        while (!this.breadCrumbs.isEmpty()) {
            ahpe leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            if (!leafByLeft.isEmpty()) {
                return leafByLeft;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public ahpe next() {
        ahpe ahpeVar = this.next;
        if (ahpeVar == null) {
            throw new NoSuchElementException();
        }
        this.next = getNextNonEmptyLeaf();
        return ahpeVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
