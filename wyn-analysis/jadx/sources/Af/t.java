package Af;

import Wf.C1266y;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class t implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1325b;

    public /* synthetic */ t(Object obj, int i5) {
        this.f1324a = i5;
        this.f1325b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1324a) {
            case 0:
                return ((k) this.f1325b).iterator();
            case 1:
                return new Uf.h((C1266y) this.f1325b);
            case 2:
                return AbstractC3340k.i((Object[]) this.f1325b);
            default:
                return new b((Iterator) ((tf.a) this.f1325b).invoke());
        }
    }
}
