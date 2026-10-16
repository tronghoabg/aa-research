package androidx.compose.foundation.text;

import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final l<KeyboardActionScope, ab> onDone;
    private final l<KeyboardActionScope, ab> onGo;
    private final l<KeyboardActionScope, ab> onNext;
    private final l<KeyboardActionScope, ab> onPrevious;
    private final l<KeyboardActionScope, ab> onSearch;
    private final l<KeyboardActionScope, ab> onSend;

    public /* synthetic */ KeyboardActions(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : lVar, (i2 & 2) != 0 ? null : lVar2, (i2 & 4) != 0 ? null : lVar3, (i2 & 8) != 0 ? null : lVar4, (i2 & 16) != 0 ? null : lVar5, (i2 & 32) != 0 ? null : lVar6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.onDone == keyboardActions.onDone && this.onGo == keyboardActions.onGo && this.onNext == keyboardActions.onNext && this.onPrevious == keyboardActions.onPrevious && this.onSearch == keyboardActions.onSearch && this.onSend == keyboardActions.onSend;
    }

    public final l<KeyboardActionScope, ab> getOnDone() {
        return this.onDone;
    }

    public final l<KeyboardActionScope, ab> getOnGo() {
        return this.onGo;
    }

    public final l<KeyboardActionScope, ab> getOnNext() {
        return this.onNext;
    }

    public final l<KeyboardActionScope, ab> getOnPrevious() {
        return this.onPrevious;
    }

    public final l<KeyboardActionScope, ab> getOnSearch() {
        return this.onSearch;
    }

    public final l<KeyboardActionScope, ab> getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        l<KeyboardActionScope, ab> lVar = this.onDone;
        int iHashCode = lVar != null ? lVar.hashCode() : 0;
        l<KeyboardActionScope, ab> lVar2 = this.onGo;
        int iHashCode2 = lVar2 != null ? lVar2.hashCode() : 0;
        int i2 = iHashCode * 31;
        l<KeyboardActionScope, ab> lVar3 = this.onNext;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<KeyboardActionScope, ab> lVar4 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        l<KeyboardActionScope, ab> lVar5 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        l<KeyboardActionScope, ab> lVar6 = this.onSend;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(l<? super KeyboardActionScope, ab> lVar, l<? super KeyboardActionScope, ab> lVar2, l<? super KeyboardActionScope, ab> lVar3, l<? super KeyboardActionScope, ab> lVar4, l<? super KeyboardActionScope, ab> lVar5, l<? super KeyboardActionScope, ab> lVar6) {
        this.onDone = lVar;
        this.onGo = lVar2;
        this.onNext = lVar3;
        this.onPrevious = lVar4;
        this.onSearch = lVar5;
        this.onSend = lVar6;
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }
}
