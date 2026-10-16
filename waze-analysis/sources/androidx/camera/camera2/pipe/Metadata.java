package androidx.camera.camera2.pipe;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Metadata {
    <T> T get(Key<T> key);

    <T> T getOrDefault(Key<T> key, T t);

    /* compiled from: WazeSource */
    public final class Key<T> {
        public static final Companion Companion = new Companion(null);
        private static final Map<String, Key<?>> keys = new HashMap();
        private final String name;
        private final c<?> type;

        private Key(String str, c<?> cVar) {
            this.name = str;
            this.type = cVar;
        }

        public String toString() {
            return "Metadata.Key(" + this.name + ")";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final <T> Key<T> create(String str, c<T> cVar) {
                Key<T> key;
                x.f(str, HintConstants.AUTOFILL_HINT_NAME);
                x.f(cVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                synchronized (getKeys$camera_camera2_pipe()) {
                    Map<String, Key<?>> keys$camera_camera2_pipe = Key.Companion.getKeys$camera_camera2_pipe();
                    Object key2 = keys$camera_camera2_pipe.get(str);
                    if (key2 == null) {
                        key2 = new Key(str, cVar, null);
                        keys$camera_camera2_pipe.put(str, key2);
                    }
                    key = (Key) key2;
                    if (!x.n(((Key) key).type, cVar)) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                return key;
            }

            public final Map<String, Key<?>> getKeys$camera_camera2_pipe() {
                return Key.keys;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }

            public static /* synthetic */ void getKeys$camera_camera2_pipe$annotations() {
            }

            public final /* synthetic */ <T> Key<T> create(String str) {
                x.f(str, HintConstants.AUTOFILL_HINT_NAME);
                x.i();
                int i2 = ar.f48106a;
                return create(str, new m(Object.class));
            }
        }

        public /* synthetic */ Key(String str, c cVar, o oVar) {
            this(str, cVar);
        }
    }
}
