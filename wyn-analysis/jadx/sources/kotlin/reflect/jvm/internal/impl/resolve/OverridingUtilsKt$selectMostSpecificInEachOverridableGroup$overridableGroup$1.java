package kotlin.reflect.jvm.internal.impl.resolve;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import tf.l;

/* loaded from: classes5.dex */
public final class OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 extends AbstractC3343n implements l {
    final /* synthetic */ SmartSet<H> $conflictedHandles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(SmartSet<H> smartSet) {
        super(1);
        this.$conflictedHandles = smartSet;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m418invoke((OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1) obj);
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m418invoke(H h10) {
        SmartSet<H> smartSet = this.$conflictedHandles;
        AbstractC3340k.b(h10);
        smartSet.add(h10);
    }
}
