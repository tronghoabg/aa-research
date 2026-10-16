package l2;

import java.util.NoSuchElementException;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3377b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f39870a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39871b;

    /* renamed from: c, reason: collision with root package name */
    public long f39872c;

    public AbstractC3377b(long j8, long j10) {
        this.f39870a = j8;
        this.f39871b = j10;
        this.f39872c = j8 - 1;
    }

    public final void a() {
        long j8 = this.f39872c;
        if (j8 < this.f39870a || j8 > this.f39871b) {
            throw new NoSuchElementException();
        }
    }

    @Override // l2.m
    public final boolean next() {
        long j8 = this.f39872c + 1;
        this.f39872c = j8;
        return !(j8 > this.f39871b);
    }
}
