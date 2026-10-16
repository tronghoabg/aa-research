package com.waze.settings;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    protected gw[] f36883a;

    /* renamed from: b, reason: collision with root package name */
    private WazeSettingsView f36884b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36885c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36886d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36887e = false;

    public final void a(gw[] gwVarArr) {
        this.f36883a = gwVarArr;
        notifyDataSetChanged();
    }

    public final void b(View view) {
        WazeSettingsView wazeSettingsView;
        if (this.f36885c && (wazeSettingsView = this.f36884b) != view) {
            if (wazeSettingsView != null) {
                wazeSettingsView.w(false, true);
            }
            WazeSettingsView wazeSettingsView2 = (WazeSettingsView) view;
            this.f36884b = wazeSettingsView2;
            wazeSettingsView2.w(true, true);
        }
    }

    public final void c() {
        this.f36885c = false;
    }

    public final void d() {
        this.f36886d = true;
    }

    public final void e() {
        this.f36887e = true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        gw[] gwVarArr = this.f36883a;
        if (gwVarArr == null) {
            return 0;
        }
        return gwVarArr.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        gw[] gwVarArr = this.f36883a;
        if (gwVarArr == null) {
            return null;
        }
        return gwVarArr[i2];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i2) {
        gw gwVar = this.f36883a[i2];
        if (gwVar.f37354g) {
            return -1;
        }
        View view = gwVar.f37357j;
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Drawable drawable;
        gw gwVar = this.f36883a[i2];
        View view2 = gwVar.f37357j;
        if (gwVar.f37354g) {
            SettingsTitleText settingsTitleText = new SettingsTitleText(viewGroup.getContext(), null);
            settingsTitleText.a(this.f36883a[i2].f37350c);
            return settingsTitleText;
        }
        if (true != (view instanceof WazeSettingsView)) {
            view = null;
        }
        WazeSettingsView wazeSettingsView = (WazeSettingsView) view;
        if (wazeSettingsView == null) {
            wazeSettingsView = new WazeSettingsView(viewGroup.getContext());
            wazeSettingsView.B(true != this.f36885c ? 0 : 3);
            wazeSettingsView.setClickable(false);
        }
        if (this.f36884b == wazeSettingsView) {
            this.f36884b = null;
        }
        gw gwVar2 = this.f36883a[i2];
        if (gwVar2 == null || (drawable = gwVar2.f37352e) == null) {
            wazeSettingsView.p(null);
        } else {
            wazeSettingsView.L(drawable);
            if (this.f36887e) {
                wazeSettingsView.z();
            }
        }
        String str = gwVar2.f37351d;
        if (str == null || str.equals("")) {
            wazeSettingsView.A(gwVar2.f37350c);
        } else {
            wazeSettingsView.N(gwVar2.f37350c);
            wazeSettingsView.P(gwVar2.f37351d);
        }
        if (this.f36885c) {
            wazeSettingsView.w(gwVar2.f37348a, false);
        }
        if (this.f36886d) {
            wazeSettingsView.B(true != gwVar2.f37348a ? 0 : 8);
        }
        if (gwVar2.f37348a) {
            this.f36884b = wazeSettingsView;
        }
        gw[] gwVarArr = this.f36883a;
        if (i2 == 0) {
            if (gwVarArr.length - 1 == 0) {
                wazeSettingsView.u(3);
                return wazeSettingsView;
            }
            wazeSettingsView.u(1);
            return wazeSettingsView;
        }
        if (i2 != gwVarArr.length - 1) {
            gw gwVar3 = gwVarArr[i2 + 1];
            if (!gwVar3.f37354g) {
                View view3 = gwVar3.f37357j;
                wazeSettingsView.u(0);
                return wazeSettingsView;
            }
        }
        wazeSettingsView.u(2);
        return wazeSettingsView;
    }
}
