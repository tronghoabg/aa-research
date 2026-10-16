package androidx.compose.foundation.layout;

import h.f;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LazyImpl implements f<Integer> {
    public static final Companion Companion = new Companion(null);
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value = -1;
    private final String errorMessage;
    private final h.g.a.a<Integer> initializer;

    public LazyImpl(h.g.a.a<Integer> aVar, String str) {
        this.initializer = aVar;
        this.errorMessage = str;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final h.g.a.a<Integer> getInitializer() {
        return this.initializer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.f
    public Integer getValue() {
        int iIntValue = this._value;
        if (iIntValue == -1) {
            iIntValue = this.initializer.invoke().intValue();
            this._value = iIntValue;
        }
        if (iIntValue != -1) {
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(this.errorMessage);
    }

    @Override // h.f
    public boolean isInitialized() {
        return this._value != -1;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : this.errorMessage;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
