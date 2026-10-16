package androidx.window.area;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WindowAreaSessionPresenter extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    Context getContext();

    Window getWindow();

    void setContentView(View view);
}
