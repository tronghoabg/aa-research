package com.google.android.apps.auto.components.widgets;

import android.os.Bundle;
import defpackage.aezr;
import defpackage.affw;
import defpackage.cct;
import defpackage.ero;
import defpackage.lec;
import defpackage.ndw;
import defpackage.njg;
import defpackage.ob;
import defpackage.ooq;
import defpackage.opv;
import defpackage.ot;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0011²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/apps/auto/components/widgets/EarthPickerActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/google/android/apps/auto/components/widgets/WidgetPickerViewModel;", "getViewModel", "()Lcom/google/android/apps/auto/components/widgets/WidgetPickerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "selectWidget", "widgetInfo", "Landroid/appwidget/AppWidgetProviderInfo;", "java.com.google.android.apps.auto.components.widgets_widgets", "groupedWidgets", "", "Lcom/google/android/apps/auto/components/widgets/WidgetApp;", "featuredWidgets", "Lcom/google/android/apps/auto/components/widgets/WidgetPickerItem;", "llmWidgetProviderInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EarthPickerActivity extends ob {
    private final aezr a = new ero(affw.b(opv.class), new ndw(this, 17), new ooq(this, 6), new ndw(this, 18));

    public final opv a() {
        return (opv) this.a.a();
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (lec.a.a().f()) {
            ot.a(this, new cct(1957576557, true, new njg(this, 19)));
        } else {
            finish();
        }
    }
}
