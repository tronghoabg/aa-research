package aa;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f17445e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f17446a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17447b;

    /* renamed from: c, reason: collision with root package name */
    public final c f17448c;

    /* renamed from: d, reason: collision with root package name */
    public final c f17449d;

    static {
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public i(Executor executor, c cVar, c cVar2) {
        this.f17447b = executor;
        this.f17448c = cVar;
        this.f17449d = cVar2;
    }

    public static HashSet b(c cVar) {
        HashSet hashSet = new HashSet();
        e eVarC = cVar.c();
        if (eVarC != null) {
            Iterator<String> itKeys = eVarC.f17423b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public final void a(Z9.i iVar) {
        synchronized (this.f17446a) {
            this.f17446a.add(iVar);
        }
    }
}
