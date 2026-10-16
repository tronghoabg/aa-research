package defpackage;

import android.text.Editable;
import android.widget.EditText;
import androidx.car.app.CarContext;
import androidx.car.app.ScreenManager;
import com.google.android.gms.car.input.CarEditable;
import com.google.android.gms.car.input.InputManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class qb implements InputManager {
    public final CarContext a;
    public CarEditable b;
    public boolean c;

    public qb(CarContext carContext) {
        this.a = carContext;
    }

    @Override // com.google.android.gms.car.input.InputManager
    public final boolean isCurrentCarEditable(CarEditable carEditable) {
        return this.b == carEditable;
    }

    @Override // com.google.android.gms.car.input.InputManager
    public final boolean isInputActive() {
        return this.c;
    }

    @Override // com.google.android.gms.car.input.InputManager
    public final boolean isValid() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.car.input.InputManager
    public final void startInput(CarEditable carEditable) {
        CarContext carContext = this.a;
        if (!this.c && (carEditable instanceof EditText)) {
            EditText editText = (EditText) carEditable;
            this.b = carEditable;
            this.c = true;
            Editable text = editText.getText();
            try {
                ((ScreenManager) carContext.getCarService(ScreenManager.class)).push(new pb(carContext, text == null ? "" : text.toString(), new z(this, editText)));
            } catch (Throwable th) {
                this.c = false;
                this.b = null;
                String.valueOf(th);
            }
        }
    }

    @Override // com.google.android.gms.car.input.InputManager
    public final void stopInput() {
        if (this.c) {
            this.c = false;
            this.b = null;
            try {
                ScreenManager screenManager = (ScreenManager) this.a.getCarService(ScreenManager.class);
                if (screenManager.getTop() instanceof pb) {
                    screenManager.pop();
                }
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
    }
}
