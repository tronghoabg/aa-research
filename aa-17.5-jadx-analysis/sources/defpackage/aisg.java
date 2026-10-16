package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aisg implements airp {
    public final CharSequence a;
    public final int b;
    public final afeg c;

    public aisg(CharSequence charSequence, int i, afeg afegVar) {
        this.a = charSequence;
        this.b = i;
        this.c = afegVar;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return new aisf(this);
    }
}
