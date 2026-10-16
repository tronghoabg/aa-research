package kotlin.reflect.jvm.internal.impl.types.checker;

import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class NewCapturedTypeConstructor$refine$1$1 extends AbstractC3343n implements a {
    final /* synthetic */ KotlinTypeRefiner $kotlinTypeRefiner;
    final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$refine$1$1(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
        this.$kotlinTypeRefiner = kotlinTypeRefiner;
    }

    @Override // tf.a
    @NotNull
    public final List<UnwrappedType> invoke() {
        List<UnwrappedType> listMo420getSupertypes = this.this$0.mo420getSupertypes();
        KotlinTypeRefiner kotlinTypeRefiner = this.$kotlinTypeRefiner;
        ArrayList arrayList = new ArrayList(p.a0(listMo420getSupertypes, 10));
        Iterator<T> it = listMo420getSupertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnwrappedType) it.next()).refine(kotlinTypeRefiner));
        }
        return arrayList;
    }
}
