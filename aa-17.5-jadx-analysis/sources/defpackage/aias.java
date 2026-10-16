package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final /* synthetic */ class aias extends afey implements afec {
    public aias(Object obj) {
        super(1, obj, aiav.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
    }

    @Override // defpackage.afec
    public final InputStream invoke(String str) {
        str.getClass();
        return ((aiav) this.receiver).loadResource(str);
    }
}
