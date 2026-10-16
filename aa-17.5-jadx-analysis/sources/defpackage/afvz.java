package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class afvz implements afdr {
    private final Map arg$0;

    public afvz(Map map) {
        this.arg$0 = map;
    }

    @Override // defpackage.afdr
    public Object invoke() {
        return Integer.valueOf(afwd.createAnnotationInstance$lambda$2(this.arg$0));
    }
}
