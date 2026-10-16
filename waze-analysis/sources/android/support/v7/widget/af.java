package android.support.v7.widget;

import android.graphics.Typeface;
import android.widget.TextView;
import androidx.core.util.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class af implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f1051a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f1052b;

    public /* synthetic */ af(TextView textView, int i2) {
        this.f1052b = i2;
        this.f1051a = textView;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i2 = this.f1052b;
        if (i2 == 0) {
            super/*android.widget.EditText*/.setTypeface((Typeface) obj);
        } else if (i2 != 1) {
            super/*android.widget.TextView*/.setTypeface((Typeface) obj);
        } else {
            ((y) this.f1051a).m142xdc1dcc3((Typeface) obj);
        }
    }
}
