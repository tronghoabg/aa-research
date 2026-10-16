package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
final class mbc {
    private final String a;
    private final int b;

    public mbc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        String str = this.a;
        Locale locale = Locale.US;
        int i = this.b;
        return String.format(locale, "%s: %s", str, i != 1 ? i != 2 ? i != 3 ? "LISTENER_DISCONNECTED" : "LISTENER_DISCONNECTING" : "LISTENER_CONNECTED" : "LISTENER_CONNECTING");
    }
}
