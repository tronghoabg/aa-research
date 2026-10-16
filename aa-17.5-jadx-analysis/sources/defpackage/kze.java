package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class kze implements Runnable {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ kze(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            int i2 = kzf.a;
            lah.a().h(19, Integer.valueOf(this.a));
            return;
        }
        if (i == 1) {
            int i3 = this.a;
            Map map = fvx.a;
            Integer numValueOf = Integer.valueOf(i3);
            map.remove(numValueOf);
            Runnable runnable = (Runnable) fvx.c.remove(numValueOf);
            if (runnable != null) {
                fvx.b.removeCallbacks(runnable);
                return;
            }
            return;
        }
        if (i == 2) {
            int i4 = kzf.a;
            lah.a().h(16, Integer.valueOf(this.a));
        } else {
            if (i == 3) {
                mtr.a.a().c(this.a);
                return;
            }
            switch (this.a) {
                case 10:
                    kfl.g().d(yxi.WIRELESS_BT_RECEIVER_CREDENTIALS_REMOVED_ON_LOST_BONDING_AFTER_ACL);
                    return;
                case 11:
                case 12:
                    kfl.g().d(yxi.WIRELESS_BT_RECEIVER_CREDENTIALS_REMOVED_ON_REBONDING);
                    return;
                default:
                    throw new AssertionError("Invalid bond state value.");
            }
        }
    }
}
