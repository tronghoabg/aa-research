package defpackage;

import android.content.Context;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class vuo {
    public final aezk a;
    public final Object b;
    public final Object c;
    public final Object d;

    public vuo(Context context, aezk aezkVar, ackk ackkVar, ackk ackkVar2) {
        this.b = ackkVar;
        this.d = context;
        this.a = aezkVar;
        this.c = ackkVar2;
    }

    public static boolean a(vrm vrmVar, vrm vrmVar2) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        if (!Objects.equals(vrmVar.d, vrmVar2.d) || !Objects.equals(vrmVar.e, vrmVar2.e) || (l = vrmVar.b) == null || (l2 = vrmVar.c) == null || (l3 = vrmVar2.b) == null || (l4 = vrmVar2.c) == null) {
            return false;
        }
        long jLongValue = l3.longValue() - l.longValue();
        long jLongValue2 = l4.longValue() - l2.longValue();
        if (jLongValue2 <= 0) {
            return false;
        }
        long jAbs = Math.abs(jLongValue - jLongValue2);
        if (jAbs >= 25) {
            return ((double) jAbs) / ((double) jLongValue2) <= 3.472222222222222E-5d;
        }
        return true;
    }

    public vuo(String str, aacq aacqVar, tmb tmbVar, aezk aezkVar) {
        this.b = str;
        this.c = aacqVar;
        this.d = tmbVar;
        this.a = aezkVar;
    }
}
