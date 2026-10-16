package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyWrappedType extends WrappedType {

    @NotNull
    private final a computation;

    @NotNull
    private final NotNullLazyValue<KotlinType> lazyValue;

    @NotNull
    private final StorageManager storageManager;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$refine$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ KotlinTypeRefiner $kotlinTypeRefiner;
        final /* synthetic */ LazyWrappedType this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
            super(0);
            this.$kotlinTypeRefiner = kotlinTypeRefiner;
            this.this$0 = lazyWrappedType;
        }

        @Override // tf.a
        @NotNull
        public final KotlinType invoke() {
            return this.$kotlinTypeRefiner.refineType((KotlinTypeMarker) this.this$0.computation.invoke());
        }
    }

    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull a computation) {
        AbstractC3340k.e(storageManager, "storageManager");
        AbstractC3340k.e(computation, "computation");
        this.storageManager = storageManager;
        this.computation = computation;
        this.lazyValue = storageManager.createLazyValue(computation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    public KotlinType getDelegate() {
        return (KotlinType) this.lazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public LazyWrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC3340k.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.storageManager, new AnonymousClass1(kotlinTypeRefiner, this));
    }
}
