package G6;

import U8.v0;
import Va.Ab;
import Va.AbstractC1117qb;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import org.json.JSONObject;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class Q extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4559a;

    public /* synthetic */ Q(int i5) {
        this.f4559a = i5;
    }

    private final void a(Context context, Intent intent) {
        synchronized (H6.i.f4948b) {
            H6.i.f4949c = false;
            H6.i.f4950d = false;
            H6.l.f("Ad debug logging enablement is out of date.");
        }
        v0.q0(context);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra;
        int intExtra2;
        int intExtra3 = -1;
        switch (this.f4559a) {
            case 0:
                a(context, intent);
                return;
            case 1:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra4 = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra4 == 0) {
                        AbstractC3772b.f43265c = 1;
                        return;
                    } else {
                        if (intExtra4 == 1) {
                            AbstractC3772b.f43265c = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                JSONObject jSONObject = AbstractC1117qb.f14541a;
                JSONObject jSONObject2 = new JSONObject();
                if (intent != null) {
                    int i5 = AbstractC1117qb.f14545e + 23;
                    AbstractC1117qb.f14544d = i5 % 128;
                    try {
                        if (i5 % 2 != 0) {
                            if (intent.hasExtra(AbstractC1117qb.j("\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{183, 7, 0, 1}, false).intern())) {
                            }
                        } else {
                            intExtra = intent.hasExtra(AbstractC1117qb.j("\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{183, 7, 0, 1}, true).intern()) ? intent.getIntExtra(AbstractC1117qb.j("\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{183, 7, 0, 1}, true).intern(), -1) : -1;
                        }
                        jSONObject2.put(AbstractC1117qb.j("\u0001\u0000\u0000\u0000", new int[]{190, 4, 197, 0}, false).intern(), intExtra);
                        if (intent.hasExtra(AbstractC1117qb.j("\u0001\u0001\u0001\u0001\u0001", new int[]{194, 5, 175, 0}, false).intern())) {
                            int i10 = AbstractC1117qb.f14545e + 9;
                            AbstractC1117qb.f14544d = i10 % 128;
                            intExtra2 = intent.getIntExtra(i10 % 2 != 0 ? AbstractC1117qb.j("\u0001\u0001\u0001\u0001\u0001", new int[]{194, 5, 175, 0}, true).intern() : AbstractC1117qb.j("\u0001\u0001\u0001\u0001\u0001", new int[]{194, 5, 175, 0}, false).intern(), -1);
                        } else {
                            intExtra2 = -1;
                        }
                        if (intent.hasExtra(AbstractC1117qb.f(((byte) KeyEvent.getModifierMetaStateMask()) + 6, "폜㷖鼒㤗柃퐱").intern())) {
                            int i11 = AbstractC1117qb.f14545e + 55;
                            AbstractC1117qb.f14544d = i11 % 128;
                            intExtra3 = intent.getIntExtra(i11 % 2 != 0 ? AbstractC1117qb.f(5 >>> (ViewConfiguration.getTouchSlop() << 39), "폜㷖鼒㤗柃퐱").intern() : AbstractC1117qb.f((ViewConfiguration.getTouchSlop() >> 8) + 5, "폜㷖鼒㤗柃퐱").intern(), -1);
                            AbstractC1117qb.f14544d = (AbstractC1117qb.f14545e + 95) % 128;
                        }
                        jSONObject2.put(AbstractC1117qb.f(Color.blue(0) + 4, "㚻鰱푡澐").intern(), Math.round((intExtra2 * 100.0f) / intExtra3));
                    } catch (Throwable th) {
                        String strIntern = AbstractC1117qb.j("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(AbstractC1117qb.f(Color.rgb(0, 0, 0) + 16777253, "Ꞧ\uf206\uf111鞎崪嚠\ueb07縻\u001b扦乔兇⋨䒐崊釆＼斲ɨ\uedae泩痧ੌﮑ뮹觕·᧙╮Ẕ볼쎌餤\uda21居㨠ꇀ\ue76d").intern());
                        sb2.append(th.getLocalizedMessage());
                        Ab.x(strIntern, sb2.toString());
                    }
                }
                synchronized (AbstractC1117qb.class) {
                    try {
                        int i12 = AbstractC1117qb.f14545e;
                        AbstractC1117qb.f14542b = jSONObject2;
                        int i13 = i12 + 67;
                        AbstractC1117qb.f14544d = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 81 / 0;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
