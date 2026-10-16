package defpackage;

import android.content.Context;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.car.control.CarAction;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class foz extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(aizu aizuVar, aiyk aiykVar, aizk aizkVar, Object obj, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = aizuVar;
        this.d = aiykVar;
        this.b = aizkVar;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [aizu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kkf] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, tks] */
    /* JADX WARN: Type inference failed for: r4v14, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [fjh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [aivh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r6v7, types: [fpp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.f) {
            case 0:
                Object obj2 = this.b;
                return new foz((fjn) obj2, (fod) this.c, (fjh) this.d, (Context) this.e, afckVar, 0);
            case 1:
                Object obj3 = this.d;
                return new foz((egd) obj3, (fdf) this.b, (afeg) this.c, (ees) this.e, afckVar, 1);
            case 2:
                Object obj4 = this.e;
                Object obj5 = this.d;
                return new foz((gjv) obj4, (fod) obj5, (AtomicInteger) this.c, (zgp) this.b, afckVar, 2);
            case 3:
                Object obj6 = this.c;
                Object obj7 = this.e;
                return new foz((ConstraintTrackingWorker) obj6, (fjn) obj7, (gjv) this.d, (fod) this.b, afckVar, 3);
            case 4:
                Object obj8 = this.b;
                Object obj9 = this.d;
                return new foz((fsy) obj8, (ugn) obj9, (ftn) this.c, (fpp) this.e, afckVar, 4);
            case 5:
                Object obj10 = this.d;
                return new foz((CarAction) obj10, (kkf) this.e, (afha) this.c, (afeg) this.b, afckVar, 5);
            case 6:
                Object obj11 = this.c;
                Object obj12 = this.d;
                return new foz((ajab) obj11, (bxn) obj12, (bwz) this.e, (afec) this.b, afckVar, 6);
            case 7:
                Object obj13 = this.c;
                return new foz((ajed) obj13, (tla) this.d, (tks) this.e, (aivh) this.b, afckVar, 7);
            default:
                return new foz((aizu) this.c, (aiyk) this.d, (aizk) this.b, this.e, afckVar, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x027e, code lost:
    
        if (r13.hR(r1, r12) == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a2, code lost:
    
        if (r13.hR(r2, r12) != r0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02dd, code lost:
    
        if (defpackage.aimr.b(r13, r5, r12) == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r13.n(r12) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (r12.b.invoke(r12) != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        if (r6.invoke(r13, r12) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        if (r6.invoke(r1, r12) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Type inference failed for: r11v0, types: [fpp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v17, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v39, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v55, types: [java.lang.Object, tks] */
    /* JADX WARN: Type inference failed for: r13v56, types: [aivh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v65, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v66, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aizk, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ae -> B:39:0x00b1). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.foz.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((foz) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(ajab ajabVar, bxn bxnVar, bwz bwzVar, afec afecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = ajabVar;
        this.d = bxnVar;
        this.e = bwzVar;
        this.b = afecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(ajed ajedVar, tla tlaVar, tks tksVar, aivh aivhVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = ajedVar;
        this.d = tlaVar;
        this.e = tksVar;
        this.b = aivhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(ConstraintTrackingWorker constraintTrackingWorker, fjn fjnVar, gjv gjvVar, fod fodVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = constraintTrackingWorker;
        this.e = fjnVar;
        this.d = gjvVar;
        this.b = fodVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(CarAction carAction, kkf kkfVar, afha afhaVar, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.d = carAction;
        this.e = kkfVar;
        this.c = afhaVar;
        this.b = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(egd egdVar, fdf fdfVar, afeg afegVar, ees eesVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.d = egdVar;
        this.b = fdfVar;
        this.c = afegVar;
        this.e = eesVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(fjn fjnVar, fod fodVar, fjh fjhVar, Context context, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = fjnVar;
        this.c = fodVar;
        this.d = fjhVar;
        this.e = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(fsy fsyVar, ugn ugnVar, ftn ftnVar, fpp fppVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = fsyVar;
        this.d = ugnVar;
        this.c = ftnVar;
        this.e = fppVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(gjv gjvVar, fod fodVar, AtomicInteger atomicInteger, zgp zgpVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.e = gjvVar;
        this.d = fodVar;
        this.c = atomicInteger;
        this.b = zgpVar;
    }
}
