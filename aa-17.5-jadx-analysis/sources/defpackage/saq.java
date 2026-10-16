package defpackage;

import android.app.Application;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class saq implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ saq(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.b = obj;
        this.a = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, uko] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, uoq] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, uko] */
    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, uoq] */
    @Override // java.lang.Runnable
    public final void run() {
        xxh xxhVarH;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        switch (this.e) {
            case 0:
                Object obj = this.c;
                Object obj2 = this.b;
                Object obj3 = this.a;
                CarSetupServiceImpl carSetupServiceImpl = ((sar) this.d).a;
                carSetupServiceImpl.e((yze) obj3, (yzf) obj2, (String) obj);
                carSetupServiceImpl.k();
                return;
            case 1:
                Object obj4 = this.c;
                Object obj5 = this.d;
                Object obj6 = this.a;
                Object obj7 = this.b;
                try {
                    ((rvr) obj6).b((qtk) obj5, (ByteBuffer) obj4);
                } catch (IOException unused) {
                    yop yopVarAi = rvs.a.f().ai(8418);
                    rvs rvsVar = (rvs) obj7;
                    int i4 = rvsVar.h;
                    if (i4 == 0) {
                        throw null;
                    }
                    yopVarAi.K("%s Could not write message %d", ols.G(i4), ((qtk) obj5).f);
                    rvsVar.c.p(yze.CAR_SERVICE_CONNECTION_ERROR, yzf.WRITER_IO_ERROR, "Failed to write message");
                }
                synchronized (((rvs) obj7).f) {
                    ((rvs) obj7).g--;
                }
                return;
            case 2:
                Object obj8 = this.d;
                ?? r0 = this.c;
                Object obj9 = this.a;
                try {
                    sxz sxzVarE = ((rjs) this.b).e(r0);
                    ((sxz) obj9).a |= sxzVarE.a;
                    ((sxz) obj9).b = sxzVarE.b | ((sxz) obj9).b;
                    sxz sxzVar = (sxz) obj9;
                    if (sxzVar.b()) {
                        sxzVar.a(((sxy) obj8).b);
                        return;
                    }
                    return;
                } finally {
                }
            case 3:
                txu txuVar = (txu) this.a;
                txuVar.V.f();
                if (!txuVar.A() || !txuVar.D()) {
                    txuVar.g.o(this.c, zfq.a);
                }
                txuVar.p.execute(new txo(this.b, this.d, i2));
                return;
            case 4:
                txu txuVar2 = (txu) this.a;
                txuVar2.V.e();
                if (txuVar2.D()) {
                    this.c.run();
                }
                txuVar2.p.execute(new txo(this.b, this.d, i3));
                return;
            case 5:
                this.c.a((ukp) this.a, (uop) this.b, this.d);
                return;
            case 6:
                Object obj10 = ((whk) this.a).c;
                Object obj11 = this.d;
                ?? r3 = this.b;
                byte[] bArr = (byte[]) this.c;
                if (bArr.length == 0) {
                    ukp ukpVar = (ukp) obj11;
                    xxhVarH = xxh.h(new uit((pka) ((umx) obj10).h(ukpVar).q(), umx.b, ukpVar, toz.a));
                } else {
                    ukp ukpVar2 = (ukp) obj11;
                    umx umxVar = (umx) obj10;
                    pka pkaVar = (pka) umxVar.h(ukpVar2).q();
                    unu unuVar = umxVar.f;
                    abgl abglVar = umx.b;
                    uku ukuVarA = unuVar.a(pkaVar, abglVar, ukpVar2, bArr, toz.b);
                    if (ukuVarA.a == ukt.d) {
                        umxVar.e(ukpVar2, r3, uop.IO_ERROR, null);
                        umxVar.e.a(ukpVar2);
                        RuntimeException runtimeException = new RuntimeException("I/O error unpacking tile");
                        runtimeException.fillInStackTrace();
                        ((ynz) ((ynz) umx.a.a(uys.a).p(runtimeException)).ai((char) 9430)).s();
                    }
                    xxhVarH = ukuVarA.b;
                    if (!xxhVarH.f()) {
                        ((ynz) ((ynz) umx.a.g()).ai(9429)).R("Tile not created for tileType=%s, coords=%s, result: %s", abglVar.name(), obj11, ukuVarA);
                    }
                }
                if (xxhVarH.f()) {
                    ?? B = xxhVarH.b();
                    umx umxVar2 = (umx) obj10;
                    ukp ukpVar3 = (ukp) obj11;
                    umxVar2.d.g(ukpVar3, B);
                    umxVar2.e.b(ukpVar3);
                    umxVar2.e(ukpVar3, r3, uop.OK, B);
                    return;
                }
                return;
            case 7:
                Object obj12 = this.b;
                ((unp) this.a).u((String) this.c, (unk) this.d, true, (upz) obj12);
                return;
            case 8:
                ((unp) this.d).i((unw) this.b, (unq) this.a, this.c);
                return;
            case 9:
                ((unp) this.d).p((unx) this.b, this.c, (unq) this.a);
                return;
            case 10:
                Object obj13 = this.c;
                Object obj14 = this.a;
                Object obj15 = this.b;
                Object obj16 = this.d;
                try {
                    String str = ((unx) obj14).d;
                    vaq.d();
                    int length = ((byte[]) obj13).length;
                    byte[] bArrA = uxi.a((byte[]) obj13, length);
                    abnp abnpVarN = pjx.a.n();
                    abnp abnpVarN2 = pjw.a.n();
                    abnpVarN2.t();
                    pjw pjwVar = (pjw) abnpVarN2.b;
                    pjwVar.c = 4;
                    pjwVar.b |= 1;
                    abnpVarN2.t();
                    pjw pjwVar2 = (pjw) abnpVarN2.b;
                    str.getClass();
                    pjwVar2.b = 2 | pjwVar2.b;
                    pjwVar2.d = str;
                    abnpVarN.t();
                    pjx pjxVar = (pjx) abnpVarN.b;
                    pjw pjwVar3 = (pjw) abnpVarN2.q();
                    pjwVar3.getClass();
                    pjxVar.c = pjwVar3;
                    pjxVar.b |= 1;
                    long epochMilli = ((upc) obj15).d.f().toEpochMilli() + upc.b;
                    abnpVarN.t();
                    pjx pjxVar2 = (pjx) abnpVarN.b;
                    pjxVar2.b |= 8;
                    pjxVar2.e = epochMilli;
                    abnpVarN.t();
                    pjx pjxVar3 = (pjx) abnpVarN.b;
                    pjxVar3.b |= 16;
                    pjxVar3.f = length;
                    abnpVarN.t();
                    pjx pjxVar4 = (pjx) abnpVarN.b;
                    pjxVar4.g = aclh.c(4);
                    pjxVar4.b |= 32;
                    try {
                        ((upc) obj15).c.h((pjx) abnpVarN.q(), bArrA);
                        return;
                    } catch (IOException e) {
                        ((ynz) ((ynz) ((ynz) upc.a.g()).p(e)).ai(9553)).u("Failed to insert resource:");
                        ((unp) obj16).d();
                        return;
                    }
                } catch (IOException e2) {
                    ((ynz) ((ynz) ((ynz) unp.a.g()).p(e2)).ai((char) 9464)).u("Disk cache insertion for style data failed.");
                    return;
                }
            case 11:
                this.c.execute(new uze(this.a, this.b, this.d, i));
                return;
            case 12:
                ((ynz) ((ynz) was.a.a((Level) this.b).p((Throwable) this.a)).ai(9890)).Y((String) this.d, (Object[]) this.c);
                return;
            case 13:
                tng tngVar = (tng) this.a.gu();
                if (tngVar != null) {
                    Object obj17 = this.d;
                    zbu zbuVarF = ysi.F((zyb) this.c, (zbi) this.b, ((Application) obj17).getPackageName());
                    tngVar.a.c("ApplicationMemoryWarningReceived").a(0L, sij.a(zbuVarF));
                    tngVar.a();
                    tng.b("ApplicationMemoryWarningReceived", zbuVarF);
                    return;
                }
                return;
            default:
                ?? r02 = this.b;
                Object obj18 = this.d;
                Object obj19 = this.a;
                int size = r02.size();
                for (int i5 = 0; i5 < size; i5++) {
                    adpl adplVar = (adpl) r02.get(i5);
                    synchronized (adplVar) {
                        adplVar.h((adnq) obj18, (adnq) obj18, false);
                    }
                }
                ?? r11 = this.c;
                int size2 = r11.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((Future) r11.get(i6)).cancel(false);
                }
                synchronized (obj19) {
                    ((adoz) obj19).k();
                }
                ((adoz) obj19).p();
                return;
        }
    }

    public /* synthetic */ saq(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public /* synthetic */ saq(Object obj, Object obj2, Object obj3, Object obj4, int i, char[] cArr) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public /* synthetic */ saq(rjs rjsVar, sxz sxzVar, List list, sxy sxyVar, int i) {
        this.e = i;
        this.b = rjsVar;
        this.a = sxzVar;
        this.c = list;
        this.d = sxyVar;
    }

    public saq(sar sarVar, yze yzeVar, yzf yzfVar, String str, int i) {
        this.e = i;
        this.a = yzeVar;
        this.b = yzfVar;
        this.c = str;
        this.d = sarVar;
    }

    public /* synthetic */ saq(unp unpVar, Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.d = unpVar;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ saq(unp unpVar, String str, unk unkVar, upz upzVar, int i) {
        this.e = i;
        this.a = unpVar;
        this.c = str;
        this.d = unkVar;
        this.b = upzVar;
    }

    public /* synthetic */ saq(unp unpVar, unx unxVar, zgp zgpVar, unq unqVar, int i) {
        this.e = i;
        this.d = unpVar;
        this.b = unxVar;
        this.c = zgpVar;
        this.a = unqVar;
    }

    public /* synthetic */ saq(uoq uoqVar, ukp ukpVar, uop uopVar, uko ukoVar, int i) {
        this.e = i;
        this.c = uoqVar;
        this.a = ukpVar;
        this.b = uopVar;
        this.d = ukoVar;
    }

    public saq(whk whkVar, ukp ukpVar, uoq uoqVar, byte[] bArr, int i) {
        this.e = i;
        this.d = ukpVar;
        this.b = uoqVar;
        this.c = bArr;
        this.a = whkVar;
    }
}
