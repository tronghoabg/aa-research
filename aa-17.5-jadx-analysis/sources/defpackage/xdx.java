package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class xdx extends xdw {
    public int g;
    public int h;
    public int i;
    public int j;
    public xdx k;
    public final ArrayList l;

    public xdx(String str, Drawable drawable, int i) {
        super(str, drawable, false, i, 0);
        this.j = -1;
        this.l = new ArrayList();
    }

    @Override // defpackage.xdw
    public final boolean d() {
        return true;
    }

    public final int g() {
        return this.l.size();
    }

    public final xdw h(int i) {
        return (xdw) this.l.get(i);
    }

    @Override // defpackage.xdw
    public final xdx a() {
        return this;
    }
}
