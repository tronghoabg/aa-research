package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractSignatureParts$toIndexed$1$1 extends AbstractC3343n implements l {
    final /* synthetic */ TypeSystemContext $this_with;
    final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$toIndexed$1$1(AbstractSignatureParts<TAnnotation> abstractSignatureParts, TypeSystemContext typeSystemContext) {
        super(1);
        this.this$0 = abstractSignatureParts;
        this.$this_with = typeSystemContext;
    }

    @Override // tf.l
    @Nullable
    public final Iterable<AbstractSignatureParts.TypeAndDefaultQualifiers> invoke(@NotNull AbstractSignatureParts.TypeAndDefaultQualifiers it) {
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        List<TypeParameterMarker> parameters;
        AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers;
        KotlinTypeMarker type2;
        AbstractC3340k.e(it, "it");
        if ((this.this$0.getSkipRawTypeArguments() && (type2 = it.getType()) != null && this.$this_with.isRawType(type2)) || (type = it.getType()) == null || (typeConstructorMarkerTypeConstructor = this.$this_with.typeConstructor(type)) == null || (parameters = this.$this_with.getParameters(typeConstructorMarkerTypeConstructor)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = parameters;
        List<TypeArgumentMarker> arguments = this.$this_with.getArguments(it.getType());
        TypeSystemContext typeSystemContext = this.$this_with;
        AbstractSignatureParts<TAnnotation> abstractSignatureParts = this.this$0;
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(p.a0(list, 10), p.a0(arguments, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it3.next();
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
            if (typeSystemContext.isStarProjection(typeArgumentMarker)) {
                typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(null, it.getDefaultQualifiers(), typeParameterMarker);
            } else {
                KotlinTypeMarker type3 = typeSystemContext.getType(typeArgumentMarker);
                typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(type3, abstractSignatureParts.extractAndMergeDefaultQualifiers(type3, it.getDefaultQualifiers()), typeParameterMarker);
            }
            arrayList.add(typeAndDefaultQualifiers);
        }
        return arrayList;
    }
}
