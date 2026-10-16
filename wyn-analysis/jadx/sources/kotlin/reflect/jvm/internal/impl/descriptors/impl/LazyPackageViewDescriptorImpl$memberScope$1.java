package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ff.o;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyPackageViewDescriptorImpl$memberScope$1 extends AbstractC3343n implements a {
    final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    @Override // tf.a
    @NotNull
    public final MemberScope invoke() {
        if (this.this$0.isEmpty()) {
            return MemberScope.Empty.INSTANCE;
        }
        List<PackageFragmentDescriptor> fragments = this.this$0.getFragments();
        ArrayList arrayList = new ArrayList(p.a0(fragments, 10));
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
        }
        ArrayList arrayListF0 = o.F0(arrayList, new SubpackagesScope(this.this$0.getModule(), this.this$0.getFqName()));
        return ChainedMemberScope.Companion.create("package view scope for " + this.this$0.getFqName() + " in " + this.this$0.getModule().getName(), arrayListF0);
    }
}
