package s5;

import Va.M6;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f45048a;

    public v(long j8) {
        this.f45048a = j8;
    }

    public static v a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new v(Long.parseLong(jsonReader.nextString())) : new v(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            if (this.f45048a == ((v) obj).f45048a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f45048a;
        return ((int) (j8 ^ (j8 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return M6.s(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f45048a, "}");
    }
}
