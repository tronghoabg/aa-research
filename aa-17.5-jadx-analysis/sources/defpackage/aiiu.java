package defpackage;

import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class aiiu {
    public static final Throwable a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        adqs.y(runtimeException, th);
        return runtimeException;
    }

    public static final aigw asSimpleType(aigl aiglVar) {
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        aigw aigwVar = aijfVarUnwrap instanceof aigw ? (aigw) aijfVarUnwrap : null;
        if (aigwVar != null) {
            return aigwVar;
        }
        Objects.toString(aiglVar);
        throw new IllegalStateException("This is should be simple type: ".concat(aiglVar.toString()));
    }

    public static final void b(afco afcoVar, Throwable th) {
        if (th instanceof aiui) {
            th = ((aiui) th).a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) afcoVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(afcoVar, th);
            } else {
                aiqj.a(afcoVar, th);
            }
        } catch (Throwable th2) {
            aiqj.a(afcoVar, a(th, th2));
        }
    }

    public static final aigl replace(aigl aiglVar, List<? extends aiin> list, agfk agfkVar, List<? extends aiin> list2) {
        aiglVar.getClass();
        list.getClass();
        agfkVar.getClass();
        list2.getClass();
        if ((list.isEmpty() || list == aiglVar.getArguments()) && agfkVar == aiglVar.getAnnotations()) {
            return aiglVar;
        }
        aihr attributes = aiglVar.getAttributes();
        if ((agfkVar instanceof agfs) && ((agfs) agfkVar).isEmpty()) {
            agfkVar = agfk.Companion.getEMPTY();
        }
        aihr aihrVarReplaceAnnotations = aihs.replaceAnnotations(attributes, agfkVar);
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof aiga) {
            aiga aigaVar = (aiga) aijfVarUnwrap;
            return aigq.flexibleType(replace(aigaVar.getLowerBound(), list, aihrVarReplaceAnnotations), replace(aigaVar.getUpperBound(), list2, aihrVarReplaceAnnotations));
        }
        if (aijfVarUnwrap instanceof aigw) {
            return replace((aigw) aijfVarUnwrap, list, aihrVarReplaceAnnotations);
        }
        throw new aezs();
    }

    public static /* synthetic */ aigl replace$default(aigl aiglVar, List list, agfk agfkVar, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aiglVar.getArguments();
        }
        if ((i & 2) != 0) {
            agfkVar = aiglVar.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return replace(aiglVar, list, agfkVar, list2);
    }

    public static /* synthetic */ aigw replace$default(aigw aigwVar, List list, aihr aihrVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aigwVar.getArguments();
        }
        if ((i & 2) != 0) {
            aihrVar = aigwVar.getAttributes();
        }
        return replace(aigwVar, (List<? extends aiin>) list, aihrVar);
    }

    public static final aigl replace(aigl aiglVar, List<? extends aiin> list, agfk agfkVar) {
        aiglVar.getClass();
        list.getClass();
        agfkVar.getClass();
        return replace$default(aiglVar, list, agfkVar, null, 4, null);
    }

    public static final aigw replace(aigw aigwVar, List<? extends aiin> list, aihr aihrVar) {
        aigwVar.getClass();
        list.getClass();
        aihrVar.getClass();
        if (list.isEmpty() && aihrVar == aigwVar.getAttributes()) {
            return aigwVar;
        }
        if (list.isEmpty()) {
            return aigwVar.replaceAttributes(aihrVar);
        }
        if (aigwVar instanceof ailj) {
            return ((ailj) aigwVar).replaceArguments(list);
        }
        return aigq.simpleType$default(aihrVar, aigwVar.getConstructor(), list, aigwVar.isMarkedNullable(), (aiju) null, 16, (Object) null);
    }
}
