package Wf;

import ef.C2540x;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class y0 extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f15659a;

    /* renamed from: b, reason: collision with root package name */
    public int f15660b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f15659a, this.f15660b);
        AbstractC3340k.d(jArrCopyOf, "copyOf(...)");
        return new C2540x(jArrCopyOf);
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        long[] jArr = this.f15659a;
        if (jArr.length < i5) {
            int length = jArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i5);
            AbstractC3340k.d(jArrCopyOf, "copyOf(...)");
            this.f15659a = jArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15660b;
    }
}
