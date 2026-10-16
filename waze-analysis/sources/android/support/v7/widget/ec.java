package android.support.v7.widget;

import android.database.Observable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ec extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ed) this.mObservers.get(size)).onChanged();
            }
        }
    }

    public final void b(int i2, int i3) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ed) this.mObservers.get(size)).onItemRangeMoved(i2, i3, 1);
            }
        }
    }

    public final void c(int i2, int i3) {
        d(i2, i3, null);
    }

    public final void d(int i2, int i3, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ed) this.mObservers.get(size)).onItemRangeChanged(i2, i3, obj);
            }
        }
    }

    public final void e(int i2, int i3) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ed) this.mObservers.get(size)).onItemRangeInserted(i2, i3);
            }
        }
    }

    public final void f(int i2, int i3) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ed) this.mObservers.get(size)).onItemRangeRemoved(i2, i3);
            }
        }
    }

    public final void g() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ed) this.mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public final boolean h() {
        return !this.mObservers.isEmpty();
    }
}
