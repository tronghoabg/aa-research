package androidx.lifecycle;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        x.d(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
