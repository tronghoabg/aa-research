package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class trh {
    public final int a;
    public final float b;
    public final List c = new ArrayList();

    public trh(float f, float f2) {
        this.a = Math.round((f * 8.0f) / f2);
        this.b = f2;
    }
}
