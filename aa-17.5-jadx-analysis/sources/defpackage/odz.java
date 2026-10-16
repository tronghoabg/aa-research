package defpackage;

import com.google.android.apps.auto.components.apphost.telecom.dialpad.RotaryDialpadView;
import com.google.android.apps.auto.sdk.ui.MaxWidthLayout;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final class odz implements moh {
    final /* synthetic */ MaxWidthLayout a;
    private final /* synthetic */ int b;

    public odz(MaxWidthLayout maxWidthLayout, int i) {
        this.b = i;
        this.a = maxWidthLayout;
    }

    @Override // defpackage.moh
    public final void a() {
        if (this.b != 0) {
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.Z).l());
        } else {
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.Z).l());
        }
    }

    @Override // defpackage.moh
    public final void b(String str) {
        if (this.b != 0) {
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.al).l());
            RotaryDialpadView rotaryDialpadView = (RotaryDialpadView) this.a;
            rotaryDialpadView.c.append(str);
            rotaryDialpadView.a();
            return;
        }
        ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.al).l());
        com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView rotaryDialpadView2 = (com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) this.a;
        rotaryDialpadView2.c.append(str);
        rotaryDialpadView2.a();
    }

    @Override // defpackage.moh
    public final void c() {
        int i = this.b;
        MaxWidthLayout maxWidthLayout = this.a;
        if (i != 0) {
            RotaryDialpadView rotaryDialpadView = (RotaryDialpadView) maxWidthLayout;
            StringBuilder sb = rotaryDialpadView.c;
            if (sb.length() != 0) {
                ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.O).l());
                sb.deleteCharAt(sb.length() - 1);
                rotaryDialpadView.a();
                return;
            }
            return;
        }
        com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView rotaryDialpadView2 = (com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) maxWidthLayout;
        StringBuilder sb2 = rotaryDialpadView2.c;
        if (sb2.length() != 0) {
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.O).l());
            sb2.deleteCharAt(sb2.length() - 1);
            rotaryDialpadView2.a();
        }
    }

    @Override // defpackage.moh
    public final void d(char c) {
        if (this.b != 0) {
            if (c != 5) {
                RotaryDialpadView rotaryDialpadView = (RotaryDialpadView) this.a;
                if (rotaryDialpadView.e == 0) {
                    ebf.A().r(c);
                    synchronized (rotaryDialpadView.d) {
                        ((ype) ((ype) RotaryDialpadView.a.h()).ai(2878)).y("playTone: toneGenerator == null, tone: %d", (Integer) RotaryDialpadView.b.get(Character.valueOf(c)));
                    }
                }
            }
            MaxWidthLayout maxWidthLayout = this.a;
            oit.a();
            ((RotaryDialpadView) maxWidthLayout).e = Instant.now().toEpochMilli();
            return;
        }
        if (c != 5) {
            com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView rotaryDialpadView2 = (com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) this.a;
            if (rotaryDialpadView2.e == 0) {
                ebf.A().r(c);
                synchronized (rotaryDialpadView2.d) {
                    ((ype) ((ype) com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView.a.h()).ai(5591)).y("playTone: toneGenerator == null, tone: %d", (Integer) com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView.b.get(Character.valueOf(c)));
                }
            }
        }
        MaxWidthLayout maxWidthLayout2 = this.a;
        oit.a();
        ((com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) maxWidthLayout2).e = Instant.now().toEpochMilli();
    }

    @Override // defpackage.moh
    public final void e(char c) {
        if (this.b == 0) {
            if (c == 5) {
                ((com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) this.a).b();
            }
            MaxWidthLayout maxWidthLayout = this.a;
            ebf.A().v();
            synchronized (((com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) maxWidthLayout).d) {
                ((ype) ((ype) com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView.a.h()).ai(5592)).u("stopTone: toneGenerator == null");
            }
            ((com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) this.a).e = 0L;
            return;
        }
        if (c == 5) {
            ((RotaryDialpadView) this.a).e();
        }
        MaxWidthLayout maxWidthLayout2 = this.a;
        ebf.A().v();
        RotaryDialpadView rotaryDialpadView = (RotaryDialpadView) maxWidthLayout2;
        synchronized (rotaryDialpadView.d) {
            ((ype) ((ype) RotaryDialpadView.a.h()).ai(2881)).u("stopTone: toneGenerator == null");
        }
        rotaryDialpadView.e = 0L;
    }
}
