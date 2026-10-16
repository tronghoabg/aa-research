package androidx.media3.common;

import android.util.SparseBooleanArray;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FlagSet {
    private final SparseBooleanArray flags;

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public boolean contains(int i2) {
        return this.flags.get(i2);
    }

    public boolean containsAny(FlagSet flagSet) {
        for (int i2 = 0; i2 < flagSet.size(); i2++) {
            if (contains(flagSet.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagSet) {
            return this.flags.equals(((FlagSet) obj).flags);
        }
        return false;
    }

    public int get(int i2) {
        an.A(i2, size());
        return this.flags.keyAt(i2);
    }

    public int hashCode() {
        return this.flags.hashCode();
    }

    public int size() {
        return this.flags.size();
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags = new SparseBooleanArray();

        public Builder add(int i2) {
            an.u(!this.buildCalled);
            this.flags.append(i2, true);
            return this;
        }

        public Builder addAll(FlagSet flagSet) {
            for (int i2 = 0; i2 < flagSet.size(); i2++) {
                add(flagSet.get(i2));
            }
            return this;
        }

        public Builder addIf(int i2, boolean z) {
            if (z) {
                add(i2);
            }
            return this;
        }

        public FlagSet build() {
            an.u(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet(this.flags);
        }

        public Builder remove(int i2) {
            an.u(!this.buildCalled);
            this.flags.delete(i2);
            return this;
        }

        public Builder removeAll(int... iArr) {
            for (int i2 : iArr) {
                remove(i2);
            }
            return this;
        }

        public Builder removeIf(int i2, boolean z) {
            if (z) {
                remove(i2);
            }
            return this;
        }

        public Builder addAll(int... iArr) {
            for (int i2 : iArr) {
                add(i2);
            }
            return this;
        }
    }

    public boolean containsAny(int... iArr) {
        for (int i2 : iArr) {
            if (contains(i2)) {
                return true;
            }
        }
        return false;
    }
}
