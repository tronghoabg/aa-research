package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.carstream.tech.car.e;
import com.carstream.tech.phone.ActivateActivity;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class m implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                ActivateActivity activateActivity = (ActivateActivity) this.b;
                if (activateActivity.state == p.c) {
                    activateActivity.render(p.a);
                }
                activateActivity.updateProgress(editable.length());
                activateActivity.pokeDriving();
                break;
            case 1:
                i0 i0Var = (i0) this.b;
                i0Var.f = editable.toString();
                i0Var.c();
                break;
            case 2:
                t9.a((t9) this.b, editable.toString());
                break;
            default:
                fd fdVar = (fd) this.b;
                if (!fdVar.f) {
                    e eVar = fdVar.a;
                    String string = editable.toString();
                    eVar.b.js("if(window.__cntWebType){window.__cntWebType(" + JSONObject.quote(string) + ");}");
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    private final void a(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void c(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void d(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void e(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void f(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void g(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void h(CharSequence charSequence, int i, int i2, int i3) {
    }
}
