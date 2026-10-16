package A0;

import android.text.Layout;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f200a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f201b;

    public b(Layout layout) {
        AbstractC3340k.e(layout, "layout");
        this.f200a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.f200a.getText();
            AbstractC3340k.d(text, "layout.text");
            int iV0 = Bf.k.v0(text, '\n', length, 4);
            length = iV0 < 0 ? this.f200a.getText().length() : iV0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f200a.getText().length());
        this.f201b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(null);
        }
        boolean[] zArr = new boolean[this.f201b.size()];
        this.f201b.size();
    }

    public final float a(int i5, boolean z2) {
        Layout layout = this.f200a;
        return z2 ? layout.getPrimaryHorizontal(i5) : layout.getSecondaryHorizontal(i5);
    }
}
