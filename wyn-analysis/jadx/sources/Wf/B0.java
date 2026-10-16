package Wf;

import ef.C2513A;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class B0 extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f15528a;

    /* renamed from: b, reason: collision with root package name */
    public int f15529b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f15528a, this.f15529b);
        AbstractC3340k.d(sArrCopyOf, "copyOf(...)");
        return new C2513A(sArrCopyOf);
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        short[] sArr = this.f15528a;
        if (sArr.length < i5) {
            int length = sArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i5);
            AbstractC3340k.d(sArrCopyOf, "copyOf(...)");
            this.f15528a = sArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15529b;
    }
}
