package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class H extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f15546a;

    /* renamed from: b, reason: collision with root package name */
    public int f15547b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f15546a, this.f15547b);
        AbstractC3340k.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        int[] iArr = this.f15546a;
        if (iArr.length < i5) {
            int length = iArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            AbstractC3340k.d(iArrCopyOf, "copyOf(...)");
            this.f15546a = iArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15547b;
    }
}
