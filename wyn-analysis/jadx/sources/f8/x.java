package f8;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f35240b;

    public /* synthetic */ x(TextInputLayout textInputLayout, int i5) {
        this.f35239a = i5;
        this.f35240b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35239a) {
            case 0:
                CheckableImageButton checkableImageButton = this.f35240b.f27041c.f35161g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                this.f35240b.f27043d.requestLayout();
                break;
        }
    }
}
