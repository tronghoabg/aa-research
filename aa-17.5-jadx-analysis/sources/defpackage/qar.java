package defpackage;

import android.content.SharedPreferences;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class qar {
    public final SharedPreferences a;
    public String e;
    public final sm g;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public final List d = new ArrayList();
    public String f = "";

    public qar(SharedPreferences sharedPreferences, sm smVar) {
        this.a = sharedPreferences;
        this.g = smVar;
    }

    public static String b() {
        Random random = new Random();
        Instant instantNow = Instant.now();
        int i = zeo.a;
        long jA = instantNow.getEpochSecond() < -9223372036854L ? a.A(zeb.h(instantNow.getEpochSecond() + 1), (instantNow.getNano() / 1000) - 1000000) : a.A(zeb.h(instantNow.getEpochSecond()), instantNow.getNano() / 1000);
        abnp abnpVarN = zbq.a.n();
        abnpVarN.t();
        zbq zbqVar = (zbq) abnpVarN.b;
        zbqVar.b |= 1;
        zbqVar.c = jA;
        int iNextInt = random.nextInt(16777216) - 536870912;
        abnpVarN.t();
        zbq zbqVar2 = (zbq) abnpVarN.b;
        zbqVar2.b |= 2;
        zbqVar2.d = iNextInt;
        int iNextInt2 = random.nextInt();
        abnpVarN.t();
        zbq zbqVar3 = (zbq) abnpVarN.b;
        zbqVar3.b |= 4;
        zbqVar3.e = iNextInt2;
        return qaf.d((zbq) abnpVarN.q());
    }

    public final int a() {
        return this.c.getAndIncrement();
    }

    public final synchronized void c() {
        this.a.edit().putInt("sequenceId", this.c.get()).putInt("activationId", this.b.get()).putString("previousClientEventId", this.e).putString("baseEventId", this.f).apply();
    }
}
