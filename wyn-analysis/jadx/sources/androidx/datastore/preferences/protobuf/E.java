package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class E extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f18139c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j8, Object obj, int i5) {
        List list = (List) s0.f18264d.i(j8, obj);
        if (list.isEmpty()) {
            List c10 = list instanceof D ? new C(i5) : ((list instanceof X) && (list instanceof InterfaceC1406x)) ? ((InterfaceC1406x) list).mutableCopyWithCapacity(i5) : new ArrayList(i5);
            s0.o(obj, j8, c10);
            return c10;
        }
        if (f18139c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i5);
            arrayList.addAll(list);
            s0.o(obj, j8, arrayList);
            return arrayList;
        }
        if (list instanceof n0) {
            C c11 = new C(list.size() + i5);
            c11.addAll((n0) list);
            s0.o(obj, j8, c11);
            return c11;
        }
        if ((list instanceof X) && (list instanceof InterfaceC1406x)) {
            InterfaceC1406x interfaceC1406x = (InterfaceC1406x) list;
            if (!((AbstractC1384b) interfaceC1406x).f18185a) {
                InterfaceC1406x interfaceC1406xMutableCopyWithCapacity = interfaceC1406x.mutableCopyWithCapacity(list.size() + i5);
                s0.o(obj, j8, interfaceC1406xMutableCopyWithCapacity);
                return interfaceC1406xMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void a(long j8, Object obj) {
        Object objUnmodifiableList;
        List list = (List) s0.f18264d.i(j8, obj);
        if (list instanceof D) {
            objUnmodifiableList = ((D) list).getUnmodifiableView();
        } else {
            if (f18139c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof X) && (list instanceof InterfaceC1406x)) {
                AbstractC1384b abstractC1384b = (AbstractC1384b) ((InterfaceC1406x) list);
                if (abstractC1384b.f18185a) {
                    abstractC1384b.f18185a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        s0.o(obj, j8, objUnmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void b(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2, long j8) {
        List list = (List) s0.f18264d.i(j8, abstractC1404v2);
        List listD = d(j8, abstractC1404v, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        s0.o(abstractC1404v, j8, list);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final List c(long j8, Object obj) {
        return d(j8, obj, 10);
    }
}
