package androidx.compose.foundation.lazy.layout;

import h.g.a;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m2977boximpl(Object obj) {
        return new StableValue(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2979equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && x.n(obj, ((StableValue) obj2).m2983unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2980equalsimpl0(Object obj, Object obj2) {
        return x.n(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2981hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2982toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m2979equalsimpl(this.value, obj);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2981hashCodeimpl(this.value);
    }

    public String toString() {
        return m2982toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m2983unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m2978constructorimpl(T t) {
        return t;
    }
}
