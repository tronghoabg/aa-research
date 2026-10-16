package Ya;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i5) {
        super("The service is not started.");
        switch (i5) {
            case 12:
                super("wakelock requires a foreground activity");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message) {
        super(message);
        AbstractC3340k.e(message, "message");
    }
}
