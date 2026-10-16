package defpackage;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class afdn implements airp {
    public final Object a;
    private final /* synthetic */ int b;

    public afdn(int i) {
        this.b = i;
        this.a = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.airp
    public final Iterator a() {
        return this.b != 0 ? this.a.iterator() : new afdm(this);
    }

    public afdn(BufferedReader bufferedReader, int i) {
        this.b = i;
        this.a = bufferedReader;
    }
}
