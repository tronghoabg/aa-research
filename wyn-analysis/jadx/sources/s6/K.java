package s6;

import android.content.Context;
import android.widget.FrameLayout;
import h6.C2783b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class K extends FrameLayout implements E {

    /* renamed from: a, reason: collision with root package name */
    public final C4015b f45115a;

    /* renamed from: b, reason: collision with root package name */
    public final I f45116b;

    /* renamed from: c, reason: collision with root package name */
    public List f45117c;

    /* renamed from: d, reason: collision with root package name */
    public C4016c f45118d;

    /* renamed from: e, reason: collision with root package name */
    public float f45119e;

    /* renamed from: f, reason: collision with root package name */
    public float f45120f;

    public K(Context context) {
        super(context, null);
        this.f45117c = Collections.EMPTY_LIST;
        this.f45118d = C4016c.f45126g;
        this.f45119e = 0.0533f;
        this.f45120f = 0.08f;
        C4015b c4015b = new C4015b(context);
        this.f45115a = c4015b;
        I i5 = new I(context, null);
        this.f45116b = i5;
        i5.setBackgroundColor(0);
        addView(c4015b);
        addView(i5);
    }

    @Override // s6.E
    public final void a(List list, C4016c c4016c, float f10, float f11) {
        this.f45118d = c4016c;
        this.f45119e = f10;
        this.f45120f = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            C2783b c2783b = (C2783b) list.get(i5);
            if (c2783b.f36171d != null) {
                arrayList.add(c2783b);
            } else {
                arrayList2.add(c2783b);
            }
        }
        if (!this.f45117c.isEmpty() || !arrayList2.isEmpty()) {
            this.f45117c = arrayList2;
            c();
        }
        this.f45115a.a(arrayList, c4016c, f10, f11);
        invalidate();
    }

    public final String b(float f10, int i5) {
        float fO = xg.g.O(i5, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fO == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fO / getContext().getResources().getDisplayMetrics().density)};
        int i10 = u6.v.f46721a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.K.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        if (!z2 || this.f45117c.isEmpty()) {
            return;
        }
        c();
    }
}
