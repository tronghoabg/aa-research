package defpackage;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import androidx.car.app.SessionInfo;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class geu extends MutableContextWrapper {
    private final Map a;

    public geu(Context context) {
        super(context);
        this.a = new HashMap();
    }

    public abstract jti A();

    public abstract gjv B();

    public abstract wsj C();

    public abstract urf D();

    public abstract kzt E();

    public final hem F(Class cls) {
        hem hemVarL = l(cls);
        if (hemVarL != null) {
            return hemVarL;
        }
        throw new NullPointerException("Missing AppHostService ".concat(String.valueOf(cls.getName())));
    }

    public abstract Context a();

    public abstract SessionInfo b();

    public abstract gdr c();

    public abstract gdv d();

    public abstract gdx e();

    public abstract geb f();

    public abstract gen g();

    public abstract ges h();

    public abstract ggl i();

    public abstract gku j();

    public abstract gns k();

    public hem l(Class cls) {
        return (hem) this.a.get(cls);
    }

    public abstract void m();

    public abstract void n();

    public abstract void o(Configuration configuration);

    public void p() {
        throw null;
    }

    public abstract boolean q();

    public abstract boolean r();

    public boolean s(Class cls, hem hemVar) {
        Map map = this.a;
        if (map.containsKey(cls)) {
            return false;
        }
        map.put(cls, hemVar);
        return true;
    }

    public abstract glp t();

    public abstract kdg u();

    public abstract jyk v();

    public abstract jwl w();

    public abstract jsj x();

    public abstract nas y();

    public abstract gcx z();

    public void G(PrintWriter printWriter) {
    }
}
