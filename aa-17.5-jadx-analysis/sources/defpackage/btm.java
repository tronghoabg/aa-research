package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telecom.Call;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class btm extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(aabf aabfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = aabfVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.c) {
            case 0:
                return new btm((btp) this.b, afckVar, 0);
            case 1:
                return new btm((brt) this.b, afckVar, 1);
            case 2:
                return new btm((crm) this.b, afckVar, 2);
            case 3:
                return new btm((cuj) this.b, afckVar, 3);
            case 4:
                return new btm((aabf) this.b, afckVar, 4);
            case 5:
                return new btm((aabf) this.b, afckVar, 5, (byte[]) null);
            case 6:
                return new btm((aabf) this.b, afckVar, 6, (char[]) null);
            case 7:
                return new btm((aabf) this.b, afckVar, 7, (short[]) null);
            case 8:
                return new btm((egd) this.b, afckVar, 8);
            case 9:
                return new btm((egd) this.b, afckVar, 9, (byte[]) null);
            case 10:
                return new btm((ncp) this.b, afckVar, 10);
            case 11:
                return new btm((eoz) this.b, afckVar, 11);
            case 12:
                return new btm((eys) this.b, afckVar, 12);
            case 13:
                return new btm((ezv) this.b, afckVar, 13);
            case 14:
                return new btm((aitm) this.b, afckVar, 14);
            case 15:
                return new btm((CoroutineWorker) this.b, afckVar, 15);
            case 16:
                return new btm((CoroutineWorker) this.b, afckVar, 16, (byte[]) null);
            case 17:
                return new btm((flz) this.b, afckVar, 17);
            case 18:
                return new btm((flz) this.b, afckVar, 18, (byte[]) null);
            case 19:
                return new btm((ConstraintTrackingWorker) this.b, afckVar, 19);
            default:
                return new btm((fqd) this.b, afckVar, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [cqz, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        flq flxVar;
        flq flwVar;
        switch (this.c) {
            case 0:
                afcr afcrVar = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj2 = this.b;
                    Float f = new Float(BitmapDescriptorFactory.HUE_RED);
                    this.a = 1;
                    if (((btp) obj2).j.e(f, this) == afcrVar) {
                        return afcrVar;
                    }
                }
                return afak.a;
            case 1:
                afcr afcrVar2 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    afft afftVar = new afft();
                    Object obj3 = this.b;
                    aiyk aiykVarA = ((brt) obj3).a.a();
                    fmo fmoVar = new fmo(afftVar, obj3, 1);
                    this.a = 1;
                    if (aiykVarA.hR(fmoVar, this) == afcrVar2) {
                        return afcrVar2;
                    }
                }
                return afak.a;
            case 2:
                afcr afcrVar3 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r8 = this.b;
                    PointerInputEventHandler pointerInputEventHandler = ((crm) r8).c;
                    this.a = 2;
                    if (pointerInputEventHandler.invoke(r8, this) == afcrVar3) {
                        return afcrVar3;
                    }
                }
                return afak.a;
            case 3:
                afcr afcrVar4 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    long j = ((cuj) this.b).a;
                    this.a = 1;
                    if (aiow.c(j, this) == afcrVar4) {
                        return afcrVar4;
                    }
                }
                ((cuj) this.b).d();
                return afak.a;
            case 4:
                afcr afcrVar5 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj4 = this.b;
                    this.a = 1;
                    aitg aitgVar = new aitg(affa.s(this), 1);
                    aitgVar.z();
                    aabf aabfVar = (aabf) obj4;
                    dxg dxgVar = new dxg(aitgVar, aabfVar);
                    ((rz) aabfVar.a).k(dxgVar, new Handler(Looper.getMainLooper()));
                    aitgVar.d(new dah(obj4, dxgVar, 2));
                    Object objK = aitgVar.k();
                    if (objK != afcrVar5) {
                        objK = afak.a;
                    }
                    if (objK == afcrVar5) {
                        return afcrVar5;
                    }
                }
                return afak.a;
            case 5:
                afcr afcrVar6 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj5 = this.b;
                this.a = 1;
                aitg aitgVar2 = new aitg(affa.s(this), 1);
                aitgVar2.z();
                eyp eypVar = new eyp(aitgVar2, 1);
                Log.d("CallExtensions", "registerWithRemoteService: sending event:");
                Bundle bundle = new Bundle();
                bundle.putBinder("androidx.core.telecom.extensions.extra.CAPABILITY_EXCHANGE_BINDER", eypVar);
                bundle.putInt("androidx.core.telecom.extensions.extra.CAPABILITY_EXCHANGE_VERSION", 1);
                ((Call) ((rz) ((aabf) obj5).a).a).sendCallEvent("android.telecom.event.CAPABILITY_EXCHANGE", bundle);
                Object objK2 = aitgVar2.k();
                return objK2 == afcrVar6 ? afcrVar6 : objK2;
            case 6:
                afcr afcrVar7 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                aabf aabfVar2 = (aabf) this.b;
                aiyk aiykVarJ = ((rz) aabfVar2.a).j();
                dxp dxpVar = new dxp(aabfVar2, (afck) null, 1);
                this.a = 1;
                Object objQ = afpt.q(aiykVarJ, dxpVar, this);
                return objQ == afcrVar7 ? afcrVar7 : objQ;
            case 7:
                afcr afcrVar8 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                aiyk aiykVarJ2 = ((rz) ((aabf) this.b).a).j();
                this.a = 1;
                Object objP = afpt.p(aiykVarJ2, this);
                return objP == afcrVar8 ? afcrVar8 : objP;
            case 8:
                afcr afcrVar9 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                egp egpVarC = ((egd) this.b).c();
                this.a = 1;
                Object objA = egpVarC.a(this);
                return objA == afcrVar9 ? afcrVar9 : objA;
            case 9:
                afcr afcrVar10 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                egp egpVarC2 = ((egd) this.b).c();
                this.a = 1;
                Object objA2 = egpVarC2.a(this);
                return objA2 == afcrVar10 ? afcrVar10 : objA2;
            case 10:
                afcr afcrVar11 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj6 = this.b;
                this.a = 1;
                Object objD = ((egd) ((ncp) obj6).a).d(this);
                return objD == afcrVar11 ? afcrVar11 : objD;
            case 11:
                afcr afcrVar12 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj7 = this.b;
                    this.a = 1;
                    if (aiow.c(((eoz) obj7).c, this) == afcrVar12) {
                        return afcrVar12;
                    }
                }
                eoz eozVar = (eoz) this.b;
                if (!eozVar.a.n()) {
                    aivh aivhVar = eozVar.f;
                    if (aivhVar != null) {
                        aivhVar.s(null);
                    }
                    eozVar.f = null;
                }
                return afak.a;
            case 12:
                afcr afcrVar13 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj8 = this.b;
                    this.a = 1;
                    if (((eys) obj8).a(this) == afcrVar13) {
                        return afcrVar13;
                    }
                }
                return afak.a;
            case 13:
                afcr afcrVar14 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj9 = this.b;
                    this.a = 1;
                    if (((ezv) obj9).e(this) == afcrVar14) {
                        return afcrVar14;
                    }
                }
                return afak.a;
            case 14:
                afcr afcrVar15 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj10 = this.b;
                this.a = 1;
                Object objHL = ((aivo) obj10).hL(this);
                return objHL == afcrVar15 ? afcrVar15 : objHL;
            case 15:
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                this.a = 1;
                throw new IllegalStateException("Not implemented");
            case 16:
                afcr afcrVar16 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj11 = this.b;
                this.a = 1;
                Object objC = ((CoroutineWorker) obj11).c(this);
                return objC == afcrVar16 ? afcrVar16 : objC;
            case 17:
                afcr afcrVar17 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj12 = this.b;
                this.a = 1;
                Object objB = ((flz) obj12).b(this);
                return objB == afcrVar17 ? afcrVar17 : objB;
            case 18:
                afcr afcrVar18 = afcr.a;
                try {
                    if (this.a != 0) {
                        woy.dF(obj);
                    } else {
                        woy.dF(obj);
                        Object obj13 = this.b;
                        aivj aivjVar = ((flz) obj13).j;
                        btm btmVar = new btm((flz) obj13, (afck) null, 17);
                        this.a = 1;
                        obj = ahnc.a(aivjVar, btmVar, this);
                        if (obj == afcrVar18) {
                            return afcrVar18;
                        }
                    }
                    flxVar = (flq) obj;
                } catch (fls e) {
                    flwVar = new flw(e.a);
                } catch (CancellationException unused) {
                    flxVar = new flu();
                } catch (Throwable th) {
                    String str = fma.a;
                    fjo.a();
                    Log.e(str, "Unexpected error in WorkerWrapper", th);
                    flxVar = new flx(false);
                }
                flwVar = flxVar;
                Object obj14 = this.b;
                affq affqVar = new affq();
                ((flz) obj14).e.m(new ae(flwVar, affqVar, obj14, 13, (short[]) null));
                return Boolean.valueOf(affqVar.a);
            case 19:
                afcr afcrVar19 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj15 = this.b;
                this.a = 1;
                Object objI = ((ConstraintTrackingWorker) obj15).i(this);
                return objI == afcrVar19 ? afcrVar19 : objI;
            default:
                afcr afcrVar20 = afcr.a;
                int i = this.a;
                woy.dF(obj);
                if (i == 0) {
                    Object obj16 = this.b;
                    aiyk aiykVarD = byx.d(new flm(obj16, 12));
                    fqd fqdVar = (fqd) obj16;
                    aiyk aiykVarA2 = aizc.a(aiykVarD, new giy(fqdVar, (afck) null, 1));
                    fqa fqaVar = new fqa(fqdVar);
                    this.a = 1;
                    if (aiykVarA2.hR(fqaVar, this) == afcrVar20) {
                        return afcrVar20;
                    }
                }
                return afak.a;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.c) {
            case 0:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((btm) b(bool, (afck) obj2)).hT(afak.a);
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((btm) b(bool2, (afck) obj2)).hT(afak.a);
            case 10:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 11:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 12:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 13:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 14:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 15:
                afck afckVarB = b((aitx) obj, (afck) obj2);
                afak afakVar = afak.a;
                ((btm) afckVarB).hT(afakVar);
                return afakVar;
            case 16:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 17:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 18:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 19:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((btm) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(aabf aabfVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.b = aabfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(aabf aabfVar, afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.c = i;
        this.b = aabfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(aabf aabfVar, afck afckVar, int i, short[] sArr) {
        super(2, afckVar);
        this.c = i;
        this.b = aabfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(aitm aitmVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = aitmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(CoroutineWorker coroutineWorker, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(CoroutineWorker coroutineWorker, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(ConstraintTrackingWorker constraintTrackingWorker, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = constraintTrackingWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(brt brtVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = brtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(btp btpVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = btpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(crm crmVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = crmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(cuj cujVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = cujVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(egd egdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = egdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(egd egdVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.b = egdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(eoz eozVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = eozVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(eys eysVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = eysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(ezv ezvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = ezvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(flz flzVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = flzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(flz flzVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.b = flzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(fqd fqdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = fqdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btm(ncp ncpVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = ncpVar;
    }
}
