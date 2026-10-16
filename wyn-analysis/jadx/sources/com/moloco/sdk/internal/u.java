package com.moloco.sdk.internal;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class u implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29749c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.a f29752f;

    public /* synthetic */ u(String str, String str2, long j8, long j10, tf.a aVar, int i5) {
        this.f29747a = i5;
        this.f29748b = str;
        this.f29749c = str2;
        this.f29750d = j8;
        this.f29751e = j10;
        this.f29752f = aVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29747a) {
            case 0:
                Z.k it = (Z.k) obj;
                C0740o c0740o = (C0740o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC3340k.e(it, "it");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0740o.e(it) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0740o.x()) {
                    c0740o.I();
                } else {
                    x.a(it, this.f29748b, this.f29749c, this.f29750d, this.f29751e, this.f29752f, c0740o, iIntValue & 14);
                }
                break;
            default:
                Z.k it2 = (Z.k) obj;
                C0740o c0740o2 = (C0740o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC3340k.e(it2, "it");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0740o2.e(it2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c0740o2.x()) {
                    c0740o2.I();
                } else {
                    x.a(it2, this.f29748b, this.f29749c, this.f29750d, this.f29751e, this.f29752f, c0740o2, iIntValue2 & 14);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
