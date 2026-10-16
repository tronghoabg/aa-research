package kotlinx.b.c;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class by extends w {

    /* renamed from: a, reason: collision with root package name */
    private final h.l.c f51026a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.a.q f51027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by(h.l.c cVar, kotlinx.b.b bVar) {
        super(bVar);
        h.g.b.x.f(cVar, "kClass");
        h.g.b.x.f(bVar, "eSerializer");
        this.f51026a = cVar;
        this.f51027b = new c(bVar.getDescriptor());
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        Object[] objArr = (Object[]) obj;
        h.g.b.x.f(objArr, "<this>");
        return objArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* synthetic */ Object c() {
        return new ArrayList();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object e(Object obj) throws NegativeArraySizeException {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        h.g.b.x.f(arrayList, "<this>");
        h.l.c cVar = this.f51026a;
        h.g.b.x.f(cVar, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) h.g.b.o.w(cVar), arrayList.size());
        h.g.b.x.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        h.g.b.x.e(array, "toArray(...)");
        return array;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Iterator f(Object obj) {
        Object[] objArr = (Object[]) obj;
        h.g.b.x.f(objArr, "<this>");
        return h.g.b.o.v(objArr);
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void g(Object obj, int i2) {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        arrayList.ensureCapacity(i2);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f51027b;
    }

    @Override // kotlinx.b.c.w
    public final /* bridge */ /* synthetic */ void k(Object obj, int i2, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        arrayList.add(i2, obj2);
    }
}
