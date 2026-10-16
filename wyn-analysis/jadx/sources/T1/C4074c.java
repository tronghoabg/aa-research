package t1;

import ad.r;
import android.graphics.Rect;
import java.util.Comparator;
import l1.C3375e;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4074c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f45599a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f45600b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45601c;

    /* renamed from: d, reason: collision with root package name */
    public final r f45602d;

    public C4074c(boolean z2, r rVar) {
        this.f45601c = z2;
        this.f45602d = rVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f45602d.getClass();
        Rect rect = this.f45599a;
        ((C3375e) obj).f(rect);
        Rect rect2 = this.f45600b;
        ((C3375e) obj2).f(rect2);
        int i5 = rect.top;
        int i10 = rect2.top;
        if (i5 < i10) {
            return -1;
        }
        if (i5 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z2 = this.f45601c;
        if (i11 < i12) {
            return z2 ? 1 : -1;
        }
        if (i11 > i12) {
            return z2 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z2 ? 1 : -1;
        }
        if (i15 > i16) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
