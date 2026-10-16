package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ef.C2527k;
import ff.AbstractC2640A;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyJavaPackageFragment$binaryClasses$2 extends AbstractC3343n implements a {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    @Override // tf.a
    @NotNull
    public final Map<String, KotlinJvmBinaryClass> invoke() {
        PackagePartProvider packagePartProvider = this.this$0.f39764c.getComponents().getPackagePartProvider();
        String strAsString = this.this$0.getFqName().asString();
        AbstractC3340k.d(strAsString, "asString(...)");
        List<String> listFindPackageParts = packagePartProvider.findPackageParts(strAsString);
        LazyJavaPackageFragment lazyJavaPackageFragment = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (String str : listFindPackageParts) {
            ClassId classId = ClassId.topLevel(JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars());
            AbstractC3340k.d(classId, "topLevel(...)");
            KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.f39764c.getComponents().getKotlinClassFinder(), classId, lazyJavaPackageFragment.jvmMetadataVersion);
            C2527k c2527k = kotlinJvmBinaryClassFindKotlinClass != null ? new C2527k(str, kotlinJvmBinaryClassFindKotlinClass) : null;
            if (c2527k != null) {
                arrayList.add(c2527k);
            }
        }
        return AbstractC2640A.X(arrayList);
    }
}
