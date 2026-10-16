package androidx.compose.ui.semantics;

import h.g.a.p;
import h.g.b.o;
import h.g.b.y;
import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private String accessibilityExtraKey;
    private boolean isImportantForAccessibility;
    private final p<T, T, T> mergePolicy;
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends y implements p<T, T, T> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // h.g.a.p
        public final T invoke(T t, T t2) {
            return t == null ? t2 : t;
        }
    }

    public /* synthetic */ SemanticsPropertyKey(String str, AnonymousClass1 anonymousClass1, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final String getAccessibilityExtraKey$ui() {
        return this.accessibilityExtraKey;
    }

    public final p<T, T, T> getMergePolicy$ui() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, r<?> rVar) {
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui() {
        return this.isImportantForAccessibility;
    }

    public final T merge(T t, T t2) {
        return this.mergePolicy.invoke(t, t2);
    }

    public final void setAccessibilityExtraKey$ui(String str) {
        this.accessibilityExtraKey = str;
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, r<?> rVar, T t) {
        semanticsPropertyReceiver.set(this, t);
    }

    public String toString() {
        return "AccessibilityKey: ".concat(String.valueOf(this.name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, p<? super T, ? super T, ? extends T> pVar) {
        this.name = str;
        this.mergePolicy = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z) {
        this(str, (p) null, 2, (o) (0 == true ? 1 : 0));
        this.isImportantForAccessibility = z;
    }

    public SemanticsPropertyKey(String str, boolean z, p<? super T, ? super T, ? extends T> pVar, String str2) {
        this(str, pVar);
        this.isImportantForAccessibility = z;
        this.accessibilityExtraKey = str2;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, boolean z, p pVar, String str2, int i2, o oVar) {
        this(str, z, pVar, (i2 & 8) != 0 ? null : str2);
    }
}
