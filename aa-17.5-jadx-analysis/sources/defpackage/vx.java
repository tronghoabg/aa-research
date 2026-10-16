package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class vx {
    public Object a;

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, dnw dnwVar, afdr afdrVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            dnwVar.b(afdrVar.invoke());
        } catch (Throwable th) {
            dnwVar.d(th);
        }
    }
}
