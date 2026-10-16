package K;

import e0.C2465q;
import ef.C2539w;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: K.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685j {

    /* renamed from: a, reason: collision with root package name */
    public final long f6263a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6264b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6265c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6266d;

    public C0685j(long j8, long j10, long j11, long j12) {
        this.f6263a = j8;
        this.f6264b = j10;
        this.f6265c = j11;
        this.f6266d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        if (!AbstractC3340k.a(i5.getOrCreateKotlinClass(C0685j.class), i5.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        C0685j c0685j = (C0685j) obj;
        return C2465q.b(this.f6263a, c0685j.f6263a) && C2465q.b(this.f6264b, c0685j.f6264b) && C2465q.b(this.f6265c, c0685j.f6265c) && C2465q.b(this.f6266d, c0685j.f6266d);
    }

    public final int hashCode() {
        int i5 = C2465q.f34381j;
        return C2539w.a(this.f6266d) + ((C2539w.a(this.f6265c) + ((C2539w.a(this.f6264b) + (C2539w.a(this.f6263a) * 31)) * 31)) * 31);
    }
}
