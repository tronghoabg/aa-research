package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* loaded from: classes2.dex */
public final class fkw extends afde implements afeg {
    /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkw(Context context, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = context;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        Object obj2 = this.b;
        if (i != 0) {
            fkw fkwVar = new fkw((sm) obj2, afckVar, 1);
            fkwVar.a = ((Boolean) obj).booleanValue();
            return fkwVar;
        }
        fkw fkwVar2 = new fkw((Context) obj2, afckVar, 0);
        fkwVar2.a = ((Boolean) obj).booleanValue();
        return fkwVar2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [dyi, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.c != 0) {
            woy.dF(obj);
            ((sm) this.b).a.b(this.a);
            return afak.a;
        }
        woy.dF(obj);
        fot.a((Context) this.b, RescheduleReceiver.class, this.a);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.c != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((fkw) b(bool, (afck) obj2)).hT(afak.a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((fkw) b(bool2, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkw(sm smVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = smVar;
    }
}
