package defpackage;

import android.os.SystemClock;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class lgx {
    public final Object a;

    public lgx(byte[] bArr) {
        List listU;
        int i = 0;
        if (spu.c()) {
            listU = yfq.u(new mhj(), new mhl(), new mhm(), new mhi(), new mhk());
        } else {
            mhl mhlVar = new mhl();
            int i2 = yfq.d;
            Object[] objArr = {mhlVar};
            yrm.B(objArr, 1);
            listU = new yls(objArr, 1);
        }
        HashSet hashSet = new HashSet();
        int i3 = ((yls) listU).c;
        while (i < i3) {
            mhf mhfVar = (mhf) listU.get(i);
            mhfVar.a();
            i++;
            if (!hashSet.add(Integer.valueOf(mhfVar.a()))) {
                throw new IllegalArgumentException("Duplicate requirementId: " + mhfVar.a());
            }
        }
        this.a = listU;
    }

    public static lgx b() {
        return (lgx) mki.a.i(lgx.class);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final eqj a(mpz mpzVar) {
        ?? r3 = this.a;
        if (!r3.containsKey(mpzVar)) {
            r3.put(mpzVar, eqy.c(tby.t(kiu.a()), new daz(mpzVar, 18)));
        }
        return (eqj) r3.get(mpzVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @ResultIgnorabilityUnspecified
    public final mhf c(int i) {
        mhf mhfVar;
        int i2 = 0;
        do {
            ?? r1 = this.a;
            if (i2 >= ((yls) r1).c) {
                throw new IllegalArgumentException(a.bp(i, "Invalid requirementId: "));
            }
            mhfVar = (mhf) r1.get(i2);
            i2++;
        } while (mhfVar.a() != i);
        return mhfVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final boolean d() {
        int i = 0;
        while (true) {
            ?? r2 = this.a;
            if (i >= ((yls) r2).c) {
                return false;
            }
            mhf mhfVar = (mhf) r2.get(i);
            if (mhfVar.a() != 5 && mhfVar.d() && !mhfVar.e()) {
                return true;
            }
            i++;
        }
    }

    public final void e() {
        ((AtomicLong) this.a).set(Long.MIN_VALUE);
    }

    public final boolean f() {
        AtomicLong atomicLong;
        long j;
        long j2;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        do {
            atomicLong = (AtomicLong) this.a;
            j = atomicLong.get();
            j2 = 5000000000L + j < jElapsedRealtimeNanos ? jElapsedRealtimeNanos : j;
        } while (!atomicLong.compareAndSet(j, j2));
        return j2 == jElapsedRealtimeNanos;
    }

    public final void g(int i, Integer num, Integer num2, int i2, Integer num3) {
        abnp abnpVarN = yxb.a.n();
        abnp abnpVarN2 = zad.a.n();
        abnpVarN2.t();
        zad zadVar = (zad) abnpVarN2.b;
        zadVar.b |= 1;
        zadVar.c = i;
        if (num != null) {
            int iIntValue = num.intValue();
            abnpVarN2.t();
            zad zadVar2 = (zad) abnpVarN2.b;
            zadVar2.b |= 2;
            zadVar2.d = iIntValue;
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            abnpVarN2.t();
            zad zadVar3 = (zad) abnpVarN2.b;
            zadVar3.b |= 4;
            zadVar3.e = iIntValue2;
        }
        if (i2 != 0) {
            abnpVarN2.t();
            zad zadVar4 = (zad) abnpVarN2.b;
            zadVar4.b |= 8;
            zadVar4.f = i2 - 1;
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            abnpVarN2.t();
            zad zadVar5 = (zad) abnpVarN2.b;
            zadVar5.b |= 16;
            zadVar5.g = iIntValue3;
        }
        Object obj = this.a;
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        zad zadVar6 = (zad) abnpVarN2.q();
        zadVar6.getClass();
        yxbVar.H = zadVar6;
        yxbVar.c |= 64;
        yxc yxcVar = yxc.WIFI_SOCKET_CONNECT;
        int i3 = yfq.d;
        ((sak) obj).f(abnpVarN, yxcVar, yls.a);
    }

    public lgx() {
        this.a = new EnumMap(mpz.class);
    }

    public lgx(char[] cArr) {
        this.a = new AtomicLong(Long.MIN_VALUE);
    }

    public lgx(sak sakVar) {
        this.a = sakVar;
    }
}
