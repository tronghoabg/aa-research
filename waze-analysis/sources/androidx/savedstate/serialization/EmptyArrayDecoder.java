package androidx.savedstate.serialization;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b.a;
import kotlinx.b.e.e;
import kotlinx.b.e.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class EmptyArrayDecoder extends a {
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();
    private static final e serializersModule = i.a();

    private EmptyArrayDecoder() {
    }

    @Override // kotlinx.b.b.c
    public int decodeElementIndex(q qVar) {
        x.f(qVar, "descriptor");
        return -1;
    }

    @Override // kotlinx.b.b.c
    public e getSerializersModule() {
        return serializersModule;
    }
}
