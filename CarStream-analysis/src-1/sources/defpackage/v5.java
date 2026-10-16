package defpackage;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.launcher.LuoiApp;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class v5 implements LuoiApp.Nghe {
    public final /* synthetic */ x5 a;

    public v5(x5 x5Var) {
        this.a = x5Var;
    }

    @Override // com.carstream.tech.launcher.LuoiApp.Nghe
    public final void moApp(String str) {
        String strConcat;
        TextView textView;
        ComponentName componentNameUnflattenFromString;
        Bundle bundle;
        x5 x5Var = this.a;
        CarScreen carScreen = x5Var.a;
        if (str == null) {
            return;
        }
        try {
            componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
        } catch (Throwable th) {
            String.valueOf(th);
        }
        if (componentNameUnflattenFromString == null) {
            strConcat = "Không mở được ứng dụng này";
            Handler handler = x5Var.g;
            textView = x5Var.f;
            if (textView != null || strConcat == null) {
            }
            textView.setText(strConcat);
            x5Var.f.setVisibility(0);
            x5Var.f.bringToFront();
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new f(x5Var, 23), 4000L);
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(componentNameUnflattenFromString);
        intent.addFlags(268435456);
        Context applicationContext = carScreen.getApplicationContext();
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setLaunchDisplayId(0);
            bundle = activityOptionsMakeBasic.toBundle();
        } catch (Throwable unused) {
            bundle = null;
        }
        applicationContext.startActivity(intent, bundle);
        strConcat = "Đã mở trên điện thoại — ".concat(k1.f() ? "ứng dụng này không mở được trên màn hình xe" : b0.d(carScreen) ? "vào lại mục Ứng dụng để mở trên màn hình xe" : "xem phần Android Auto trong Cài đặt để mở trên màn hình xe");
        Handler handler2 = x5Var.g;
        textView = x5Var.f;
        if (textView != null) {
        }
    }
}
