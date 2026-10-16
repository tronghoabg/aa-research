package defpackage;

import android.widget.EditText;
import androidx.car.app.model.SearchTemplate;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ob implements SearchTemplate.SearchCallback {
    public final /* synthetic */ pb a;

    public ob(pb pbVar) {
        this.a = pbVar;
    }

    @Override // androidx.car.app.model.SearchTemplate.SearchCallback
    public final void onSearchSubmitted(String str) {
        pb pbVar = this.a;
        z zVar = pbVar.b;
        EditText editText = (EditText) zVar.a;
        editText.post(new mb(editText, str, true));
        qb qbVar = (qb) zVar.b;
        qbVar.c = false;
        qbVar.b = null;
        pbVar.getScreenManager().pop();
    }

    @Override // androidx.car.app.model.SearchTemplate.SearchCallback
    public final void onSearchTextChanged(String str) {
        EditText editText = (EditText) this.a.b.a;
        editText.post(new mb(editText, str, false));
    }
}
