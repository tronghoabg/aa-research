package defpackage;

import java.io.Serializable;
import java.util.Map;
import org.jni_zero.CommonApis;

/* loaded from: classes2.dex */
public class akcw extends akcv implements Serializable, akcu {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile akcd b;

    public akcw(long j, akcd akcdVar) {
        Map map = akci.a;
        this.b = akcdVar;
        this.a = j;
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.a();
        }
    }

    @Override // defpackage.akcu
    public final long a() {
        return this.a;
    }

    @Override // defpackage.akcu
    public final akcd b() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public akcw() {
        this(System.currentTimeMillis(), akdr.N());
        CommonApis commonApis = akci.b;
    }
}
