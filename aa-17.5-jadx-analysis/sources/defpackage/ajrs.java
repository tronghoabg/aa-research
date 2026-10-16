package defpackage;

import java.net.URI;

/* loaded from: classes2.dex */
public final class ajrs extends ajrp {
    public ajrs(String str) {
        this.b = URI.create(str);
    }

    @Override // defpackage.ajrm, defpackage.ajrt
    public final String s() {
        return "POST";
    }
}
