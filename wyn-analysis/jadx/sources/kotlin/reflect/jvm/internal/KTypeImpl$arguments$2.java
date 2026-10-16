package kotlin.reflect.jvm.internal;

import E5.Q;
import Fe.c;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import ff.p;
import ff.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import r7.AbstractC3935e;
import tf.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KTypeImpl$arguments$2 extends AbstractC3343n implements a {
    final /* synthetic */ a $computeJavaType;
    final /* synthetic */ KTypeImpl this$0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, a aVar) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$computeJavaType = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Type> invoke$lambda$0(InterfaceC2525i interfaceC2525i) {
        return (List) interfaceC2525i.getValue();
    }

    @Override // tf.a
    public final List<KTypeProjection> invoke() {
        KTypeProjection kTypeProjectionInvariant;
        List<TypeProjection> arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return v.f35432a;
        }
        InterfaceC2525i interfaceC2525iY = c.y(EnumC2526j.f34668b, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this.this$0));
        List<TypeProjection> list = arguments;
        a aVar = this.$computeJavaType;
        KTypeImpl kTypeImpl = this.this$0;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        int i5 = 0;
        for (Object obj : list) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                AbstractC3935e.P();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                kTypeProjectionInvariant = KTypeProjection.INSTANCE.getSTAR();
            } else {
                KotlinType type = typeProjection.getType();
                AbstractC3340k.d(type, "getType(...)");
                KTypeImpl kTypeImpl2 = new KTypeImpl(type, aVar != null ? new KTypeImpl$arguments$2$1$type$1(kTypeImpl, i5, interfaceC2525iY) : null);
                int i11 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i11 == 1) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.invariant(kTypeImpl2);
                } else if (i11 == 2) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.contravariant(kTypeImpl2);
                } else {
                    if (i11 != 3) {
                        throw new Q((byte) 0, 9);
                    }
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.covariant(kTypeImpl2);
                }
            }
            arrayList.add(kTypeProjectionInvariant);
            i5 = i10;
        }
        return arrayList;
    }
}
