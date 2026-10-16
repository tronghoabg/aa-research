package defpackage;

import android.content.Intent;
import android.view.View;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.phone.ActivateActivity;
import com.google.android.gms.car.input.InputManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class v2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarScreen b;

    public /* synthetic */ v2(CarScreen carScreen, int i) {
        this.a = i;
        this.b = carScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.goBack();
                break;
            case 1:
                this.b.goForward();
                break;
            case 2:
                this.b.goHome();
                break;
            case 3:
                CarScreen carScreen = this.b;
                carScreen.addressBox.setFocusable(true);
                carScreen.addressBox.setFocusableInTouchMode(true);
                carScreen.addressBox.requestFocus();
                InputManager inputManager = carScreen.host() != null ? carScreen.host().getInputManager() : null;
                if (inputManager != null && inputManager.isValid()) {
                    if (inputManager.isInputActive()) {
                        inputManager.stopInput();
                    }
                    inputManager.startInput(carScreen.addressBox);
                    break;
                }
                break;
            case 4:
                this.b.doiCheDoUa();
                break;
            default:
                CarScreen carScreen2 = this.b;
                carScreen2.startActivity(new Intent(carScreen2, (Class<?>) ActivateActivity.class));
                break;
        }
    }
}
