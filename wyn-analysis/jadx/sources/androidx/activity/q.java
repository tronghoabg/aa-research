package androidx.activity;

import ef.C2515C;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class q extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17729i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f17730j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(w wVar, int i5) {
        super(0);
        this.f17729i = i5;
        this.f17730j = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // tf.a
    public final Object invoke() {
        o oVarPrevious;
        switch (this.f17729i) {
            case 0:
                this.f17730j.b();
                break;
            case 1:
                w wVar = this.f17730j;
                o oVar = wVar.f17745c;
                if (oVar == null) {
                    ff.l lVar = wVar.f17744b;
                    ListIterator listIterator = lVar.listIterator(lVar.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            oVarPrevious = listIterator.previous();
                            if (((o) oVarPrevious).f17724a) {
                            }
                        } else {
                            oVarPrevious = 0;
                        }
                    }
                    oVar = oVarPrevious;
                }
                wVar.f17745c = null;
                if (oVar != null) {
                    oVar.a();
                }
                break;
            default:
                this.f17730j.b();
                break;
        }
        return C2515C.f34653a;
    }
}
