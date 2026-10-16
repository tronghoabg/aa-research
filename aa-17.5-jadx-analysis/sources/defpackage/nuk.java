package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class nuk {
    public final GhIcon a;
    public final String b;
    public final String c;
    public final nul d;

    public nuk(uie uieVar) {
        this.a = (GhIcon) uieVar.c;
        this.b = (String) uieVar.d;
        this.c = (String) uieVar.a;
        this.d = (nul) uieVar.b;
    }

    public final String toString() {
        xxg xxgVar = new xxg("OngoingNotificationAlertTemplate");
        xxgVar.b("icon", this.a);
        xxgVar.b("titleText", this.b);
        xxgVar.b("contentText", this.c);
        xxgVar.b("action", this.d);
        xxgVar.b("autoDismissDuration", null);
        return xxgVar.toString();
    }
}
