package com.google.android.apps.auto.components.apphost.template.gearhead;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\tÊ\u0001\u0002\b\n¨\u0006\b"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/template/gearhead/MinimizedStateNavigationTemplate;", "Landroidx/car/app/model/Template;", "originalTemplate", "Landroidx/car/app/navigation/model/NavigationTemplate;", "<init>", "(Landroidx/car/app/navigation/model/NavigationTemplate;)V", "getOriginalTemplate", "()Landroidx/car/app/navigation/model/NavigationTemplate;", "java.com.google.android.apps.auto.components.apphost.template.gearhead_gearhead", "Landroidx/car/app/annotations/KeepFields;", "Landroidx/car/app/annotations/CarProtocol;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@defpackage.rg
public final class MinimizedStateNavigationTemplate implements defpackage.wi {
    private final androidx.car.app.navigation.model.NavigationTemplate originalTemplate;

    public MinimizedStateNavigationTemplate(androidx.car.app.navigation.model.NavigationTemplate navigationTemplate) {
        navigationTemplate.getClass();
        this.originalTemplate = navigationTemplate;
    }

    public final androidx.car.app.navigation.model.NavigationTemplate getOriginalTemplate() {
        return this.originalTemplate;
    }
}
