package defpackage;

import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class whm {
    public static final whm a = new whm();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Map f = new HashMap();

    public final SurveyDataImpl a(String str) {
        return (SurveyDataImpl) this.d.get(str);
    }

    public final void b(String str) {
        this.f.remove(str);
    }

    public final ajmd c(String str) {
        return (ajmd) this.f.get(str);
    }
}
