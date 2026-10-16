package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.sdk.CheckboxWrapperView;

/* loaded from: classes2.dex */
public final class qfq extends qgr {
    public final CheckboxWrapperView s;

    public qfq(View view) {
        super(view);
        this.s = (CheckboxWrapperView) view.findViewById(R.id.checkbox);
    }

    @Override // defpackage.qgr
    public final void E(MenuItem menuItem, Context context, Context context2) {
        super.E(menuItem, context, context2);
        this.s.setChecked(menuItem.m);
    }

    @Override // defpackage.qgr
    public final void F(MenuItem menuItem, qgq qgqVar) {
        this.a.setOnClickListener(new naj(this, menuItem, qgqVar, 2));
        this.s.setOnClickListener(new naj(this, menuItem, qgqVar, 3));
    }
}
