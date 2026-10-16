package androidx.savedstate.serialization.serializers;

import h.f;
import h.g;
import h.g.a.a;
import h.h;
import java.lang.annotation.Annotation;
import kotlinx.b.b;
import kotlinx.b.c.bm;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class NullValue implements SerializableValue {
    public static final NullValue INSTANCE = new NullValue();
    private static final /* synthetic */ f<b<Object>> $cachedSerializer$delegate = g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.NullValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return NullValue._init_$_anonymous_();
        }
    });

    private NullValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _init_$_anonymous_() {
        return new bm(INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ b get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullValue)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1031296800;
    }

    public final b<NullValue> serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "NullValue";
    }
}
