package com.google.android.datatransport.cct.a;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final long f3952a;

    ak(long j2) {
        this.f3952a = j2;
    }

    public static ak a(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new ak(Long.parseLong(jsonReader.nextString())) : new ak(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final long b() {
        return this.f3952a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ak) && this.f3952a == ((ak) obj).f3952a;
    }

    public final int hashCode() {
        long j2 = this.f3952a;
        return ((int) (j2 ^ (j2 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f3952a + "}";
    }

    public ak() {
        throw null;
    }
}
