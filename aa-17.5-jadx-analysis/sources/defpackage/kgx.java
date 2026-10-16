package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.auto.components.calendar.model.CalendarReminder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class kgx {
    public final Object a;

    public kgx(long[] jArr) {
        zn znVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            int length = jArrCopyOf.length;
            znVar = new zn(length);
            int i = znVar.b;
            jArrCopyOf.getClass();
            if (i < 0) {
                ca.aa("");
            }
            if (length != 0) {
                znVar.a(znVar.b + length);
                long[] jArr2 = znVar.a;
                int i2 = znVar.b;
                if (i != i2) {
                    woy.dp(jArr2, jArr2, i + length, i, i2);
                }
                woy.dp(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                znVar.b += length;
            }
        } else {
            znVar = new zn(16);
        }
        this.a = znVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kgw a(CalendarReminder calendarReminder) {
        yfq yfqVarB = b(calendarReminder);
        if (yfqVarB.isEmpty()) {
            return null;
        }
        return (kgw) yfqVarB.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yfq b(com.google.android.apps.auto.components.calendar.model.CalendarReminder r5) {
        /*
            int r0 = defpackage.yfq.d
            yfl r0 = new yfl
            r1 = 4
            r0.<init>(r1)
            yph r1 = defpackage.kgt.a
            mki r1 = defpackage.mki.a
            jqw r2 = new jqw
            r3 = 9
            r2.<init>(r3)
            java.lang.Class<kgt> r3 = defpackage.kgt.class
            java.lang.Object r1 = r1.b(r3, r2)
            kgt r1 = (defpackage.kgt) r1
            java.lang.String r1 = r5.h()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L2f
            r1 = 3071(0xbff, float:4.303E-42)
            yph r2 = defpackage.kgt.a
            java.lang.String r3 = "Empty location"
            defpackage.a.bu(r3, r1, r2)
            goto L53
        L2f:
            java.util.regex.Pattern r2 = defpackage.dzj.c
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.find()
            if (r2 == 0) goto L4e
            int r1 = r1.start()
            yph r2 = defpackage.kgt.a
            yop r2 = r2.f()
            java.lang.String r3 = "Found URL in location at position %d"
            r4 = 3070(0xbfe, float:4.302E-42)
            defpackage.a.bO(r2, r3, r1, r4)
            if (r1 == 0) goto L53
        L4e:
            kgw r1 = defpackage.kgw.b
            r0.i(r1)
        L53:
            yfq r1 = r5.g()
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L64
            kgw r5 = defpackage.kgw.d
            r0.i(r5)
            goto L73
        L64:
            yfq r5 = r5.g()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L73
            kgw r5 = defpackage.kgw.c
            r0.i(r5)
        L73:
            yfq r5 = r0.g()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgx.b(com.google.android.apps.auto.components.calendar.model.CalendarReminder):yfq");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void c(rrc rrcVar, int i) {
        int iIntValue = 0;
        woy.O(i >= 0, "negative addedCount is forbidden for batched events");
        woy.O(true ^ rrcVar.x.f(), "eventCount field is forbidden for batched events");
        if (i == 0) {
            return;
        }
        ?? r4 = this.a;
        synchronized (r4) {
            Integer num = (Integer) r4.get(rrcVar);
            if (num != null) {
                iIntValue = num.intValue();
            }
            r4.put(rrcVar, Integer.valueOf(iIntValue + i));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void d(jfg jfgVar) {
        ?? r4 = this.a;
        synchronized (r4) {
            for (Map.Entry entry : r4.entrySet()) {
                rrb rrbVar = new rrb((rrc) entry.getKey());
                rrbVar.w(((Integer) entry.getValue()).intValue());
                jfgVar.b(rrbVar.l());
            }
            r4.clear();
        }
    }

    public final boolean e(BluetoothDevice bluetoothDevice, int i) {
        return ((BluetoothA2dp) this.a).setConnectionPolicy(bluetoothDevice, i);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, qzv] */
    public final void f(boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("projection_authorized", z);
            this.a.e(1, bundle);
        } catch (RemoteException e) {
            rrd.d(5, "CAR.CLIENT.PLS", e, "Exception while invoking callback!", new Object[0]);
        }
    }

    public final boolean g() {
        Object obj = ((abos) this.a).b;
        if (obj == null) {
            return true;
        }
        ((Boolean) obj).booleanValue();
        return false;
    }

    public final void h() {
        Object obj = ((abos) this.a).a;
        if (obj != null) {
            ((Boolean) obj).booleanValue();
        }
    }

    public final int i() {
        return ((AtomicInteger) this.a).get();
    }

    public final void j() {
        ((AtomicInteger) this.a).incrementAndGet();
    }

    public final void k(wcm wcmVar) {
        wcmVar.a((wcq) this.a);
    }

    public final boolean l() {
        return !o();
    }

    public final void m() {
        ((cbc) this.a).a();
    }

    public final void n() {
        ((cbc) this.a).b(bzw.a);
    }

    public final boolean o() {
        return ((cbc) this.a).c();
    }

    public final void p(buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        ((cbc) this.a).e(bujVar, bzjVar, cdaVar, cayVar);
    }

    public kgx(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public kgx(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new cbc();
    }

    public kgx(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicInteger();
    }

    public kgx(Object obj) {
        this.a = obj;
    }

    public kgx(byte[] bArr) {
        this.a = (web) woy.ap(null, web.a);
    }

    public kgx(byte[] bArr, char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public kgx(char[] cArr) {
        this.a = new cje();
    }

    public kgx() {
        this.a = new yw();
    }
}
