package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aduk {
    private final ArrayList a = new ArrayList();

    public final void a(Object obj) {
        this.a.add(obj.toString());
    }

    public final void b(String str, Object obj) {
        this.a.add(str + "=" + String.valueOf(obj));
    }

    public final String toString() {
        return this.a.toString();
    }
}
