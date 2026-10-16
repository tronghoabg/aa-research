package Jd;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Jd.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0675i {

    /* renamed from: a, reason: collision with root package name */
    public final String f6056a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6057b;

    public C0675i(String value, List params) {
        Object next;
        String str;
        AbstractC3340k.e(value, "value");
        AbstractC3340k.e(params, "params");
        this.f6056a = value;
        this.f6057b = params;
        Iterator it = params.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC3340k.a(((j) next).f6058a, "q")) {
                    break;
                }
            }
        }
        j jVar = (j) next;
        if (jVar == null || (str = jVar.f6059b) == null) {
            return;
        }
        Bf.q.Y(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0675i)) {
            return false;
        }
        C0675i c0675i = (C0675i) obj;
        return AbstractC3340k.a(this.f6056a, c0675i.f6056a) && AbstractC3340k.a(this.f6057b, c0675i.f6057b);
    }

    public final int hashCode() {
        return this.f6057b.hashCode() + (this.f6056a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f6056a + ", params=" + this.f6057b + ')';
    }
}
