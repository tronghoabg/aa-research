package E4;

import java.util.HashMap;
import lc.C3458b;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static y f3000b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3001a;

    public y(int i5) {
        switch (i5) {
            case 1:
                this.f3001a = new HashMap();
                break;
            default:
                this.f3001a = new HashMap();
                new HashMap();
                break;
        }
    }

    public static y a() {
        if (f3000b == null) {
            f3000b = new y(1);
        }
        return f3000b;
    }

    public void b(String str, C3458b c3458b) {
        HashMap map = this.f3001a;
        if (c3458b != null) {
            map.put(str, c3458b);
        } else {
            map.remove(str);
        }
    }
}
