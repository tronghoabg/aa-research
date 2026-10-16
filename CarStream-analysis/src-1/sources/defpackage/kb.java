package defpackage;

import android.content.Intent;
import androidx.car.app.Screen;
import androidx.car.app.Session;
import com.carstream.tech.surf.c;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class kb extends Session {
    @Override // androidx.car.app.Session
    public final Screen onCreateScreen(Intent intent) {
        return new c(getCarContext());
    }

    @Override // androidx.car.app.Session
    public final void onNewIntent(Intent intent) {
    }
}
