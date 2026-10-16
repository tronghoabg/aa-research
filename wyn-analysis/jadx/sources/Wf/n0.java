package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class n0 extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f15618a;

    /* renamed from: b, reason: collision with root package name */
    public int f15619b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f15618a, this.f15619b);
        AbstractC3340k.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        short[] sArr = this.f15618a;
        if (sArr.length < i5) {
            int length = sArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i5);
            AbstractC3340k.d(sArrCopyOf, "copyOf(...)");
            this.f15618a = sArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15619b;
    }
}
