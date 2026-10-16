package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class kuq implements afdr {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ kuq(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.b) {
            case 0:
                fww.E(this.a, "Simple Inline Notification with Icon in Subtitle");
                break;
            case 1:
                fww.H(this.a, "Action clicked");
                break;
            case 2:
                fww.E(this.a, "Simple Inline Notification with Badged Icon");
                break;
            case 3:
                fww.E(this.a, "Simple Inline Notification no Subtitle");
                break;
            case 4:
                fww.E(this.a, "Message Notification");
                break;
            case 5:
                fww.E(this.a, "Simple Inline Notification no Icon");
                break;
            case 6:
                fww.E(this.a, "Simple Inline Work Profile Notification");
                break;
            case 7:
                fww.E(this.a, "Simple Inline Notification");
                break;
            case 8:
                fww.H(this.a, "Filled icon button clicked");
                break;
            case 9:
                fww.H(this.a, "Filled button with icon clicked");
                break;
            case 10:
                fww.H(this.a, "Filled button clicked");
                break;
            case 11:
                fww.H(this.a, "Colored icon button clicked");
                break;
            case 12:
                fww.H(this.a, "Colored button with icon clicked");
                break;
            case 13:
                fww.H(this.a, "Colored button clicked");
                break;
            case 14:
                fww.H(this.a, "Icon button clicked");
                break;
            case 15:
                fww.H(this.a, "Outlined icon button clicked");
                break;
            case 16:
                fww.H(this.a, "Outlined button with icon clicked");
                break;
            case 17:
                fww.H(this.a, "Outlined button clicked");
                break;
            case 18:
                fww.H(this.a, "Tonal icon button clicked");
                break;
            case 19:
                fww.H(this.a, "Tonal button with icon clicked");
                break;
            default:
                fww.H(this.a, "Tonal button clicked");
                break;
        }
        return afak.a;
    }
}
