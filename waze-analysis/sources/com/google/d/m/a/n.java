package com.google.d.m.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends l {
    @Override // com.google.d.m.a.l
    final h a(s sVar, h hVar) {
        h hVar2;
        synchronized (sVar) {
            hVar2 = sVar.listenersField;
            if (hVar2 != hVar) {
                sVar.listenersField = hVar;
            }
        }
        return hVar2;
    }

    @Override // com.google.d.m.a.l
    final r b(s sVar, r rVar) {
        r rVar2;
        synchronized (sVar) {
            rVar2 = sVar.waitersField;
            if (rVar2 != rVar) {
                sVar.waitersField = rVar;
            }
        }
        return rVar2;
    }

    @Override // com.google.d.m.a.l
    final void c(r rVar, r rVar2) {
        rVar.next = rVar2;
    }

    @Override // com.google.d.m.a.l
    final void d(r rVar, Thread thread) {
        rVar.thread = thread;
    }

    @Override // com.google.d.m.a.l
    final boolean e(s sVar, h hVar, h hVar2) {
        synchronized (sVar) {
            if (sVar.listenersField != hVar) {
                return false;
            }
            sVar.listenersField = hVar2;
            return true;
        }
    }

    @Override // com.google.d.m.a.l
    final boolean f(s sVar, Object obj, Object obj2) {
        synchronized (sVar) {
            if (sVar.valueField != obj) {
                return false;
            }
            sVar.valueField = obj2;
            return true;
        }
    }

    @Override // com.google.d.m.a.l
    final boolean g(s sVar, r rVar, r rVar2) {
        synchronized (sVar) {
            if (sVar.waitersField != rVar) {
                return false;
            }
            sVar.waitersField = rVar2;
            return true;
        }
    }
}
