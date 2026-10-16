package r6;

import f6.Z;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Z f44462a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f44463b;

    public m(int i5, Z z2, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC4256a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f44462a = z2;
        this.f44463b = iArr;
    }
}
