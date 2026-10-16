package androidx.navigation.internal;

import androidx.collection.SparseArrayCompat;
import androidx.navigation.NavDestination;
import h.g.b.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavGraphImpl$iterator$1 implements Iterator<NavDestination>, a {
    private int index = -1;
    final /* synthetic */ NavGraphImpl this$0;
    private boolean wentToNext;

    NavGraphImpl$iterator$1(NavGraphImpl navGraphImpl) {
        this.this$0 = navGraphImpl;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index + 1 < this.this$0.getNodes$navigation_common().size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public NavDestination next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.wentToNext = true;
        SparseArrayCompat<NavDestination> nodes$navigation_common = this.this$0.getNodes$navigation_common();
        int i2 = this.index + 1;
        this.index = i2;
        return nodes$navigation_common.valueAt(i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.wentToNext) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        SparseArrayCompat<NavDestination> nodes$navigation_common = this.this$0.getNodes$navigation_common();
        nodes$navigation_common.valueAt(this.index).setParent(null);
        nodes$navigation_common.removeAt(this.index);
        this.index--;
        this.wentToNext = false;
    }
}
