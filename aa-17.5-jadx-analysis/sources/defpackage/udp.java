package defpackage;

import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.RadioProgramSelector;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class udp {
    public final Object a;
    public Object b;

    public udp() {
        this.a = new HashMap();
    }

    public final RadioProgramInfo a() {
        return new RadioProgramInfo((RadioProgramSelector) this.a, (RadioMetadata) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final pwn b(String str) {
        return (pwn) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void c(pwn pwnVar) {
        this.a.put(pwnVar.a, pwnVar);
    }

    public udp(udx udxVar) {
        this.a = udxVar;
        this.b = xvy.a;
    }

    public udp(RadioProgramSelector radioProgramSelector) {
        this.a = radioProgramSelector;
    }
}
