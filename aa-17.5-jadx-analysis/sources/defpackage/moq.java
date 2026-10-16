package defpackage;

import android.content.Context;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.AbstractMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class moq implements BiFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ moq(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) throws NumberFormatException {
        int i = this.a;
        if (i == 0) {
            return Long.valueOf(((Long) obj).longValue() + ((Long) obj2).longValue());
        }
        int i2 = 3;
        int i3 = 0;
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? obj : new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            xbo xboVar = (xbo) obj;
            Context context = (Context) obj2;
            yph yphVar = xbo.f;
            context.getClass();
            rbt rbtVar = xboVar.p;
            xboVar.getClass();
            return omc.b(context, rbtVar, new wzf(xboVar, i2), null, 0);
        }
        yph yphVar2 = mir.a;
        List listI = xxx.d("-").i((String) obj2);
        if (listI.size() != 3) {
            return Optional.empty();
        }
        try {
            int iM = lws.m((String) listI.get(0));
            if (iM > 0 && iM <= 9) {
                String str = (String) listI.get(1);
                int length = str.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                if (str.charAt(0) == '+' && length > 1) {
                    i3 = 1;
                }
                long j = 0;
                while (i3 < length) {
                    int iDigit = Character.digit(str.charAt(i3), 16);
                    if (iDigit == -1) {
                        throw new NumberFormatException(str.toString());
                    }
                    if (j < 0 || j > 1152921504606846975L || (j == 1152921504606846975L && iDigit > 15)) {
                        throw new NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
                    }
                    j = (j * 16) + iDigit;
                    i3++;
                }
                RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = new RadioProgramSelector.RadioProgramIdentifier(iM, j);
                return lws.m((String) listI.get(2)) != radioProgramIdentifier.hashCode() ? Optional.empty() : Optional.of(radioProgramIdentifier);
            }
            return Optional.empty();
        } catch (IllegalStateException unused) {
            return Optional.empty();
        }
    }
}
