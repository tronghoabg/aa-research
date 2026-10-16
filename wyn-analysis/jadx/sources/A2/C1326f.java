package a2;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Arrays;
import l2.AbstractC3380e;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1326f extends AbstractC3380e {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f17161j;
    public volatile boolean k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f17162l;

    @Override // o2.j
    public final void g() {
        this.k = true;
    }

    @Override // o2.j
    public final void load() {
        try {
            this.f39897i.y(this.f39890b);
            int i5 = 0;
            int i10 = 0;
            while (i5 != -1 && !this.k) {
                byte[] bArr = this.f17161j;
                if (bArr.length < i10 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    this.f17161j = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
                }
                i5 = this.f39897i.read(this.f17161j, i10, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i5 != -1) {
                    i10 += i5;
                }
            }
            if (!this.k) {
                this.f17162l = Arrays.copyOf(this.f17161j, i10);
            }
            Fe.b.m(this.f39897i);
        } catch (Throwable th) {
            Fe.b.m(this.f39897i);
            throw th;
        }
    }
}
