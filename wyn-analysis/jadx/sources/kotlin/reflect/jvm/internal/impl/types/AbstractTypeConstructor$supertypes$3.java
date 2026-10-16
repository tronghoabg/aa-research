package kotlin.reflect.jvm.internal.impl.types;

import ef.C2515C;
import ff.o;
import ff.v;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractTypeConstructor$supertypes$3 extends AbstractC3343n implements l {
    final /* synthetic */ AbstractTypeConstructor this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ AbstractTypeConstructor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractTypeConstructor abstractTypeConstructor) {
            super(1);
            this.this$0 = abstractTypeConstructor;
        }

        @Override // tf.l
        @NotNull
        public final Iterable<KotlinType> invoke(@NotNull TypeConstructor it) {
            AbstractC3340k.e(it, "it");
            return this.this$0.computeNeighbours(it, true);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements l {
        final /* synthetic */ AbstractTypeConstructor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AbstractTypeConstructor abstractTypeConstructor) {
            super(1);
            this.this$0 = abstractTypeConstructor;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((KotlinType) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull KotlinType it) {
            AbstractC3340k.e(it, "it");
            this.this$0.reportScopesLoopError(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractTypeConstructor.Supertypes) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull AbstractTypeConstructor.Supertypes supertypes) {
        AbstractC3340k.e(supertypes, "supertypes");
        List listFindLoopsInSupertypesAndDisconnect = this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, supertypes.getAllSupertypes(), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(this.this$0), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this.this$0));
        if (listFindLoopsInSupertypesAndDisconnect.isEmpty()) {
            KotlinType kotlinTypeDefaultSupertypeIfEmpty = this.this$0.defaultSupertypeIfEmpty();
            List listC = kotlinTypeDefaultSupertypeIfEmpty != null ? AbstractC3935e.C(kotlinTypeDefaultSupertypeIfEmpty) : null;
            if (listC == null) {
                listC = v.f35432a;
            }
            listFindLoopsInSupertypesAndDisconnect = listC;
        }
        if (this.this$0.getShouldReportCyclicScopeWithCompanionWarning()) {
            SupertypeLoopChecker supertypeLoopChecker = this.this$0.getSupertypeLoopChecker();
            AbstractTypeConstructor abstractTypeConstructor = this.this$0;
            supertypeLoopChecker.findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, listFindLoopsInSupertypesAndDisconnect, new AnonymousClass2(abstractTypeConstructor), new AnonymousClass3(this.this$0));
        }
        AbstractTypeConstructor abstractTypeConstructor2 = this.this$0;
        List<KotlinType> listS0 = listFindLoopsInSupertypesAndDisconnect instanceof List ? (List) listFindLoopsInSupertypesAndDisconnect : null;
        if (listS0 == null) {
            listS0 = o.S0(listFindLoopsInSupertypesAndDisconnect);
        }
        supertypes.setSupertypesWithoutCycles(abstractTypeConstructor2.processSupertypesWithoutCycles(listS0));
    }
}
