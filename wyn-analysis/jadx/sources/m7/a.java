package M7;

import G9.e;
import ad.C1358c;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.wynauto.wyn.R;
import java.util.HashMap;
import q.v1;

/* loaded from: classes4.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7529b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f7528a = i5;
        this.f7529b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f7528a) {
            case 0:
                throw null;
            case 1:
                int measuredHeight = view.getMeasuredHeight();
                C1358c c1358c = (C1358c) this.f7529b;
                if (measuredHeight != c1358c.f17564i) {
                    e eVar = c1358c.f17592b;
                    eVar.getClass();
                    HashMap map = new HashMap();
                    map.put("adId", Integer.valueOf(c1358c.f17586a));
                    map.put("eventName", "onFluidAdHeightChanged");
                    map.put("height", Integer.valueOf(measuredHeight));
                    eVar.w(map);
                }
                c1358c.f17564i = measuredHeight;
                return;
            default:
                SearchView searchView = (SearchView) this.f7529b;
                View view2 = searchView.f17911x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f17905r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zA = v1.a(searchView);
                    int dimensionPixelSize = searchView.f17886M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f17903p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
