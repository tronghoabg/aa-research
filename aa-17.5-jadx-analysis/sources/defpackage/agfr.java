package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agfr implements agfk {
    private final List<agfk> delegates;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agfr(agfk... agfkVarArr) {
        this((List<? extends agfk>) woy.df(agfkVarArr));
        agfkVarArr.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agfc findAnnotation$lambda$0(ahnf ahnfVar, agfk agfkVar) {
        agfkVar.getClass();
        return agfkVar.findAnnotation(ahnfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final airp iterator$lambda$0(agfk agfkVar) {
        agfkVar.getClass();
        return woy.cm(agfkVar);
    }

    @Override // defpackage.agfk
    public agfc findAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        return (agfc) afrg.h(afrg.r(woy.cm(this.delegates), new agfp(ahnfVar)));
    }

    @Override // defpackage.agfk
    public boolean hasAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        Iterator itA = woy.cm(this.delegates).a();
        while (itA.hasNext()) {
            if (((agfk) itA.next()).hasAnnotation(ahnfVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agfk
    public boolean isEmpty() {
        List<agfk> list = this.delegates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((agfk) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<agfc> iterator() {
        return new airl((airm) afrg.o(woy.cm(this.delegates), agfq.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public agfr(List<? extends agfk> list) {
        list.getClass();
        this.delegates = list;
    }
}
