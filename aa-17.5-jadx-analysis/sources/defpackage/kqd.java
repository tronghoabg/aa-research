package defpackage;

import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class kqd extends eql {
    private static final yph h = yph.c("GH.Conn.LD.Projecting");
    public final kpy a;
    private final ogz i;

    public kqd(ogz ogzVar, kpy kpyVar) {
        this.i = ogzVar;
        this.a = kpyVar;
    }

    public static kqd a() {
        return (kqd) mki.a.b(kqd.class, new jqw(11));
    }

    public final void b(Optional optional) {
        if (optional.isEmpty()) {
            Optional optionalEmpty = (Optional) e();
            if (optionalEmpty == null || !optionalEmpty.isPresent()) {
                optionalEmpty = Optional.empty();
            }
            if (optionalEmpty.isEmpty()) {
                ((ype) h.l().ai((char) 3375)).u("Receiving token invalidation but no token cached, ignoring.");
                return;
            }
        }
        if (optional.isEmpty()) {
            ((ype) h.l().ai((char) 3374)).u("Receiving token invalidation with cached token, clearing cache.");
            p();
        } else {
            final ogz ogzVar = this.i;
            final qrn qrnVar = (qrn) optional.get();
            final kok kokVar = new kok(this, 2);
            ogzVar.e(new kpv() { // from class: kpr
                @Override // defpackage.kpv
                public final void a(jlo jloVar) {
                    kqg kqgVarC;
                    boolean zR = kio.b().r();
                    qrn qrnVar2 = qrnVar;
                    if (zR) {
                        try {
                            mki.a.f();
                            CarInfo carInfoD = oni.d(qrnVar2);
                            if (carInfoD == null || carInfoD.d == null) {
                                kqgVarC = kqg.c();
                            } else {
                                CarInfoInternal carInfoInternalB = jloVar.b(carInfoD, "allowedcars");
                                if (carInfoInternalB == null) {
                                    carInfoInternalB = jloVar.b(carInfoD, "rejectedcars");
                                }
                                int iC = oni.c(qrnVar2);
                                int i = 2;
                                int i2 = iC == 2 ? 1 : 2;
                                if (i2 != 1) {
                                    i = 3;
                                }
                                kqf kqfVarA = kqg.a();
                                kqfVarA.c(Optional.ofNullable(carInfoInternalB));
                                kqfVarA.d(i2);
                                kqfVarA.e(i);
                                kqgVarC = kqfVarA.a();
                            }
                        } catch (qrz unused) {
                            kqgVarC = kqg.c();
                        }
                    } else {
                        kqgVarC = kqg.c();
                    }
                    Consumer consumer = kokVar;
                    ((ype) ((ypf) ogzVar.b).l().ai(3366)).y("Projecting carInfo loaded. Info found: %b", Boolean.valueOf(kqgVarC.a.isPresent()));
                    consumer.accept(kqgVarC);
                }
            });
        }
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        r(this.a, new kqc(this, 0));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        s(this.a);
        p();
        super.d();
    }
}
