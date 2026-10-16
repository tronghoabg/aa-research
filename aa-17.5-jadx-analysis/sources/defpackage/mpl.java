package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;

/* loaded from: classes.dex */
public final class mpl {
    @ResultIgnorabilityUnspecified
    public static void a() {
    }

    public static final mqb b(ComponentName componentName) {
        componentName.getClass();
        return new mqb(componentName, mqa.b);
    }

    public static final mqb c(String str) {
        List listK = afyh.K(str, new char[]{':'}, 0);
        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString((String) listK.get(0));
        if (componentNameUnflattenFromString != null) {
            return listK.size() == 1 ? b(componentNameUnflattenFromString) : new mqb(componentNameUnflattenFromString, mqa.valueOf((String) listK.get(1)));
        }
        throw new IllegalStateException("ComponentName should always be present");
    }

    public static final mqb d(Intent intent) {
        intent.getClass();
        String stringExtra = intent.getStringExtra("AppKey");
        if (stringExtra != null) {
            return c(stringExtra);
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            return null;
        }
        return new mqb(component, mqa.b);
    }

    public static mpj e() {
        return (mpj) mki.a.i(mpj.class);
    }

    public static mkq f() {
        return (mkq) mki.a.i(mkq.class);
    }
}
