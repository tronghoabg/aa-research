package kotlin.reflect.jvm.internal.impl.descriptors;

import ff.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class NotFoundClasses$classes$1 extends AbstractC3343n implements l {
    final /* synthetic */ NotFoundClasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    @Override // tf.l
    @NotNull
    public final ClassDescriptor invoke(@NotNull NotFoundClasses.ClassRequest classRequest) {
        DeclarationDescriptor declarationDescriptor;
        AbstractC3340k.e(classRequest, "<name for destructuring parameter 0>");
        ClassId classIdComponent1 = classRequest.component1();
        List<Integer> listComponent2 = classRequest.component2();
        if (classIdComponent1.isLocal()) {
            throw new UnsupportedOperationException("Unresolved local class: " + classIdComponent1);
        }
        ClassId outerClassId = classIdComponent1.getOuterClassId();
        if (outerClassId == null || (declarationDescriptor = this.this$0.getClass(outerClassId, o.l0(listComponent2))) == null) {
            MemoizedFunctionToNotNull memoizedFunctionToNotNull = this.this$0.packageFragments;
            FqName packageFqName = classIdComponent1.getPackageFqName();
            AbstractC3340k.d(packageFqName, "getPackageFqName(...)");
            declarationDescriptor = (ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull.invoke(packageFqName);
        }
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        boolean zIsNestedClass = classIdComponent1.isNestedClass();
        StorageManager storageManager = this.this$0.storageManager;
        Name shortClassName = classIdComponent1.getShortClassName();
        AbstractC3340k.d(shortClassName, "getShortClassName(...)");
        Integer num = (Integer) o.s0(listComponent2);
        return new NotFoundClasses.MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
    }
}
