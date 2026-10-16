package kotlinx.b.c;

import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class bf<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.b f50989a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.b f50990b;

    public /* synthetic */ bf(kotlinx.b.b bVar, kotlinx.b.b bVar2) {
        this.f50989a = bVar;
        this.f50990b = bVar2;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public abstract kotlinx.b.a.q getDescriptor();

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void h(kotlinx.b.b.c cVar, Object obj, int i2, int i3) {
        Map map = (Map) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(map, "builder");
        if (i3 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        h.k.h hVarT = h.k.n.t(h.k.n.u(0, i3 + i3), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC <= 0 || iA > iB) && (iC >= 0 || iB > iA)) {
            return;
        }
        while (true) {
            k(cVar, i2 + iA, map, false);
            if (iA == iB) {
                return;
            } else {
                iA += iC;
            }
        }
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        k(cVar, i2, (Map) obj, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void k(kotlinx.b.b.c r3, int r4, java.util.Map r5, boolean r6) {
        /*
            r2 = this;
            java.lang.String r0 = "decoder"
            h.g.b.x.f(r3, r0)
            java.lang.String r0 = "builder"
            h.g.b.x.f(r5, r0)
            kotlinx.b.b r0 = r2.f50989a
            kotlinx.b.a.q r1 = r2.getDescriptor()
            kotlinx.b.a r0 = (kotlinx.b.a) r0
            java.lang.Object r0 = h.m.k.B(r3, r1, r4, r0)
            int r1 = r4 + 1
            if (r6 == 0) goto L42
            kotlinx.b.a.q r6 = r2.getDescriptor()
            int r6 = r3.decodeElementIndex(r6)
            if (r6 != r1) goto L26
            r1 = r6
            goto L42
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Value must follow key in a map, index for key: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = ", returned index for value: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
        L42:
            boolean r4 = r5.containsKey(r0)
            if (r4 == 0) goto L65
            kotlinx.b.b r4 = r2.f50990b
            kotlinx.b.a.q r6 = r4.getDescriptor()
            kotlinx.b.a.x r6 = r6.h()
            boolean r6 = r6 instanceof kotlinx.b.a.p
            if (r6 != 0) goto L65
            kotlinx.b.a.q r2 = r2.getDescriptor()
            kotlinx.b.a r4 = (kotlinx.b.a) r4
            java.lang.Object r6 = h.a.r.h(r5, r0)
            java.lang.Object r2 = r3.decodeSerializableElement(r2, r1, r4, r6)
            goto L71
        L65:
            kotlinx.b.a.q r4 = r2.getDescriptor()
            kotlinx.b.b r2 = r2.f50990b
            kotlinx.b.a r2 = (kotlinx.b.a) r2
            java.lang.Object r2 = h.m.k.B(r3, r4, r1, r2)
        L71:
            r5.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.c.bf.k(kotlinx.b.b.c, int, java.util.Map, boolean):void");
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, Collection collection) {
        h.g.b.x.f(fVar, "encoder");
        int iB = b(collection);
        kotlinx.b.a.q descriptor = getDescriptor();
        kotlinx.b.b.d dVarBeginCollection = fVar.beginCollection(descriptor, iB);
        Iterator itF = f(collection);
        int i2 = 0;
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            dVarBeginCollection.encodeSerializableElement(getDescriptor(), i2, this.f50989a, key);
            dVarBeginCollection.encodeSerializableElement(getDescriptor(), i2 + 1, this.f50990b, value);
            i2 += 2;
        }
        dVarBeginCollection.endStructure(descriptor);
    }
}
