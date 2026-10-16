package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Af.f;
import Af.k;
import Af.n;
import ff.m;
import ff.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class CompositeAnnotations implements Annotations {

    @NotNull
    private final List<Annotations> delegates;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$findAnnotation$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ FqName $fqName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FqName fqName) {
            super(1);
            this.$fqName = fqName;
        }

        @Override // tf.l
        @Nullable
        public final AnnotationDescriptor invoke(@NotNull Annotations it) {
            AbstractC3340k.e(it, "it");
            return it.mo413findAnnotation(this.$fqName);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$iterator$1, reason: invalid class name and case insensitive filesystem */
    public static final class C33481 extends AbstractC3343n implements l {
        public static final C33481 INSTANCE = new C33481();

        public C33481() {
            super(1);
        }

        @Override // tf.l
        @NotNull
        public final k invoke(@NotNull Annotations it) {
            AbstractC3340k.e(it, "it");
            return o.j0(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@NotNull List<? extends Annotations> delegates) {
        AbstractC3340k.e(delegates, "delegates");
        this.delegates = delegates;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* renamed from: findAnnotation */
    public AnnotationDescriptor mo413findAnnotation(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        return (AnnotationDescriptor) n.X(n.d0(o.j0(this.delegates), new AnonymousClass1(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        Iterator it = ((Iterable) o.j0(this.delegates).f1317b).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.delegates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return new f(n.Y(o.j0(this.delegates), C33481.INSTANCE));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@NotNull Annotations... delegates) {
        this((List<? extends Annotations>) m.L0(delegates));
        AbstractC3340k.e(delegates, "delegates");
    }
}
