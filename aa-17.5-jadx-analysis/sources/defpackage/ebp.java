package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ebp implements airp {
    final /* synthetic */ ViewGroup a;

    public ebp(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return new ebr(this.a);
    }
}
