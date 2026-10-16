package hb;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f36272a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f36273b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f36274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K f36275d;

    public J(K k) {
        this.f36275d = k;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.f36274c) {
            this.f36274c = true;
            ArrayDeque arrayDeque = this.f36273b;
            if (arrayDeque.size() != 1 || ((I) arrayDeque.getFirst()).f36269b != null) {
                StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    I i5 = (I) itDescendingIterator.next();
                    sb2.append("\nfor ");
                    sb2.append(i5.f36268a);
                    String str = i5.f36269b;
                    if (str != null) {
                        sb2.append(' ');
                        sb2.append(str);
                    }
                }
                return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z2) {
        this.f36273b.removeLast();
        if (this.f36273b.isEmpty()) {
            this.f36275d.f36278b.remove();
            if (z2) {
                synchronized (this.f36275d.f36279c) {
                    try {
                        int size = this.f36272a.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            I i10 = (I) this.f36272a.get(i5);
                            r rVar = (r) this.f36275d.f36279c.put(i10.f36270c, i10.f36271d);
                            if (rVar != null) {
                                i10.f36271d = rVar;
                                this.f36275d.f36279c.put(i10.f36270c, rVar);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
