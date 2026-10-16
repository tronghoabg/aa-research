package a0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1309e extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final C1309e f17097a = new C1309e();

    public final void a(@NotNull C1305a autofill) {
        AbstractC3340k.e(autofill, "autofill");
        autofill.f17094c.registerCallback(this);
    }

    public final void b(@NotNull C1305a autofill) {
        AbstractC3340k.e(autofill, "autofill");
        autofill.f17094c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i5, int i10) {
        AbstractC3340k.e(view, "view");
        super.onAutofillEvent(view, i5, i10);
        Log.d("Autofill Status", i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
