package androidx.activity;

import ef.C2515C;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class p extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17727i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f17728j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i5) {
        super(1);
        this.f17727i = i5;
        this.f17728j = wVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f17727i) {
            case 0:
                b backEvent = (b) obj;
                AbstractC3340k.e(backEvent, "backEvent");
                w wVar = this.f17728j;
                ff.l lVar = wVar.f17744b;
                ListIterator listIterator = lVar.listIterator(lVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((o) objPrevious).f17724a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                o oVar = (o) objPrevious;
                wVar.f17745c = oVar;
                if (oVar != null) {
                    oVar.d(backEvent);
                }
                break;
            default:
                b backEvent2 = (b) obj;
                AbstractC3340k.e(backEvent2, "backEvent");
                w wVar2 = this.f17728j;
                o oVar2 = wVar2.f17745c;
                if (oVar2 == null) {
                    ff.l lVar2 = wVar2.f17744b;
                    ListIterator listIterator2 = lVar2.listIterator(lVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((o) objPrevious2).f17724a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    oVar2 = (o) objPrevious2;
                }
                if (oVar2 != null) {
                    oVar2.c(backEvent2);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
