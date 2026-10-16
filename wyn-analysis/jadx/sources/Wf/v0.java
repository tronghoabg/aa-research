package Wf;

import ef.C2538v;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class v0 extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f15644a;

    /* renamed from: b, reason: collision with root package name */
    public int f15645b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f15644a, this.f15645b);
        AbstractC3340k.d(iArrCopyOf, "copyOf(...)");
        return new C2538v(iArrCopyOf);
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        int[] iArr = this.f15644a;
        if (iArr.length < i5) {
            int length = iArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            AbstractC3340k.d(iArrCopyOf, "copyOf(...)");
            this.f15644a = iArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15645b;
    }
}
