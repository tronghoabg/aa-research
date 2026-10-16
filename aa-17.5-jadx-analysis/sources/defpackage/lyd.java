package defpackage;

import android.content.ComponentName;
import android.text.TextUtils;
import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class lyd implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ lyd(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return mqp.b((mqc) obj);
            case 1:
                int i = lva.c;
                return ((ids) obj).c;
            case 2:
                return (tlh) ((Optional) obj).get();
            case 3:
                return ((mqc) obj).a;
            case 4:
                int i2 = lzg.b;
                return new mqc((ComponentName) obj, mpz.b);
            case 5:
                return ((mqc) obj).a();
            case 6:
                return ((mqc) obj).a();
            case 7:
                return ((mqc) obj).a();
            case 8:
                return ((mqc) obj).a();
            case 9:
                String str = (String) obj;
                int i3 = maz.a;
                return str;
            case 10:
                int i4 = mdc.b;
                return new mqc((ComponentName) obj, mpz.a, true, true, true);
            case 11:
                return (mih) ((Map.Entry) obj).getKey();
            case 12:
                yph yphVar = mil.a;
                Stream map = Collection.EL.stream((yfq) ((Map.Entry) obj).getValue()).map(new lyd(13));
                int i5 = yfq.d;
                return (yfq) map.collect(ycm.a);
            case 13:
                yph yphVar2 = mil.a;
                return ((mik) obj).a;
            case 14:
                return (yfq) ((Map.Entry) obj).getValue();
            case 15:
                return Collection.EL.stream((yfq) obj);
            case 16:
                RadioMetadata radioMetadata = ((RadioProgramInfo) obj).b;
                if (radioMetadata != null) {
                    String str2 = radioMetadata.a;
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                }
                return null;
            case 17:
                RadioMetadata radioMetadata2 = ((RadioProgramInfo) obj).b;
                if (radioMetadata2 != null) {
                    String str3 = radioMetadata2.m;
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                }
                return null;
            case 18:
                RadioMetadata radioMetadata3 = ((RadioProgramInfo) obj).b;
                if (radioMetadata3 != null) {
                    String str4 = radioMetadata3.h;
                    if (!TextUtils.isEmpty(str4)) {
                        return str4;
                    }
                }
                return null;
            case 19:
                RadioMetadata radioMetadata4 = ((RadioProgramInfo) obj).b;
                if (radioMetadata4 != null) {
                    String str5 = radioMetadata4.b;
                    if (!TextUtils.isEmpty(str5)) {
                        return str5;
                    }
                }
                return null;
            default:
                Optional optionalG = lws.g(((RadioProgramInfo) obj).a, 4);
                if (true == optionalG.isPresent() && ((Long) optionalG.get()).longValue() <= 10) {
                    optionalG = Optional.empty();
                }
                if (true == optionalG.isPresent()) {
                    StringBuilder sb = new StringBuilder();
                    for (long jLongValue = ((Long) optionalG.get()).longValue(); jLongValue > 0; jLongValue >>= 8) {
                        long j = 255 & jLongValue;
                        int i6 = (int) j;
                        boolean z = ((long) i6) == j;
                        char c = (char) i6;
                        woy.R(z, "Out of range: %s", j);
                        if ((Character.isLetter(c) && Character.isUpperCase(c)) || Character.isDigit(c)) {
                            sb.append(c);
                        }
                    }
                    optionalG = Optional.ofNullable(sb.toString());
                }
                return (String) optionalG.orElse(null);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
