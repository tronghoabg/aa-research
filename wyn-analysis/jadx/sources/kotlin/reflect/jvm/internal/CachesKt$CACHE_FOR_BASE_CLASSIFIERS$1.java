package kotlin.reflect.jvm.internal;

import ff.v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/KType;", "it", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1 extends AbstractC3343n implements l {
    public static final CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1 INSTANCE = new CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1();

    public CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final KType invoke(@NotNull Class<?> it) {
        AbstractC3340k.e(it, "it");
        KClassImpl orCreateKotlinClass = CachesKt.getOrCreateKotlinClass(it);
        v vVar = v.f35432a;
        return KClassifiers.createType(orCreateKotlinClass, vVar, false, vVar);
    }
}
