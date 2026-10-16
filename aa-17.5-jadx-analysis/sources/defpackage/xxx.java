package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class xxx {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public xxx(String str, int i, boolean z) {
        this.c = "com.google.android.gms";
        this.d = str;
        this.b = i;
        this.a = z;
    }

    public static xxx c(char c) {
        return new xxx(new xxr(new xwi(c)));
    }

    public static xxx d(String str) {
        return new xxx(new xxr(new xwi(str.charAt(0))));
    }

    public static xxx e(String str) {
        final xwz xwzVar = new xwz(Pattern.compile(str));
        woy.S(!((Matcher) xwzVar.a("").a).matches(), "The pattern may not match the empty string: %s", xwzVar);
        return new xxx(new xxw() { // from class: xxs
            @Override // defpackage.xxw
            public final Iterator a(xxx xxxVar, CharSequence charSequence) {
                return new xxu(xxxVar, charSequence, xwzVar.a(charSequence));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xxw] */
    public final xxx a(int i) {
        return new xxx(this.d, this.a, (xwp) this.c, i);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, xxw] */
    public final xxx b() {
        return new xxx(this.d, true, (xwp) this.c, this.b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xxw] */
    public final xxx f() {
        xwp xwpVar = xwo.c;
        xwpVar.getClass();
        return new xxx(this.d, this.a, xwpVar, this.b);
    }

    public final Iterable g(CharSequence charSequence) {
        charSequence.getClass();
        return new xxv(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xxw] */
    public final Iterator h(CharSequence charSequence) {
        return this.d.a(this, charSequence);
    }

    public final List i(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itH = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itH.hasNext()) {
            arrayList.add((String) itH.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final aacq j(String str) {
        return new aacq(this, d(str), (byte[]) null);
    }

    private xxx(xxw xxwVar, boolean z, xwp xwpVar, int i) {
        this.d = xxwVar;
        this.a = z;
        this.c = xwpVar;
        this.b = i;
    }

    public xxx(xxw xxwVar) {
        this(xxwVar, false, xwm.a, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
