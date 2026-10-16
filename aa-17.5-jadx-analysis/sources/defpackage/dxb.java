package defpackage;

import android.graphics.Bitmap;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.PhoneCall;

/* loaded from: classes2.dex */
public final class dxb extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(aabf aabfVar, PhoneAccountHandle phoneAccountHandle, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = aabfVar;
        this.c = phoneAccountHandle;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ase, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        if (i == 0) {
            dxb dxbVar = new dxb((aabf) this.b, (PhoneAccountHandle) this.c, afckVar, 0);
            dxbVar.d = obj;
            return dxbVar;
        }
        if (i == 1) {
            dxb dxbVar2 = new dxb((ase) this.c, (bnw) this.b, afckVar, 1);
            dxbVar2.d = obj;
            return dxbVar2;
        }
        if (i == 2) {
            dxb dxbVar3 = new dxb((fsy) this.b, (ugn) this.c, afckVar, 2);
            dxbVar3.d = obj;
            return dxbVar3;
        }
        if (i == 3) {
            dxb dxbVar4 = new dxb((mzy) this.b, (Bitmap) this.c, afckVar, 3);
            dxbVar4.d = obj;
            return dxbVar4;
        }
        if (i == 4) {
            dxb dxbVar5 = new dxb((Bitmap) this.c, (gjo) this.b, afckVar, 4);
            dxbVar5.d = obj;
            return dxbVar5;
        }
        Object obj2 = this.b;
        if (i != 5) {
            dxb dxbVar6 = new dxb((nfn) obj2, (Bitmap) this.c, afckVar, 6);
            dxbVar6.d = obj;
            return dxbVar6;
        }
        dxb dxbVar7 = new dxb((PhoneCall) obj2, (nea) this.c, afckVar, 5);
        dxbVar7.d = obj;
        return dxbVar7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0243, code lost:
    
        if (r1.t(r4, r9) == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        if (r10.u(((defpackage.nea) r3).f, r9) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        if (r10.t(r1, r9) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        if (r10.t(r1, r9) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        if (r10.t(r1, r9) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        if (r10.t(r1, r9) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (r10.t(r1, r9) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0195, code lost:
    
        if (r10 != r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        if (r10 != r0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ee, code lost:
    
        if (r1.t(r4, r9) == r0) goto L96;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [ase, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxb.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((dxb) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((dxb) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((dxb) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 3) {
            return ((dxb) b((sx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 4) {
            return ((dxb) b((sx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 5) {
            return ((dxb) b((sx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((dxb) b((sx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(Bitmap bitmap, gjo gjoVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = bitmap;
        this.b = gjoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(ase aseVar, bnw bnwVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = aseVar;
        this.b = bnwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(PhoneCall phoneCall, nea neaVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = phoneCall;
        this.c = neaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(fsy fsyVar, ugn ugnVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = fsyVar;
        this.c = ugnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(mzy mzyVar, Bitmap bitmap, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = mzyVar;
        this.c = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(nfn nfnVar, Bitmap bitmap, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = nfnVar;
        this.c = bitmap;
    }
}
