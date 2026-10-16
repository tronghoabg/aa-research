package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public final class A extends z {
    public A(Class cls) {
        super(AbstractC3332c.NO_RECEIVER, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    @Override // kotlin.reflect.KProperty2
    public final Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
