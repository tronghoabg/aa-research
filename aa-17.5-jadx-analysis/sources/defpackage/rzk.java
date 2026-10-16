package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public final class rzk extends rzj {
    private final StringWriter a;

    private rzk(StringWriter stringWriter) {
        super(new PrintWriter(stringWriter));
        this.a = stringWriter;
    }

    public static rzk n() {
        return new rzk(new StringWriter());
    }

    public final String toString() {
        return this.a.toString();
    }
}
