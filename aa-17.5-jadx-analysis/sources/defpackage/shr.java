package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class shr {
    public final shq a;
    protected boolean b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public Set g;
    public String h;
    public String i;
    public final shz j;
    public final zgp k;
    public boolean l;
    public final abow m;
    public tmu n;
    public int o;
    public final abnr p;

    public shr(shv shvVar, abow abowVar) {
        abnr abnrVar = (abnr) acam.a.n();
        this.p = abnrVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.l = false;
        this.a = shvVar;
        this.i = shvVar.h;
        this.h = shvVar.e;
        shx shxVar = shvVar.f.getApplicationContext() instanceof shx ? (shx) shvVar.f.getApplicationContext() : (shx) shy.a.get();
        shz shzVarA = shxVar != null ? shxVar.a() : null;
        if (shzVarA == null) {
            this.j = null;
        } else {
            int i = shzVarA.a;
            if (i == 2 || i == 3) {
                this.j = shzVarA;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + Integer.toString(i - 1) + " is not one of the process-level expected values: " + Integer.toString(1) + " or " + Integer.toString(2));
                this.j = null;
            }
        }
        this.k = shxVar != null ? shxVar.b() : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        abnrVar.t();
        acam acamVar = (acam) abnrVar.b;
        acamVar.b |= 1;
        acamVar.c = jCurrentTimeMillis;
        long j = ((acam) abnrVar.b).c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        abnrVar.t();
        acam acamVar2 = (acam) abnrVar.b;
        acamVar2.b |= 131072;
        acamVar2.g = TimeZone.getDefault().getOffset(j) / 1000;
        if (!tmz.e(shvVar.f)) {
            abnrVar.t();
            acam acamVar3 = (acam) abnrVar.b;
            acamVar3.b |= 8388608;
            acamVar3.h = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            abnrVar.t();
            acam acamVar4 = (acam) abnrVar.b;
            acamVar4.b |= 2;
            acamVar4.d = jElapsedRealtime;
        }
        this.m = abowVar;
    }

    public final void a(shz shzVar) {
        abnr abnrVar = this.p;
        acan acanVar = ((acam) abnrVar.b).l;
        if (acanVar == null) {
            acanVar = acan.a;
        }
        abnr abnrVar2 = (abnr) acanVar.K();
        int i = shzVar.a;
        abnrVar2.t();
        acan acanVar2 = (acan) abnrVar2.b;
        acanVar2.d = i - 1;
        acanVar2.b |= 2;
        abue abueVar = acanVar2.c;
        if (abueVar == null) {
            abueVar = abue.a;
        }
        abnp abnpVarK = abueVar.K();
        abud abudVar = ((abue) abnpVarK.b).c;
        if (abudVar == null) {
            abudVar = abud.a;
        }
        abnp abnpVarK2 = abudVar.K();
        abnpVarK2.t();
        abud abudVar2 = (abud) abnpVarK2.b;
        abudVar2.b |= 1;
        abudVar2.c = 79508299;
        abnpVarK.t();
        abue abueVar2 = (abue) abnpVarK.b;
        abud abudVar3 = (abud) abnpVarK2.q();
        abudVar3.getClass();
        abueVar2.c = abudVar3;
        abueVar2.b |= 1;
        abnrVar2.t();
        acan acanVar3 = (acan) abnrVar2.b;
        abue abueVar3 = (abue) abnpVarK.q();
        abueVar3.getClass();
        acanVar3.c = abueVar3;
        acanVar3.b |= 1;
        acan acanVar4 = (acan) abnrVar2.q();
        abnrVar.t();
        acam acamVar = (acam) abnrVar.b;
        acanVar4.getClass();
        acamVar.l = acanVar4;
        acamVar.b |= 268435456;
    }

    public final svz b() {
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.b = true;
        shv shvVar = (shv) this.a;
        shw shwVar = shvVar.g;
        shs shsVar = shvVar.p;
        return shsVar != null ? sjc.d(this, new pgv(shwVar, shsVar, 4, null)) : sjc.d(this, new kpf(shwVar, 6));
    }

    @Deprecated
    public final void c(tmu tmuVar) {
        if (adcl.a.gu().a(((shv) this.a).f)) {
            return;
        }
        this.n = tmuVar;
    }

    public final int d() {
        int i = this.o;
        return i != 0 ? i : this.a.k;
    }

    public final void e(int[] iArr) {
        if (this.a.c()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        for (int i : iArr) {
            this.e.add(Integer.valueOf(i));
        }
    }

    public final void f(String str) {
        if (this.a.c()) {
            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.d = arrayList;
        }
        arrayList.add(str);
    }

    public final void g(int i) {
        abnr abnrVar = this.p;
        abnrVar.t();
        acam acamVar = (acam) abnrVar.b;
        acam acamVar2 = acam.a;
        acamVar.b |= 32;
        acamVar.e = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.h);
        sb.append(", logSourceName: ");
        sb.append(this.i);
        sb.append(", qosTier: ");
        sb.append(d() - 1);
        sb.append(", veMessage: null, testCodes: ");
        ArrayList arrayList = this.c;
        sb.append(arrayList != null ? shq.a(arrayList) : null);
        sb.append(", mendelPackages: ");
        ArrayList arrayList2 = this.d;
        sb.append(arrayList2 != null ? shq.a(arrayList2) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList3 = this.e;
        sb.append(arrayList3 != null ? shq.a(arrayList3) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList4 = this.f;
        sb.append(arrayList4 != null ? shq.a(arrayList4) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
