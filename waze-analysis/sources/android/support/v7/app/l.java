package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ListView;
import androidx.core.widget.NestedScrollView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class l extends ap implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    final j f611a;

    protected l(Context context, int i2) {
        super(context, a(context, i2));
        this.f611a = new j(getContext(), this, getWindow());
    }

    static int a(Context context, int i2) {
        if ((i2 >>> 24) > 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final ListView b() {
        return this.f611a.f598b;
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f611a.a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f611a.f604h;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f611a.f604h;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // android.support.v7.app.ap, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f611a.f(charSequence);
    }
}
