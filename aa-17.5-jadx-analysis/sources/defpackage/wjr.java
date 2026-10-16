package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import java.util.List;

/* loaded from: classes3.dex */
final class wjr implements TextWatcher {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ View c;
    private final /* synthetic */ int d;

    public wjr(wio wioVar, int i, CheckBox checkBox, int i2) {
        this.d = i2;
        this.a = i;
        this.c = checkBox;
        this.b = wioVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d == 0) {
            String strTrim = charSequence.toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            ((wjt) this.c).a.a(new ajll(4, strTrim, ((abxl) this.b.get(this.a)).d));
            return;
        }
        String strTrim2 = charSequence.toString().trim();
        if (TextUtils.isEmpty(strTrim2)) {
            return;
        }
        Object obj = this.b;
        wio wioVar = (wio) obj;
        wioVar.a[this.a] = true;
        ((CheckBox) this.c).setChecked(true);
        wioVar.b = strTrim2;
        wioVar.c.a(new aacq(wioVar.b, wioVar.a, (char[]) null));
    }

    public wjr(wjt wjtVar, List list, int i, int i2) {
        this.d = i2;
        this.b = list;
        this.a = i;
        this.c = wjtVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
