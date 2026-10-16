package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import h.g.b.o;
import h.g.b.x;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreferencesMapCompat {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final PreferencesProto.PreferenceMap readFrom(InputStream inputStream) throws CorruptionException {
            x.f(inputStream, "input");
            try {
                PreferencesProto.PreferenceMap from = PreferencesProto.PreferenceMap.parseFrom(inputStream);
                x.c(from);
                return from;
            } catch (InvalidProtocolBufferException e2) {
                throw new CorruptionException("Unable to parse preferences proto.", e2);
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
