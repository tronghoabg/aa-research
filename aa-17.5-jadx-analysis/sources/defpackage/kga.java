package defpackage;

import android.net.Uri;
import com.google.android.apps.auto.components.bugreport.BugreportHandlerActivity;
import com.google.android.apps.auto.components.troubleshooter.contentprovider.TroubleshooterContentProvider;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class kga implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kga(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Integer num = (Integer) obj;
                    long jIntValue = num.intValue();
                    kmu kmuVar = (kmu) this.a;
                    kmuVar.g("com.google.android.apps.auto.radio.HD_SUB_CHANNEL_ID", jIntValue);
                    kmuVar.h("com.google.android.apps.auto.radio.HD_SUB_CHANNEL", ((mit) this.b).c(num.intValue()));
                    return;
                }
                if (i == 3) {
                    ((TroubleshooterContentProvider) this.a).b((okt) this.b, (mbm) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                abms abmsVarV = abms.v(bArr);
                abnp abnpVar = (abnp) this.b;
                abnpVar.t();
                xqa xqaVar = (xqa) abnpVar.b;
                xqa xqaVar2 = xqa.a;
                abmsVarV.getClass();
                xqaVar.b |= 64;
                xqaVar.i = abmsVarV;
                ((ype) pgr.a.l().ai((char) 6568)).y("Sending WifiSetupInfo token '%s' in WifiVersionResponse.", Arrays.toString(bArr));
                ((pgr) this.a).y = Optional.empty();
                return;
            }
            irt irtVar = (irt) obj;
            ipr iprVar = (ipr) this.a;
            long jC = iprVar.c();
            long j = irtVar.h;
            Object obj2 = this.b;
            if (jC > j) {
                ((ype) ((ype) ((ype) ((iru) obj2).a.f()).l(1, TimeUnit.SECONDS)).ai(1254)).x("Audio pipeline latency on MD increased to %d ms", iprVar.c());
            }
            irtVar.h = Math.max(irtVar.h, iprVar.c());
            irtVar.j.b(iprVar.g());
            iru iruVar = (iru) obj2;
            otv otvVar = iruVar.b;
            otv otvVar2 = otv.PCM;
            if (otvVar == otvVar2) {
                irtVar.l.b(iprVar.i());
            }
            otv otvVar3 = otv.AAC_LC;
            if (otvVar == otvVar3 || otvVar == otv.AAC_LC_ADTS) {
                isc iscVar = irtVar.k;
                if (iscVar.a == 0) {
                    ((ype) iruVar.a.l().ai(1253)).x("Encoding latency for the first frame: %s ms", iprVar.f());
                    irtVar.i = iprVar.f();
                }
                iscVar.b(iprVar.f());
                irtVar.l.b(iprVar.h());
            }
            irtVar.r.c(iprVar.d(), 1);
            irtVar.s.c(iprVar.g(), 1);
            if (otvVar == otvVar2) {
                irtVar.u.c(iprVar.i(), 1);
            }
            if (otvVar == otvVar3 || otvVar == otv.AAC_LC_ADTS) {
                irtVar.t.c(iprVar.f(), 1);
                irtVar.u.c(iprVar.h(), 1);
                return;
            }
            return;
        }
        String str = (String) obj;
        int i2 = 0;
        while (true) {
            ?? r2 = this.b;
            if (i2 >= ((yls) r2).c) {
                return;
            }
            ((BugreportHandlerActivity) this.a).grantUriPermission(str, (Uri) r2.get(i2), 3);
            i2++;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ kga(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
