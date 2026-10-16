package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qmi {
    public final String a;
    public final String b;
    public final boolean c;
    public long d;
    public final Map e;

    public qmi(String str, String str2, boolean z, long j, Map map) {
        spu.at(str);
        spu.at(str2);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
        if (map != null) {
            this.e = new HashMap(map);
        } else {
            this.e = Collections.EMPTY_MAP;
        }
    }
}
