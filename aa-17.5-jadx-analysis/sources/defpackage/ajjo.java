package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class ajjo extends ajiu {
    final /* synthetic */ ajjp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajjo(ajjp ajjpVar, String str) {
        super(str);
        this.d = ajjpVar;
    }

    @Override // defpackage.ajiu
    public final long a() throws IOException {
        long j;
        ajjn ajjnVar;
        long j2;
        Iterator it;
        long j3;
        long jNanoTime = System.nanoTime();
        ajjp ajjpVar = this.d;
        long j4 = jNanoTime - ajjpVar.a;
        Iterator it2 = ((ConcurrentLinkedQueue) ajjpVar.d).iterator();
        it2.getClass();
        long j5 = 1 + j4;
        long j6 = Long.MAX_VALUE;
        ajjn ajjnVar2 = null;
        int i = 0;
        ajjn ajjnVar3 = null;
        int i2 = 0;
        while (it2.hasNext()) {
            ajjn ajjnVar4 = (ajjn) it2.next();
            ajjnVar4.getClass();
            synchronized (ajjnVar4) {
                TimeZone timeZone = ajis.a;
                List list = ajjnVar4.l;
                j2 = jNanoTime;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference reference = (Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            reference.getClass();
                            it = it2;
                            j3 = j5;
                            ajly.c.e("A connection to " + ajjnVar4.b.a.h + " was leaked. Did you forget to close a response body?", ((ajjk) reference).a);
                            list.remove(i3);
                            if (list.isEmpty()) {
                                ajjnVar4.m = j4;
                                break;
                            }
                            it2 = it;
                            j5 = j3;
                        }
                    } else {
                        it = it2;
                        j3 = j5;
                        if (list.size() > 0) {
                            i2++;
                            j5 = j3;
                        }
                    }
                }
                long j7 = ajjnVar4.m;
                j5 = j7 < j3 ? j7 : j3;
                if (j7 < j3) {
                    ajjnVar2 = ajjnVar4;
                }
                i++;
                if (j7 < j6) {
                    j6 = j7;
                }
                if (j7 < j6) {
                    ajjnVar3 = ajjnVar4;
                }
            }
            jNanoTime = j2;
            it2 = it;
        }
        long j8 = jNanoTime;
        long j9 = j5;
        if (ajjnVar2 != null) {
            ajjnVar = ajjnVar2;
            j = j9;
        } else if (i > 5) {
            j = j6;
            ajjnVar = ajjnVar3;
        } else {
            j = -1;
            ajjnVar = null;
        }
        if (ajjnVar == null) {
            if (ajjnVar3 != null) {
                return (j6 + ajjpVar.a) - j8;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return ajjpVar.a;
        }
        synchronized (ajjnVar) {
            if (!ajjnVar.l.isEmpty()) {
                return 0L;
            }
            if (ajjnVar.m != j) {
                return 0L;
            }
            ajjnVar.f();
            ((ConcurrentLinkedQueue) ajjpVar.d).remove(ajjnVar);
            ajis.g(ajjnVar.c);
            if (!((ConcurrentLinkedQueue) ajjpVar.d).isEmpty()) {
                return 0L;
            }
            ((ajiw) ajjpVar.c).a();
            return 0L;
        }
    }
}
