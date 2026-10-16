package defpackage;

import android.os.SystemClock;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class gty extends afde implements afeg {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gty(long j, axr axrVar, ajju ajjuVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = j;
        this.d = axrVar;
        this.c = ajjuVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        if (i == 0) {
            return new gty((afdr) this.c, this.b, (byb) this.d, afckVar, 0);
        }
        if (i == 1) {
            return new gty((geu) this.c, this.b, (bwq) this.d, afckVar, 1);
        }
        return new gty(this.b, (axr) this.d, (ajju) this.c, afckVar, 2);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        long j;
        long millisPart;
        int i = this.e;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            int i2 = this.a;
            woy.dF(obj);
            do {
                ?? r7 = this.c;
                if (((Number) r7.invoke()).floatValue() >= 1.0f) {
                    return afak.a;
                }
                ((byb) this.d).h(((Number) r7.invoke()).floatValue());
                j = this.b;
                this.a = 1;
            } while (aiow.c(j, this) != afcrVar);
            return afcrVar;
        }
        if (i != 1) {
            afcr afcrVar2 = afcr.a;
            int i3 = this.a;
            woy.dF(obj);
            if (i3 == 0) {
                Object obj2 = this.d;
                aiyk aiykVarA = aiyr.a(aizc.b(ainb.a(byx.d(new gzm(obj2, 5)), this.b), new hcg(new fmn(byx.d(new gzm(obj2, 6)), 17), obj2, 1)));
                bqe bqeVar = new bqe(this.c, 7);
                this.a = 1;
                if (aiykVarA.hR(bqeVar, this) == afcrVar2) {
                    return afcrVar2;
                }
            }
            return afak.a;
        }
        afcr afcrVar3 = afcr.a;
        int i4 = this.a;
        woy.dF(obj);
        do {
            ((geu) this.c).z();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            ?? r72 = this.d;
            r72.b(Duration.ofMillis(jElapsedRealtime));
            millisPart = fwl.o(r72).toMillisPart();
            this.a = 1;
        } while (aiow.c(1000 - millisPart, this) != afcrVar3);
        return afcrVar3;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((gty) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((gty) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((gty) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gty(afdr afdrVar, long j, byb bybVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = afdrVar;
        this.b = j;
        this.d = bybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gty(geu geuVar, long j, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = geuVar;
        this.b = j;
        this.d = bwqVar;
    }
}
