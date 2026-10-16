package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hvz {
    public final icw a;
    public final dzk b;
    private final Class c;
    private final List d;
    private final String e;

    public hvz(Class cls, Class cls2, Class cls3, List list, icw icwVar, dzk dzkVar) {
        this.c = cls;
        this.d = list;
        this.a = icwVar;
        this.b = dzkVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final hwx a(hux huxVar, int i, int i2, hum humVar, List list) throws hwt {
        List list2 = this.d;
        int size = list2.size();
        hwx hwxVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            huo huoVar = (huo) list2.get(i3);
            try {
                if (huoVar.b(huxVar.a(), humVar)) {
                    hwxVarA = huoVar.a(huxVar.a(), i, i2, humVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for ".concat(String.valueOf(String.valueOf(huoVar))), e);
                }
                list.add(e);
            }
            if (hwxVarA != null) {
                break;
            }
        }
        if (hwxVarA != null) {
            return hwxVarA;
        }
        throw new hwt(this.e, new ArrayList(list));
    }

    public final String toString() {
        icw icwVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + icwVar.toString() + "}";
    }
}
