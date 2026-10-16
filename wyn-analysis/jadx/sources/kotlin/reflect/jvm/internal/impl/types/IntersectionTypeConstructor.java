package kotlin.reflect.jvm.internal.impl.types;

import android.support.v4.media.session.b;
import ff.o;
import ff.p;
import ff.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    @Nullable
    private KotlinType alternative;
    private final int hashCode;

    @NotNull
    private final LinkedHashSet<KotlinType> intersectedTypes;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$createType$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        @Nullable
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            AbstractC3340k.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            return IntersectionTypeConstructor.this.refine(kotlinTypeRefiner).createType();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$1, reason: invalid class name and case insensitive filesystem */
    public static final class C33631 extends AbstractC3343n implements l {
        public static final C33631 INSTANCE = new C33631();

        public C33631() {
            super(1);
        }

        @Override // tf.l
        @NotNull
        public final String invoke(@NotNull KotlinType it) {
            AbstractC3340k.e(it, "it");
            return it.toString();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements l {
        final /* synthetic */ l $getProperTypeRelatedToStringify;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(l lVar) {
            super(1);
            this.$getProperTypeRelatedToStringify = lVar;
        }

        @Override // tf.l
        @NotNull
        public final CharSequence invoke(KotlinType kotlinType) {
            l lVar = this.$getProperTypeRelatedToStringify;
            AbstractC3340k.b(kotlinType);
            return lVar.invoke(kotlinType).toString();
        }
    }

    public IntersectionTypeConstructor(@NotNull Collection<? extends KotlinType> typesToIntersect) {
        AbstractC3340k.e(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.intersectedTypes = linkedHashSet;
        this.hashCode = linkedHashSet.hashCode();
    }

    public static /* synthetic */ String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = C33631.INSTANCE;
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(lVar);
    }

    @NotNull
    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.intersectedTypes);
    }

    @NotNull
    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, v.f35432a, false, createScopeForKotlinType(), new AnonymousClass1());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return AbstractC3340k.a(this.intersectedTypes, ((IntersectionTypeConstructor) obj).intersectedTypes);
        }
        return false;
    }

    @Nullable
    public final KotlinType getAlternativeType() {
        return this.alternative;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.intersectedTypes.iterator().next().getConstructor().getBuiltIns();
        AbstractC3340k.d(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo419getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return v.f35432a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: getSupertypes */
    public Collection<KotlinType> mo420getSupertypes() {
        return this.intersectedTypes;
    }

    public int hashCode() {
        return this.hashCode;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @NotNull
    public final String makeDebugNameForIntersectionType(@NotNull final l getProperTypeRelatedToStringify) {
        AbstractC3340k.e(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return o.w0(o.M0(new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                KotlinType kotlinType = (KotlinType) t10;
                l lVar = getProperTypeRelatedToStringify;
                AbstractC3340k.b(kotlinType);
                String string = lVar.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t11;
                l lVar2 = getProperTypeRelatedToStringify;
                AbstractC3340k.b(kotlinType2);
                return b.W(string, lVar2.invoke(kotlinType2).toString());
            }
        }, this.intersectedTypes), " & ", "{", "}", new AnonymousClass3(getProperTypeRelatedToStringify), 24);
    }

    @NotNull
    public final IntersectionTypeConstructor setAlternative(@Nullable KotlinType kotlinType) {
        return new IntersectionTypeConstructor(this.intersectedTypes, kotlinType);
    }

    @NotNull
    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public IntersectionTypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC3340k.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<KotlinType> collectionMo420getSupertypes = mo420getSupertypes();
        ArrayList arrayList = new ArrayList(p.a0(collectionMo420getSupertypes, 10));
        Iterator<T> it = collectionMo420getSupertypes.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).refine(kotlinTypeRefiner));
            z2 = true;
        }
        IntersectionTypeConstructor alternative = null;
        if (z2) {
            KotlinType alternativeType = getAlternativeType();
            alternative = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return alternative == null ? this : alternative;
    }

    private IntersectionTypeConstructor(Collection<? extends KotlinType> collection, KotlinType kotlinType) {
        this(collection);
        this.alternative = kotlinType;
    }
}
