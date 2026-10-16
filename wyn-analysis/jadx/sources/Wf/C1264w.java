package Wf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Wf.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1264w {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f15646e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f15647a;

    /* renamed from: b, reason: collision with root package name */
    public final Yf.p f15648b;

    /* renamed from: c, reason: collision with root package name */
    public long f15649c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f15650d;

    public C1264w(SerialDescriptor descriptor, Yf.p pVar) {
        AbstractC3340k.e(descriptor, "descriptor");
        this.f15647a = descriptor;
        this.f15648b = pVar;
        int iD = descriptor.d();
        if (iD <= 64) {
            this.f15649c = iD != 64 ? (-1) << iD : 0L;
            this.f15650d = f15646e;
            return;
        }
        this.f15649c = 0L;
        int i5 = (iD - 1) >>> 6;
        long[] jArr = new long[i5];
        if ((iD & 63) != 0) {
            jArr[i5 - 1] = (-1) << iD;
        }
        this.f15650d = jArr;
    }
}
