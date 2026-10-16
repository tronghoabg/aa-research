package q;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: q.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3850z0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43958b;

    public /* synthetic */ C3850z0(Object obj, int i5) {
        this.f43957a = i5;
        this.f43958b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i5, long j8) {
        C3838t0 c3838t0;
        switch (this.f43957a) {
            case 0:
                if (i5 != -1 && (c3838t0 = ((F0) this.f43958b).f43629c) != null) {
                    c3838t0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f43958b).q(i5);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i5 = this.f43957a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
