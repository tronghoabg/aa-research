package com.waze.settings;

import android.widget.BaseAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bn extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SettingsCalendarSelectionActivity f36890a;

    bn(SettingsCalendarSelectionActivity settingsCalendarSelectionActivity) {
        Objects.requireNonNull(settingsCalendarSelectionActivity);
        this.f36890a = settingsCalendarSelectionActivity;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36890a.f36680l.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.settings.tree.views.WazeSettingsView] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r9 = 0
            if (r8 == 0) goto L2f
            com.waze.settings.SettingsCalendarSelectionActivity r0 = r6.f36890a
            com.waze.settings.bo[] r1 = com.waze.settings.SettingsCalendarSelectionActivity.l(r0)
            r1 = r1[r7]
            boolean r1 = r1.f36896f
            if (r1 == 0) goto L18
            boolean r1 = r8 instanceof com.waze.settings.tree.views.SettingsTitleText
            if (r1 == 0) goto L18
            r0 = r8
            com.waze.settings.tree.views.SettingsTitleText r0 = (com.waze.settings.tree.views.SettingsTitleText) r0
            r1 = r9
            goto L31
        L18:
            com.waze.settings.bo[] r0 = com.waze.settings.SettingsCalendarSelectionActivity.l(r0)
            r0 = r0[r7]
            boolean r0 = r0.f36896f
            if (r0 != 0) goto L2c
            boolean r0 = r8 instanceof com.waze.settings.tree.views.WazeSettingsView
            if (r0 == 0) goto L2c
            r0 = r8
            com.waze.settings.tree.views.WazeSettingsView r0 = (com.waze.settings.tree.views.WazeSettingsView) r0
            r1 = r0
            r0 = r9
            goto L31
        L2c:
            r8 = r9
            r0 = r8
            goto L30
        L2f:
            r0 = r9
        L30:
            r1 = r0
        L31:
            r2 = 2
            if (r8 != 0) goto L50
            com.waze.settings.SettingsCalendarSelectionActivity r8 = r6.f36890a
            com.waze.settings.bo[] r3 = com.waze.settings.SettingsCalendarSelectionActivity.l(r8)
            r3 = r3[r7]
            boolean r3 = r3.f36896f
            if (r3 == 0) goto L47
            com.waze.settings.tree.views.SettingsTitleText r0 = new com.waze.settings.tree.views.SettingsTitleText
            r0.<init>(r8, r9)
            r8 = r0
            goto L50
        L47:
            com.waze.settings.tree.views.WazeSettingsView r1 = new com.waze.settings.tree.views.WazeSettingsView
            r1.<init>(r8)
            r1.B(r2)
            r8 = r1
        L50:
            com.waze.settings.SettingsCalendarSelectionActivity r3 = r6.f36890a
            com.waze.settings.bo[] r4 = com.waze.settings.SettingsCalendarSelectionActivity.l(r3)
            r4 = r4[r7]
            boolean r5 = r4.f36896f
            if (r5 == 0) goto L62
            java.lang.String r6 = r4.f36891a
            r0.a(r6)
            return r8
        L62:
            com.waze.settings.bo[] r0 = com.waze.settings.SettingsCalendarSelectionActivity.l(r3)
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r7 >= r0) goto L83
            int r0 = r7 + 1
            com.waze.settings.bo[] r5 = com.waze.settings.SettingsCalendarSelectionActivity.l(r3)
            r5 = r5[r0]
            if (r5 == 0) goto L83
            com.waze.settings.bo[] r5 = com.waze.settings.SettingsCalendarSelectionActivity.l(r3)
            r0 = r5[r0]
            boolean r0 = r0.f36896f
            if (r0 == 0) goto L83
            r1.u(r2)
            goto L9a
        L83:
            if (r7 == 0) goto L96
            int r0 = r7 + (-1)
            com.waze.settings.bo[] r2 = com.waze.settings.SettingsCalendarSelectionActivity.l(r3)
            r0 = r2[r0]
            boolean r0 = r0.f36896f
            if (r0 == 0) goto L96
            r0 = 1
            r1.u(r0)
            goto L9a
        L96:
            r0 = 0
            r1.u(r0)
        L9a:
            r1.s(r9)
            java.lang.String r9 = r4.f36891a
            r1.A(r9)
            android.content.res.Resources r9 = r3.getResources()
            r0 = 2131232838(0x7f080846, float:1.8081797E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r0)
            r1.p(r9)
            boolean r9 = r4.f36895e
            r1.D(r9)
            com.waze.settings.bm r9 = new com.waze.settings.bm
            r9.<init>(r6, r7)
            r1.s(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.bn.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
