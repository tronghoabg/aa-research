package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.widget.RemoteViews;
import java.util.List;

/* loaded from: classes2.dex */
public final class kvr extends afde implements afeg {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvr(AppWidgetProviderInfo appWidgetProviderInfo, boolean z, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = appWidgetProviderInfo;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            return new kvr(this.a, (bwq) this.b, afckVar, 0);
        }
        if (i == 1) {
            return new kvr(this.a, (bwq) this.b, afckVar, 1, (byte[]) null);
        }
        if (i == 2) {
            return new kvr(this.a, (List) this.b, afckVar, 2);
        }
        if (i == 3) {
            return new kvr(this.a, (List) this.b, afckVar, 3, (byte[]) null);
        }
        return new kvr((AppWidgetProviderInfo) this.b, this.a, afckVar, 4);
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            woy.dF(obj);
            if (this.a) {
                this.b.b(false);
            }
            return afak.a;
        }
        if (i == 1) {
            woy.dF(obj);
            if (this.a) {
                this.b.b(false);
            }
            return afak.a;
        }
        if (i == 2) {
            woy.dF(obj);
            if (!this.a) {
                ((ype) ngk.a.h()).u("Controls uninitialized, will set driver critical ui as not ready.");
                nim.a().j(false);
            } else if (this.b.isEmpty()) {
                ((ype) ngk.a.h()).u("No driver controls found, will set driver critical ui as ready.");
                nim.a().j(true);
            }
            return afak.a;
        }
        if (i == 3) {
            woy.dF(obj);
            if (!this.a) {
                ((ype) ngk.a.h()).u("Controls uninitialized, will set passenger critical ui as not ready.");
                nim.a().l(false);
            } else if (this.b.isEmpty()) {
                ((ype) ngk.a.h()).u("No passenger controls found, will set passenger critical ui as ready.");
                nim.a().l(true);
            }
            return afak.a;
        }
        woy.dF(obj);
        Context context = mki.a.c;
        context.getClass();
        boolean z = this.a;
        Object obj2 = this.b;
        if (z) {
            AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) obj2;
            RemoteViews widgetPreview = opr.a.a().e.getWidgetPreview(appWidgetProviderInfo.provider, Process.myUserHandle(), 1);
            if (widgetPreview != null) {
                return new oph(widgetPreview, appWidgetProviderInfo);
            }
            if (appWidgetProviderInfo.previewLayout != 0) {
                return new oph(new RemoteViews(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo.previewLayout), appWidgetProviderInfo);
            }
        }
        AppWidgetProviderInfo appWidgetProviderInfo2 = (AppWidgetProviderInfo) obj2;
        Drawable drawableLoadPreviewImage = appWidgetProviderInfo2.loadPreviewImage(context, context.getResources().getConfiguration().densityDpi);
        if (drawableLoadPreviewImage != null) {
            return new opk(drawableLoadPreviewImage);
        }
        Drawable applicationIcon = context.getPackageManager().getApplicationIcon(appWidgetProviderInfo2.provider.getPackageName());
        applicationIcon.getClass();
        return new ooc(applicationIcon);
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((kvr) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((kvr) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((kvr) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 3) {
            return ((kvr) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((kvr) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvr(boolean z, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = z;
        this.b = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvr(boolean z, bwq bwqVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.a = z;
        this.b = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvr(boolean z, List list, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = z;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvr(boolean z, List list, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.a = z;
        this.b = list;
    }
}
