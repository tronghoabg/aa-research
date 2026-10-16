package kotlinx.coroutines.d;

import com.google.d.m.a.bm;
import e.a.h.ad;
import h.c.j;
import h.e;
import h.f.s;
import h.g.a.p;
import h.g.b.x;
import h.k.n;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.b.a.q;
import kotlinx.b.d.a.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.e.g;
import kotlinx.coroutines.e.i;
import kotlinx.coroutines.e.l;
import kotlinx.coroutines.y;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {
    public static final bm a(af afVar, j jVar, ag agVar, p pVar) {
        if (agVar.a()) {
            Objects.toString(agVar);
            throw new IllegalArgumentException(String.valueOf(agVar).concat(" start is not supported"));
        }
        c cVar = new c(y.b(afVar, jVar));
        cVar.bS(agVar, cVar, pVar);
        return cVar.f51832c;
    }

    public static final void b(j jVar, Throwable th) {
        Iterator it = g.a().iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(jVar, th);
            } catch (l unused) {
                return;
            } catch (Throwable th2) {
                g.b(s.g(th, th2));
            }
        }
        try {
            ad.c(th, new i(jVar));
        } catch (Throwable unused2) {
        }
        g.b(th);
    }

    public static final CharSequence c(CharSequence charSequence, int i2) {
        x.f(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            return length > 0 ? ".....".concat(String.valueOf(charSequence.subSequence(length, charSequence.length()).toString())) : charSequence;
        }
        int i3 = i2 - 30;
        int i4 = i2 + 30;
        int length2 = charSequence.length();
        StringBuilder sb = new StringBuilder(i3 <= 0 ? "" : ".....");
        sb.append(charSequence.subSequence(n.h(i3, 0), n.i(i4, charSequence.length())).toString());
        sb.append(i4 >= length2 ? "" : ".....");
        return sb.toString();
    }

    public static final kotlinx.b.d.a.n d(Number number, String str, String str2) {
        x.f(number, "value");
        x.f(str, "key");
        x.f(str2, "output");
        return e(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str2)));
    }

    public static final kotlinx.b.d.a.n e(int i2, String str) {
        x.f(str, "message");
        if (i2 >= 0) {
            str = "Unexpected JSON token at offset " + i2 + ": " + str;
        }
        return new kotlinx.b.d.a.n(str);
    }

    public static final kotlinx.b.d.a.n f(int i2, String str, CharSequence charSequence) {
        x.f(str, "message");
        x.f(charSequence, "input");
        return e(i2, str + "\nJSON input: " + ((Object) c(charSequence, i2)));
    }

    public static final o g(Number number, String str) {
        x.f(number, "value");
        x.f(str, "output");
        return new o("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str)));
    }

    public static final o h(q qVar) {
        x.f(qVar, "keyDescriptor");
        return new o("Value of type '" + qVar.d() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + qVar.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence) {
        return c(charSequence, -1);
    }

    public static final void k(kotlinx.b.d.a.a aVar, Number number) {
        x.f(aVar, "<this>");
        x.f(number, "result");
        kotlinx.b.d.a.a.s(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw new e();
    }

    public static final void l(kotlinx.b.d.a.a aVar, String str) {
        x.f(aVar, "<this>");
        x.f(str, "entity");
        aVar.u("Trailing comma before the end of JSON ".concat(str), aVar.f51108a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new e();
    }
}
