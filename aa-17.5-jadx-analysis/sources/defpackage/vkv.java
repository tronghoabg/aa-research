package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.car.app.model.Alert;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class vkv implements ackr {
    private final acku a;
    private final acku b;
    private final /* synthetic */ int c;

    public vkv(acku ackuVar, acku ackuVar2, int i) {
        this.c = i;
        this.a = ackuVar;
        this.b = ackuVar2;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) ((xyc) ((vxp) this.b).a().d(new vks((Context) ((acks) this.a).b, 0))).gu();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 1:
                boolean zBooleanValue = ((Boolean) ((acks) this.b).b).booleanValue();
                ldq ldqVar = (ldq) ((acks) this.a).b;
                vsn vsnVarD = vso.d();
                vsnVarD.d = 3;
                vsnVarD.b = new tfa(ldqVar);
                if (zBooleanValue) {
                    vsnVarD.b(Alert.DURATION_SHOW_INDEFINITELY);
                }
                return vsnVarD.a();
            case 2:
                if (!wer.h(Thread.currentThread())) {
                    vrw vrwVar = (vrw) this.a.a();
                    if (!vrw.b()) {
                        yop yopVarH = vlj.a.h();
                        Object obj = vrwVar.a;
                        ((ynz) ((ynz) yopVarH).ai((char) 9743)).y("Primes init triggered from background in package: %s", obj);
                        if (!vrwVar.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", obj));
                        }
                    }
                }
                return new vla(((vld) this.b).a());
            case 3:
                Context context = (Context) ((acks) this.a).b;
                vuz vuzVarA = (vuz) ((aezk) ((tfe) this.b).b().d(new qev(9))).a();
                if (vuzVarA.c()) {
                    try {
                        boolean zA = sxf.a.a(context.getContentResolver(), new xxd(":").e("primes", context.getPackageName(), "force_gc_before_record_memory"), vuzVarA.c);
                        vuy vuyVar = new vuy(vuzVarA);
                        vuyVar.b(zA);
                        vuzVarA = vuyVar.a();
                    } catch (SecurityException e) {
                        ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9747)).u("Fail to read Gservices: ");
                    }
                }
                vuzVarA.getClass();
                return vuzVarA;
            case 4:
                vlk vlkVar = (vlk) this.b.a();
                int i = vlkVar.b;
                int i2 = vlkVar.a;
                vqk vqkVarA = ((tmf) this.a).a();
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new vli(i2), new vlh());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                zgt zgtVarC = vqkVarA.c(yrm.aJ(scheduledThreadPoolExecutor));
                zgtVarC.getClass();
                return zgtVarC;
            case 5:
                return new voz((tmb) this.a.a(), this.b);
            case 6:
                return new vqk((Context) ((acks) this.a).b, (vqn) this.b.a());
            case 7:
                return new rju(((vqb) this.b).a(), (Context) ((acks) this.a).b);
            case 8:
                Object ympVar = ((xxh) ((acks) this.b).b).f() ? new ymp((vsa) this.a.a()) : yly.a;
                ympVar.getClass();
                return ympVar;
            case 9:
                Object ympVar2 = !((xxh) ((acks) this.b).b).f() ? yly.a : new ymp((vsa) this.a.a());
                ympVar2.getClass();
                return ympVar2;
            case 10:
                Set setW = a.W((xxh) this.b.a(), this.a);
                setW.getClass();
                return setW;
            case 11:
                Set setW2 = a.W((xxh) ((acks) this.b).b, this.a);
                setW2.getClass();
                return setW2;
            case 12:
                Object ympVar3 = ((xxh) ((acks) this.b).b).f() ? new ymp((vsa) this.a.a()) : yly.a;
                ympVar3.getClass();
                return ympVar3;
            case 13:
                return new vvv(this.a, this.b);
            case 14:
                Set setW3 = a.W((xxh) this.b.a(), this.a);
                setW3.getClass();
                return setW3;
            case 15:
                return new vwk((vqe) this.a.a(), ackq.b(this.b));
            case 16:
                Set setW4 = a.W((xxh) this.b.a(), this.a);
                setW4.getClass();
                return setW4;
            case 17:
                vuf vufVar = ((xxh) ((acks) this.b).b).f() ? (vuf) this.a.a() : new vuf(null, null);
                vufVar.getClass();
                return vufVar;
            case 18:
                Set setW5 = a.W((xxh) ((acks) this.b).b, this.a);
                setW5.getClass();
                return setW5;
            case 19:
                return new vxt((Random) ((xxh) ((acks) this.b).b).d((Random) this.a.a()));
            default:
                return new zgh((tmb) this.a.a(), (xxh) ((acks) this.b).b);
        }
    }

    public vkv(acku ackuVar, acku ackuVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = ackuVar;
        this.a = ackuVar2;
    }
}
