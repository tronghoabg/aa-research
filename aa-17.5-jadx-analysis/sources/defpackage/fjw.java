package defpackage;

import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class fjw {
    public UUID a;
    public fod b;
    public final Set c;
    private final Class d;

    public fjw(Class cls) {
        this.d = cls;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = uuidRandomUUID;
        String string = this.a.toString();
        string.getClass();
        String name = cls.getName();
        name.getClass();
        this.b = new fod(string, (fju) null, name, (String) null, (fjc) null, (fjc) null, 0L, 0L, 0L, (fja) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String name2 = cls.getName();
        name2.getClass();
        this.c = woy.aP(name2);
    }
}
