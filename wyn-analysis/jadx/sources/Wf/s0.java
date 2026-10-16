package Wf;

import ef.C2536t;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class s0 extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15634a;

    /* renamed from: b, reason: collision with root package name */
    public int f15635b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f15634a, this.f15635b);
        AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
        return new C2536t(bArrCopyOf);
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        byte[] bArr = this.f15634a;
        if (bArr.length < i5) {
            int length = bArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
            AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
            this.f15634a = bArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15635b;
    }
}
