package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class acko implements ackr {
    public final Map a;

    public acko(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }
}
