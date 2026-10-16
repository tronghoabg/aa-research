package j2;

import N1.D;

/* loaded from: classes.dex */
public final class d extends D {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, int i5) {
        super("Missing required field: ".concat(str), null, true, 4);
        switch (i5) {
            case 2:
                super(str, null, false, 1);
                break;
            default:
                break;
        }
    }
}
