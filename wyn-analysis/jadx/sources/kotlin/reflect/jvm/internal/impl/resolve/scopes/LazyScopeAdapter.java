package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    @NotNull
    private final NotNullLazyValue<MemberScope> lazyScope;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(@NotNull a getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        AbstractC3340k.e(getScope, "getScope");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public MemberScope getWorkerScope() {
        return (MemberScope) this.lazyScope.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LazyScopeAdapter(StorageManager NO_LOCKS, a aVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i5 & 1) != 0) {
            NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
            AbstractC3340k.d(NO_LOCKS, "NO_LOCKS");
        }
        this(NO_LOCKS, aVar);
    }

    public LazyScopeAdapter(@NotNull StorageManager storageManager, @NotNull a getScope) {
        AbstractC3340k.e(storageManager, "storageManager");
        AbstractC3340k.e(getScope, "getScope");
        this.lazyScope = storageManager.createLazyValue(new LazyScopeAdapter$lazyScope$1(getScope));
    }
}
