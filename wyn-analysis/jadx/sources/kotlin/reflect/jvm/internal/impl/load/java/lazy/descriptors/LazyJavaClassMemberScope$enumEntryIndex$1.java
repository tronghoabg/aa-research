package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ff.AbstractC2641B;
import ff.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyJavaClassMemberScope$enumEntryIndex$1 extends AbstractC3343n implements a {
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
    }

    @Override // tf.a
    @NotNull
    public final Map<Name, JavaField> invoke() {
        Collection<JavaField> fields = this.this$0.jClass.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((JavaField) obj).isEnumEntry()) {
                arrayList.add(obj);
            }
        }
        int iD = AbstractC2641B.D(p.a0(arrayList, 10));
        if (iD < 16) {
            iD = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((JavaField) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }
}
