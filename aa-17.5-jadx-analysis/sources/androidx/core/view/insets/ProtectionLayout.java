package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.projection.gearhead.R;
import defpackage.edw;
import defpackage.edx;
import defpackage.eeb;
import defpackage.lh;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object a = new Object();
    private final List b;
    private edx c;

    public ProtectionLayout(Context context, List<edw> list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    private final void a() {
        eeb eebVar;
        List list = this.b;
        if (list.isEmpty()) {
            b();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof eeb) {
            eebVar = (eeb) tag;
        } else {
            eebVar = new eeb(viewGroup);
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, eebVar);
        }
        b();
        this.c = new edx(eebVar, list);
        getChildCount();
        if (this.c.a() <= 0) {
            return;
        }
        this.c.d();
        getContext();
        throw null;
    }

    private final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a(), this.c.a());
            int iA = this.c.a();
            edx edxVar = this.c;
            if (iA > 0) {
                edxVar.d();
                throw null;
            }
            if (!edxVar.d) {
                edxVar.d = true;
                edxVar.b.b.remove(edxVar);
                ArrayList arrayList = edxVar.a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((edw) arrayList.get(size)).b = null;
                    }
                }
                arrayList.clear();
            }
            this.c = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != a) {
            edx edxVar = this.c;
            int childCount = getChildCount() - (edxVar != null ? edxVar.a() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof eeb) {
            eeb eebVar = (eeb) tag;
            if (eebVar.b.isEmpty()) {
                eebVar.a.post(new lh(eebVar, 19, null));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.b = new ArrayList();
    }
}
