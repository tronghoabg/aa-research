package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class pdf {
    final ozs a;
    public int b = 1;

    public pdf(ozs ozsVar) {
        this.a = ozsVar;
    }

    public final String toString() {
        Locale locale = Locale.US;
        int i = this.b;
        return String.format(locale, "NetworkRequester{requestState: %s}", i != 1 ? i != 2 ? i != 3 ? "null" : "DISCONNECTED" : "CONNECTED" : "PENDING");
    }
}
