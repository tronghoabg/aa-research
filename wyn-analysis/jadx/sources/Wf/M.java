package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class M extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f15553a;

    /* renamed from: b, reason: collision with root package name */
    public int f15554b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f15553a, this.f15554b);
        AbstractC3340k.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        long[] jArr = this.f15553a;
        if (jArr.length < i5) {
            int length = jArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i5);
            AbstractC3340k.d(jArrCopyOf, "copyOf(...)");
            this.f15553a = jArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15554b;
    }
}
