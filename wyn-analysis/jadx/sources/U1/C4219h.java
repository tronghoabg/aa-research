package u1;

import ef.C2515C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4219h extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f46465a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4215d f46466b;

    /* renamed from: c, reason: collision with root package name */
    public Object f46467c;

    /* renamed from: d, reason: collision with root package name */
    public int f46468d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f46469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f46470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4219h(List list, ArrayList arrayList, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46470f = list;
        this.f46471g = arrayList;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4219h c4219h = new C4219h(this.f46470f, this.f46471g, interfaceC3103c);
        c4219h.f46469e = obj;
        return c4219h;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4219h) create(obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[RETURN] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r9.f46468d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.util.Iterator r1 = r9.f46465a
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.f46469e
            java.util.List r4 = (java.util.List) r4
            Fe.e.U(r10)
            goto L42
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f46467c
            u1.d r4 = r9.f46466b
            java.util.Iterator r5 = r9.f46465a
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.f46469e
            java.util.List r6 = (java.util.List) r6
            Fe.e.U(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L67
        L33:
            Fe.e.U(r10)
            java.lang.Object r10 = r9.f46469e
            java.util.List r1 = r9.f46470f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r9.f46471g
        L42:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r1.next()
            u1.d r5 = (u1.InterfaceC4215d) r5
            r9.f46469e = r4
            r6 = r1
            java.util.Iterator r6 = (java.util.Iterator) r6
            r9.f46465a = r6
            r9.f46466b = r5
            r9.f46467c = r10
            r9.f46468d = r3
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r0) goto L62
            goto L8b
        L62:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8e
            u1.g r10 = new u1.g
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.f46469e = r4
            r10 = r5
            java.util.Iterator r10 = (java.util.Iterator) r10
            r9.f46465a = r10
            r9.f46466b = r7
            r9.f46467c = r7
            r9.f46468d = r2
            java.lang.Object r10 = r6.migrate(r1, r9)
            if (r10 != r0) goto L8c
        L8b:
            return r0
        L8c:
            r1 = r5
            goto L42
        L8e:
            r10 = r1
            goto L8c
        L90:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4219h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
