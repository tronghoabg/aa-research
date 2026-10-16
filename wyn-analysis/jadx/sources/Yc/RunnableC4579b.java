package yc;

import A.AbstractC0213f;
import J9.C0665y;
import Pc.C0799o;
import Pc.C0801q;
import Va.X7;
import android.app.job.JobParameters;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.internal.z2;
import ef.InterfaceC2525i;
import java.util.ArrayList;
import java.util.Collections;
import md.J;
import uc.InterfaceC4269f;

/* renamed from: yc.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC4579b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48103c;

    public /* synthetic */ RunnableC4579b(int i5, Object obj, Object obj2) {
        this.f48101a = i5;
        this.f48102b = obj;
        this.f48103c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ef.i, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = false;
        ?? r12 = this.f48103c;
        Object obj = this.f48102b;
        switch (this.f48101a) {
            case 0:
                ((C0799o) obj).a(Double.valueOf(((Cc.a) r12).f1982b));
                break;
            case 1:
                C4584g c4584g = ((C4581d) obj).f48107b;
                final J j8 = c4584g.f48119h;
                Ic.a aVar = (Ic.a) r12;
                final Integer numValueOf = Integer.valueOf(aVar.f5439c.getWidth());
                final Integer numValueOf2 = Integer.valueOf(aVar.f5439c.getHeight());
                final int i5 = ((Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK")).f1667b;
                final int i10 = ((Ac.a) c4584g.f48112a.f5569a.get("AUTO_FOCUS")).f1257b;
                Integer num = (Integer) ((CameraCharacteristics) c4584g.f48112a.c().f48474a.f45906a).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                final Boolean boolValueOf = Boolean.valueOf(num != null && num.intValue() > 0);
                Integer num2 = (Integer) ((CameraCharacteristics) c4584g.f48112a.d().f48474a.f45906a).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                if (num2 != null && num2.intValue() > 0) {
                    z2 = true;
                }
                final Boolean boolValueOf2 = Boolean.valueOf(z2);
                ((Handler) j8.f40580a).post(new Runnable() { // from class: yc.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        J j10 = j8;
                        Double dValueOf = Double.valueOf(numValueOf.doubleValue());
                        Double dValueOf2 = Double.valueOf(numValueOf2.doubleValue());
                        C4572B c4572b = new C4572B();
                        c4572b.f48075a = dValueOf;
                        c4572b.f48076b = dValueOf2;
                        int iF = AbstractC0213f.f(i5);
                        u uVar = u.AUTO;
                        if (iF != 0 && iF == 1) {
                            uVar = u.LOCKED;
                        }
                        int iF2 = AbstractC0213f.f(i10);
                        w wVar = w.AUTO;
                        if (iF2 != 0 && iF2 == 1) {
                            wVar = w.LOCKED;
                        }
                        s sVar = new s();
                        sVar.f48167a = c4572b;
                        sVar.f48168b = uVar;
                        sVar.f48169c = wVar;
                        sVar.f48170d = boolValueOf;
                        sVar.f48171e = boolValueOf2;
                        a2.k kVar = new a2.k();
                        StringBuilder sb2 = new StringBuilder("dev.flutter.pigeon.camera_android.CameraEventApi.initialized");
                        t6.q qVar = (t6.q) j10.f40582c;
                        sb2.append((String) qVar.f45907b);
                        String string = sb2.toString();
                        new X7((InterfaceC4269f) qVar.f45906a, p.f48158d, (Object) null, string).m(new ArrayList(Collections.singletonList(sVar)), new C0665y(kVar, string, 6));
                    }
                });
                break;
            case 2:
                ((C0801q) obj).a((String) r12);
                break;
            case 3:
                a2.k kVar = new a2.k();
                StringBuilder sb2 = new StringBuilder("dev.flutter.pigeon.camera_android.CameraEventApi.error");
                t6.q qVar = (t6.q) ((J) obj).f40582c;
                sb2.append((String) qVar.f45907b);
                String string = sb2.toString();
                new X7((InterfaceC4269f) qVar.f45906a, p.f48158d, (Object) null, string).m(new ArrayList(Collections.singletonList((String) r12)), new C0665y(kVar, string, 7));
                break;
            case 4:
                int i11 = JobInfoSchedulerService.f26262a;
                ((JobInfoSchedulerService) obj).jobFinished((JobParameters) r12, false);
                break;
            default:
                z2.a((BidTokenCallback) obj, (InterfaceC2525i) r12);
                break;
        }
    }
}
