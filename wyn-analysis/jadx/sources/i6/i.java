package i6;

import h6.InterfaceC2787f;
import java.util.Collections;
import java.util.List;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class i implements InterfaceC2787f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36874a;

    /* renamed from: b, reason: collision with root package name */
    public final List f36875b;

    public /* synthetic */ i(int i5, List list) {
        this.f36874a = i5;
        this.f36875b = list;
    }

    @Override // h6.InterfaceC2787f
    public final int a(long j8) {
        switch (this.f36874a) {
            case 0:
                if (j8 < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // h6.InterfaceC2787f
    public final List g(long j8) {
        switch (this.f36874a) {
            case 0:
                return j8 >= 0 ? this.f36875b : Collections.EMPTY_LIST;
            default:
                return this.f36875b;
        }
    }

    @Override // h6.InterfaceC2787f
    public final long k(int i5) {
        switch (this.f36874a) {
            case 0:
                AbstractC4256a.e(i5 == 0);
                break;
        }
        return 0L;
    }

    @Override // h6.InterfaceC2787f
    public final int p() {
        switch (this.f36874a) {
        }
        return 1;
    }
}
