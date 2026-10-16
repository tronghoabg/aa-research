package com.google.b.d.b;

import androidx.collection.SimpleArrayMap;
import com.google.d.b.an;
import com.google.d.d.ci;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class r {

    /* renamed from: d, reason: collision with root package name */
    private static final ai f7115d = ai.f();

    /* renamed from: a, reason: collision with root package name */
    private final r f7116a;

    /* renamed from: b, reason: collision with root package name */
    private final SimpleArrayMap f7117b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7118c = false;

    /* synthetic */ r(r rVar, SimpleArrayMap simpleArrayMap) {
        if (rVar != null) {
            an.l(rVar.f7118c);
        }
        this.f7116a = rVar;
        this.f7117b = simpleArrayMap;
    }

    static r b(r rVar, r rVar2) {
        if (rVar.e()) {
            return rVar2;
        }
        if (rVar2.e()) {
            return rVar;
        }
        ci<r> ciVarQ = ci.q(rVar, rVar2);
        if (ciVarQ.isEmpty()) {
            return q.f7113a;
        }
        if (ciVarQ.size() == 1) {
            return (r) ciVarQ.iterator().next();
        }
        int size = 0;
        for (r rVar3 : ciVarQ) {
            do {
                size += rVar3.f7117b.size();
                rVar3 = rVar3.f7116a;
            } while (rVar3 != null);
        }
        if (size == 0) {
            return q.f7113a;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap(size);
        for (r rVar4 : ciVarQ) {
            do {
                int i2 = 0;
                while (true) {
                    SimpleArrayMap simpleArrayMap2 = rVar4.f7117b;
                    if (i2 >= simpleArrayMap2.size()) {
                        break;
                    }
                    an.q(simpleArrayMap.put((ai) simpleArrayMap2.keyAt(i2), simpleArrayMap2.valueAt(i2)) == null, "Duplicate bindings: %s", simpleArrayMap2.keyAt(i2));
                    i2++;
                }
                rVar4 = rVar4.f7116a;
            } while (rVar4 != null);
        }
        return new q(simpleArrayMap).c();
    }

    final r c() {
        if (this.f7118c) {
            throw new IllegalStateException("Already frozen");
        }
        this.f7118c = true;
        r rVar = this.f7116a;
        return (rVar == null || !this.f7117b.isEmpty()) ? this : rVar;
    }

    public final boolean e() {
        return this == q.f7113a;
    }

    final boolean f() {
        return this.f7118c;
    }

    final boolean h(ai aiVar) {
        if (this.f7117b.containsKey(aiVar)) {
            return true;
        }
        r rVar = this.f7116a;
        return rVar != null && rVar.h(aiVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (r rVar = this; rVar != null; rVar = rVar.f7116a) {
            for (int i2 = 0; i2 < rVar.f7117b.size(); i2++) {
                sb.append("[");
                sb.append(this.f7117b.valueAt(i2));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
