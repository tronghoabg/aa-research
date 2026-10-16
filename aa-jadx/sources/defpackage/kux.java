package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kux implements defpackage.afer {
    public final /* synthetic */ android.content.Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ kux(android.content.Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        switch (this.b) {
            case 0:
                defpackage.jzb.i(this.a, "Incoming Call Notification");
                break;
            case 1:
                defpackage.jzb.i(this.a, "Single Action Notification");
                break;
            case 2:
                defpackage.jzb.i(this.a, "Simple Inline Notification with Message Count over 9");
                break;
            case 3:
                defpackage.jzb.l(this.a, "Action clicked");
                break;
            case 4:
                defpackage.jzb.i(this.a, "Simple Inline Notification with Icon in Subtitle");
                break;
            case 5:
                defpackage.jzb.i(this.a, "Simple Inline Notification with Badged Icon");
                break;
            case 6:
                defpackage.jzb.i(this.a, "Simple Inline Notification no Subtitle");
                break;
            case 7:
                defpackage.jzb.i(this.a, "Message Notification");
                break;
            case 8:
                defpackage.jzb.i(this.a, "Simple Inline Notification no Icon");
                break;
            case 9:
                defpackage.jzb.i(this.a, "Simple Inline Work Profile Notification");
                break;
            case 10:
                defpackage.jzb.i(this.a, "Simple Inline Notification");
                break;
            case 11:
                defpackage.jzb.l(this.a, "Filled icon button clicked");
                break;
            case 12:
                defpackage.jzb.l(this.a, "Filled button with icon clicked");
                break;
            case 13:
                defpackage.jzb.l(this.a, "Filled button clicked");
                break;
            case 14:
                defpackage.jzb.l(this.a, "Colored icon button clicked");
                break;
            case 15:
                defpackage.jzb.l(this.a, "Colored button with icon clicked");
                break;
            case 16:
                defpackage.jzb.l(this.a, "Colored button clicked");
                break;
            case 17:
                defpackage.jzb.l(this.a, "Icon button clicked");
                break;
            case 18:
                defpackage.jzb.l(this.a, "Outlined icon button clicked");
                break;
            case 19:
                defpackage.jzb.l(this.a, "Outlined button with icon clicked");
                break;
            default:
                defpackage.jzb.l(this.a, "Outlined button clicked");
                break;
        }
        return defpackage.afbk.a;
    }
}
