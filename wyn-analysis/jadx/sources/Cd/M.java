package Cd;

import ef.C2527k;
import java.nio.charset.Charset;
import java.util.Comparator;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class M implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2017a;

    public /* synthetic */ M(int i5) {
        this.f2017a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2017a) {
            case 0:
                return android.support.v4.media.session.b.W(AbstractC3772b.A((Charset) obj), AbstractC3772b.A((Charset) obj2));
            default:
                return android.support.v4.media.session.b.W((Float) ((C2527k) obj2).f34672b, (Float) ((C2527k) obj).f34672b);
        }
    }
}
