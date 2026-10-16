package defpackage;

/* loaded from: classes2.dex */
public final class kkk {
    private static final yph a = yph.c("GH.OverlayActionHelper");

    public static final void a() {
        Integer num = (Integer) kkq.a.a().e();
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue != 1) {
            a.l().w("Overlay is not dismissable: %s", iIntValue);
        } else if (!b()) {
            ((ype) a.h()).u("ACTION_DISMISS_OVERLAY is not supported by the car");
        } else {
            ((ype) a.f()).u("Dismissing overlay");
            kjq.a.a().l(5);
        }
    }

    public static final boolean b() {
        return kjq.a.a().n(5);
    }
}
