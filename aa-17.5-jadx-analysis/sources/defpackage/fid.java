package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public final class fid extends dzp {
    final /* synthetic */ ViewPager a;

    public fid(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        fhy fhyVar = this.a.b;
        return fhyVar != null && fhyVar.e() > 1;
    }

    @Override // defpackage.dzp
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        ViewPager viewPager;
        fhy fhyVar;
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() != 4096 || (fhyVar = (viewPager = this.a).b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(fhyVar.e());
        accessibilityEvent.setFromIndex(viewPager.c);
        accessibilityEvent.setToIndex(viewPager.c);
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        edgVar.r("androidx.viewpager.widget.ViewPager");
        edgVar.M(j());
        ViewPager viewPager = this.a;
        if (viewPager.canScrollHorizontally(1)) {
            edgVar.g(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            edgVar.g(8192);
        }
    }

    @Override // defpackage.dzp
    public final boolean i(View view, int i, Bundle bundle) throws Resources.NotFoundException {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            ViewPager viewPager = this.a;
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.i(viewPager.c + 1);
            return true;
        }
        if (i != 8192) {
            return false;
        }
        ViewPager viewPager2 = this.a;
        if (!viewPager2.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager2.i(viewPager2.c - 1);
        return true;
    }
}
