package kotlin.reflect.jvm.internal.impl.types;

import ef.C2515C;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;
import tf.a;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4 extends AbstractC3343n implements l {
    final /* synthetic */ TypeCheckerState $state;
    final /* synthetic */ SimpleTypeMarker $superType;
    final /* synthetic */ List<SimpleTypeMarker> $supertypesWithSameConstructor;
    final /* synthetic */ TypeSystemContext $this_with;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ TypeCheckerState $state;
        final /* synthetic */ SimpleTypeMarker $subTypeArguments;
        final /* synthetic */ SimpleTypeMarker $superType;
        final /* synthetic */ TypeSystemContext $this_with;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            super(0);
            this.$state = typeCheckerState;
            this.$this_with = typeSystemContext;
            this.$subTypeArguments = simpleTypeMarker;
            this.$superType = simpleTypeMarker2;
        }

        @Override // tf.a
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(this.$state, this.$this_with.asArgumentList(this.$subTypeArguments), this.$superType));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4(List<? extends SimpleTypeMarker> list, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        super(1);
        this.$supertypesWithSameConstructor = list;
        this.$state = typeCheckerState;
        this.$this_with = typeSystemContext;
        this.$superType = simpleTypeMarker;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TypeCheckerState.ForkPointContext) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull TypeCheckerState.ForkPointContext runForkingPoint) {
        AbstractC3340k.e(runForkingPoint, "$this$runForkingPoint");
        Iterator<SimpleTypeMarker> it = this.$supertypesWithSameConstructor.iterator();
        while (it.hasNext()) {
            runForkingPoint.fork(new AnonymousClass1(this.$state, this.$this_with, it.next(), this.$superType));
        }
    }
}
