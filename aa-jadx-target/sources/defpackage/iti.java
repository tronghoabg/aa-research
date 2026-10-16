package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iti implements defpackage.itg {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO");
    public final android.telephony.TelephonyManager b;
    public final defpackage.itf c;
    public volatile boolean d;
    public final android.telephony.PhoneStateListener e = new defpackage.ith(this);
    private final android.media.AudioManager f;

    public iti(android.media.AudioManager audioManager, android.telephony.TelephonyManager telephonyManager, defpackage.itf itfVar) {
        this.f = audioManager;
        this.b = telephonyManager;
        this.c = itfVar;
        this.d = c() != 0;
    }

    @Override // defpackage.itg
    public final boolean a() {
        int mode = this.f.getMode();
        return mode == 2 || mode == 1;
    }

    @Override // defpackage.itg
    public final boolean b() {
        return c() != 0 || this.d || a();
    }

    public final int c() {
        return this.b.getCallState();
    }
}
