package defpackage;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class aiwt implements aiuo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aiwt(aiwv aiwvVar, Runnable runnable, int i) {
        this.c = i;
        this.a = aiwvVar;
        this.b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.aiuo
    public final void hy() {
        int i = this.c;
        Object obj = this.a;
        if (i == 0) {
            ((aiwv) obj).a.removeCallbacks(this.b);
            return;
        }
        Object obj2 = this.b;
        synchronized (egu.a) {
            Map map = egu.b;
            egu eguVar = (egu) map.get(obj2);
            if (eguVar != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = eguVar.c;
                copyOnWriteArrayList.remove(obj);
                if (copyOnWriteArrayList.isEmpty()) {
                    map.remove(obj2);
                    eguVar.stopWatching();
                }
            }
        }
    }

    public /* synthetic */ aiwt(String str, afec afecVar, int i) {
        this.c = i;
        this.b = str;
        this.a = afecVar;
    }
}
