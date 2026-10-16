package wf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: wf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4405a implements InterfaceC4407c {
    private Object value;

    public AbstractC4405a(Object obj) {
        this.value = obj;
    }

    public void afterChange(@NotNull KProperty<?> property, Object obj, Object obj2) {
        AbstractC3340k.e(property, "property");
    }

    public abstract boolean beforeChange(KProperty kProperty, Object obj, Object obj2);

    @Override // wf.InterfaceC4406b
    public Object getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        AbstractC3340k.e(property, "property");
        return this.value;
    }

    @Override // wf.InterfaceC4407c
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, Object obj2) {
        AbstractC3340k.e(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
