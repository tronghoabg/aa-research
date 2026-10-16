package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class khb {
    public final java.lang.Object a;

    public khb(long[] jArr) {
        defpackage.zu zuVar;
        if (jArr != null) {
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, jArr.length);
            int length = jArrCopyOf.length;
            zuVar = new defpackage.zu(length);
            int i = zuVar.b;
            jArrCopyOf.getClass();
            if (i < 0) {
                defpackage.ca.aa("");
            }
            if (length != 0) {
                zuVar.a(zuVar.b + length);
                long[] jArr2 = zuVar.a;
                int i2 = zuVar.b;
                if (i != i2) {
                    defpackage.afga.cj(jArr2, jArr2, i + length, i, i2);
                }
                defpackage.afga.cj(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                zuVar.b += length;
            }
        } else {
            zuVar = new defpackage.zu(16);
        }
        this.a = zuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.kha a(com.google.android.apps.auto.components.calendar.model.CalendarReminder calendarReminder) {
        defpackage.ygw ygwVarB = b(calendarReminder);
        if (ygwVarB.isEmpty()) {
            return null;
        }
        return (defpackage.kha) ygwVarB.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    public static defpackage.ygw b(com.google.android.apps.auto.components.calendar.model.CalendarReminder calendarReminder) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        defpackage.yqm yqmVar = defpackage.kgx.a;
        java.lang.String strH = calendarReminder.h();
        if (strH.isEmpty()) {
            ((defpackage.yqj) defpackage.kgx.a.l().ai((char) 3074)).u("Empty location");
        } else {
            java.util.regex.Matcher matcher = defpackage.dzq.c.matcher(strH);
            if (matcher.find()) {
                int iStart = matcher.start();
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kgx.a.f()).ai((char) 3073)).w("Found URL in location at position %d", iStart);
                if (iStart != 0) {
                    ygrVar.i(defpackage.kha.b);
                }
            } else {
                ygrVar.i(defpackage.kha.b);
            }
        }
        if (calendarReminder.g().size() > 1) {
            ygrVar.i(defpackage.kha.d);
        } else if (!calendarReminder.g().isEmpty()) {
            ygrVar.i(defpackage.kha.c);
        }
        return ygrVar.g();
    }

    public final boolean c(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
        return ((android.bluetooth.BluetoothA2dp) this.a).setConnectionPolicy(bluetoothDevice, i);
    }

    public final boolean d() {
        java.lang.Object obj = ((defpackage.abpu) this.a).b;
        if (obj == null) {
            return true;
        }
        ((java.lang.Boolean) obj).booleanValue();
        return false;
    }

    public final void e() {
        java.lang.Object obj = ((defpackage.abpu) this.a).a;
        if (obj != null) {
            ((java.lang.Boolean) obj).booleanValue();
        }
    }

    public final int f() {
        return ((java.util.concurrent.atomic.AtomicInteger) this.a).get();
    }

    public final void g() {
        ((java.util.concurrent.atomic.AtomicInteger) this.a).incrementAndGet();
    }

    public final boolean h() {
        return !k();
    }

    public final void i() {
        ((defpackage.cbi) this.a).a();
    }

    public final void j() {
        ((defpackage.cbi) this.a).b(defpackage.cac.a);
    }

    public final boolean k() {
        return ((defpackage.cbi) this.a).c();
    }

    public final void l(defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        ((defpackage.cbi) this.a).e(buqVar, bzpVar, cdgVar, cbeVar);
    }

    public khb(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public khb(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new defpackage.cbi();
    }

    public khb(char[] cArr) {
        this.a = "tiktok_systrace";
    }

    public khb(byte[] bArr) {
        this.a = new defpackage.yfd(300);
    }

    public khb(java.lang.Object obj) {
        this.a = obj;
    }

    public khb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new java.util.concurrent.atomic.AtomicInteger();
    }

    public khb(byte[] bArr, byte[] bArr2) {
        this.a = (defpackage.wez) defpackage.ysr.bz(null, defpackage.wez.a);
    }

    public khb(byte[] bArr, char[] cArr) {
        this.a = new java.util.LinkedHashMap();
    }

    public khb(short[] sArr) {
        this.a = new defpackage.cjm();
    }

    public khb() {
        this.a = new java.util.ArrayList();
    }
}
