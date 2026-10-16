package defpackage;

import android.widget.EditText;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class mb implements Runnable {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public mb(EditText editText, String str, boolean z) {
        this.a = editText;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.b;
        EditText editText = this.a;
        try {
            editText.setText(str);
            editText.setSelection(str.length());
            if (this.c) {
                editText.onEditorAction(3);
            }
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }
}
