package defpackage;

import android.content.res.Resources;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class mjs implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mjs(RadioProgramSelector radioProgramSelector, Resources resources, int i) {
        this.c = i;
        this.b = radioProgramSelector;
        this.a = resources;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return this.c != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional optionalOfNullable;
        if (this.c != 0) {
            Long l = (Long) obj;
            boolean zJ = lws.j(((RadioProgramSelector) this.b).a.a);
            Object obj2 = this.a;
            return zJ ? Optional.of(String.format(Locale.US, ((Resources) obj2).getString(R.string.radio_dab_frequency), Float.valueOf(l.longValue() / 1000.0f))) : lws.i(l.longValue()) ? Optional.of(String.format(Locale.US, ((Resources) obj2).getString(R.string.radio_am_frequency), l)) : lws.k(l.longValue()) ? Optional.of(String.format(Locale.US, ((Resources) obj2).getString(R.string.radio_fm_frequency), Float.valueOf(l.longValue() / 1000.0f))) : Optional.empty();
        }
        nur nurVar = (nur) obj;
        Object obj3 = this.b;
        tlv tlvVar = (tlv) obj3;
        int iOrdinal = tlvVar.ordinal();
        if (iOrdinal == 1) {
            optionalOfNullable = Optional.ofNullable(nurVar.c);
        } else if (iOrdinal == 2) {
            optionalOfNullable = mjt.b(nurVar.p);
        } else if (iOrdinal == 3) {
            optionalOfNullable = mjt.b(nurVar.q);
        } else if (iOrdinal == 4) {
            optionalOfNullable = mjt.b(nurVar.r);
        } else {
            if (iOrdinal != 5) {
                throw new IllegalArgumentException("Unexpected interaction type: ".concat(obj3.toString()));
            }
            optionalOfNullable = mjt.b(nurVar.s);
        }
        if (optionalOfNullable.isEmpty()) {
            ((ynz) ((ynz) mju.a.g()).ai(5040)).M("Missing [%s] intent on notification with a key[%s]", tlvVar.name(), ((mjt) this.a).a);
        }
        return optionalOfNullable;
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.c != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ mjs(mjt mjtVar, tlv tlvVar, int i) {
        this.c = i;
        this.a = mjtVar;
        this.b = tlvVar;
    }
}
