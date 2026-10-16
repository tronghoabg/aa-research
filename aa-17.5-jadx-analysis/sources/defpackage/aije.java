package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class aije {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final aigl getEnhancement(aigl aiglVar) {
        aiglVar.getClass();
        if (aiglVar instanceof aijd) {
            return ((aijd) aiglVar).getEnhancement();
        }
        return null;
    }

    public static final aijf inheritEnhancement(aijf aijfVar, aigl aiglVar, afec<? super aigl, ? extends aigl> afecVar) {
        aijfVar.getClass();
        aiglVar.getClass();
        afecVar.getClass();
        aigl enhancement = getEnhancement(aiglVar);
        return wrapEnhancement(aijfVar, enhancement != null ? afecVar.invoke(enhancement) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final aijf wrapEnhancement(aijf aijfVar, aigl aiglVar) {
        aijfVar.getClass();
        if (aijfVar instanceof aijd) {
            return wrapEnhancement(((aijd) aijfVar).getOrigin(), aiglVar);
        }
        if (aiglVar == null || affa.f(aiglVar, aijfVar)) {
            return aijfVar;
        }
        if (aijfVar instanceof aigw) {
            return new aigz((aigw) aijfVar, aiglVar);
        }
        if (aijfVar instanceof aiga) {
            return new aigd((aiga) aijfVar, aiglVar);
        }
        throw new aezs();
    }

    public static final aijf inheritEnhancement(aijf aijfVar, aigl aiglVar) {
        aijfVar.getClass();
        aiglVar.getClass();
        return wrapEnhancement(aijfVar, getEnhancement(aiglVar));
    }
}
