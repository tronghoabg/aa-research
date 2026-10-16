package e.a.b;

import android.content.Intent;
import android.os.UserHandle;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    Intent f46303a;

    /* renamed from: b, reason: collision with root package name */
    UserHandle f46304b;

    public final b a() {
        an.v(this.f46303a != null, "Required property 'bindIntent' unset");
        return new b(this.f46303a, this.f46304b, null);
    }

    public final void b(Intent intent) {
        this.f46303a = intent.cloneFilter();
    }

    public final void c(UserHandle userHandle) {
        this.f46304b = userHandle;
    }
}
