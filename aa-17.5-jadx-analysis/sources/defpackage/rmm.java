package defpackage;

import com.google.android.projection.gearhead.sdk.CarAppLayout;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class rmm implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public rmm(Object obj, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        int i = this.c;
        if (i == 0) {
            return Boolean.valueOf(((rmk) this.b).a.performContextMenuAction(this.a));
        }
        if (i == 1) {
            return Boolean.valueOf(((rmk) this.b).a.performEditorAction(this.a));
        }
        if (i == 2) {
            return Boolean.valueOf(((rmk) this.b).a.clearMetaKeyStates(this.a));
        }
        if (i == 3) {
            return ((rmk) this.b).a.getSelectedText(this.a);
        }
        if (i == 4) {
            return Integer.valueOf(((rmk) this.b).a.getCursorCapsMode(this.a));
        }
        try {
            return ((CarAppLayout) this.b).getResources().getDrawable(this.a);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
