package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.car.app.model.Action;
import androidx.car.app.model.Alert;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jyl {
    public static final yph a = yph.c("CarApp.H.Not");

    public static String a(CarText carText) {
        List<CharSequence> variants = carText.getVariants();
        return variants.isEmpty() ? carText.toString() : ((CharSequence) Collection.EL.stream(variants).min(Comparator.CC.comparing(new jxe(4))).get()).toString();
    }

    public static final boolean b(CarIcon carIcon) {
        if (carIcon == null) {
            return false;
        }
        int type = carIcon.getType();
        return type == 1 || type == 5;
    }

    public static final nul c(Action action, IBinder iBinder, boolean z, Context context, ComponentName componentName, Alert alert, boolean z2) {
        aaew aaewVar = new aaew(null);
        String packageName = componentName.getPackageName();
        Bundle bundle = new Bundle(1);
        bundle.putBinder("TemplateAppPendingAlertBinder", iBinder);
        Intent intentPutExtras = new Intent("androidx.car.app.action.CarAppNotificationAction").putExtra("TemplateAppPackageName", packageName).putExtra("TemplateAppActionType", 3).putExtras(bundle);
        if (acob.aa()) {
            intentPutExtras.setPackage(context.getPackageName());
        }
        int i = jul.a;
        jul.a = i + 1;
        aaewVar.b = PendingIntent.getBroadcast(context, i, intentPutExtras, 67108864);
        if (action.getTitle() != null && !z) {
            CarText title = action.getTitle();
            title.getClass();
            aaewVar.d = a(title);
        }
        if (action.getIcon() != null && !TextUtils.isEmpty(componentName.getPackageName())) {
            CarIcon icon = action.getIcon();
            icon.getClass();
            aaewVar.e = GhIcon.m(icon, componentName);
        }
        if (z2 && action.getFlags() == 4) {
            aaewVar.c = Duration.ofMillis(alert.getDurationMillis());
        }
        return new nul(aaewVar);
    }
}
