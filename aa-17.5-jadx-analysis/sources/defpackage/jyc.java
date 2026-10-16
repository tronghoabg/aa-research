package defpackage;

import androidx.car.app.messaging.model.ConversationItem;

/* loaded from: classes2.dex */
public final class jyc implements aiyk {
    final /* synthetic */ aiyk a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public jyc(aiyk aiykVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = aiykVar;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [afeh, java.lang.Object] */
    @Override // defpackage.aiyk
    public final Object hR(aiyl aiylVar, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            Object objHR = this.a.hR(new jyb(aiylVar, (geu) this.b, (ConversationItem) this.c), afckVar);
            return objHR == afcr.a ? objHR : afak.a;
        }
        if (i == 1) {
            Object objHR2 = this.a.hR(new kle(aiylVar, this.b, this.c, 1), afckVar);
            return objHR2 == afcr.a ? objHR2 : afak.a;
        }
        if (i == 2) {
            Object objHR3 = this.a.hR(new kle(aiylVar, (klj) this.c, (klq) this.b, 0), afckVar);
            return objHR3 == afcr.a ? objHR3 : afak.a;
        }
        if (i == 3) {
            Object objHR4 = this.a.hR(new kle(aiylVar, (klj) this.c, (klq) this.b, 2), afckVar);
            return objHR4 == afcr.a ? objHR4 : afak.a;
        }
        if (i != 4) {
            Object objA = aipm.a(aiylVar, new aiyk[]{this.a, this.b}, new tic(10), new aizj((afeh) this.c, (afck) null, 4), afckVar);
            return objA == afcr.a ? objA : afak.a;
        }
        Object objHR5 = this.a.hR(new kle(aiylVar, this.b, this.c, 3), afckVar);
        return objHR5 == afcr.a ? objHR5 : afak.a;
    }

    public jyc(aiyk aiykVar, klj kljVar, klq klqVar, int i) {
        this.d = i;
        this.a = aiykVar;
        this.c = kljVar;
        this.b = klqVar;
    }
}
