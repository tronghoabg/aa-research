package m4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* loaded from: classes.dex */
public final class b extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f40356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MDRootLayout f40358c;

    public b(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z2) {
        this.f40358c = mDRootLayout;
        this.f40356a = viewGroup;
        this.f40357b = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        super.onScrolled(recyclerView, i5, i10);
        MDRootLayout mDRootLayout = this.f40358c;
        MDButton[] mDButtonArr = mDRootLayout.f19951a;
        int length = mDButtonArr.length;
        boolean z2 = false;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                MDButton mDButton = mDButtonArr[i11];
                if (mDButton != null && mDButton.getVisibility() != 8) {
                    z2 = true;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        MDRootLayout.a(mDRootLayout, this.f40356a, this.f40357b, z2);
        mDRootLayout.invalidate();
    }
}
