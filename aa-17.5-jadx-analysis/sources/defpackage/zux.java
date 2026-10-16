package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zux {
    public int a = 0;
    public String b;
    public String c;
    public String d;
    public yfy e;
    public zys f;

    public final zuy a() {
        if (this.c != null) {
            this.a = 1;
        }
        if (this.d != null) {
            this.a = 2;
        }
        if (this.b == null || this.a == 0) {
            return null;
        }
        return new zuy(this);
    }

    public final void b(Map map) {
        this.e = yfy.j(map);
    }
}
