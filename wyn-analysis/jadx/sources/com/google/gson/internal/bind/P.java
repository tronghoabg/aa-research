package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class P extends la.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27396a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27397b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27398c;

    public P(TypeAdapters$32 typeAdapters$32, Class cls) {
        this.f27398c = typeAdapters$32;
        this.f27397b = cls;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        switch (this.f27396a) {
            case 0:
                Object objB = ((TypeAdapters$32) this.f27398c).f27416b.b(c3962a);
                if (objB != null) {
                    Class cls = (Class) this.f27397b;
                    if (!cls.isInstance(objB)) {
                        throw new la.p("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + c3962a.B(), 13);
                    }
                }
                return objB;
            default:
                if (c3962a.e0() == 9) {
                    c3962a.a0();
                    return null;
                }
                Collection collection = (Collection) ((na.m) this.f27398c).d();
                c3962a.a();
                while (c3962a.D()) {
                    collection.add(((la.z) ((com.dexterous.flutterlocalnotifications.j) this.f27397b).f26236c).b(c3962a));
                }
                c3962a.i();
                return collection;
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        switch (this.f27396a) {
            case 0:
                ((TypeAdapters$32) this.f27398c).f27416b.c(c3963b, obj);
                break;
            default:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c3963b.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((com.dexterous.flutterlocalnotifications.j) this.f27397b).c(c3963b, it.next());
                    }
                    c3963b.i();
                    break;
                } else {
                    c3963b.z();
                    break;
                }
        }
    }

    public P(la.l lVar, Type type, la.z zVar, na.m mVar) {
        this.f27397b = new com.dexterous.flutterlocalnotifications.j(lVar, zVar, type);
        this.f27398c = mVar;
    }
}
