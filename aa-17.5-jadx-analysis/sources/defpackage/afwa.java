package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class afwa implements afdr {
    private final Class arg$0;
    private final Map arg$1;

    public afwa(Class cls, Map map) {
        this.arg$0 = cls;
        this.arg$1 = map;
    }

    @Override // defpackage.afdr
    public Object invoke() {
        return afwd.createAnnotationInstance$lambda$4(this.arg$0, this.arg$1);
    }
}
