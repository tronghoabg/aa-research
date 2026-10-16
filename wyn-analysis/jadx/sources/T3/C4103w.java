package t3;

import A7.AbstractC0279p0;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: t3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4103w {

    /* renamed from: b, reason: collision with root package name */
    public final View f45733b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f45732a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f45734c = new ArrayList();

    public C4103w(View view) {
        this.f45733b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4103w)) {
            return false;
        }
        C4103w c4103w = (C4103w) obj;
        return this.f45733b == c4103w.f45733b && this.f45732a.equals(c4103w.f45732a);
    }

    public final int hashCode() {
        return this.f45732a.hashCode() + (this.f45733b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbQ = AbstractC0279p0.q("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbQ.append(this.f45733b);
        sbQ.append("\n");
        String strF = N0.a.f(sbQ.toString(), "    values:");
        HashMap map = this.f45732a;
        for (String str : map.keySet()) {
            strF = strF + "    " + str + ": " + map.get(str) + "\n";
        }
        return strF;
    }
}
