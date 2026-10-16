package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class vzk {
    public static final Pattern a = Pattern.compile("[^A-Za-z0-9]");
    protected final ajgu b;

    protected vzk(ajgu ajguVar) {
        this.b = ajguVar;
    }

    protected abstract void a(rju rjuVar);

    protected String b() {
        ajgu ajguVar = this.b;
        return (ajguVar.b & 4) != 0 ? ajguVar.e : ajguVar.d;
    }
}
