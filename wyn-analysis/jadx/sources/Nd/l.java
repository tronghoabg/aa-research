package Nd;

import ff.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;

/* loaded from: classes5.dex */
public abstract class l implements j {

    /* renamed from: c, reason: collision with root package name */
    public final Map f8669c;

    public l(Map values) {
        AbstractC3340k.e(values, "values");
        b bVar = new b();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add((String) list.get(i5));
            }
            bVar.put(str, arrayList);
        }
        this.f8669c = bVar;
    }

    @Override // Nd.j
    public final Set b() {
        Set setEntrySet = this.f8669c.entrySet();
        AbstractC3340k.e(setEntrySet, "<this>");
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setEntrySet);
        AbstractC3340k.d(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @Override // Nd.j
    public final boolean c() {
        return true;
    }

    @Override // Nd.j
    public final void d(p pVar) {
        for (Map.Entry entry : this.f8669c.entrySet()) {
            pVar.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (true != jVar.c()) {
            return false;
        }
        return b().equals(jVar.b());
    }

    @Override // Nd.j
    public final String get(String str) {
        List list = (List) this.f8669c.get(str);
        if (list != null) {
            return (String) o.s0(list);
        }
        return null;
    }

    public final int hashCode() {
        return b().hashCode() + 1182991;
    }

    @Override // Nd.j
    public final boolean isEmpty() {
        return this.f8669c.isEmpty();
    }
}
