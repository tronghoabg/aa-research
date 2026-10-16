package defpackage;

import android.content.Intent;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.IntentResult;
import com.google.android.gearhead.sdk.assistant.VoiceSessionResult;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lai {
    public final long a;
    public final List b = new ArrayList();
    public ywk c;
    public VoiceSessionResult d;
    public final int e;
    public final int f;
    private final int g;
    private final ClientStateSnapshot h;
    private boolean i;

    public lai(int i, int i2, int i3, ClientStateSnapshot clientStateSnapshot, long j) {
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
        oit.a();
        return Instant.now().toEpochMilli() - j;
    }

    public final void b() {
        int i;
        String str;
        String action;
        IntentResult intentResult;
        woy.aa(!this.i, "Already logged voice session state");
        this.i = true;
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        VoiceSessionResult voiceSessionResult = this.d;
        if (voiceSessionResult == null || (intentResult = voiceSessionResult.b) == null) {
            i = 0;
            str = null;
            action = null;
        } else {
            Intent intent = intentResult.b;
            int iL = kzd.l(intent);
            String str2 = intent.getPackage();
            action = intent.getAction();
            i = iL;
            str = str2;
        }
        ebf.j().u(this.e, this.f, Long.valueOf(a()), i, str, action, this.c, this.h, this.g, yfq.o(list));
    }

    public final void c(int i, Integer num) {
        abnp abnpVarN = ywh.a.n();
        abnpVarN.t();
        ywh ywhVar = (ywh) abnpVarN.b;
        ywhVar.b |= 2;
        int i2 = i - 1;
        ywhVar.d = i2;
        long jA = a();
        abnpVarN.t();
        ywh ywhVar2 = (ywh) abnpVarN.b;
        ywhVar2.b |= 1;
        ywhVar2.c = jA;
        if (num != null) {
            if (i2 == 16) {
                int iIntValue = num.intValue();
                abnpVarN.t();
                ywh ywhVar3 = (ywh) abnpVarN.b;
                ywhVar3.b |= 4;
                ywhVar3.e = iIntValue;
            } else if (i2 == 18) {
                int iIntValue2 = num.intValue();
                abnpVarN.t();
                ywh ywhVar4 = (ywh) abnpVarN.b;
                ywhVar4.b |= 8;
                ywhVar4.f = iIntValue2;
            }
        }
        this.b.add((ywh) abnpVarN.q());
    }
}
