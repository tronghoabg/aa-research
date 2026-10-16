package defpackage;

import com.google.android.libraries.geo.mapcore.internal.store.diskcache.NativeSqliteDiskCacheImpl;
import java.util.function.BooleanSupplier;

/* loaded from: classes3.dex */
public final /* synthetic */ class uow implements BooleanSupplier {
    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        return NativeSqliteDiskCacheImpl.nativeInitClass();
    }
}
