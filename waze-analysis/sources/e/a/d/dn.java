package e.a.d;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dn {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f46820a = new ArrayList();

    public final void a(Object obj) {
        this.f46820a.add(obj.toString());
    }

    public final void b(String str, Object obj) {
        this.f46820a.add(str + "=" + String.valueOf(obj));
    }

    public final String toString() {
        return this.f46820a.toString();
    }
}
