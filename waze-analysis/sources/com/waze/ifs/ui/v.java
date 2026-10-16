package com.waze.ifs.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import androidx.core.content.res.ResourcesCompat;
import com.waze.R;
import com.waze.settings.gw;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class v extends u implements ExpandableListAdapter {

    /* renamed from: b, reason: collision with root package name */
    final int[] f24583b;

    /* renamed from: c, reason: collision with root package name */
    int f24584c;

    public v(Context context) {
        super(context);
        this.f24584c = 0;
        this.f24583b = new int[64];
    }

    public final int a(int i2, int i3) {
        return this.f24583b[i2] + i3 + 1;
    }

    @Override // com.waze.ifs.ui.u
    public void b(gw[] gwVarArr) {
        super.b(gwVarArr);
        g(gwVarArr);
    }

    protected final void g(gw[] gwVarArr) {
        int[] iArr = this.f24583b;
        Arrays.fill(iArr, 0);
        this.f24584c = 0;
        for (int i2 = 0; i2 < gwVarArr.length; i2++) {
            if (gwVarArr[i2].f37354g) {
                int i3 = this.f24584c;
                iArr[i3] = i2;
                this.f24584c = i3 + 1;
            }
            if (this.f24584c == 64) {
                return;
            }
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i2, int i3) {
        return this.f24580e[a(i2, i3)];
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i2, int i3) {
        return a(i2, i3);
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i2, int i3, boolean z, View view, ViewGroup viewGroup) {
        int iA = a(i2, i3);
        if (iA == this.f24580e.length) {
            View view2 = new View(viewGroup.getContext());
            view2.setBackgroundColor(ResourcesCompat.getColor(viewGroup.getResources(), R.color.transparent, null));
            return view2;
        }
        if (true != (view instanceof ViewGroup)) {
            view = null;
        }
        View view3 = getView(iA, view, viewGroup);
        View viewFindViewById = view3.findViewById(R.id.omniSelectItemContainer);
        viewFindViewById.setBackgroundColor(ResourcesCompat.getColor(viewGroup.getResources(), R.color.background_variant, null));
        viewFindViewById.setPadding(0, 0, 0, 0);
        return view3;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i2) {
        return ((i2 < this.f24584c + (-1) ? this.f24583b[i2 + 1] : this.f24580e.length + 1) - this.f24583b[i2]) - 1;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getCombinedChildId(long j2, long j3) {
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getCombinedGroupId(long j2) {
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i2) {
        return this.f24580e[this.f24583b[i2]];
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f24584c;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i2) {
        return a(i2, -1);
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i2, boolean z, View view, ViewGroup viewGroup) {
        View view2 = getView(this.f24583b[i2], view, viewGroup);
        if (z) {
            view2.findViewById(R.id.omniSelectItemContainer).setPadding(0, 0, 0, 0);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i2) {
        if (i2 == this.f24580e.length) {
            return -1;
        }
        return super.getItemViewType(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i2, int i3) {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final void onGroupCollapsed(int i2) {
    }

    @Override // android.widget.ExpandableListAdapter
    public final void onGroupExpanded(int i2) {
    }
}
