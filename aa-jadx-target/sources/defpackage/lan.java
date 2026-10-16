package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lan {
    public final long a;
    public final java.util.List b = new java.util.ArrayList();
    public defpackage.yxp c;
    public com.google.android.gearhead.sdk.assistant.VoiceSessionResult d;
    public final int e;
    public final int f;
    private final int g;
    private final com.google.android.gearhead.sdk.assistant.ClientStateSnapshot h;
    private boolean i;

    public lan(int i, int i2, int i3, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot clientStateSnapshot, long j) {
        this.g = i;
        this.e = i2;
        this.f = i3;
        this.h = clientStateSnapshot;
        this.a = j;
    }

    public final long a() {
        long j = this.a;
        if (j == 0) {
            return 0L;
        }
        defpackage.ojm.a();
        return j$.time.Instant.now().toEpochMilli() - j;
    }

    public final void b() {
        int i;
        java.lang.String str;
        java.lang.String action;
        com.google.android.gearhead.sdk.assistant.IntentResult intentResult;
        defpackage.ysr.bk(!this.i, "Already logged voice session state");
        this.i = true;
        java.util.List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        com.google.android.gearhead.sdk.assistant.VoiceSessionResult voiceSessionResult = this.d;
        if (voiceSessionResult == null || (intentResult = voiceSessionResult.b) == null) {
            i = 0;
            str = null;
            action = null;
        } else {
            android.content.Intent intent = intentResult.b;
            int iT = defpackage.jzb.t(intent);
            java.lang.String str2 = intent.getPackage();
            action = intent.getAction();
            i = iT;
            str = str2;
        }
        defpackage.omf.u().u(this.e, this.f, java.lang.Long.valueOf(a()), i, str, action, this.c, this.h, this.g, defpackage.ygw.o(list));
    }

    public final void c(int i, java.lang.Integer num) {
        defpackage.abor aborVarN = defpackage.yxm.a.n();
        aborVarN.t();
        defpackage.yxm yxmVar = (defpackage.yxm) aborVarN.b;
        yxmVar.b |= 2;
        int i2 = i - 1;
        yxmVar.d = i2;
        long jA = a();
        aborVarN.t();
        defpackage.yxm yxmVar2 = (defpackage.yxm) aborVarN.b;
        yxmVar2.b |= 1;
        yxmVar2.c = jA;
        if (num != null) {
            if (i2 == 16) {
                int iIntValue = num.intValue();
                aborVarN.t();
                defpackage.yxm yxmVar3 = (defpackage.yxm) aborVarN.b;
                yxmVar3.b |= 4;
                yxmVar3.e = iIntValue;
            } else if (i2 == 18) {
                int iIntValue2 = num.intValue();
                aborVarN.t();
                defpackage.yxm yxmVar4 = (defpackage.yxm) aborVarN.b;
                yxmVar4.b |= 8;
                yxmVar4.f = iIntValue2;
            }
        }
        this.b.add((defpackage.yxm) aborVarN.q());
    }
}
