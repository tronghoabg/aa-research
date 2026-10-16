package X;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4294d;

/* loaded from: classes.dex */
public final class w implements Map.Entry, InterfaceC4294d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15766a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f15768c;

    public w(x xVar) {
        this.f15768c = xVar;
        Map.Entry entry = xVar.f15772d;
        AbstractC3340k.b(entry);
        this.f15766a = entry.getKey();
        Map.Entry entry2 = xVar.f15772d;
        AbstractC3340k.b(entry2);
        this.f15767b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15766a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15767b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        x xVar = this.f15768c;
        if (xVar.f15769a.a().f15736d != xVar.f15771c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f15767b;
        xVar.f15769a.put(this.f15766a, obj);
        this.f15767b = obj;
        return obj2;
    }
}
