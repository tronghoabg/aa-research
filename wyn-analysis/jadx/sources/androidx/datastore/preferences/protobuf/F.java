package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class F extends G {
    @Override // androidx.datastore.preferences.protobuf.G
    public final void a(long j8, Object obj) {
        ((AbstractC1384b) ((InterfaceC1406x) s0.f18264d.i(j8, obj))).f18185a = false;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void b(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2, long j8) {
        r0 r0Var = s0.f18264d;
        InterfaceC1406x interfaceC1406xMutableCopyWithCapacity = (InterfaceC1406x) r0Var.i(j8, abstractC1404v);
        InterfaceC1406x interfaceC1406x = (InterfaceC1406x) r0Var.i(j8, abstractC1404v2);
        int size = interfaceC1406xMutableCopyWithCapacity.size();
        int size2 = interfaceC1406x.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1384b) interfaceC1406xMutableCopyWithCapacity).f18185a) {
                interfaceC1406xMutableCopyWithCapacity = interfaceC1406xMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            interfaceC1406xMutableCopyWithCapacity.addAll(interfaceC1406x);
        }
        if (size > 0) {
            interfaceC1406x = interfaceC1406xMutableCopyWithCapacity;
        }
        s0.o(abstractC1404v, j8, interfaceC1406x);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final List c(long j8, Object obj) {
        InterfaceC1406x interfaceC1406x = (InterfaceC1406x) s0.f18264d.i(j8, obj);
        if (((AbstractC1384b) interfaceC1406x).f18185a) {
            return interfaceC1406x;
        }
        int size = interfaceC1406x.size();
        InterfaceC1406x interfaceC1406xMutableCopyWithCapacity = interfaceC1406x.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        s0.o(obj, j8, interfaceC1406xMutableCopyWithCapacity);
        return interfaceC1406xMutableCopyWithCapacity;
    }
}
